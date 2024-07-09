package Java;

import javax.swing.*;
import javax.tools.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.Arrays;
import java.util.Enumeration;

public class StaticVsNonStaticGUI extends JFrame {

    private JTextArea theoryTextArea;
    private JTextArea codeTextArea;
    private JTextArea outputTextArea;
    private JButton checkQuizButton, runCodeButton, back;
    private JPanel quizPanel;

    public StaticVsNonStaticGUI() {
        setTitle("Java: Static vs. Non-Static");
        setSize(950, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setupContent();
    }

    private void setupContent() {
        theoryTextArea = new JTextArea();
        theoryTextArea.setText(getTheoryText());
        theoryTextArea.setEditable(false);
        theoryTextArea.setBackground(Color.ORANGE);
        theoryTextArea.setFont(new Font("Tahoma", Font.PLAIN, 16));
        JScrollPane theoryScrollPane = new JScrollPane(theoryTextArea);

        codeTextArea = new JTextArea();
        codeTextArea.setText(getExampleCode());
        codeTextArea.setFont(new Font("Courier New", Font.PLAIN, 16));
        JScrollPane codeScrollPane = new JScrollPane(codeTextArea);

        outputTextArea = new JTextArea();
        outputTextArea.setEditable(false);
        outputTextArea.setFont(new Font("Courier New", Font.PLAIN, 16));
        outputTextArea.setBackground(Color.LIGHT_GRAY);
        JScrollPane outputScrollPane = new JScrollPane(outputTextArea);

        quizPanel = new JPanel();
        quizPanel.setLayout(new BoxLayout(quizPanel, BoxLayout.Y_AXIS));
        quizPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        addQuizQuestions();
        JScrollPane quizScrollPane = new JScrollPane(quizPanel);

        checkQuizButton = new JButton("Check Quiz");
        checkQuizButton.setFont(new Font("Tahoma", Font.BOLD, 16));
        checkQuizButton.setForeground(new Color(255, 255, 145));
        checkQuizButton.setBackground(new Color(30, 144, 255));

        runCodeButton = new JButton("Run Code");
        runCodeButton.setFont(new Font("Tahoma", Font.BOLD, 16));
        runCodeButton.setForeground(new Color(255, 255, 145));
        runCodeButton.setBackground(new Color(30, 144, 255));

        back = new JButton("Back");
        back.setFont(new Font("Tahoma", Font.BOLD, 16));
        back.setForeground(new Color(255, 255, 145));
        back.setBackground(new Color(30, 144, 255));

        JSplitPane verticalSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, theoryScrollPane, codeScrollPane);
        verticalSplitPane.setDividerLocation(250);

        JSplitPane mainSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, verticalSplitPane, quizScrollPane);
        mainSplitPane.setDividerLocation(500);

        add(mainSplitPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(back);
        buttonPanel.add(runCodeButton);
        buttonPanel.add(checkQuizButton);
        add(buttonPanel, BorderLayout.SOUTH);
        add(outputScrollPane, BorderLayout.EAST);

        checkQuizButton.addActionListener((ActionEvent e) -> checkQuiz());
        runCodeButton.addActionListener((ActionEvent e) -> runCode());
        back.addActionListener((ActionEvent e) -> {
            setVisible(false);
            frame.Menu.getInstance().setVisible(true);
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

    private String getTheoryText() {
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

    private String getExampleCode() {
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

    private void addQuizQuestions() {
        addQuizQuestion("Static methods can be called without creating an instance of the class", true);
        addQuizQuestion("Non-static variables belong to an instance of the class rather than any specific instance.", false);
        addQuizQuestion("Static inner classes require an instance of the outer class.", false);
        addQuizQuestion("Non-static methods require an instance of the class to be called.", true);
    }

    private void addQuizQuestion(String question, boolean answer) {
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

        if (answer) {
            trueButton.setSelected(true);
        } else {
            falseButton.setSelected(true);
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
                    for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements(); ) {
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
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon(ClassLoader.getSystemResource("usericons/poop-smiley.png")));
    }

    private void runCode() {
        String code = codeTextArea.getText();
        String className = "UserClass";
        String javaCode = "public class " + className + " {\n" + code + "\n}";

        // Compile the code
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<>();
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(diagnostics, null, null);

        SimpleJavaFileObject fileObject = new SimpleJavaFileObject(URI.create("string:///" + className + ".java"), JavaFileObject.Kind.SOURCE) {
            @Override
            public CharSequence getCharContent(boolean ignoreEncodingErrors) {
                return javaCode;
            }
        };

        Iterable<? extends JavaFileObject> fileObjects = Arrays.asList(fileObject);

        JavaCompiler.CompilationTask task = compiler.getTask(null, fileManager, diagnostics, null, null, fileObjects);
        boolean success = task.call();

        if (success) {
            // Load and run the compiled class
            try {
                ClassLoader classLoader = ToolProvider.getSystemToolClassLoader();
                Class<?> userClass = classLoader.loadClass(className);
                Method mainMethod = userClass.getDeclaredMethod("main", String[].class);
                ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                PrintStream printStream = new PrintStream(outputStream);
                PrintStream originalOut = System.out;
                System.setOut(printStream);
                mainMethod.invoke(null, (Object) new String[]{});
                System.setOut(originalOut);
                outputTextArea.setText(outputStream.toString());
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
                outputTextArea.setText(e.toString());
            }
        } else {
           
            StringBuilder errorMessages = new StringBuilder();
            for (Diagnostic<? extends JavaFileObject> diagnostic : diagnostics.getDiagnostics()) {
                errorMessages.append(diagnostic.toString()).append("\n");
            }
            outputTextArea.setText(errorMessages.toString());
        }
    }

    public static void main(String[] args) {
        new StaticVsNonStaticGUI().setVisible(true);
    }
}
