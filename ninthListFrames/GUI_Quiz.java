package ninthListFrames;

import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */
public class GUI_Quiz extends Quiz {

    public GUI_Quiz(String name) {
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

    // questions:36
    @Override
    public final void loadQuestions() {

        questions.add("What does GUI stand for?");
        options.add("A) Graphical User Interaction, B) Graphics User Interface, C) Graphical User Interface, D) Graphics User Interaction");
        answers.add("C) Graphical User Interface");

        questions.add("Which of the following is a characteristic of a GUI?");
        options.add("A) Text-based interaction, B) Command-line interface, C) Graph-based navigation, D) Icon-based interaction");
        answers.add("D) Icon-based interaction");

        questions.add("Which design principle focuses on the ease of learning for a GUI?");
        options.add("A) Learnability, B) Efficiency, C) Effectiveness, D) Consistency");
        answers.add("A) Learnability");

        questions.add("Which GUI component is used to display text that the user cannot edit?");
        options.add("A) JTextArea, B) JTextField, C) JLabel, D) JEditorPane");
        answers.add("C) JLabel");

        questions.add("What is a GUI widget that allows users to enter and edit text?");
        options.add("A) JEditorPane, B) JTextBox, C) JTextArea, D) JTextField");
        answers.add("D) JTextField");

        questions.add("Which GUI component is used to display a list of selectable items?");
        options.add("A) JList, B) JTable, C) JComboBox, D) JScrollBar");
        answers.add("A) JList");

        questions.add("What is the purpose of a tooltip in a GUI?");
        options.add("A) Provide keyboard shortcuts, B) Display help information, C) Navigate between screens, D) Manage screen layout");
        answers.add("B) Display help information");

        questions.add("Which layout manager arranges components in a top-to-bottom flow?");
        options.add("A) FlowLayout, B) BorderLayout, C) GridLayout, D) BoxLayout");
        answers.add("A) FlowLayout");

        questions.add("Which GUI component is used to let users choose from a set of mutually exclusive options?");
        options.add("A) JCheckBox, B) JToggleButton, C) JRadioButton, D) JSpinner");
        answers.add("C) JRadioButton");

        questions.add("What does WIMP stand for in the context of GUI design?");
        options.add("A) Windows, Icons, Menus, Pointers, B) Windows, Interfaces, Menus, Panels, C) Widgets, Interfaces, Menus, Panels, D) Windows, Icons, Menus, Panels");
        answers.add("A) Windows, Icons, Menus, Pointers");

        questions.add("Which GUI design principle states that interface elements should be logically grouped?");
        options.add("A) Proximity, B) Consistency, C) Alignment, D) Grouping");
        answers.add("A) Proximity");

        questions.add("What is the purpose of affordances in GUI design?");
        options.add("A) Indicate the actions possible with an element, B) Define interface colors, C) Group related elements, D) Align elements on a screen");
        answers.add("A) Indicate the actions possible with an element");

        questions.add("Which event is triggered when a user selects an item from a dropdown list?");
        options.add("A) ItemEvent, B) SelectEvent, C) DropdownEvent, D) ChoiceEvent");
        answers.add("A) ItemEvent");

        questions.add("What does Fitts's Law describe in the context of GUI design?");
        options.add("A) Predicts mouse movement patterns, B) Measures user interaction speed, C) Evaluates screen resolution, D) Assesses input device accuracy");
        answers.add("A) Predicts mouse movement patterns");

        questions.add("Which GUI component is used to display a scrollable view of a component?");
        options.add("A) JScrollPane, B) JScrollArea, C) JScrollFrame, D) JScrollBar");
        answers.add("A) JScrollPane");

        questions.add("What is the purpose of modal dialogs in GUI design?");
        options.add("A) Display non-blocking messages, B) Handle user input, C) Control application flow, D) Prevent access to other application windows");
        answers.add("D) Prevent access to other application windows");

        questions.add("Which design principle emphasizes that users should easily recover from errors in a GUI?");
        options.add("A) Error recovery, B) Fault tolerance, C) Robustness, D) Recoverability");
        answers.add("B) Fault tolerance");

        questions.add("What is the purpose of user personas in GUI design?");
        options.add("A) Represent typical users, B) Track user interactions, C) Design user interfaces, D) Manage user accounts");
        answers.add("A) Represent typical users");

        questions.add("Which GUI component is used to display a tabbed set of components?");
        options.add("A) JTabbedPane, B) JTabPanel, C) JTabContainer, D) JTabControl");
        answers.add("A) JTabbedPane");

        questions.add("What is the role of GUI wireframing in the design process?");
        options.add("A) Create functional prototypes, B) Define interface colors, C) Manage user accounts, D) Evaluate user feedback");
        answers.add("A) Create functional prototypes");

        questions.add("Which GUI design principle suggests minimizing cognitive load on users?");
        options.add("A) Simplicity, B) Complexity, C) Efficiency, D) Elegance");
        answers.add("A) Simplicity");

        questions.add("What does the principle of Hick's Law propose in GUI design?");
        options.add("A) Predicts user decision time, B) Measures interface responsiveness, C) Evaluates menu design, D) Assesses button placement");
        answers.add("A) Predicts user decision time");

        questions.add("Which GUI component is used to display hierarchical data structures?");
        options.add("A) JTree, B) JList, C) JTable, D) JTreeList");
        answers.add("A) JTree");

        questions.add("What is the purpose of usability testing in GUI design?");
        options.add("A) Evaluate interface efficiency, B) Test code functionality, C) Verify system security, D) Monitor server performance");
        answers.add("A) Evaluate interface efficiency");

        questions.add("Which GUI design principle suggests using familiar symbols and icons?");
        options.add("A) Iconography, B) Symbolism, C) Semiotics, D) Representationalism");
        answers.add("A) Iconography");

        questions.add("What is the purpose of a wireframe in GUI design?");
        options.add("A) Outline interface structure, B) Design color schemes, C) Implement user feedback, D) Generate user personas");
        answers.add("A) Outline interface structure");

        questions.add("Which event is triggered when a user hovers over a GUI component?");
        options.add("A) HoverEvent, B) MouseHoverEvent, C) MouseEnterEvent, D) MouseEvent");
        answers.add("C) MouseEnterEvent");

        questions.add("What does the principle of progressive disclosure suggest in GUI design?");
        options.add("A) Reveal information gradually, B) Simplify user interaction, C) Enhance interface aesthetics, D) Streamline application flow");
        answers.add("A) Reveal information gradually");

        questions.add("Which GUI component is used to display a bar representing the progress of a task?");
        options.add("A) JProgressBar, B) JStatusbar, C) JProgress, D) JTaskbar");
        answers.add("A) JProgressBar");

        questions.add("What is the purpose of user feedback in GUI design?");
        options.add("A) Improve interface responsiveness, B) Define user roles, C) Evaluate system stability, D) Manage user preferences");
        answers.add("A) Improve interface responsiveness");

        questions.add("Which GUI design principle suggests consistency across interface elements?");
        options.add("A) Uniformity, B) Consistency, C) Standardization, D) Conformity");
        answers.add("B) Consistency");

        questions.add("What is the purpose of A/B testing in GUI design?");
        options.add("A) Compare interface designs, B) Test system security, C) Verify database integrity, D) Evaluate user documentation");
        answers.add("A) Compare interface designs");

        questions.add("Which event is triggered when a user scrolls a scroll bar?");
        options.add("A) ScrollEvent, B) ScrollBarEvent, C) MouseWheelEvent, D) MouseEvent");
        answers.add("C) MouseWheelEvent");

        questions.add("What is the role of GUI mockups in the design process?");
        options.add("A) Visualize interface concepts, B) Develop database schemas, C) Implement security protocols, D) Monitor server performance");
        answers.add("A) Visualize interface concepts");

        questions.add("Which GUI component is used to display and edit tabular data?");
        options.add("A) JTable, B) JTabular, C) JDataGrid, D) JDataTable");
        answers.add("A) JTable");

        questions.add("What does the principle of visibility suggest in GUI design?");
        options.add("A) Make important elements prominent, B) Minimize user interaction, C) Reduce interface clutter, D) Hide complex features");
        answers.add("A) Make important elements prominent");

    }

    public static void main(String[] args) {
        new GUI_Quiz(name).setVisible(true);
    }

}
