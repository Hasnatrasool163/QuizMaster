package Games;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class JavaKeywords extends JFrame {

    private JEditorPane panel;
    JScrollPane scrollPane;
    private ArrayList<String> keywords;
    private ArrayList<String> purposes;

    public JavaKeywords() {
        setTitle("Java-Keywords");
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setLocationByPlatform(true);
        setAlwaysOnTop(true);

        keywords = new ArrayList<>();
        purposes = new ArrayList<>();

        addKeywordsAndPurposes();

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        int x = 20;
        int y = 20;
        int width = 200;
        int height = 30;

        // Add keyword labels and text fields
        for (int i = 0; i < keywords.size(); i++) {
            JLabel keywordLabel = new JLabel(keywords.get(i));
            keywordLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
            keywordLabel.setForeground(new Color(30, 144, 255));
            keywordLabel.setBounds(x, y, width, height);
            contentPanel.add(keywordLabel);

            JTextField purposeLabel = new JTextField();
            purposeLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
            purposeLabel.setBounds(x + 220, y, width, height);
            purposeLabel.setForeground(Color.ORANGE);
            contentPanel.add(purposeLabel);

            // Add action listener to text field
            int finalI = i;
            purposeLabel.addActionListener(e -> {
                String userAnswer = purposeLabel.getText();
                String correctAnswer = purposes.get(finalI);
                if (isCorrectAnswer(userAnswer, correctAnswer)) {
                    purposeLabel.setForeground(Color.GREEN);
                } else {
                    purposeLabel.setForeground(Color.RED);
                }
            });

            y += 40;
        }

        panel = new JEditorPane();
        panel.setContentType("text/html"); // Set content type to HTML
        panel.setBounds(0, 0, 780, 600);
        scrollPane = new JScrollPane(panel);
        scrollPane.setBounds(0, 0, 780, 550); // Set bounds for scroll pane
        scrollPane.getViewport().add(contentPanel);
        scrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        add(scrollPane);

        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    private void addKeywordsAndPurposes() {
        keywords.add("abstract");
        purposes.add("Abstract class");

        keywords.add("assert");
        purposes.add("Assert statement");

        keywords.add("boolean");
        purposes.add("Boolean type");

        keywords.add("break");
        purposes.add("Break out of loop");

        keywords.add("byte");
        purposes.add("Byte type");

        keywords.add("case");
        purposes.add("Case in switch");

        keywords.add("catch");
        purposes.add("Catch block");

        keywords.add("char");
        purposes.add("Character type");

        keywords.add("class");
        purposes.add("Class definition");

        keywords.add("continue");
        purposes.add("Continue to next iteration");

        keywords.add("default");
        purposes.add("Default case");

        keywords.add("do");
        purposes.add("Do-while loop");

        keywords.add("double");
        purposes.add("Double precision floating point");

        keywords.add("else");
        purposes.add("Else clause");

        keywords.add("enum");
        purposes.add("Enumeration");

        keywords.add("export");
        purposes.add("Export package");

        keywords.add("extends");
        purposes.add("Extends class");

        keywords.add("final");
        purposes.add("Final variable");

        keywords.add("finally");
        purposes.add("Finally block");

        keywords.add("float");
        purposes.add("Float type");

        keywords.add("for");
        purposes.add("For loop");

        keywords.add("goto");
        purposes.add("Go to label");

        keywords.add("if");
        purposes.add("If statement");

        keywords.add("implements");
        purposes.add("Implements interface");

        keywords.add("import");
        purposes.add("Import package");

        keywords.add("instanceof");
        purposes.add("Instance of class");

        keywords.add("int");
        purposes.add("Integer type");

        keywords.add("interface");
        purposes.add("Interface definition");

        keywords.add("long");
        purposes.add("Long type");

        keywords.add("native");
        purposes.add("Native method");

        keywords.add("new");
        purposes.add("New object");

        keywords.add("package");
        purposes.add("Package definition");

        keywords.add("private");
        purposes.add("Private access");

        keywords.add("protected");
        purposes.add("Protected access");

        keywords.add("public");
        purposes.add("Public access");

        keywords.add("return");
        purposes.add("Return from method");

        keywords.add("short");
        purposes.add("Short type");

        keywords.add("static");
        purposes.add("Static variable");

        keywords.add("strictfp");
        purposes.add("Strictfp keyword");

        keywords.add("super");
        purposes.add("Super class");

        keywords.add("switch");
        purposes.add("Switch statement");

        keywords.add("synchronized");
        purposes.add("Synchronized block");

        keywords.add("this");
        purposes.add("This pointer");

        keywords.add("throw");
        purposes.add("Throw exception");

        keywords.add("throws");
        purposes.add("Throws clause");

        keywords.add("transient");
        purposes.add("Transient variable");

        keywords.add("try");
        purposes.add("Try-catch block");

        keywords.add("void");
        purposes.add("Void type");

        keywords.add("volatile");
        purposes.add("Volatile variable");

        keywords.add("while");
        purposes.add("While loop");
    }

    private boolean isCorrectAnswer(String userAnswer, String correctAnswer) {
        userAnswer = userAnswer.toLowerCase();
        correctAnswer = correctAnswer.toLowerCase();

        // Calculate similarity percentage
        double similarity = calculateSimilarity(userAnswer, correctAnswer);

        // Define a threshold (60% similarity)
        double threshold = 0.6;

        return similarity >= threshold;
    }

    private double calculateSimilarity(String s1, String s2) {
        int maxLength = Math.max(s1.length(), s2.length());
        if (maxLength == 0) return 1.0; 

        int matches = 0;
        for (int i = 0; i < s1.length() && i < s2.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                matches++;
            }
        }

        return (double) matches / maxLength;
    }

    public static void main(String[] args) {
        new JavaKeywords().setVisible(true);
    }
}
