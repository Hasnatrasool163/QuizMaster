package Visualization_Frames;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class JavaScriptKeywordsVisualizer extends JFrame {
    private JEditorPane panel;
    JScrollPane scrollPane;
    private ArrayList<String> keywords;
    private ArrayList<String> purposes;

    public JavaScriptKeywordsVisualizer() {
        setTitle("JavaScript Keywords");
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setLocationByPlatform(true);
        setAlwaysOnTop(true);

        keywords = new ArrayList<>();
        purposes = new ArrayList<>();

       
        keywords.add("break");
        keywords.add("case");
        keywords.add("catch");
        keywords.add("class");
        keywords.add("const");
        keywords.add("continue");
        keywords.add("debugger");
        keywords.add("default");
        keywords.add("delete");
        keywords.add("do");
        keywords.add("else");
        keywords.add("enum");
        keywords.add("export");
        keywords.add("extends");
        keywords.add("false");
        keywords.add("finally");
        keywords.add("for");
        keywords.add("function");
        keywords.add("get");
        keywords.add("if");
        keywords.add("implements");
        keywords.add("import");
        keywords.add("in");
        keywords.add("instanceof");
        keywords.add("interface");
        keywords.add("let");
        keywords.add("new");
        keywords.add("null");
        keywords.add("of");
        keywords.add("private");
        keywords.add("protected");
        keywords.add("public");
        keywords.add("return");
        keywords.add("static");
        keywords.add("super");
        keywords.add("switch");
        keywords.add("this");
        keywords.add("throw");
        keywords.add("true");
        keywords.add("try");
        keywords.add("typeof");
        keywords.add("var");
        keywords.add("void");
        keywords.add("while");
        keywords.add("with");
        keywords.add("yield");

        purposes.add("Break out of loop");
        purposes.add("Case in switch");
        purposes.add("Catch block");
        purposes.add("Class definition");
        purposes.add("Constant variable");
        purposes.add("Continue to next iteration");
        purposes.add("Debugger statement");
        purposes.add("Default case");
        purposes.add("Delete object");
        purposes.add("Do-while loop");
        purposes.add("Else clause");
        purposes.add("Enumeration");
        purposes.add("Export module");
        purposes.add("Extends class");
        purposes.add("False value");
        purposes.add("Finally block");
        purposes.add("For loop");
        purposes.add("Function definition");
        purposes.add("Get accessor");
        purposes.add("If statement");
        purposes.add("Implements interface");
        purposes.add("Import module");
        purposes.add("In operator");
        purposes.add("Instanceof operator");
        purposes.add("Interface definition");
        purposes.add("Let variable");
        purposes.add("New object");
        purposes.add("Null value");
        purposes.add("Of operator");
        purposes.add("Private access");
        purposes.add("Protected access");
        purposes.add("Public access");
        purposes.add("Return from function");
        purposes.add("Static variable");
        purposes.add("Super class");
        purposes.add("Switch statement");
        purposes.add("This pointer");
        purposes.add("Throw exception");
        purposes.add("True value");
        purposes.add("Try block");
        purposes.add("Typeof operator");
        purposes.add("Var variable");
        purposes.add("Void type");
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
            purposeLabel.setForeground(new java.awt.Color(10, 255, 143));
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
        new JavaScriptKeywordsVisualizer().setVisible(true);
    }
}

