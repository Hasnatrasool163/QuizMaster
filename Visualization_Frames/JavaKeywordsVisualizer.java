package Visualization_Frames;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class JavaKeywordsVisualizer extends JFrame {

    private JEditorPane panel;
    JScrollPane scrollPane;
    private ArrayList<String> keywords;
    private ArrayList<String> purposes;
    private ArrayList<String> reservedWords;

    public JavaKeywordsVisualizer() {
        setTitle("Java-Keywords");
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setLocationByPlatform(true);
        setAlwaysOnTop(true);
        
        keywords = new ArrayList<>();
        purposes = new ArrayList<>();
        reservedWords = new ArrayList<>();

        keywords.add("abstract");
        keywords.add("assert");
        keywords.add("boolean");
        keywords.add("break");
        keywords.add("byte");
        keywords.add("case");
        keywords.add("catch");
        keywords.add("char");
        keywords.add("class");
        keywords.add("continue");
        keywords.add("default");
        keywords.add("do");
        keywords.add("double");
        keywords.add("else");
        keywords.add("enum");
        keywords.add("export");
        keywords.add("extends");
        keywords.add("final");
        keywords.add("finally");
        keywords.add("float");
        keywords.add("for");
        keywords.add("goto");
        keywords.add("if");
        keywords.add("implements");
        keywords.add("import");
        keywords.add("instanceof");
        keywords.add("int");
        keywords.add("interface");
        keywords.add("long");
        keywords.add("native");
        keywords.add("new");
        keywords.add("package");
        keywords.add("private");
        keywords.add("protected");
        keywords.add("public");
        keywords.add("return");
        keywords.add("short");
        keywords.add("static");
        keywords.add("strictfp");
        keywords.add("super");
        keywords.add("switch");
        keywords.add("synchronized");
        keywords.add("this");
        keywords.add("throw");
        keywords.add("throws");
        keywords.add("transient");
        keywords.add("try");
        keywords.add("void");
        keywords.add("volatile");
        keywords.add("while");

        purposes.add("Abstract class");
        purposes.add("Assert statement");
        purposes.add("Boolean type");
        purposes.add("Break out of loop");
        purposes.add("Byte type");
        purposes.add("Case in switch");
        purposes.add("Catch block");
        purposes.add("Character type");
        purposes.add("Class definition");
        purposes.add("Continue to next iteration");
        purposes.add("Default case");
        purposes.add("Do-while loop");
        purposes.add("Double precision floating point");
        purposes.add("Else clause");
        purposes.add("Enumeration");
        purposes.add("Export package");
        purposes.add("Extends class");
        purposes.add("Final variable");
        purposes.add("Finally block");
        purposes.add("Float type");
        purposes.add("For loop");
        purposes.add("Go to label");
        purposes.add("If statement");
        purposes.add("Implements interface");
        purposes.add("Import package");
        purposes.add("Instance of class");
        purposes.add("Integer type");
        purposes.add("Interface definition");
        purposes.add("Long type");
        purposes.add("Native method");
        purposes.add("New object");
        purposes.add("Package definition");
        purposes.add("Private access");
        purposes.add("Protected access");
        purposes.add("Public access");
        purposes.add("Return from method");
        purposes.add("Short type");
        purposes.add("Static variable");
        purposes.add("Strictfp keyword");
        purposes.add("Super class");
        purposes.add("Switch statement");
        purposes.add("Synchronized block");
        purposes.add("This pointer");
        purposes.add("Throw exception");
        purposes.add("Throws clause");
        purposes.add("Transient variable");
        purposes.add("Try-catch block");
        purposes.add("Void type");
        purposes.add("Volatile variable");
        purposes.add("While loop");
        
        reservedWords.add("true");
        reservedWords.add("false");
        reservedWords.add("null");

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        int x = 20;
        int y = 20;
        int width = 200;
        int height = 30;

        for (int i = 0; i < keywords.size(); i++) {
            JLabel keywordLabel = new JLabel(keywords.get(i));
            keywordLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
            keywordLabel.setForeground(new Color(30, 144, 255));
            keywordLabel.setBounds(x, y, width, height);
            contentPanel.add(keywordLabel);

            JTextField purposeLabel = new JTextField(purposes.get(i));
            purposeLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
            purposeLabel.setBounds(x + 220, y, width, height);
            purposeLabel.setForeground(Color.ORANGE);
            contentPanel.add(purposeLabel);

            y += 40;
        }

        for (int i = 0; i < reservedWords.size(); i++) {
            JLabel reservedWordLabel = new JLabel(reservedWords.get(i));
            reservedWordLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
            reservedWordLabel.setForeground(Color.RED);
            reservedWordLabel.setBounds(x, y, width, height);
            contentPanel.add(reservedWordLabel);

            JTextField purposeLabel = new JTextField("Reserved word");
            purposeLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
            purposeLabel.setBounds(x + 220, y, width, height);
            contentPanel.add(purposeLabel);

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

    public static void main(String[] args) {
        new JavaKeywordsVisualizer().setVisible(true);
    }
}
