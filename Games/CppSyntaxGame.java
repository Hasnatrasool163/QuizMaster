package Games;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class CppSyntaxGame {

    private JFrame frame;
    private JTextArea codeArea;
    private JComboBox<String> typeBox, variableBox, ioBox;
    private JButton checkButton;
    private JLabel feedbackLabel;

    private String correctType = "int";
    private String correctVariable = "number";
    private String correctIO = "cin >> number";

    public CppSyntaxGame() {
        initUI();
    }

    private void initUI() {
        // Create the main frame
        frame = new JFrame("C++ Syntax Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

        // Create the panel for displaying code snippet
        JPanel codePanel = new JPanel(new BorderLayout());
        codeArea = new JTextArea();
        codeArea.setText(getCodeSnippet());
        codeArea.setEditable(false);
        codeArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        codePanel.add(new JScrollPane(codeArea), BorderLayout.CENTER);

        frame.add(codePanel, BorderLayout.CENTER);

        // Create bottom panel for selecting missing parts and check button
        JPanel bottomPanel = new JPanel(new FlowLayout());

        String[] types = {"int", "float", "double", "char"};
        typeBox = new JComboBox<>(types);

        String[] variables = {"number", "num", "value", "var"};
        variableBox = new JComboBox<>(variables);

        String[] ioStatements = {"cin >> number", "cin >> num", "cout << number", "cout << num"};
        ioBox = new JComboBox<>(ioStatements);

        checkButton = new JButton("Check");

        bottomPanel.add(new JLabel("Select Type:"));
        bottomPanel.add(typeBox);
        bottomPanel.add(new JLabel("Select Variable:"));
        bottomPanel.add(variableBox);
        bottomPanel.add(new JLabel("Select I/O Statement:"));
        bottomPanel.add(ioBox);
        bottomPanel.add(checkButton);

        feedbackLabel = new JLabel("Fill in the missing parts and click Check.");
        bottomPanel.add(feedbackLabel);

        frame.add(bottomPanel, BorderLayout.SOUTH);
        checkButton.addActionListener((ActionEvent e) -> {
            checkAnswers();
        });

        frame.setVisible(true);
    }

    private String getCodeSnippet() {
        return """
               #include <iostream>
               using namespace std;
               
               int main() {
                   __ __; // Declare a variable
                   cout << "Enter a number: ";
                   ___; // Input the number
                   cout << "You entered: " << number << endl;
                   return 0;
               }""";
    }

    private void checkAnswers() {
        String selectedType = (String) typeBox.getSelectedItem();
        String selectedVariable = (String) variableBox.getSelectedItem();
        String selectedIO = (String) ioBox.getSelectedItem();

        if (selectedType.equals(correctType) && selectedVariable.equals(correctVariable) && selectedIO.equals(correctIO)) {
            feedbackLabel.setText("Correct! You have successfully completed the code.");
        } else {
            feedbackLabel.setText("Incorrect. Please try again.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CppSyntaxGame::new);
    }
}