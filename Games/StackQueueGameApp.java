package Games;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.LinkedList;
import java.util.Random;

public class StackQueueGameApp extends JFrame {
    private LinkedList<Integer> stack;
    private LinkedList<Integer> queue;
    private JPanel stackPanel, queuePanel;
    private JTextField inputField;
    private JButton pushButton, popButton, enqueueButton, dequeueButton;
    private static final Color BUTTON_BACKGROUND_COLOR = new Color(30, 144, 255);
    private static final Color BUTTON_FOREGROUND_COLOR = Color.WHITE;
    private Font font = new Font("Tahoma", Font.BOLD, 18);
    private Random random = new Random();

    public StackQueueGameApp() {
        stack = new LinkedList<>();
        queue = new LinkedList<>();
        initUI();
        setResizable(false);
    }

    private void initUI() {
        setTitle("Stack and Queue Game");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(Color.LIGHT_GRAY);

        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.WHITE);
        topPanel.setBounds(10, 10, 780, 50);
        inputField = new JTextField(10);
        inputField.setFont(new Font("Tahoma", Font.CENTER_BASELINE, 18));
        pushButton = new JButton("Push");
        pushButton.setBackground(BUTTON_BACKGROUND_COLOR);
        pushButton.setForeground(BUTTON_FOREGROUND_COLOR);
        pushButton.setFont(font);
        popButton = new JButton("Pop");
        popButton.setBackground(BUTTON_BACKGROUND_COLOR);
        popButton.setForeground(BUTTON_FOREGROUND_COLOR);
        popButton.setFont(font);
        enqueueButton = new JButton("Enqueue");
        enqueueButton.setBackground(BUTTON_BACKGROUND_COLOR);
        enqueueButton.setForeground(BUTTON_FOREGROUND_COLOR);
        enqueueButton.setFont(font);
        dequeueButton = new JButton("Dequeue");
        dequeueButton.setBackground(BUTTON_BACKGROUND_COLOR);
        dequeueButton.setForeground(BUTTON_FOREGROUND_COLOR);
        dequeueButton.setFont(font);
        JButton back = new JButton("Back");
        back.setBackground(BUTTON_BACKGROUND_COLOR);
        back.setForeground(BUTTON_FOREGROUND_COLOR);
        back.setFont(font);
        back.addActionListener((ActionEvent e) -> {
            setVisible(false);
            // Replace with appropriate action to go back
        });

        topPanel.add(new JLabel("Enter Value:"));
        topPanel.add(inputField);
        topPanel.add(pushButton);
        topPanel.add(popButton);
        topPanel.add(enqueueButton);
        topPanel.add(dequeueButton);

        add(topPanel);

        stackPanel = new JPanel();
        stackPanel.setBorder(BorderFactory.createTitledBorder("Stack"));
        stackPanel.setLayout(new BoxLayout(stackPanel, BoxLayout.Y_AXIS));
        stackPanel.setBackground(Color.WHITE);

        JScrollPane stackScrollPane = new JScrollPane(stackPanel);
        stackScrollPane.setBounds(10, 70, 200, 480);
        stackScrollPane.setViewportView(stackPanel);

        queuePanel = new JPanel();
        queuePanel.setBorder(BorderFactory.createTitledBorder("Queue"));
        queuePanel.setLayout(new BoxLayout(queuePanel, BoxLayout.Y_AXIS));
        queuePanel.setBackground(Color.WHITE);

        JScrollPane queueScrollPane = new JScrollPane(queuePanel);
        queueScrollPane.setBounds(570, 70, 200, 480);

        add(stackScrollPane);
        add(queueScrollPane);

        pushButton.addActionListener((ActionEvent e) -> pushValue());
        popButton.addActionListener((ActionEvent e) -> popValue());
        enqueueButton.addActionListener((ActionEvent e) -> enqueueValue());
        dequeueButton.addActionListener((ActionEvent e) -> dequeueValue());

        setVisible(true);

        generateRandomTask();
    }

    private void pushValue() {
        try {
            int value = Integer.parseInt(inputField.getText());
            stack.push(value);
            updateStackPanel();
//            JOptionPane.showMessageDialog(this, value + " pushed to stack");
            checkTaskCompletion();
        } catch (NumberFormatException e) {
            showError("Please enter a valid integer.");
        }
    }

    private void popValue() {
        if (!stack.isEmpty()) {
            stack.pop();
            updateStackPanel();
            checkTaskCompletion();
        } else {
            showError("Stack is empty.");
        }
    }

    private void enqueueValue() {
        try {
            int value = Integer.parseInt(inputField.getText());
            queue.add(value);
            updateQueuePanel();
            checkTaskCompletion();
        } catch (NumberFormatException e) {
            showError("Please enter a valid integer.");
        }
    }

    private void dequeueValue() {
        if (!queue.isEmpty()) {
            queue.remove();
            updateQueuePanel();
            checkTaskCompletion();
        } else {
            showError("Queue is empty.");
        }
    }

    private void updateStackPanel() {
        stackPanel.removeAll();
        int y = 20;
        for (Integer value : stack) {
            JLabel label = new JLabel(value.toString());
            label.setFont(new Font("Tahoma", Font.BOLD, 18));
            label.setBounds(50, y, 200, 30);
            stackPanel.add(label);
            y += 30;
        }
        stackPanel.revalidate();
        stackPanel.repaint();
    }

    private void updateQueuePanel() {
        queuePanel.removeAll();
        int y = 20;
        for (Integer value : queue) {
            JLabel label = new JLabel(value.toString());
            label.setFont(new Font("Tahoma", Font.BOLD, 18));
            label.setBounds(50, y, 200, 30);
            queuePanel.add(label);
            y += 30;
        }
        queuePanel.revalidate();
        queuePanel.repaint();
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void generateRandomTask() {
       
        if (stack.size() >= 5 && queue.size() >= 5) {
            int popFromStack = random.nextInt(2) + 1; 
            int dequeueFromQueue = random.nextInt(2) + 1; 

            JOptionPane.showMessageDialog(this,
                    "After popping " + popFromStack + " elements from stack and dequeuing " + dequeueFromQueue + " elements from queue, what will be the result?");
        }
    }

    private void checkTaskCompletion() {
        
        if (stack.size() >= 5 && queue.size() >= 5) {
            generateRandomTask();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(StackQueueGameApp::new);
    }
}
