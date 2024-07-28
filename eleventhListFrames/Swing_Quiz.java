package eleventhListFrames;

import frame.Quiz;
/**
 * @author MuhammadHasnatRasool
 */
public class Swing_Quiz extends Quiz {

    public Swing_Quiz(String name) {
        super(name);
        loadQuestions();
        setupQuiz();
    }

    private void setupQuiz() {
        shuffleIndices();
        selectTotalQuestions();
        setCurrentQuestion();
        setQuestionTextAndOptions();
    }

   

    @Override
    public void setQuestionTextAndOptions() {
        qno.setText("Question #: " + currentQno);
        question.setText(questions.get(currentQuestionIndex));
        opt1.setText(options.get(currentQuestionIndex).split(", ")[0]);
        opt2.setText(options.get(currentQuestionIndex).split(", ")[1]);
        opt3.setText(options.get(currentQuestionIndex).split(", ")[2]);
        opt4.setText(options.get(currentQuestionIndex).split(", ")[3]);
    }

    // questions:48
    @Override
    public final void loadQuestions() {

        questions.add("What is the main package used for creating GUI applications in Java?");
        options.add("A) java.awt, B) javax.swing, C) java.swing, D) awt.swing");
        answers.add("B) javax.swing");

        questions.add("Which component is used to display text or images in Java Swing?");
        options.add("A) JLabel, B) JButton, C) JTextField, D) JTextArea");
        answers.add("A) JLabel");

        questions.add("What is the purpose of the JFrame class in Java Swing?");
        options.add("A) To create a window, B) To create a button, C) To create a label, D) To create a text field");
        answers.add("A) To create a window");

        questions.add("Which layout manager is used to arrange components in a grid in Java Swing?");
        options.add("A) GridLayout, B) FlowLayout, C) BorderLayout, D) BoxLayout");
        answers.add("A) GridLayout");

        questions.add("What is the purpose of the JPanel class in Java Swing?");
        options.add("A) To create a panel, B) To create a window, C) To create a button, D) To create a label");
        answers.add("A) To create a panel");

        questions.add("Which component is used to get user input in Java Swing?");
        options.add("A) JTextField, B) JTextArea, C) JLabel, D) JButton");
        answers.add("A) JTextField");

        questions.add("What is the purpose of the JButton class in Java Swing?");
        options.add("A) To create a button, B) To create a label, C) To create a text field, D) To create a window");
        answers.add("A) To create a button");

        questions.add("Which method is used to set the text of a JLabel in Java Swing?");
        options.add("A) setText(), B) getText(), C) label(), D) text()");
        answers.add("A) setText()");

        questions.add("What is the purpose of the BorderFactory class in Java Swing?");
        options.add("A) To create a border, B) To create a panel, C) To create a window, D) To create a button");
        answers.add("A) To create a border");

        questions.add("Which component is used to display a list of items in Java Swing?");
        options.add("A) JList, B) JComboBox, C) JTextField, D) JTextArea");
        answers.add("A) JList");

        questions.add("What is the purpose of the JComboBox class in Java Swing?");
        options.add("A) To create a combo box, B) To create a list, C) To create a text field, D) To create a button");
        answers.add("A) To create a combo box");

        questions.add("Which method is used to add an action listener to a JButton in Java Swing?");
        options.add("A) addActionListener(), B) addMouseListener(), C) addKeyListener(), D) addFocusListener()");
        answers.add("A) addActionListener()");

        questions.add("What is the purpose of the Graphics class in Java Swing?");
        options.add("A) To draw shapes, B) To create a window, C) To create a panel, D) To create a button");
        answers.add("A) To draw shapes");

        questions.add("Which component is used to display a table in Java Swing?");
        options.add("A) JTable, B) JList, C) JComboBox, D) JTextField");
        answers.add("A) JTable");

        questions.add("What is the purpose of the JScrollPane class in Java Swing?");
        options.add("A) To create a scroll pane, B) To create a panel, C) To create a window, D) To create a button");
        answers.add("A) To create a scroll pane");

        questions.add("Which method is used to set the font of a JLabel in Java Swing?");
        options.add("A) setFont(), B) getFont(), C) font(), D) label()");
        answers.add("A) setFont()");

        questions.add("What is the purpose of the Color class in Java Swing?");
        options.add("A) To create a color, B) To create a panel, C) To create a window, D) To create a button");
        answers.add("A) To create a color");

        questions.add("Which component is used to display a tree structure in Java Swing?");
        options.add("A) JTree, B) JList, C) JComboBox, D) JTextField");
        answers.add("A) JTree");

        questions.add("What is the purpose of the JOptionPane class in Java Swing?");
        options.add("A) To display a dialog box, B) To create a panel, C) To create a window, D) To create a button");
        answers.add("A) To display a dialog box");

        questions.add("Which method is used to pack a JFrame in Java Swing?");
        options.add("A) pack(), B) setVisible(), C) setSize(), D) setLocation()");
        answers.add("A) pack()");

        questions.add("Which class is used to create a menu bar in Java Swing?");
        options.add("A) JMenuBar, B) JMenu, C) JMenuItem, D) JPopupMenu");
        answers.add("A) JMenuBar");

        questions.add("What is the purpose of the JFrame's setDefaultCloseOperation() method?");
        options.add("A) To set the default button, B) To set the default window state, C) To exit the application, D) To minimize the window");
        answers.add("C) To exit the application");

        questions.add("Which component is used to display a progress bar in Java Swing?");
        options.add("A) JProgressBar, B) JSlider, C) JSpinner, D) JScrollBar");
        answers.add("A) JProgressBar");

        questions.add("What is the purpose of the SwingUtilities class in Java Swing?");
        options.add("A) To create a GUI component, B) To layout GUI components, C) To handle GUI events, D) To perform GUI-related utility tasks");
        answers.add("D) To perform GUI-related utility tasks");

        questions.add("Which method is used to set the tooltip text of a GUI component in Java Swing?");
        options.add("A) setToolTipText(), B) setToolTip(), C) tooltip(), D) toolTipText()");
        answers.add("A) setToolTipText()");

        questions.add("What is the purpose of the Java Swing timer class?");
        options.add("A) To schedule tasks, B) To handle events, C) To create GUI components, D) To perform layout management");
        answers.add("A) To schedule tasks");

        questions.add("Which component is used to display a desktop application's main window in Java Swing?");
        options.add("A) JFrame, B) JDialog, C) JWindow, D) JApplet");
        answers.add("A) JFrame");

        questions.add("What is the purpose of the Java Swing pluggable look and feel (PLAF) architecture?");
        options.add("A) To change the look and feel of GUI components, B) To create custom GUI components, C) To handle GUI events, D) To perform layout management");
        answers.add("A) To change the look and feel of GUI components");

        questions.add("Which class is used to create a scroll pane in Java Swing?");
        options.add("A) JScrollPane, B) JScrollBar, C) JViewport, D) JComponent");
        answers.add("A) JScrollPane");

        questions.add("Which component is used to arrange elements in a single row in a GUI?");
        options.add("A) FlowLayout, B) BorderLayout, C) GridLayout, D) BoxLayout");
        answers.add("A) FlowLayout");

        questions.add("How do you create a window in Java Swing?");
        options.add("A) JFrame frame = new JFrame();, B) Frame frame = new Frame();, C) Window frame = new Window();, D) MainFrame frame = new MainFrame();");
        answers.add("A) JFrame frame = new JFrame();");

        questions.add("Which layout manager is used to arrange components in a grid-like manner?");
        options.add("A) GridLayout, B) FlowLayout, C) BorderLayout, D) GridBagLayout");
        answers.add("A) GridLayout");

        questions.add("Which component is used to create a checkbox in a GUI?");
        options.add("A) JCheckBox, B) JToggleButton, C) JRadioButton, D) JCheckboxButton");
        answers.add("A) JCheckBox");

        questions.add("What is the event fired when a user clicks a button in a GUI?");
        options.add("A) ActionEvent, B) ButtonEvent, C) ClickEvent, D) MouseEvent");
        answers.add("A) ActionEvent");

        questions.add("Which method is used to add a component to a container in Java Swing?");
        options.add("A) addComponent(), B) addToContainer(), C) add(), D) attachComponent()");
        answers.add("C) add()");

        questions.add("How do you create a label in Java Swing?");
        options.add("A) JLabel label = new JLabel();, B) Label label = new Label();, C) TextLabel label = new TextLabel();, D) JLabel label = new Label();");
        answers.add("A) JLabel label = new JLabel();");

        questions.add("Which component is used to create a dropdown menu in a GUI?");
        options.add("A) JComboBox, B) JDropDown, C) JMenu, D) JDropdown");
        answers.add("A) JComboBox");

        questions.add("What is the method to set the size of a JFrame?");
        options.add("A) setSize(), B) setFrameSize(), C) setDimensions(), D) setWindowDimensions()");
        answers.add("A) setSize()");

        questions.add("Which layout manager is used to arrange components along the edges of a container?");
        options.add("A) BorderLayout, B) FlowLayout, C) GridLayout, D) BoxLayout");
        answers.add("A) BorderLayout");

        questions.add("How do you create a button in Java Swing?");
        options.add("A) JButton button = new JButton();, B) Button button = new Button();, C) JButton button = new Button();, D) Button button = new JButton();");
        answers.add("A) JButton button = new JButton();");

        questions.add("Which component is used to create a slider in a GUI?");
        options.add("A) JSlider, B) JScrollBar, C) JProgress, D) JScrollSlider");
        answers.add("A) JSlider");

        questions.add("What is the method to set the title of a JFrame?");
        options.add("A) setTitle(), B) setFrameTitle(), C) setWindowTitle(), D) setWindowTitle()");
        answers.add("A) setTitle()");

        questions.add("Which layout manager is flexible and powerful but complex to use?");
        options.add("A) GridBagLayout, B) FlowLayout, C) BorderLayout, D) GroupLayout");
        answers.add("A) GridBagLayout");

        questions.add("How do you create a text field in Java Swing?");
        options.add("A) JTextField field = new JTextField();, B) TextBox field = new TextBox();, C) JTextArea field = new JTextArea();, D) JTextBox field = new JTextBox();");
        answers.add("A) JTextField field = new JTextField();");

        questions.add("What is the method to set the visibility of a JFrame?");
        options.add("A) setVisible(), B) show(), C) display(), D) setVisibility()");
        answers.add("A) setVisible()");

        questions.add("Which event is fired when a window is closed?");
        options.add("A) WindowClosedEvent, B) WindowCloseEvent, C) WindowEvent, D) CloseWindowEvent");
        answers.add("C) WindowEvent");
        
        questions.add("Which is best widget for showing pages with url?");
        options.add("A) JTextArea, B) JComponentArea, C) JEditorPane, D) JTextPane");
        answers.add("C) JEditorPane");

        questions.add("How do you create a radio button in Java Swing?");
        options.add("A) JRadioButton button = new JRadioButton();, B) JToggleButton button = new JToggleButton();, C) JCheckBox button = new JCheckBox();, D) JRadioButton button = new JToggleButton();");
        answers.add("A) JRadioButton button = new JRadioButton();");

    }

    public static void main(String[] args) {
        new Swing_Quiz(name).setVisible(true);
    }

}
