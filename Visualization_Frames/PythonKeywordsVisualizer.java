package Visualization_Frames;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PythonKeywordsVisualizer extends JFrame {
    private JEditorPane panel;
    JScrollPane scrollPane;
    private ArrayList<String> keywords;
    private ArrayList<String> purposes;

    public PythonKeywordsVisualizer() {
        setTitle("Python Keywords");
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setLocationByPlatform(true);
        setAlwaysOnTop(true);

        keywords = new ArrayList<>();
        purposes = new ArrayList<>();

        keywords.add("and");
        keywords.add("as");
        keywords.add("assert");
        keywords.add("break");
        keywords.add("class");
        keywords.add("continue");
        keywords.add("def");
        keywords.add("del");
        keywords.add("elif");
        keywords.add("else");
        keywords.add("except");
        keywords.add("finally");
        keywords.add("for");
        keywords.add("from");
        keywords.add("global");
        keywords.add("if");
        keywords.add("import");
        keywords.add("in");
        keywords.add("is");
        keywords.add("lambda");
        keywords.add("nonlocal");
        keywords.add("not");
        keywords.add("or");
        keywords.add("pass");
        keywords.add("raise");
        keywords.add("return");
        keywords.add("try");
        keywords.add("while");
        keywords.add("with");
        keywords.add("yield");

        purposes.add("Logical and");
        purposes.add("Alias for import");
        purposes.add("Assert statement");
        purposes.add("Break out of loop");
        purposes.add("Class definition");
        purposes.add("Continue to next iteration");
        purposes.add("Function definition");
        purposes.add("Delete object");
        purposes.add("Else if clause");
        purposes.add("Else clause");
        purposes.add("Exception handling");
        purposes.add("Finally block");
        purposes.add("For loop");
        purposes.add("Import module");
        purposes.add("Global variable");
        purposes.add("If statement");
        purposes.add("Import module");
        purposes.add("In operator");
        purposes.add("Is operator");
        purposes.add("Lambda function");
        purposes.add("Nonlocal variable");
        purposes.add("Not operator");
        purposes.add("Logical or");
        purposes.add("Pass statement");
        purposes.add("Raise exception");
        purposes.add("Return from function");
        purposes.add("Try block");
        purposes.add("While loop");
        purposes.add("With statement");
        purposes.add("Yield from generator");

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
            purposeLabel.setEditable(false);
            contentPanel.add(purposeLabel);

            y += 40;
        }


        panel = new JEditorPane();
        panel.setContentType("text/html");
        panel.setBounds(0, 0, 780, 600);
        scrollPane = new JScrollPane(panel);
        scrollPane.setBounds(0, 0, 780, 550);
        scrollPane.getViewport().add(contentPanel);
        scrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        add(scrollPane);

        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PythonKeywordsVisualizer().setVisible(true);
    }
}