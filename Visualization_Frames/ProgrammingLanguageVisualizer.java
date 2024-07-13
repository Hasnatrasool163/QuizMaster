package Visualization_Frames;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ProgrammingLanguageVisualizer extends JFrame {
    private JEditorPane panel;
    JScrollPane scrollPane;
    private ArrayList<String> programmingLanguages;
    private ArrayList<String> syntaxTrees;
    private ArrayList<String> controlFlows;

    public ProgrammingLanguageVisualizer() {
        setTitle("Programming Languages");
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setLocationByPlatform(true);
        setAlwaysOnTop(true);

        programmingLanguages = new ArrayList<>();
        syntaxTrees = new ArrayList<>();
        controlFlows = new ArrayList<>();

        programmingLanguages.add("Java");
        syntaxTrees.add("Class Declaration\n" +
                "  |--- Class Name\n" +
                "  |--- Methods\n" +
                "  |--- Variables");
        controlFlows.add("Sequence\n" +
                "  |--- Statements\n" +
                "  |--- Conditional Statements\n" +
                "  |--- Loops");

        programmingLanguages.add("Python");
        syntaxTrees.add("Indentation-based syntax\n" +
                "  |--- Functions\n" +
                "  |--- Conditional Statements\n" +
                "  |--- Loops");
        controlFlows.add("Indentation-based control flow\n" +
                "  |--- If-Else Statements\n" +
                "  |--- For Loops\n" +
                "  |--- While Loops");

        programmingLanguages.add("C++");
        syntaxTrees.add("Curly brace syntax\n" +
                "  |--- Functions\n" +
                "  |--- Conditional Statements\n" +
                "  |--- Loops");
        controlFlows.add("Curly brace control flow\n" +
                "  |--- If-Else Statements\n" +
                "  |--- For Loops\n" +
                "  |--- While Loops");
        programmingLanguages.add("JavaScript");
        syntaxTrees.add("Curly brace syntax\n" +
        " |--- Functions\n" +
        " |--- Conditional Statements\n" +
        " |--- Loops\n" +
        " |--- Objects");
        controlFlows.add("Curly brace control flow\n" +
        " |--- If-Else Statements\n" +
        " |--- For Loops\n" +
        " |--- While Loops\n" +
        " |--- Callbacks");
        programmingLanguages.add("Ruby");
        syntaxTrees.add("Indentation-based syntax\n" +
        " |--- Methods\n" +
        " |--- Conditional Statements\n" +
        " |--- Loops\n" +
        " |--- Blocks");
        controlFlows.add("Indentation-based control flow\n" +
        " |--- If-Else Statements\n" +
        " |--- For Loops\n" +
        " |--- While Loops\n" +
        " |--- Lambdas");
        programmingLanguages.add("Swift");
        syntaxTrees.add("Curly brace syntax\n" +
        " |--- Functions\n" +
        " |--- Conditional Statements\n" +
        " |--- Loops\n" +
        " |--- Closures");
        controlFlows.add("Curly brace control flow\n" +
        " |--- If-Else Statements\n" +
        " |--- For Loops\n" +
        " |--- While Loops\n" +
        " |--- Guard Statements");
        programmingLanguages.add("Go");
        syntaxTrees.add("Curly brace syntax\n" +
        " |--- Functions\n" +
        " |--- Conditional Statements\n" +
        " |--- Loops\n" +
        " |--- Goroutines");
        controlFlows.add("Curly brace control flow\n" +
        " |--- If-Else Statements\n" +
        " |--- For Loops\n" +
        " |--- While Loops\n" +
        " |--- Channels");
        programmingLanguages.add("Rust");
        syntaxTrees.add("Curly brace syntax\n" +
        " |--- Functions\n" +
        " |--- Conditional Statements\n" +
        " |--- Loops\n" +
        " |--- Ownership");
        controlFlows.add("Curly brace control flow\n" +
        " |--- If-Else Statements\n" +
        " |--- For Loops\n" +
        " |--- While Loops\n" +
        " |--- Pattern Matching");

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        int x = 20;
        int y = 20;
        int width = 200;
        int height = 30;

        for (int i = 0; i < programmingLanguages.size(); i++) {
        JLabel bigOLabel = new JLabel(programmingLanguages.get(i));
        bigOLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
        bigOLabel.setForeground(new Color(30, 144, 255));
        bigOLabel.setBounds(x, y, width, height);
        contentPanel.add(bigOLabel);

        JLabel nameLabel = new JLabel(syntaxTrees.get(i));
        nameLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        nameLabel.setBounds(x + 220, y, width, height);
        nameLabel.setForeground(new java.awt.Color(10, 255, 143));
        contentPanel.add(nameLabel);

        JLabel purposeLabel = new JLabel(controlFlows.get(i));
        purposeLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        purposeLabel.setBounds(x + 440, y, width, height);
        purposeLabel.setForeground(Color.ORANGE);
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
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ProgrammingLanguageVisualizer().setVisible(true);
    }
}

