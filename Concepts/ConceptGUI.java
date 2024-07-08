package Concepts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class ConceptGUI<T extends ConceptHandler> extends JFrame {

    private JTextArea theoryTextArea;
    private JTextArea codeTextArea;
    private JTextArea quizTextArea;
    private JButton checkQuizButton;
    private T conceptHandler;

    public ConceptGUI(String title, T conceptHandler) {
        this.conceptHandler = conceptHandler;
        setTitle(title);
        setSize(900, 600);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        setupContent(conceptHandler);
    }

    private void setupContent(T conceptHandler) {
        theoryTextArea = new JTextArea();
        theoryTextArea.setText(conceptHandler.getTheoryText());
        theoryTextArea.setEditable(false);
        theoryTextArea.setBackground(Color.ORANGE);
        theoryTextArea.setFont(new Font("Tahoma", Font.PLAIN, 18));
        JScrollPane theoryScrollPane = new JScrollPane(theoryTextArea);

        codeTextArea = new JTextArea();
        codeTextArea.setText(conceptHandler.getExampleCode());
        codeTextArea.setEditable(false);
        codeTextArea.setFont(new Font("Courier New", Font.PLAIN, 16));
        JScrollPane codeScrollPane = new JScrollPane(codeTextArea);

        quizTextArea = new JTextArea();
        quizTextArea.setText(conceptHandler.getQuizQuestions());
        quizTextArea.setEditable(true);
        quizTextArea.setFont(new Font("Tahoma", Font.PLAIN, 16));
        quizTextArea.setForeground(new Color(30, 144, 255));
        JScrollPane quizScrollPane = new JScrollPane(quizTextArea);

        checkQuizButton = new JButton("Check Quiz");
        checkQuizButton.setFont(new Font("Tahoma", Font.BOLD, 16));
        checkQuizButton.setForeground(Color.WHITE);
        checkQuizButton.setBackground(new Color(30, 144, 255));

        JPanel quizPanel = new JPanel(new BorderLayout());
        quizPanel.add(new JLabel("Answer True/False in front of each question:"), BorderLayout.NORTH);
        quizPanel.add(quizScrollPane, BorderLayout.CENTER);
        quizPanel.add(checkQuizButton, BorderLayout.SOUTH);

        JSplitPane verticalSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, theoryScrollPane, codeScrollPane);
        verticalSplitPane.setDividerLocation(250);

        JSplitPane mainSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, verticalSplitPane, quizPanel);
        mainSplitPane.setDividerLocation(500);

        add(mainSplitPane);

        checkQuizButton.addActionListener((ActionEvent e) -> {
            checkQuiz();
        });
    }

    private void checkQuiz() {
        String[] userAnswers = quizTextArea.getText().split("\n");
        String[] correctAnswers = conceptHandler.getCorrectAnswers();
        int correctCount = 0;

        for (int i = 0; i < userAnswers.length && i < correctAnswers.length; i++) {
            String userAnswer = userAnswers[i].trim().split("\\s+")[1];
            if (userAnswer.equalsIgnoreCase(correctAnswers[i])) {
                correctCount++;
            }
        }

        JOptionPane.showMessageDialog(this,
                "You got " + correctCount + " out of " + correctAnswers.length + " correct.",
                "Quiz Results",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
ConceptGUI<StaticVsNonStaticConceptHandler> frame = new ConceptGUI<>("Java: Static vs. Non-Static", new StaticVsNonStaticConceptHandler());
            frame.setVisible(true);
        });
    }
}

// Example concept handler class for Static vs. Non-Static
class StaticVsNonStaticConceptHandler implements ConceptHandler {
    @Override
    public String getTheoryText() {
        return """
               In Java, the 'static' keyword can be applied to variables, methods, and inner classes. 
               Static:
               1. Static variables belong to the class rather than any specific instance.
               2. Static methods can be called without creating an instance of the class.
               3. Static inner classes can be accessed without an instance of the outer class.
               Non-Static:
               1. Non-static variables belong to an instance of the class.
               2. Non-static methods require an instance of the class to be called.
               3. Non-static inner classes require an instance of the outer class.""";
    }

    @Override
    public String getExampleCode() {
        return """
               public class StaticExample {
                   // Static variable
                   static int staticVar = 10;
                   // Non-static variable
                   int nonStaticVar = 20;
               
                   // Static method
                   public static void staticMethod() {
                       System.out.println("Static method called.");
                   }
               
                   // Non-static method
                   public void nonStaticMethod() {
                       System.out.println("Non-static method called.");
                   }
               
                   public static void main(String[] args) {
                       // Calling static method
                       staticMethod();
               
                       // Creating an instance to call non-static method
                       StaticExample example = new StaticExample();
                       example.nonStaticMethod();
                   }
               }""";
    }

    @Override
    public String getQuizQuestions() {
        return """
               1. Static methods can be called without creating an instance of the class. (True/False)
               2. Non-static variables belong to an instance of the class rather than any specific instance. (True/False)
               3. Static inner classes require an instance of the outer class. (True/False)
               4. Non-static methods require an instance of the class to be called. (True/False)
               """;
    }

    @Override
    public String[] getCorrectAnswers() {
        return new String[] {
            "True",
            "False",
            "False",
            "True"
        };
    }
}
