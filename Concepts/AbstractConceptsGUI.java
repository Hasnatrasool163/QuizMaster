package Concepts;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Enumeration;
import frame.Menu;

public abstract class AbstractConceptsGUI extends JFrame {

    private JTextArea theoryTextArea;
    private JTextArea codeTextArea;
    private JPanel quizPanel;
    private JButton checkQuizButton, back,quiz;
    private boolean shift = false;

    public AbstractConceptsGUI(String title) {
        setTitle(title);
        setSize(1000, 700);
        setLocationRelativeTo(null);
        setLocationByPlatform(true);
        setAlwaysOnTop(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setupContent();
    }

    private void setupContent() {
        // Theory section
        theoryTextArea = new JTextArea();
        theoryTextArea.setText(getTheoryText());
        theoryTextArea.setBackground(Color.ORANGE);
        theoryTextArea.setEditable(false);
        theoryTextArea.setFont(new Font("Tahoma", Font.PLAIN, 16));
        JScrollPane theoryScrollPane = new JScrollPane(theoryTextArea);

        // Code section
        codeTextArea = new JTextArea();
        codeTextArea.setText(getExampleCode());
        codeTextArea.setEditable(false);
        codeTextArea.setFont(new Font("Courier New", Font.PLAIN, 16));
        JScrollPane codeScrollPane = new JScrollPane(codeTextArea);

        // Quiz section
        quizPanel = new JPanel();
        quizPanel.setLayout(new BoxLayout(quizPanel, BoxLayout.Y_AXIS));
        quizPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        addQuizQuestions();

        JScrollPane quizScrollPane = new JScrollPane(quizPanel);

        checkQuizButton = new JButton("Check Assessment-Answers");
        checkQuizButton.setFont(new Font("Tahoma", Font.BOLD, 16));
        checkQuizButton.setForeground(new Color(255, 255, 145));
        checkQuizButton.setBackground(new Color(30, 144, 255));

        back = new JButton("Back");
        back.setFont(new Font("Tahoma", Font.BOLD, 16));
        back.setForeground(new Color(255, 255, 145));
        back.setBackground(new Color(30, 144, 255));
        
        quiz = new JButton("Move To Test");
        quiz.setFont(new Font("Tahoma", Font.BOLD, 16));
        quiz.setForeground(new Color(255, 255, 145));
        quiz.setBackground(new Color(30, 144, 255));

        // Split panes
        JSplitPane verticalSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, theoryScrollPane, codeScrollPane);
        verticalSplitPane.setDividerLocation(340);

        JSplitPane mainSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, verticalSplitPane, quizScrollPane);
        mainSplitPane.setDividerLocation(920);

        add(mainSplitPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(back);
        buttonPanel.add(checkQuizButton);
        buttonPanel.add(quiz);
        add(buttonPanel, BorderLayout.SOUTH);

        checkQuizButton.addActionListener((ActionEvent e) -> checkQuiz());
        back.addActionListener((ActionEvent e) -> {
            setVisible(false);
            Menu.getInstance().setVisible(true);
        });
        
        quiz.addActionListener((ActionEvent e) -> {
           if(shift == false){
               mainSplitPane.setDividerLocation(0);
               shift = true;
           }
           else{
                mainSplitPane.setDividerLocation(920);
                shift = false;
           }
          
           
        });

        clearQuizSelections();
    }

    private void clearQuizSelections() {
        for (Component component : quizPanel.getComponents()) {
            if (component instanceof JPanel questionPanel) {
                ButtonGroup buttonGroup = (ButtonGroup) questionPanel.getClientProperty("buttonGroup");
                if (buttonGroup != null) {
                    buttonGroup.clearSelection();
                }
            }
        }
    }

    private void checkQuiz() {
        int correctCount = 0;
        Component[] components = quizPanel.getComponents();
        for (Component component : components) {
            if (component instanceof JPanel questionPanel) {
                ButtonGroup buttonGroup = (ButtonGroup) questionPanel.getClientProperty("buttonGroup");
                if (buttonGroup != null) {
                    JRadioButton selectedButton = null;
                    for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
                        AbstractButton button = buttons.nextElement();
                        if (button.isSelected()) {
                            selectedButton = (JRadioButton) button;
                            break;
                        }
                    }
                    if (selectedButton != null) {
                        boolean isTrue = selectedButton.getText().equals("True");
                        if (isTrue && questionPanel.getName().endsWith("True")) {
                            correctCount++;
                        } else if (!isTrue && questionPanel.getName().endsWith("False")) {
                            correctCount++;
                        }
                    }
                }
            }
        }

        JOptionPane.showMessageDialog(this,
                "You got " + correctCount + " out of " + quizPanel.getComponentCount() + " correct.",
                "Quiz Results",
                JOptionPane.INFORMATION_MESSAGE);
    }

    protected void addQuizQuestion(String question, boolean answer) {
        JPanel questionPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        questionPanel.setName(answer ? "True" : "False");
        JLabel questionLabel = new JLabel(question);
        questionLabel.setForeground(new Color(30, 144, 255));
        questionLabel.setFont(new Font("Dialog", Font.PLAIN, 16));
        questionPanel.add(questionLabel);

        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButton trueButton = new JRadioButton("True");
        JRadioButton falseButton = new JRadioButton("False");

        buttonGroup.add(trueButton);
        buttonGroup.add(falseButton);

        questionPanel.add(trueButton);
        questionPanel.add(falseButton);

        quizPanel.add(questionPanel);
        questionPanel.putClientProperty("buttonGroup", buttonGroup);
    }

    protected abstract String getTheoryText();

    protected abstract String getExampleCode();

    protected abstract void addQuizQuestions();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AbstractConceptsGUI frame = new PointersGUI();
            frame.setVisible(true);
        });
    }
}
