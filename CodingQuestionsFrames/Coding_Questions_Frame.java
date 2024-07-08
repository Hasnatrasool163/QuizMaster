package CodingQuestionsFrames;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 * 
 * @author MuhammadHasnatRasool
 */


public abstract class Coding_Questions_Frame {
    private static final int WIDTH = 900;
    private static final int HEIGHT = 600;

    public static void main(String[] args) {
        JFrame frame = createFrame();
        frame.add(createUI());
        frame.pack();
        frame.setVisible(true);
    }

    private static JFrame createFrame() {
        JFrame frame = new JFrame("Coding-Questions");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLocationByPlatform(true);
        return frame;
    }

    private static JComponent createUI() {
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setPreferredSize(new Dimension(WIDTH, HEIGHT));

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1));

        Coding_Questions_Frame app = new Coding_Questions_Frame() {
            @Override
            public void loadQuestions(JPanel panel) {
                
            }
        };
        app.loadQuestions(panel);

        scrollPane.setViewportView(panel);
        return scrollPane;
    }

    public abstract void loadQuestions(JPanel panel);


}

