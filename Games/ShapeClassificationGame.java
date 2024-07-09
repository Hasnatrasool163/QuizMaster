package Games;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.util.Random;

public class ShapeClassificationGame extends JFrame {

    private JFrame frame;
    private DrawPanel drawPanel;
    private JComboBox<String> shapeBox;
    private JComboBox<String> operatorBox;
    private JButton classifyButton;
    private JLabel feedbackLabel;
    private JLabel scoreLabel;
    private JLabel attemptsLabel;
    private int score = 0;
    private int wrongAttempts = 0;
    private String currentShape;
    private String currentOperator;
    private int lastShapeIndex = -1; // Initialize with an invalid index
    private int lastOperatorIndex = -1; // Initialize with an invalid index
    private Timer timer;

    public ShapeClassificationGame() {
        initUI();
        setupTimer();
    }

    private void initUI() {
        frame = new JFrame("Shape Classification Game");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 450);
        frame.setLayout(new BorderLayout());
        drawPanel = new DrawPanel();
        frame.setAlwaysOnTop(true);
        frame.setLocationByPlatform(true);
        frame.setLocationRelativeTo(null);
        frame.add(drawPanel, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel(new FlowLayout());

        String[] shapes = {"Circle", "Square", "Triangle", "Rectangle", "Pentagon"};
        Arrays.sort(shapes);
        shapeBox = new JComboBox<>(shapes);

        String[] operators = {"Plus (+)", "Minus (-)", "Multiplication (*)", "Division (/)",
                "Logical AND (&&)", "Logical OR (||)", "Logical NOT (!)"};
        Arrays.sort(operators);
        operatorBox = new JComboBox<>(operators);

        classifyButton = new JButton("Classify");
        scoreLabel = new JLabel("Score: 0");
        attemptsLabel = new JLabel("Wrong Attempts: 0");

        bottomPanel.add(new JLabel("Select Shape:"));
        bottomPanel.add(shapeBox);
        bottomPanel.add(new JLabel("Select Operator:"));
        bottomPanel.add(operatorBox);
        bottomPanel.add(classifyButton);
        bottomPanel.add(scoreLabel);
        bottomPanel.add(attemptsLabel);

        feedbackLabel = new JLabel("Classify the shape or operator displayed above.");
        bottomPanel.add(feedbackLabel);

        frame.add(bottomPanel, BorderLayout.SOUTH);

        classifyButton.addActionListener((ActionEvent e) -> {
            classifyShape();
        });

        frame.setVisible(true);
        displayRandomShape();
    }

    private void setupTimer() {
        timer = new Timer(10000, (ActionEvent e) -> {
            displayRandomShape();
        });
        timer.setRepeats(false); // Only fire once per countdown
        timer.start();
    }

    private void restartTimer() {
        if (timer != null) {
            timer.restart();
        } else {
            setupTimer(); // Initialize timer if it's null (this is a fallback mechanism)
            timer.restart();
        }
    }

    private void displayRandomShape() {
        Random random = new Random();

        // Determine whether to display a shape or an operator
        int category = random.nextInt(2); // 0 for shapes, 1 for operators

        if (category == 0) {
            int shapeIndex;
            do {
                shapeIndex = random.nextInt(shapeBox.getItemCount());
            } while (shapeIndex == lastShapeIndex); // Ensure the shape doesn't repeat consecutively

            lastShapeIndex = shapeIndex; // Update last shape index
            currentShape = (String) shapeBox.getItemAt(shapeIndex);
        } else {
            int operatorIndex;
            do {
                operatorIndex = random.nextInt(operatorBox.getItemCount());
            } while (operatorIndex == lastOperatorIndex); // Ensure the operator doesn't repeat consecutively

            lastOperatorIndex = operatorIndex; // Update last operator index
            currentShape = (String) operatorBox.getItemAt(operatorIndex);
        }

        drawPanel.repaint();
        restartTimer(); // Restart the timer after displaying the shape
    }

    private void classifyShape() {
        String selectedShape = (String) shapeBox.getSelectedItem();
        String selectedOperator = (String) operatorBox.getSelectedItem();

        if (selectedShape.equals(currentShape) || selectedOperator.equals(currentShape)) {
            feedbackLabel.setText("Correct! It's a " + currentShape + ".");
            score++;
            scoreLabel.setText("Score: " + score);
        } else {
            feedbackLabel.setText("Incorrect. Try again.");
            wrongAttempts++;
            attemptsLabel.setText("Wrong Attempts: " + wrongAttempts);
        }
        displayRandomShape(); // Display the next random shape after classification
    }

    private class DrawPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            g2d.setColor(Color.WHITE);
            g2d.fillRect(0, 0, getWidth(), getHeight());

            // Draw the current shape or symbol
            g2d.setColor(Color.BLACK);
            int x = getWidth() / 2 - 50;
            int y = getHeight() / 2 - 50;

            switch (currentShape) {
                case "Circle" -> g2d.fillOval(x, y, 100, 100);
                case "Square" -> g2d.fillRect(x, y, 100, 100);
                case "Triangle" -> {
                    int[] xPoints = {x + 50, x, x + 100};
                    int[] yPoints = {y, y + 100, y + 100};
                    g2d.fillPolygon(xPoints, yPoints, 3);
                }
                case "Rectangle" -> g2d.fillRect(x, y, 100, 50);
                case "Pentagon" -> {
                    int[] xPoints = {x + 50, x, x + 100, x + 75, x + 25};
                    int[] yPoints = {y, y + 100, y + 100, y + 50, y + 50};
                    g2d.fillPolygon(xPoints, yPoints, 5);
                }
                case "Plus (+)" -> {
                    g2d.setFont(new Font("TimesRoman", Font.PLAIN, 80));
                    g2d.drawString("+", x + 25, y + 80);
                }
                case "Minus (-)" -> {
                    g2d.setFont(new Font("TimesRoman", Font.PLAIN, 80));
                    g2d.drawString("-", x + 25, y + 80);
                }
                case "Multiplication (*)" -> {
                    g2d.setFont(new Font("TimesRoman", Font.PLAIN, 80));
                    g2d.drawString("*", x + 25, y + 80);
                }
                case "Division (/)" -> {
                    g2d.setFont(new Font("TimesRoman", Font.PLAIN, 80));
                    g2d.drawString("/", x + 25, y + 80);
                }
                case "Logical AND (&&)" -> {
                    g2d.setFont(new Font("TimesRoman", Font.PLAIN, 50));
                    g2d.drawString("&&", x + 10, y + 70);
                }
                case "Logical OR (||)" -> {
                    g2d.setFont(new Font("TimesRoman", Font.PLAIN, 50));
                    g2d.drawString("||", x + 10, y + 70);
                }
                case "Logical NOT (!)" -> {
                    g2d.setFont(new Font("TimesRoman", Font.PLAIN, 80));
                    g2d.drawString("!", x + 25, y + 80);
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ShapeClassificationGame::new);
    }
}
