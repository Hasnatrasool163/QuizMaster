package utilities;

import Hasnat.HMeter;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

/**
 * Utility class for handling common question-related functionalities.
 * 
 *
 * @author MuhammadHasnatRasool
 */
 
// to do need to add badges , achievments and more common methods here !
public class QuestionUtils {
    public static Color OPTION_COLOR = Color.decode("#C6F7D5");
    public static Color WRONG_OPTION_COLOR = Color.decode("#FFA07A");
    public static Color DEFAULT_COLOR = Color.WHITE;

    public static void shuffleIndices(List<Integer> indices, int size) {
        for (int i = 0; i < size; i++) {
            indices.add(i);
        }
        Collections.shuffle(indices);
    }

    public static int selectTotalQuestions(int totalQuestions, int size, HMeter meter) {
        String input = null;
        while (input == null || input.isEmpty()) {
            input = (String) JOptionPane.showInputDialog(null, "Enter number of questions: (1- " + size + ")", "Questions", JOptionPane.QUESTION_MESSAGE, new ImageIcon(ClassLoader.getSystemResource("icons/question.png")), null, 5);
        }
        totalQuestions = Integer.parseInt(input);
        if (totalQuestions < 1 || totalQuestions > size) {
            JOptionPane.showMessageDialog(null, "5 mcqs set as a default value!", "Default value selection", JOptionPane.WARNING_MESSAGE, new ImageIcon(ClassLoader.getSystemResource("icons/blob.png")));
            totalQuestions = 5;
        }
        meter.setMaximumValue(100);
        return totalQuestions;
    }

    public static String getCorrectAnswer(ArrayList<String> answers, int currentQuestionIndex) {
        return answers.get(currentQuestionIndex);
    }

    public static void updateMeterClearSelection(HMeter meter, CurrentQno currentQno, int totalQuestions, int score,ButtonGroup group) {
        group.clearSelection();
        int weightagePerQuestion = 100 / totalQuestions;
        int progress = currentQno.getCurrentQno() * weightagePerQuestion;
        meter.setProgress(progress);
        meter.setText("Score: " + score + " (" + progress + "%)");
    }

    public static void manageStreak(int currentStreak, int maxStreak, int correctAnswersInSeries, javax.swing.JFrame frame) {
        correctAnswersInSeries++;
        currentStreak = correctAnswersInSeries;
        if (currentStreak > maxStreak) {
            maxStreak = currentStreak;
        }
        switch (correctAnswersInSeries) {
            case 5 -> JOptionPane.showMessageDialog(frame, "You are doing great 5 in a row keep it up", "Achievement Unlocked!!", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(ClassLoader.getSystemResource("icons/smiley.png")));
            case 10 -> JOptionPane.showMessageDialog(frame, "You are a master 10 in a row keep it up", "Achievement Unlocked!!", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(ClassLoader.getSystemResource("icons/smiley2.png")));
            case 20 -> JOptionPane.showMessageDialog(frame, "You are a veteran 20 in a row no more words!!", "Achievement Unlocked!!", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(ClassLoader.getSystemResource("icons/cup.png")));
            default -> {
            }
        }
    }
    
   public static JRadioButton getSelectedOption(ButtonGroup group, List<JRadioButton> options) {
        for (JRadioButton option : options) {
            if (option.isSelected()) {
                return option;
            }
        }
        return null;
    }

    public static void setOptionsEnabled(List<JRadioButton> options, boolean enabled) {
        for (JRadioButton option : options) {
            option.setEnabled(enabled);
        }
    }
    
    public static void setOptionsDisable(List<JRadioButton> options) {
        for (JRadioButton option : options) {
            option.setEnabled(false);
        }
    }

    public static void clearOptionSelection(ButtonGroup group) {
        group.clearSelection();
    }

    public static void clearOptionBackground(List<JRadioButton> options) {
        for (JRadioButton option : options) {
            option.setBackground(Color.WHITE);
        }
    }

    public static void setOptionsVisible(List<JRadioButton> options, boolean visible) {
        for (JRadioButton option : options) {
            option.setVisible(visible);
        }
    }
    
     public static int setCurrentQuestion(int currentQuestionIndex,List<Integer> indices) {
        return currentQuestionIndex = indices.get(0);
    }
     
    public static void showMaxLifelinesUsedMessage(Component parentComponent) {
        JOptionPane.showMessageDialog(parentComponent, "All life lines already used", "Life-Lines", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void showEndOfQuizMessage(Component parentComponent) {
        JOptionPane.showMessageDialog(parentComponent, "You have reached the end of the quiz.", "End of Quiz", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void showNoQuestionAvailable(Component parentComponent) {
        JOptionPane.showMessageDialog(parentComponent, "Already at start cannot go back", "Start of Questions", JOptionPane.WARNING_MESSAGE);
    }
}



