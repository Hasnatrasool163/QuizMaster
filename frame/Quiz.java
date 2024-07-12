package frame;

import static UserProfile.User_View.currentUser;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import main.Main;
import score.Score;
import utilities.Badge;
import utilities.BadgeManager;
import utilities.CurrentQno;
import utilities.LoadingDialog;
import utilities.QuestionType;
import utilities.QuestionUtils;

/**
 * @author MuhammadHasnatRasool
 */
public abstract class Quiz extends frame implements ActionListener {

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
    public int NUM_OPTIONS = 3;
    public JRadioButton option;
    public Color OPTION_COLOR = Color.decode("#C6F7D5");
    public Color WRONG_OPTION_COLOR = Color.decode("#FFA07A");
    public Color DEFAULT_COLOR = Color.WHITE;
    public int MAX_LIFE_LINES = 5;
    public int LIFE_LINES = 0;
    public int currentStreak = 0;
    public int maxStreak = 0;
    public int correctAnswersInSeries = 0;
    BadgeManager badgeManager = BadgeManager.getInstance();
    List<Badge> badgesEarned = badgeManager.getBadgesEarned();
    public static String name;
    List<JRadioButton> optionList;
    public int points = 0;

    public Quiz(String name) {
        Quiz.name = name;
        setLocationByPlatform(true);
        setAlwaysOnTop(true);
        setLocationRelativeTo(null);
        currentQno = new CurrentQno();
        questions = new ArrayList<>();
        options = new ArrayList<>();
        answers = new ArrayList<>();
        indices = new ArrayList<>();
//        badgesEarned = new ArrayList<>();
        pointslbl.setText("" + points);
        meter.setMinimumValue(0);
        meter.setMaximumValue(100);
        next.setEnabled(false);
        optionList = Arrays.asList(opt1, opt2, opt3, opt4);
        requestFocus();
           Quiz.this.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    handleSubmit();
                }
            }

            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    handleSubmit();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    handleSubmit();
                }
            }
        });
           next.requestFocus();
    }

    public abstract void loadQuestions();

    public void shuffleIndices() {
        for (int i = 0; i < questions.size(); i++) {
            indices.add(i);
        }
        Collections.shuffle(indices);
    }

    public void selectTotalQuestions() {
        String input = null;
        requestFocus();
        while (input == null || input.isEmpty()) {
            input = (String) JOptionPane.showInputDialog(this, "Enter number of questions : (1- " + questions.size() + ")", "Questions", JOptionPane.QUESTION_MESSAGE, new ImageIcon(ClassLoader.getSystemResource("icons/question.png")), null, 5);
        }
        totalQuestions = Integer.parseInt(input);
        if (totalQuestions < 1 || totalQuestions > questions.size()) {
            if (questions.size() > 4) {
                totalQuestions = 5;
                JOptionPane.showMessageDialog(this, "5 mcqs set as a default value!", "Default value selection", JOptionPane.WARNING_MESSAGE, new ImageIcon(ClassLoader.getSystemResource("icons/blob.png")));
            } else {
                totalQuestions = 1;
                JOptionPane.showMessageDialog(this, "1 mcqs set as a default value!", "Default value selection", JOptionPane.WARNING_MESSAGE, new ImageIcon(ClassLoader.getSystemResource("usericons/smiley-twist.png")));
            }
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
            String selectedOption = (String) lifelineBox.getSelectedItem();
            if (selectedOption.equals("50-50 Lifeline")) {
                handleLifeline();
            } else if (selectedOption.equals("Skip Question")) {
                handleSkipQuestion();
            }
        }
    }

    private void handleNext() {
        clearFeedback();
        updateMeter();
        QuestionUtils.setOptionsEnabled(optionList, true);
        QuestionUtils.clearOptionBackground(optionList);
        currentQuestionIndex = indices.get((indices.indexOf(currentQuestionIndex) + 1) % questions.size());
        if (indices.indexOf(currentQuestionIndex) >= totalQuestions) {
            if(currentUser==null){
            new Score(name, score,points ,wrongAnswers, totalQuestions,badgesEarned).setVisible(true);
            setVisible(false);
            dispose();}
            else{
               
                new Score(currentUser,points, score, wrongAnswers, totalQuestions, badgesEarned, QuestionType.MCQ).setVisible(true);
            setVisible(false);
            this.dispose();
            
        }}
        else {
            currentQno.increment();
            setQuestionTextAndOptions();
            next.setEnabled(false);
            groupoptions.clearSelection();
        }
    }

    private void handleBack() {
        setVisible(false);
        Main.getInstance().setVisible(true);
    }

    private void handlePrev() {
        QuestionUtils.setOptionsEnabled(optionList, true);
        clearFeedback();
        if (currentQno.getCurrentQno() > 0) {
            currentQuestionIndex = indices.get((indices.indexOf(currentQuestionIndex) - 1 + questions.size()) % questions.size());
            currentQno.decrement();
            meter.setText("Score:" + score);
            setQuestionTextAndOptions();
            groupoptions.clearSelection();
        }
    }

    private void handleSubmit() {
        if (QuestionUtils.getSelectedOption(groupoptions, optionList) == null) {
            JOptionPane.showMessageDialog(this, "Choose any option first", "None of options selected", JOptionPane.WARNING_MESSAGE, new ImageIcon(ClassLoader.getSystemResource("icons/ghost.png")));
            return;
        }
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
            points += 10;
            updatePointsIcon();
            meter.setText("Score:" + score);
            pointslbl.setText("" + points);
            correctAnswersInSeries++;
            currentStreak = correctAnswersInSeries;
            if (currentStreak > maxStreak) {
                maxStreak = currentStreak;
            }
            next.setEnabled(true);
            handleAchievements();
        } else {
            QuestionUtils.clearOptionBackground(optionList);
            submit.setEnabled(false);
            PlaySound.playSound("wrong.wav");
            feedback.setText("Wrong! Answer is: " + getCorrectAnswer());
            wrongAnswers++;
            points -= 5;
            updatePointsIcon();
            pointslbl.setText("" + points);
            lifelineBox.setEnabled(false);
            prev.setEnabled(false);
            next.setEnabled(true);
            if (correctAnswersInSeries > 10) {
                JOptionPane.showMessageDialog(this, "Oops, you lost the streak! Don't lose hope, try again!", "Lost Streak", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(ClassLoader.getSystemResource("usericons/heart-break.png")));
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
                
            new Score(currentUser, score,points, wrongAnswers, totalQuestions, badgesEarned, QuestionType.MCQ).setVisible(true);

            setVisible(false);
            dispose();
            }
        
        }
        submit.setEnabled(false);
        next.setEnabled(true);
    }
    
    
    private String cleanAnswer(String answer) {
        return answer.replaceAll("[^a-zA-Z]", "").trim();
    }

    private void handleLifeline() {
        if (checkMaxLifeLinesCrossed()) {
            String correctAnswer = answers.get(currentQuestionIndex);
            ArrayList<String> allOptions = new ArrayList<>(Arrays.asList(opt1.getText(), opt2.getText(), opt3.getText(), opt4.getText()));
            allOptions.remove(correctAnswer);
            int disableIndex1 = (int) (Math.random() * allOptions.size());
            String disableOption1 = allOptions.get(disableIndex1);
            allOptions.remove(disableIndex1);
            int disableIndex2 = (int) (Math.random() * allOptions.size());
            String disableOption2 = allOptions.get(disableIndex2);

            JRadioButton option1 = getOptionByText(disableOption1);
            JRadioButton option2 = getOptionByText(disableOption2);

            option1.setEnabled(false);
            option2.setEnabled(false);

            LIFE_LINES++;
        } else {
            JOptionPane.showMessageDialog(this, "You have used maximum 5 life-lines! Sorry", "Life-line limit", JOptionPane.WARNING_MESSAGE, new ImageIcon(ClassLoader.getSystemResource("usericons/smiley-sad.png")));
        }
    }

    private void handleSkipQuestion() {
        if (checkMaxLifeLinesCrossed()) {
            if (currentQuestionNumber <= totalQuestions) {
                currentQuestionIndex = indices.get(currentQuestionNumber++);
                setQuestionTextAndOptions();
            }
            LIFE_LINES++;
        } else {
            JOptionPane.showMessageDialog(this, "You have used maximum 5 life-lines! Sorry", "Life-line limit", JOptionPane.WARNING_MESSAGE, new ImageIcon(ClassLoader.getSystemResource("usericons/smiley-sad.png")));
        }
    }

    private JRadioButton getOptionByText(String text) {
        for (JRadioButton opt : optionList) {
            if (opt.getText().equals(text)) {
                return opt;
            }
        }
        return null;
    }

    private boolean checkMaxLifeLinesCrossed() {
        return LIFE_LINES < MAX_LIFE_LINES;
    }

   private boolean checkAnswer() {
    JRadioButton selectedOption = QuestionUtils.getSelectedOption(groupoptions, optionList);
    if (selectedOption == null) {
        return false;
    }
    String selectedText = cleanAnswer(selectedOption.getText());
    String correctAnswer = cleanAnswer(answers.get(currentQuestionIndex));
    return selectedText.equalsIgnoreCase(correctAnswer);
}



    private String getCorrectAnswer() {
        return answers.get(currentQuestionIndex);
    }

    public void setQuestionTextAndOptions() {
        question.setText(questions.get(currentQuestionIndex));
        opt1.setText(options.get(currentQuestionIndex * NUM_OPTIONS));
        opt2.setText(options.get(currentQuestionIndex * NUM_OPTIONS + 1));
        opt3.setText(options.get(currentQuestionIndex * NUM_OPTIONS + 2));
        opt4.setText(options.get(currentQuestionIndex * NUM_OPTIONS + 3));
    }

    private void updatePointsIcon() {
        if (points >= 0 && points <= 30) {
            pointslbl.setIcon(new ImageIcon(ClassLoader.getSystemResource("usericons/point-bronze.png")));
        } else if (points >= 31 && points <= 60) {
            pointslbl.setIcon(new ImageIcon(ClassLoader.getSystemResource("usericons/point.png")));
        } else if (points >= 61 && points <= 90) {
            pointslbl.setIcon(new ImageIcon(ClassLoader.getSystemResource("usericons/points.png")));
        } else if (points >= 91 && points <= 120) {
            pointslbl.setIcon(new ImageIcon(ClassLoader.getSystemResource("icons/cake.png")));
        } else if (points >= 121 && points <= 150) {
            pointslbl.setIcon(new ImageIcon(ClassLoader.getSystemResource("icons/cup.png")));
        } else if (points >= 151) {
            pointslbl.setIcon(new ImageIcon(ClassLoader.getSystemResource("usericons/star.png")));
        }
    }

    private void addBadge(String title, String message,ImageIcon icon) {
        Badge badge = new Badge(title, message);
        badgesEarned.add(badge);
        JOptionPane.showMessageDialog(this, badge.getDescription(), "Achievement Unlocked", JOptionPane.INFORMATION_MESSAGE, icon);
    }
    private void handleAchievements() {
        ImageIcon trophyIcon = new ImageIcon(ClassLoader.getSystemResource("usericons/trophy.png"));
        if (correctAnswersInSeries >= 10) {
            addBadge("10 Correct Answers in a Row", "You have answered 10 questions correctly in a row!",trophyIcon);
        }
        if (currentStreak >= 20) {
            addBadge("20 Correct Answers in a Row", "You have answered 20 questions correctly in a row!",new ImageIcon(ClassLoader.getSystemResource("usericons/smiley-cool.png")));
        }
        if (score >= 50) {
            addBadge("Score 50 Points", "You have scored 50 points!",new ImageIcon(ClassLoader.getSystemResource("usericons/smiley-roll.png")));
        }
        if (score >= 100) {
            addBadge("Score 100 Points", "You have scored 100 points!",new ImageIcon(ClassLoader.getSystemResource("usericons/medal-bronze-red.png")));
        }
        if (wrongAnswers == 0 && currentQno.getCurrentQno() >= totalQuestions) {
            addBadge("Perfect Score", "You have completed the quiz with no wrong answers!",new ImageIcon(ClassLoader.getSystemResource("usericons/smiley-angel.png")));
        }
        if (LIFE_LINES == 0 && currentQno.getCurrentQno() >= totalQuestions) {
            addBadge("No Lifelines Used", "You have completed the quiz without using any lifelines!",new ImageIcon(ClassLoader.getSystemResource("usericons/skull-happy.png")));
        }
        if (maxStreak >= 15) {
            addBadge("15 Correct Answers in a Row", "You have answered 15 questions correctly in a row!",trophyIcon);
        }
        if (totalQuestions >= 50) {
            addBadge("Quiz Master", "You have answered 50 questions!",new ImageIcon(ClassLoader.getSystemResource("usericons/medal-silver-premium.png")));
        }
        if (totalQuestions >= 100) {
            addBadge("Quiz Legend", "You have answered 100 questions!",new ImageIcon(ClassLoader.getSystemResource("usericons/medal-premium.png")));
        }
        if (points >= 100) {
            addBadge("200 Points Club", "You have scored 200 points!",new ImageIcon(ClassLoader.getSystemResource("usericons/medal-silver-red.png")));
        }
        if (points >= 200) {
            addBadge("200 Points Club", "You have scored 200 points!",new ImageIcon(ClassLoader.getSystemResource("usericons/medal-silver.png")));
        }
    }

    private void updateMeter() {
        int percentage = (int) (((double) currentQno.getCurrentQno() / totalQuestions) * 100);
        meter.setProgress(percentage);
    }

    private void clearFeedback() {
        feedback.setText("");
        lifelineBox.setEnabled(true);
        submit.setEnabled(true);
    }

    
}
