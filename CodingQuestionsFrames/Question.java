package CodingQuestionsFrames;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import static javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;

 /**
  * 
  * @author MuhammadHasnatRasool
  */

// helper class for showing Questions in split panel

public class Question {
    private String questionText;
    private String answer;
    JEditorPane answerText;
    JScrollPane pane;

    public Question(String questionText, String answer) {
        this.questionText = questionText;
        this.answer = answer;
    }

    public JSplitPane getPanel() {
        JLabel questionLabel = new JLabel(questionText);
        questionLabel.setForeground(new Color(30, 144, 255));
        questionLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
        pane = new JScrollPane(answerText);
        CodeFormatter formatter = new CodeFormatter();
        answerText = new JEditorPane("text/html",formatter.formatCode(answer));
        answerText.setFont(new Font("Tahoma", Font.PLAIN, 22));
        answerText.setBackground(Color.ORANGE);
        answerText.setForeground(Color.BLACK);
        answerText.setAutoscrolls(true);
        answerText.setOpaque(true);
        answerText.setSelectedTextColor(Color.WHITE);
        answerText.setEditable(false);
        answerText.setVisible(true);
      
   
         pane = new JScrollPane(answerText);
         pane.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_ALWAYS);

    JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, questionLabel, pane);
    splitPane.setDividerLocation(50);

    addQuestionListeners(answerText,pane);

    return splitPane;
}

    private void addQuestionListeners(final JEditorPane answerText,JScrollPane pane) {
        pane.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                answerText.setVisible(true);
                
            }

            
            public void mouseWheelMoved(MouseEvent e) {
                answerText.setVisible(true);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    answerText.setVisible(false);
                }
            }
        });
    }
    

}