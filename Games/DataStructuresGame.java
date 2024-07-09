package Games;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class DataStructuresGame extends JFrame {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    private JPanel mainPanel;
    private JComboBox<String> dataStructuresComboBox;
    private JTextArea descriptionArea;
    private JButton visualizeButton;

    private String[] dataStructures = {"Array", "Linked List", "Stack", "Queue", "Binary Tree", "Hash Table"};
    private String[] descriptions = {
            "A collection of elements stored at contiguous memory locations.",
            "A linear collection of elements where each element points to the next one.",
            "A collection of elements with Last In First Out (LIFO) access.",
            "A collection of elements with First In First Out (FIFO) access.",
            "A tree data structure where each node has at most two children.",
            "A data structure that maps keys to values, allowing O(1) average time complexity for insert and search operations."
    };

    public DataStructuresGame() {
        setTitle("Data Structures Visualizer");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        dataStructuresComboBox = new JComboBox<>(dataStructures);
        dataStructuresComboBox.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(dataStructuresComboBox);

        descriptionArea = new JTextArea(10, 40);
        descriptionArea.setEditable(false);
        descriptionArea.setFont(new Font("Tahoma",Font.PLAIN,20));
        descriptionArea.setLineWrap(true);
        descriptionArea.setBackground(Color.orange);
        descriptionArea.setWrapStyleWord(true);
        descriptionArea.setText(descriptions[0]); // Set default description
        JScrollPane scrollPane = new JScrollPane(descriptionArea);
        scrollPane.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(scrollPane);

        visualizeButton = new JButton("Visualize");
        visualizeButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        visualizeButton.addActionListener((ActionEvent e) -> {
            visualizeDataStructure();
        });
        mainPanel.add(visualizeButton);

        getContentPane().add(mainPanel);
        setVisible(true);
    }

    private void visualizeDataStructure() {
        String selectedStructure = (String) dataStructuresComboBox.getSelectedItem();

        
        JFrame visualizationFrame = new JFrame("Visualization: " + selectedStructure);
        visualizationFrame.setSize(600, 400);
        visualizationFrame.setLocationRelativeTo(this);
        visualizationFrame.setVisible(true);

        JPanel visualizationPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;

                switch (selectedStructure) {
                    case "Array" -> drawArrayVisualization(g2d);
                    case "Linked List" -> drawLinkedListVisualization(g2d);
                    case "Stack" -> drawStackVisualization(g2d);
                    case"Binary Tree"-> drawBinaryTreeVisualization(g2d);
                    case"Queue"->drawQueueVisualization(g2d);
                    case"Hash Table"->drawHashTreeVisualization(g2d);                    
                    default -> {
                    }
                }
               
                            }

            private void drawArrayVisualization(Graphics2D g2d) {
                g2d.setColor(Color.BLACK);
                g2d.drawRect(50, 50, 400, 50); // Example array box
                g2d.drawString("Array Visualization", 50, 30);
                g2d.drawString("[0]", 60, 80); 
                g2d.drawString("[1]", 120, 80); 
                g2d.drawString("[2]", 180, 80); 
                g2d.drawString("[3]", 240, 80); 
                g2d.drawString("[4]", 300, 80); 
                
            }

            private void drawLinkedListVisualization(Graphics2D g2d) {
                g2d.setColor(Color.BLACK);
                g2d.drawRect(50, 50, 400, 50); 
                g2d.drawString("Linked List Visualization", 50, 30);
                g2d.drawString("Node 1 -> Node 2 -> Node 3 -> ...", 60, 80); 
                
            }

            private void drawStackVisualization(Graphics2D g2d) {
                g2d.setColor(Color.BLACK);
                g2d.drawRect(50, 50, 100, 200); // Example stack box
                g2d.drawString("Stack Visualization", 50, 30);
                g2d.drawString("Top", 60, 70); // Example stack element
                g2d.drawString("Element 1", 60, 100); // Example stack element
                g2d.drawString("Element 2", 60, 130); // Example stack element
                
            }
            
            
            private void drawQueueVisualization(Graphics2D g2d) {
    g2d.setColor(Color.BLACK);
    g2d.drawRect(50, 50, 400, 50); // Queue box
    g2d.drawString("Queue Visualization", 50, 30);
    g2d.drawString("Front", 60, 70); // Front element
    g2d.drawString("Rear", 360, 70); // Rear element
    g2d.drawString("Element 1", 100, 100); // Element 1
    g2d.drawString("Element 2", 150, 100); // Element 2
    g2d.drawString("Element 3", 200, 100); // Element 3
    // Add more elements as needed
}

private void drawBinaryTreeVisualization(Graphics2D g2d) {
    g2d.setColor(Color.BLACK);
    g2d.drawRect(50, 50, 400, 200); // Binary Tree box
    g2d.drawString("Binary Tree Visualization", 50, 30);
    g2d.drawString("Root", 200, 70); // Root node
    g2d.drawString("Left Child", 100, 120); // Left child
    g2d.drawString("Right Child", 300, 120); // Right child
    g2d.drawString("Left Grandchild", 50, 170); // Left grandchild
    g2d.drawString("Right Grandchild", 350, 170); // Right grandchild
    // Add more nodes as needed
}

private void drawHashTreeVisualization(Graphics2D g2d) {
    g2d.setColor(Color.BLACK);
    g2d.drawRect(50, 50, 400, 200); // Hash Tree box
    g2d.drawString("Hash Tree Visualization", 50, 30);
    g2d.drawString("Root", 200, 70); // Root node
    g2d.drawString("Bucket 1", 100, 120); // Bucket 1
    g2d.drawString("Bucket 2", 300, 120); // Bucket 2
    g2d.drawString("Key 1", 50, 170); // Key 1
    g2d.drawString("Key 2", 350, 170); // Key 2
    // Add more nodes as needed
}

        };

        visualizationFrame.add(visualizationPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DataStructuresGame::new);
    }
}
