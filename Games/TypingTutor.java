package Games;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.net.URL;

public class TypingTutor extends JFrame implements KeyListener {
    private JTextPane promptPane;
    private JLabel statsLabel;
    private HashMap<Character, Integer> mistakeCounts;
    private ArrayList<String> exercises;
    private int level;
    private String currentExercise;
    private StringBuilder currentInput;
    private int correctPresses;
    private int totalPresses;
    private long startTime;
    private long endTime;

    public TypingTutor() {
        showLoadingScreen();
        mistakeCounts = new HashMap<>();
    }

    private void showLoadingScreen() {
        JFrame loadingFrame = new JFrame("Loading...");
        loadingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loadingFrame.setSize(800, 600);
        loadingFrame.setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());
        JLabel label = new JLabel("Welcome! Place your hands on the keyboard as shown and press any key to continue.", SwingConstants.CENTER);
        label.setFont(new Font("Serif", Font.BOLD, 16));
        label.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        URL imageUrl = getClass().getResource("/icons/keyboard_hands.png");

        if (imageUrl != null) {
            ImageIcon icon = new ImageIcon(imageUrl);
            JLabel imageLabel = new JLabel(icon);
            panel.add(imageLabel, BorderLayout.CENTER);
        } else {
            System.err.println("Resource not found: keyboard_hands.png");
        }

        panel.add(label, BorderLayout.SOUTH);

        loadingFrame.add(panel);
        loadingFrame.setVisible(true);

        loadingFrame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                loadingFrame.dispose();
                initUI();
                loadExercises();
                level = 0;
                startLevel();
                mistakeCounts = new HashMap<>();
            }
        });

        loadingFrame.setFocusable(true); // To ensure the JFrame can capture key presses
    }

    private void initUI() {
        setTitle("Typing Tutor");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        promptPane = new JTextPane();
        promptPane.setContentType("text/html");
        promptPane.setEditable(false);
        promptPane.setFont(new Font("Serif", Font.BOLD, 24));
        JScrollPane scrollPane = new JScrollPane(promptPane);
        add(scrollPane, BorderLayout.CENTER);

        statsLabel = new JLabel("Accuracy: 0%, Words Per Minute (WPM): 0", SwingConstants.CENTER);
        statsLabel.setFont(new Font("Serif", Font.BOLD, 18));
        add(statsLabel, BorderLayout.SOUTH);

        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    private void loadExercises() {
        exercises = new ArrayList<>();
        InputStream is = getClass().getResourceAsStream("exercises.txt");
        if (is == null) {
            JOptionPane.showMessageDialog(this, "Resource not found: exercises.txt", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
            String line;
            StringBuilder exercise = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    if (line.startsWith("Level")) {
                        if (!exercise.isEmpty()) {
                            exercises.add(exercise.toString().trim());
                            exercise = new StringBuilder();
                        }
                    } else {
                        exercise.append(line).append("\n");
                    }
                }
            }
            if (!exercise.isEmpty()) {
                exercises.add(exercise.toString().trim());
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Failed to load exercises from file.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void startLevel() {
        if (level < exercises.size()) {
            currentExercise = exercises.get(level);
            currentInput = new StringBuilder();
            correctPresses = 0;
            totalPresses = 0;
            startTime = System.currentTimeMillis();
            updateTextPane();
            this.requestFocus();
        } else {
            JOptionPane.showMessageDialog(this, "Congratulations, you have completed all levels!", "Completed", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void updateStats() {
        endTime = System.currentTimeMillis();
        double accuracy = (totalPresses > 0) ? ((double) correctPresses / totalPresses) * 100 : 0;
        double timeTaken = (endTime - startTime) / 60000.0;
        double wpm = (timeTaken > 0) ? (correctPresses / 5.0) / timeTaken : 0;

        statsLabel.setText(String.format("Level: %d, Accuracy: %.2f%%, Words Per Minute (WPM): %.2f", level + 1, accuracy, wpm));
    }

    private void updateTextPane() {
        StringBuilder htmlText = new StringBuilder("<html><body style='font-size: 24px;'>");
        for (int i = 0; i < currentExercise.length(); i++) {
            char c = currentExercise.charAt(i);
            if (i < currentInput.length()) {
                char inputChar = currentInput.charAt(i);
                if (c == inputChar) {
                    htmlText.append("<span style='color: green;'>").append(c).append("</span>");
                } else {
                    htmlText.append("<span style='color: red;'>").append(inputChar).append("</span>");
                }
            } else {
                htmlText.append("<span style='color: black;'>").append(c).append("</span>");
            }
        }
        htmlText.append("</body></html>");
        promptPane.setText(htmlText.toString());
    }

    private void showProblematicKeys() {
        StringBuilder message = new StringBuilder("Watch out for these keys:\n");
        mistakeCounts.entrySet().stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .limit(5) // Show top 5 problematic keys
                .forEach(entry -> message.append(entry.getKey()).append(": ").append(entry.getValue()).append(" mistakes\n"));

        JOptionPane.showMessageDialog(this, message.toString(), "Problematic Keys", JOptionPane.INFORMATION_MESSAGE);
    }

    private void checkAndShowAchievements(double accuracy, double wpm) {
        ArrayList<String> achievements = new ArrayList<>();

        if (level == 1) {
            achievements.add("Completed the First Level!");
        }
        if (accuracy >= 90.0) {
            achievements.add("Achieved 90% Accuracy!");
        }
        if (wpm >= 60) {
            achievements.add("Reached 60 WPM!");
        }

        if (!achievements.isEmpty()) {
            StringBuilder message = new StringBuilder("Congratulations! You've unlocked new achievements:\n");
            for (String achievement : achievements) {
                message.append(achievement).append("\n");
            }
            JOptionPane.showMessageDialog(this, message.toString(), "Achievements", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        // Handle backspace for corrections
        if (c == KeyEvent.VK_BACK_SPACE) {
            if (currentInput.length() > 0) {
                currentInput.deleteCharAt(currentInput.length() - 1);
                totalPresses--;
                updateTextPane();
                updateStats();
            }
            return;
        }

        // Ignore non-printable characters.
        if (Character.isISOControl(c)) {
            return;
        }

        if (currentInput.length() < currentExercise.length()) {
            currentInput.append(c);

            if (currentExercise.charAt(currentInput.length() - 1) != c) {
                Toolkit.getDefaultToolkit().beep();
                mistakeCounts.put(c, mistakeCounts.getOrDefault(c, 0) + 1);
            }

            if (currentExercise.charAt(currentInput.length() - 1) == c) {
                correctPresses++;
            }
            totalPresses++;
            updateTextPane();
            updateStats();
        }
    }

    private void showResults() {
        double accuracy = (totalPresses > 0) ? ((double) correctPresses / totalPresses) * 100 : 0;
        double timeTaken = (endTime - startTime) / 60000.0;
        double wpm = (timeTaken > 0) ? (correctPresses / 5.0) / timeTaken : 0;

        // Determine and display problematic keys
        String problematicKeys = getProblematicKeysString();

        // Determine and display achievements
        checkAndShowAchievements(accuracy, wpm);

        // Show results and options
        int choice = JOptionPane.showOptionDialog(this,
                String.format("Your accuracy: %.2f%%\nWords per minute: %.2f\n\nProblematic keys: %s\n\nWould you like to proceed to the next level or repeat this one?", accuracy, wpm, problematicKeys),
                "Results", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                new String[]{"Next Level", "Repeat Level"}, "Next Level");

        if (choice == JOptionPane.YES_OPTION) {
            level++;
        }
        startLevel();
    }

    private String getProblematicKeysString() {
        StringBuilder problematicKeys = new StringBuilder();
        mistakeCounts.entrySet().stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .limit(5)
                .forEach(entry -> problematicKeys.append(entry.getKey()).append(" (").append(entry.getValue()).append(" mistakes), "));

        if (problematicKeys.length() > 2) {
            problematicKeys.setLength(problematicKeys.length() - 2); // Remove the last comma and space
        }
        return problematicKeys.toString();
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (currentInput.toString().equals(currentExercise)) {
            endTime = System.currentTimeMillis();
            showResults();
        }
    }

    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            TypingTutor tutor = new TypingTutor();
//            tutor.setVisible(true);
//        });
new TypingTutor().setVisible(true);
    }
}
