package utilities;

import frame.True_False_Questions;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.filechooser.FileNameExtensionFilter;

public class UserTrueFalse extends True_False_Questions {

    public UserTrueFalse(String name) {
        super(name);
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
            setQuestionTextAndOptions();
            setVisible(true);
        }
    }


    public static void main(String[] args) {
        new UserTrueFalse("User").setVisible(true);
    }
}
