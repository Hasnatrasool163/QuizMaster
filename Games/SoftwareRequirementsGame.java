package Games;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

public class SoftwareRequirementsGame extends JFrame {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    private Map<String, String> requirements; // Map to store requirements and descriptions
    private List<String> shuffledKeys; // Shuffled keys for random display

    private JLabel requirementLabel;
    private JTextArea descriptionArea;
    private JButton nextButton;

    private int currentIndex;

    public SoftwareRequirementsGame() {
        setTitle("Software Requirements Game");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        // Initialize requirements and descriptions
        initializeRequirements();

        // Shuffle keys for random display
        shuffledKeys = new ArrayList<>(requirements.keySet());
        Collections.shuffle(shuffledKeys);

  
        requirementLabel = new JLabel();
        requirementLabel.setFont(new Font("Arial", Font.BOLD, 18));
        descriptionArea = new JTextArea(10, 40);
        descriptionArea.setFont(new Font("Tahoma",Font.BOLD,22));
        descriptionArea.setEditable(false);
        descriptionArea.setLineWrap(true);
        descriptionArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(descriptionArea);

        nextButton = new JButton("Next");
        nextButton.addActionListener((ActionEvent e) -> {
            showNextRequirement();
        });

        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        topPanel.add(requirementLabel);

        JPanel centerPanel = new JPanel(new BorderLayout(10, 10));
        centerPanel.add(scrollPane, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        bottomPanel.add(nextButton);

        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);

        getContentPane().add(mainPanel);
        setVisible(true);

       
        currentIndex = 0;
        showNextRequirement();
    }

    private void initializeRequirements() {
        requirements = new HashMap<>();
        requirements.put("Authentication", "Verify the identity of users accessing the system.");
        requirements.put("Data Encryption", "Protect sensitive data by encrypting it during transmission and storage.");
        requirements.put("Scalability", "Ability of the system to handle increasing amounts of workload or data.");
        requirements.put("User Interface", "Design and layout of screens and interaction elements for users.");
       
    }

    private void showNextRequirement() {
        if (currentIndex < shuffledKeys.size()) {
            String key = shuffledKeys.get(currentIndex);
            requirementLabel.setText("Requirement: " + key);
            descriptionArea.setText(requirements.get(key));
            currentIndex++;
        } else {
            JOptionPane.showMessageDialog(this, "You have reviewed all requirements. Game Over!");
            System.exit(0); 
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SoftwareRequirementsGame::new);
    }
}
