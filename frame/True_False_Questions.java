package frame;

import static UserProfile.User_View.currentUser;
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
import utilities.QuestionType;
import utilities.QuestionUtils;
/**
 * Author: MuhammadHasnatRasool
 */
public abstract class True_False_Questions extends True_False_Frame implements ActionListener {

    protected CurrentQno currentQno;
    protected ArrayList<String> questions;
    protected ArrayList<String> answers;
    protected int currentQuestionIndex;
    protected int wrongAnswers;
    protected int score;
    protected int totalQuestions;
    protected JRadioButton option;
    protected List<Integer> indices;
    protected int currentStreak = 0;
    protected int maxStreak = 0;
    protected int correctAnswersInSeries = 0;
    List<JRadioButton> optionList;
    BadgeManager badgeManager = BadgeManager.getInstance();
    List<Badge> badgesEarned = badgeManager.getBadgesEarned();
    public int points=0;

    public True_False_Questions(String name) {
        True_False_Questions.name=name;
        setLocationRelativeTo(null);
        currentQno = new CurrentQno();
        questions = new ArrayList<>();
        answers = new ArrayList<>();
        indices = new ArrayList<>();
//        badgesEarned = new ArrayList<>();
        setupQuiz();
        setQuestionTextAndOptions();
        meter.setMinimumValue(0);
        meter.setMaximumValue(100);
        next.setEnabled(false);
        optionList = Arrays.asList(trueOption,falseOption);
    }
    
     private void setupQuiz() {
        loadQuestions();
        QuestionUtils.shuffleIndices(indices, questions.size());
        totalQuestions = QuestionUtils.selectTotalQuestions(totalQuestions,questions.size(),meter);
        currentQuestionIndex = QuestionUtils.setCurrentQuestion(0,indices);
        setQuestionTextAndOptions();
    }

    protected abstract void loadQuestions();
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == next) {
            handleNext();
        } else if (e.getSource() == back) {
            handleBack();
        } else if (e.getSource() == trueOption || e.getSource() == falseOption) {
            handleSubmit();
        } else if (e.getSource() == submit) {
            handleMessage();
        }
    }

    protected void handleNext() {
        submit.setEnabled(true);
        QuestionUtils.setOptionsEnabled(optionList,true);
        QuestionUtils.updateMeterClearSelection(meter,currentQno,totalQuestions,score,group);
        currentQuestionIndex = indices.get((indices.indexOf(currentQuestionIndex) + 1) % questions.size());
        if (indices.indexOf(currentQuestionIndex) >= totalQuestions) {
            if(currentUser==null){
            new Score(name, score,points, wrongAnswers, totalQuestions,badgesEarned).setVisible(true);
            setVisible(false);
            dispose();}
            else{
//                 UserData userData = UserData.loadUserData().get(name);
                new Score(currentUser, score,points, wrongAnswers, totalQuestions, badgesEarned, QuestionType.TRUE_FALSE).setVisible(true);
            setVisible(false);
            this.dispose();
            }
        } else {
            showNextQuestion();
        }
    }

    protected void handleBack() {
        setVisible(false);
        new Menu().setVisible(true);
    }

    protected void handleSubmit() {
        if ((trueOption.isSelected() && getCorrectAnswer().equals("True"))
                || (falseOption.isSelected() && getCorrectAnswer().equals("False"))) {
            score++;
            points+=10;
            pointslbl.setText(""+points);
            meter.setText("Score:" + score);
            PlaySound.playSound("correct.wav");
            feedback.setText("Correct!");
            manageStreak();
            submit.setEnabled(false);
            QuestionUtils.setOptionsDisable(optionList);
        } else {
            PlaySound.playSound("wrong.wav");
            feedback.setText("Incorrect! " + "It Was ->  " + getCorrectAnswer());
            wrongAnswers++;
            points-=5;
            pointslbl.setText(""+points);
            if (correctAnswersInSeries > 10) {
                JOptionPane.showMessageDialog(this, "Oops! You lost the streak! Don't lose hope, try again!");
            }
            correctAnswersInSeries = 0;
            currentStreak = 0;
            submit.setEnabled(false);
            QuestionUtils.setOptionsDisable(optionList);
        }
         if (currentQno.getCurrentQno() >= totalQuestions) {
            JOptionPane.showMessageDialog(this, "Quiz completed. Your score is: " + score);
            dispose();
             if(currentUser==null){
            new Score(name, score,points, wrongAnswers, totalQuestions,badgesEarned).setVisible(true);
            setVisible(false);
            dispose();}
            else{
//                UserData userData = UserData.loadUserData().get(name);
        new Score(currentUser, score,points, wrongAnswers, totalQuestions, badgesEarned, QuestionType.TRUE_FALSE).setVisible(true);
            setVisible(false);
            dispose();
            }
        }
        submit.setEnabled(false);
        next.setEnabled(true);
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
    

    protected final void setQuestionTextAndOptions() {
        qno.setText("Question #: " + currentQno);
        question.setText(questions.get(currentQuestionIndex));
    }

    protected String getCorrectAnswer() {
        return answers.get(currentQuestionIndex);
    }

    protected void showNextQuestion() {
        feedback.setText("");
        currentQno.increment();
        setQuestionTextAndOptions();
        next.setEnabled(false);
        submit.setEnabled(true);
    }

    protected void handleMessage() {
        JOptionPane.showMessageDialog(this, "Choose True or False!", "Answer not selected", JOptionPane.WARNING_MESSAGE, new ImageIcon(ClassLoader.getSystemResource("icons/ghost.png")));
    }
}
