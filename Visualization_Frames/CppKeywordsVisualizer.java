package Visualization_Frames;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CppKeywordsVisualizer extends JFrame {

    private JEditorPane panel;
    JScrollPane scrollPane;
    private ArrayList<String> keywords;
    private ArrayList<String> purposes;

    public CppKeywordsVisualizer() {
        setTitle("Cpp-Keywords");
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setLocationByPlatform(true);
        setAlwaysOnTop(true);
        
        keywords = new ArrayList<>();
        purposes = new ArrayList<>();
        keywords.add("auto");
        keywords.add("break");
        keywords.add("case");
        keywords.add("char");
        keywords.add("const");
        keywords.add("continue");
        keywords.add("default");
        keywords.add("do");
        keywords.add("double");
        keywords.add("else");
        keywords.add("enum");
        keywords.add("extern");
        keywords.add("float");
        keywords.add("for");
        keywords.add("goto");
        keywords.add("if");
        keywords.add("inline");
        keywords.add("int");
        keywords.add("long");
        keywords.add("register");
        keywords.add("restrict");
        keywords.add("return");
        keywords.add("short");
        keywords.add("signed");
        keywords.add("sizeof");
        keywords.add("static");
        keywords.add("struct");
        keywords.add("switch");
        keywords.add("typedef");
        keywords.add("union");
        keywords.add("unsigned");
        keywords.add("void");
        keywords.add("volatile");
        keywords.add("while");
        keywords.add("class");
        keywords.add("delete");
        keywords.add("friend");
        keywords.add("new");
        keywords.add("operator");
        keywords.add("private");
        keywords.add("protected");
        keywords.add("public");
        keywords.add("template");
        keywords.add("this");
        keywords.add("throw");
        keywords.add("try");
        keywords.add("virtual");

        purposes.add("Automatic variable");
        purposes.add("Break out of loop");
        purposes.add("Case in switch");
        purposes.add("Character type");
        purposes.add("Constant variable");
        purposes.add("Continue to next iteration");
        purposes.add("Default case");
        purposes.add("Do-while loop");
        purposes.add("Double precision floating point");
        purposes.add("Else clause");
        purposes.add("Enumeration");
        purposes.add("External variable");
        purposes.add("Floating point");
        purposes.add("For loop");
        purposes.add("Go to label");
        purposes.add("If statement");
        purposes.add("Inline function");
        purposes.add("Integer type");
        purposes.add("Long integer type");
        purposes.add("Register variable");
        purposes.add("Restrict keyword");
        purposes.add("Return from function");
        purposes.add("Short integer type");
        purposes.add("Signed integer type");
        purposes.add("Size of type");
        purposes.add("Static variable");
        purposes.add("Struct type");
        purposes.add("Switch statement");
        purposes.add("Type definition");
        purposes.add("Union type");
        purposes.add("Unsigned integer type");
        purposes.add("Void type");
        purposes.add("Volatile variable");
        purposes.add("While loop");
        purposes.add("Class definition");
        purposes.add("Delete operator");
        purposes.add("Friend function");
        purposes.add("New operator");
        purposes.add("Operator overloading");
        purposes.add("Private access specifier");
        purposes.add("Protected access specifier");
        purposes.add("Public access specifier");
        purposes.add("Template metaprogramming");
        purposes.add("This pointer");
        purposes.add("Throw exception");
        purposes.add("Try-catch block");
        purposes.add("Virtual function");

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

            JTextField purposeField = new JTextField(purposes.get(i));
            purposeField.setFont(new Font("Tahoma", Font.PLAIN, 18));
            purposeField.setBounds(x + 220, y, width, height);
            purposeField.setForeground(Color.ORANGE);
            purposeField.setEditable(false);
            contentPanel.add(purposeField);

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
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CppKeywordsVisualizer().setVisible(true);
    }
}
