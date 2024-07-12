package frame;

import static UserProfile.User_View.currentUser;
import java.awt.Font;
import utilities.CurrentQno;
import score.Score;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import utilities.Badge;
import utilities.BadgeManager;
import utilities.LoadingDialog;
import utilities.QuestionType;
import utilities.QuestionUtils;
import static utilities.QuestionUtils.OPTION_COLOR;
import static utilities.QuestionUtils.WRONG_OPTION_COLOR;

/**
 * @author MuhammadHasnatRasool
 */
public abstract class Output_Questions extends Output_Frame2 implements ActionListener {

    public CurrentQno currentQno;
    public ArrayList<String> questions;
    public ArrayList<String> options;
    public ArrayList<String> answers;
    public int currentQuestionIndex;
    public int wrongAnswers;
    public int score;
    public int totalQuestions;
    public List<Integer> indices;
    public static int currentQuestionNumber = 1;
    public JRadioButton option;
    public int MAX_LIFE_LINES = 5;
    public int LIFE_LINES = 0;
    public int currentStreak = 0;
    public int maxStreak = 0;
    public int correctAnswersInSeries = 0;
    BadgeManager badgeManager = BadgeManager.getInstance();
    List<Badge> badgesEarned = badgeManager.getBadgesEarned();
    private List<JRadioButton> optionList;
    public int points=0;
  
    public Badge fiftyFiftyLuckBadge = new Badge("FiftyfiftyLuck", "Awarded for marking exactly half questions wrong!!!.");
    public Badge perfectScoreBadge = new Badge("Perfect Score", "Awarded for achieving a perfect score!!!.");
    public Badge superMindBadge = new Badge("Super Mind", "Awarded for using no life lines!!!.");
    public Badge streak5Badge = new Badge("Streak5", "Awarded for achieving a streak of 5 consecutive correct answers.");
    public Badge streak10Badge = new Badge("Streak10", "Awarded for achieving a streak of 10 consecutive correct answers.");

    public Output_Questions(String name) {

        super(name);
        setLocationRelativeTo(null);
        setLocationByPlatform(true);
        setAlwaysOnTop(true);
        currentQno = new CurrentQno();
        questions = new ArrayList<>();
        options = new ArrayList<>();
        answers = new ArrayList<>();
        indices = new ArrayList<>();
//        badgesEarned = new ArrayList<>();
        meter.setAnimate(false);
        meter.setMinimumValue(0);
        meter.setMaximumValue(totalQuestions);
        next.setEnabled(false);
        question.setFont(new Font("Tahoma", Font.BOLD, 24));
        optionList = Arrays.asList(opt1, opt2, opt3, opt4);

    }

    public abstract void loadQuestions();
    
    public void selectTotalQuestions() {
          String input = null;
        // Select number of questions
        requestFocus();
        while(input==null || input.isEmpty()){
       input = (String) JOptionPane.showInputDialog(this,"Enter number of questions : (1- "+questions.size()+")","Questions",JOptionPane.QUESTION_MESSAGE,new ImageIcon(ClassLoader.getSystemResource("icons/question.png")),null,5);

        }
       totalQuestions = Integer.parseInt(input);
       if(totalQuestions<1 || totalQuestions> questions.size()){
           JOptionPane.showMessageDialog(this,"5 mcqs set as a default value!","Default value selection",JOptionPane.WARNING_MESSAGE,new ImageIcon(ClassLoader.getSystemResource("icons/blob.png")));
           totalQuestions=5;
       }
        meter.setMaximumValue(100);
    }

    public void setCurrentQuestion() {
        currentQuestionIndex = indices.get(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == next) {
            handleNext();
        } else if (e.getSource() == back) {
            handleBack();
        } else if (e.getSource() == prev) {
            handlePrev();
        } else if (e.getSource() == submit) {
            handleSubmit();
        } else if (e.getSource() == lifelineBox) {
            handleLifeLineOptions();
        }
    }

    private void handleNext() {

        // clear answer field and update meter
        QuestionUtils.updateMeterClearSelection(meter,currentQno,totalQuestions,score,groupoptions);

        // check if reached to last question
        checkLastQuestion();
        // Move to the next question
        QuestionUtils.clearOptionBackground(optionList);
        showNextQuestion();

    }
    
    public void checkLastQuestion() {

        System.out.println("inside checkLastQuestion");
        currentQuestionIndex = indices.get((indices.indexOf(currentQuestionIndex) + 1) % questions.size());
        if (indices.indexOf(currentQuestionIndex) >= totalQuestions) {
            if(currentUser==null){
            new Score(name, score,points, wrongAnswers, totalQuestions,badgesEarned).setVisible(true);
            setVisible(false);
            dispose();}
            else{
      
                new Score(currentUser, score,points, wrongAnswers, totalQuestions, badgesEarned, QuestionType.CODING).setVisible(true);
            setVisible(false);
            this.dispose();
            }
       
        }

    }

    private void showNextQuestion() {
    currentQno.increment();
    feedback.setText("");
    setQuestionTextAndOptions();
    next.setEnabled(false);
    submit.setEnabled(true);
}

    // method to move back to menu 
    private void handleBack() {
        setVisible(false);
        new Menu().setVisible(true);
    }

    // method to show previous question
    private void handlePrev() {
        if (currentQno.getCurrentQno() > 1) {
            currentQno.decrement();
            moveToPreviousQuestion();
           
        } else {

            QuestionUtils.showNoQuestionAvailable(this);
        }
    }

    // helper methods for displaying prev questions
    private void moveToPreviousQuestion() {

        if (currentQuestionIndex > 0) {
            currentQuestionIndex--;
            meter.setText("Score:"+score);
            QuestionUtils.updateMeterClearSelection(meter, currentQno, totalQuestions, score, groupoptions);
            setQuestionTextAndOptions();
            QuestionUtils.clearOptionSelection(groupoptions);
        } else {
            QuestionUtils.showNoQuestionAvailable(this);
        }
        
        submit.setEnabled(false);
        next.setEnabled(true);

    }

    // helper methods for submit button
 public void clearFeedback() {
       QuestionUtils.clearOptionBackground(optionList);
        feedback.setText("");
        submit.setEnabled(true);
        lifelineBox.setEnabled(true);
        prev.setEnabled(true);
    }
 
     private boolean checkAnswer() {
    String correctAnswer = getCorrectAnswer();
    List<JRadioButton> tions = Arrays.asList(opt1, opt2, opt3, opt4);
    for (JRadioButton opt : tions) {
        if (opt.isSelected()) {
            String optionText = opt.getText().trim();
            return optionText.equalsIgnoreCase(correctAnswer);
        }
    }
    return false;
}

    // submit button specific method
   private void handleSubmit() {
    submit.setEnabled(false);
    LoadingDialog loadingDialog = new LoadingDialog(this);
    loadingDialog.setVisible(true);
    clearFeedback();
    submit.setEnabled(false);
    lifelineBox.setEnabled(false);
    next.setEnabled(true);
    System.out.println(answers.get(currentQuestionIndex));
    if (checkAnswer()) {
        option = QuestionUtils.getSelectedOption(groupoptions, optionList);
        option.setBackground(OPTION_COLOR);
        PlaySound.playSound("correct.wav");
        feedback.setText("Correct!");
        lifelineBox.setEnabled(false);
        score++;
        points+=10;
        meter.setText("Score:" + score);
        pointslbl.setText("" + score);
        manageStreak();
    } else {
        option = QuestionUtils.getSelectedOption(groupoptions, optionList);
        option.setBackground(WRONG_OPTION_COLOR);
        submit.setEnabled(false);
        PlaySound.playSound("wrong.wav");
        feedback.setText("Wrong! Answer is: " + getCorrectAnswer());
        wrongAnswers++;
        points-=10;
        pointslbl.setText("" + score);
        lifelineBox.setEnabled(false);
        prev.setEnabled(false);
         if(correctAnswersInSeries>10){
            JOptionPane.showMessageDialog(this,"oops you lose streak! dont lose hope and try again!");
        }
        correctAnswersInSeries = 0;
        currentStreak = 0;
    }
     if (currentQno.getCurrentQno() >= totalQuestions) {
            JOptionPane.showMessageDialog(this, "Quiz completed. Your score is: " + score, "End of Quiz", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(ClassLoader.getSystemResource("usericons/brain--plus.png")));
            if(currentUser==null){
            new Score(name, score,points, wrongAnswers, totalQuestions,badgesEarned).setVisible(true);
            setVisible(false);
            dispose();}
            else{
                
            new Score(currentUser, score,points, wrongAnswers, totalQuestions, badgesEarned, QuestionType.CODING).setVisible(true);

            setVisible(false);
            dispose();
            }
}
   }
   
    protected void manageStreak() {
        correctAnswersInSeries++;
        currentStreak = correctAnswersInSeries;
        if (currentStreak > maxStreak) {
            maxStreak = currentStreak;
        }
        if (correctAnswersInSeries == totalQuestions) {
            JOptionPane.showMessageDialog(this, "You got all " + totalQuestions + " questions correct! " + "Perfect Score!", "Achievement Unlocked!!", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(ClassLoader.getSystemResource("usericons/fire-big.png")));
            badgesEarned.add(new Badge("Perfect Score", "Achieved perfect score on the quiz!"));
        } else if (score == (totalQuestions / 2) && totalQuestions > 15) {
            JOptionPane.showMessageDialog(this, "You got at least half of the questions correct! " + "Halfway Hero!", "Achievement Unlocked!!", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(ClassLoader.getSystemResource("usericons/smiley-mr-green.png")));
            badgesEarned.add(new Badge("Halfway Hero", "Answered at least half the questions correctly."));
        }
        switch (correctAnswersInSeries) {
            case 5 -> {
                JOptionPane.showMessageDialog(this, "You are doing great 5 in a row keep it up", "Achievement Unlocked!!", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(ClassLoader.getSystemResource("icons/smiley.png")));
                badgesEarned.add(new Badge("5 in a Row", "Answered 5 questions in a row correctly."));
            }
            case 10 -> {
                JOptionPane.showMessageDialog(this, "You are a master 10 in a row keep it up", "Achievement Unlocked!!", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(ClassLoader.getSystemResource("icons/smiley2.png")));
                badgesEarned.add(new Badge("10 in a Row", "Answered 10 questions in a row correctly."));
            }
            case 20 -> {
                JOptionPane.showMessageDialog(this, "You are a veteran 20 in a row no more words!!", "Achievement Unlocked!!", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(ClassLoader.getSystemResource("icons/cup.png")));
                badgesEarned.add(new Badge("20 in a Row", "Answered 20 questions in a row correctly."));
            }
            default -> {
            }
        }
    }
    


    // lifeline related method to disable 2 options
    private void handleLifeline() {
       
        System.out.println("inside lifeline");
        if (checkMaxLifeLinesCrossed()) {

            String correctAnswer = answers.get(currentQuestionIndex);
            ArrayList<String> allOptions = new ArrayList<>(Arrays.asList(opt1.getText(), opt2.getText(), opt3.getText(), opt4.getText()));
            allOptions.remove(correctAnswer);
            int disableIndex1 = (int) (Math.random() * allOptions.size());
            String disableOption1 = allOptions.get(disableIndex1);
            allOptions.remove(disableIndex1);
            int disableIndex2 = (int) (Math.random() * allOptions.size());
            String disableOption2 = allOptions.get(disableIndex2);

            if (opt1.getText().equals(disableOption1) || opt1.getText().equals(disableOption2)) {
                opt1.setEnabled(false);
            }
            if (opt2.getText().equals(disableOption1) || opt2.getText().equals(disableOption2)) {
                opt2.setEnabled(false);
            }
            if (opt3.getText().equals(disableOption1) || opt3.getText().equals(disableOption2)) {
                opt3.setEnabled(false);
            }
            if (opt4.getText().equals(disableOption1) || opt4.getText().equals(disableOption2)) {
                opt4.setEnabled(false);
            }

//            setQuestionTextAndOptions();
        } else {
            QuestionUtils.showMaxLifelinesUsedMessage(this);
        }
    }

    private void handleSkipQuestion() {

        // Check  if current question is last question
        if (currentQno.getCurrentQno() >= totalQuestions - 1) {

            QuestionUtils.showEndOfQuizMessage(this);
            return;
        }

        // else Move to next question
        currentQno.increment();
        moveToNextQuestion();
        next.setEnabled(false);
       
        groupoptions.clearSelection();
        submit.setEnabled(true);
    }

    public void setQuestionTextAndOptions() {
        qno.setText("Question #: " + currentQno);
        meter.setText("Score:" + score);
        question.setText("<html>" + questions.get(currentQuestionIndex).replace("{", "{\n").replace(":", ":\n").replace("}", "}\n").replace(";", ";\n").replace("\n", "<br>") + "</html>");
        opt1.setText(options.get(currentQuestionIndex).split(", ")[0]);
        opt2.setText(options.get(currentQuestionIndex).split(", ")[1]);
        opt3.setText(options.get(currentQuestionIndex).split(", ")[2]);
        opt4.setText(options.get(currentQuestionIndex).split(", ")[3]);
        opt1.setToolTipText(opt1.getText());
        opt2.setToolTipText(opt2.getText());
        opt3.setToolTipText(opt3.getText());
        opt4.setToolTipText(opt4.getText());
        
    }
    
    private void moveToNextQuestion() {

        if (currentQuestionIndex < questions.size()-1) {
            currentQuestionIndex++;
            setQuestionTextAndOptions();
        } else {
            QuestionUtils.showEndOfQuizMessage(this);
        }

    }
 
    private String getCorrectAnswer() {
        return answers.get(currentQuestionIndex).trim();
    }


    private void handleLifeLineOptions() {
        String selectedOption = (String) lifelineBox.getSelectedItem();
        switch (selectedOption) {
            case "50-50" -> handleLifeline();
            case "SkipQ" -> handleSkipQuestion();
            default -> {
            }
        }
    }

    private boolean checkMaxLifeLinesCrossed() {
        LIFE_LINES++;
        return LIFE_LINES <= MAX_LIFE_LINES;
    }

    public void checkForBadgesAndAchievements() {

        System.out.println("checking for badges and achievements!!");
        System.out.println(score);
        System.out.println(totalQuestions);
        if (score == totalQuestions) {
            if (!badgesEarned.contains(perfectScoreBadge)) {
                badgesEarned.add(perfectScoreBadge);
                JOptionPane.showMessageDialog(this, "You earned the Perfect Score badge!");
            }
        }
        else if (wrongAnswers == totalQuestions / 2) {
            if (!badgesEarned.contains(fiftyFiftyLuckBadge)) {
                badgesEarned.add(fiftyFiftyLuckBadge);
                JOptionPane.showMessageDialog(this, "you earned the 50-50 luck badge!");
            }
        }
        else if (LIFE_LINES == 0 && score == totalQuestions) {
            if (!badgesEarned.contains(fiftyFiftyLuckBadge)) {
                badgesEarned.add(fiftyFiftyLuckBadge);
                JOptionPane.showMessageDialog(this, "you earned super mind badge!");
            }
        }
        else if (maxStreak >= 5) {
            if (!badgesEarned.contains(streak5Badge)) {
                badgesEarned.add(streak5Badge);
                JOptionPane.showMessageDialog(this, "You earned the Streak 5 badge!");
            }
        }

        else if (maxStreak >= 10) {
            if (!badgesEarned.contains(streak10Badge)) {
                badgesEarned.add(streak10Badge);
                JOptionPane.showMessageDialog(this, "You earned the Streak 10 badge!");
            }
        }
           
    }

    public String formatCode(String code) {
        return code.replace("}", "}\n").replace(";", ";\n");
    }
    
}
