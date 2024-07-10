package utilities;

import frame.Quiz;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.filechooser.FileNameExtensionFilter;

public class UserQuiz extends Quiz {

    public UserQuiz(String name) {
        super(name);
        loadQuestions();
        startQuiz();
    }

    @Override
    public final void loadQuestions() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files", "txt"));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            try (BufferedReader br = new BufferedReader(new FileReader(fileChooser.getSelectedFile()))) {
        
                String line;
                while ((line = br.readLine()) != null) {
                    if (line.startsWith("questions.add")) {
                        questions.add(line.substring(line.indexOf("\"") + 1, line.lastIndexOf("\"")));
                    } else if (line.startsWith("options.add")) {
                        options.add(line.substring(line.indexOf("\"") + 1, line.lastIndexOf("\"")));
                    } else if (line.startsWith("answers.add")) {
                        answers.add(line.substring(line.indexOf("\"") + 1, line.lastIndexOf("\"")));
                    }
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error loading questions from file "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(result == JFileChooser.CANCEL_OPTION){
            JOptionPane.showMessageDialog(this, "You have not selected any txt file , an empty frame will be displayed!!","File not selected",JOptionPane.WARNING_MESSAGE);
        }

    }
    
    

    public final void startQuiz() {
        if (questions.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No questions loaded. Exiting quiz.", "Error", JOptionPane.ERROR_MESSAGE);
            dispose();
        } else {
            shuffleIndices();
            selectTotalQuestions();
            setCurrentQuestion();
            setQuestionTextAndOptions();
            setVisible(true);
        }
    }

    @Override
    public void setQuestionTextAndOptions() {
        qno.setText("Question #: " + currentQno);
        question.setText(questions.get(currentQuestionIndex));
        String[] optionsArray = options.get(currentQuestionIndex).split(", ");
        opt1.setText(optionsArray[0]);
        opt2.setText(optionsArray[1]);
        opt3.setText(optionsArray[2]);
        opt4.setText(optionsArray[3]);
    }

  
    public String getSelectedOption() {
        if (opt1.isSelected()) {
            return "A) " + opt1.getText();
        } else if (opt2.isSelected()) {
            return "B) " + opt2.getText();
        } else if (opt3.isSelected()) {
            return "C) " + opt3.getText();
        } else if (opt4.isSelected()) {
            return "D) " + opt4.getText();
        }
        return null;
    }

    public static void main(String[] args) {
        new UserQuiz("User").setVisible(true);
    }
}
