
package Concepts;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GenericsGUIs extends JFrame {

    private JTextArea theoryTextArea;
    private JTextArea codeTextArea;
    private JTextArea quizTextArea;
    private JButton checkQuizButton;

    public GenericsGUIs() {
        // Set up the frame
        setTitle("Java Generics");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set up the content
        setupContent();
    }

    private void setupContent() {
        // Theory section
        theoryTextArea = new JTextArea();
        theoryTextArea.setText(getTheoryText());
        theoryTextArea.setEditable(false);
        theoryTextArea.setBackground(Color.ORANGE);
        theoryTextArea.setFont(new Font("Tahoma", Font.PLAIN, 16));
        JScrollPane theoryScrollPane = new JScrollPane(theoryTextArea);

        // Code section
        codeTextArea = new JTextArea();
        codeTextArea.setText(getExampleCode());
        codeTextArea.setEditable(false);
        codeTextArea.setFont(new Font("Courier New", Font.PLAIN, 16));
        JScrollPane codeScrollPane = new JScrollPane(codeTextArea);

        // Quiz section
        quizTextArea = new JTextArea();
        quizTextArea.setText(getQuizQuestions());
        quizTextArea.setEditable(true);
        quizTextArea.setFont(new Font("Tahoma", Font.PLAIN, 16));
        quizTextArea.setForeground(new Color(30,144,255)); 
        JScrollPane quizScrollPane = new JScrollPane(quizTextArea);

        checkQuizButton = new JButton("Check Quiz");
        checkQuizButton.setFont(new Font("Tahoma", Font.BOLD, 16));
        checkQuizButton.setBackground(new Color(30,144,255));
        checkQuizButton.setForeground(Color.WHITE);

        JPanel quizPanel = new JPanel(new BorderLayout());
        quizPanel.add(new JLabel("Answer True/False below in front of questions:"), BorderLayout.NORTH);
        quizPanel.add(quizScrollPane, BorderLayout.CENTER);
        quizPanel.add(checkQuizButton, BorderLayout.SOUTH);

        // Split panes
        JSplitPane verticalSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, theoryScrollPane, codeScrollPane);
        verticalSplitPane.setDividerLocation(250);

        JSplitPane mainSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, verticalSplitPane, quizPanel);
        mainSplitPane.setDividerLocation(500);

        // Add the main split pane to the frame
        add(mainSplitPane);

        // Add action listener to the quiz button
        checkQuizButton.addActionListener((ActionEvent e) -> {
            checkQuiz();
        });
    }

    private String getTheoryText() {
        return """
               Generics in Java allow you to create classes, interfaces, and methods that operate with types (classes and interfaces) as parameters.
               
               Benefits of Generics:
               1. Type safety: Detect errors at compile time rather than runtime.
               2. Reusability: Write code that can be reused with different types.
               3. Eliminate type casting: Code becomes more readable and less prone to errors.
               
               Example of a Generic Class:
               public class Box<T> {
                   private T item;

                   public void setItem(T item) {
                       this.item = item;
                   }

                   public T getItem() {
                       return item;
                   }
               }
               
               Example of Using Generics:
               Box<Integer> integerBox = new Box<>();
               integerBox.setItem(10);
               Integer value = integerBox.getItem();
               """;
    }

    private String getExampleCode() {
        return """
               public class Box<T> {
                   private T item;

                   public void setItem(T item) {
                       this.item = item;
                   }

                   public T getItem() {
                       return item;
                   }
               }

               public class GenericsExample {
                   public static void main(String[] args) {
                       Box<Integer> integerBox = new Box<>();
                       integerBox.setItem(10);
                       Integer value = integerBox.getItem();
                       System.out.println("Value: " + value);
                   }
               }
               """;
    }

    private String getQuizQuestions() {
        return """
               1. Generics in Java allow you to create classes, interfaces, and methods that operate with types as parameters. (True/False)
               2. Generics help in detecting errors at runtime rather than compile time. (True/False)
               3. Type casting is eliminated by using generics. (True/False)
               4. In a generic class 'Box<T>', T can be replaced with any class type. (True/False)
               """;
    }

    private void checkQuiz() {
        String[] answers = quizTextArea.getText().split("\n");
        int correctCount = 0;
        if (answers[0].trim().endsWith("True")) correctCount++;
        if (answers[1].trim().endsWith("False")) correctCount++;
        if (answers[2].trim().endsWith("True")) correctCount++;
        if (answers[3].trim().endsWith("True")) correctCount++;

        JOptionPane.showMessageDialog(this,
                "You got " + correctCount + " out of 4 correct.",
                "Quiz Results",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GenericsGUIs frame = new GenericsGUIs();
            frame.setVisible(true);
        });
    }
}
