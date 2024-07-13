package Visualization_Frames;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class AlgorithmVisualizer extends JFrame {
    private JEditorPane panel;
    JScrollPane scrollPane;
    private ArrayList<String> algorithms;
    private ArrayList<String> purposes;

    public AlgorithmVisualizer() {
        setTitle("Algorithms");
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setLocationByPlatform(true);
        setAlwaysOnTop(true);

        algorithms = new ArrayList<>();
        purposes = new ArrayList<>();

        
        algorithms.add("Bubble Sort");
        purposes.add("Sorts an array by repeatedly swapping adjacent elements that are in the wrong order.");

        algorithms.add("Selection Sort");
        purposes.add("Sorts an array by repeatedly selecting the smallest (or largest) element from the unsorted portion of the array.");

        algorithms.add("Insertion Sort");
        purposes.add("Sorts an array by inserting each element into its proper position in the sorted portion of the array.");

        algorithms.add("Merge Sort");
        purposes.add("Sorts an array by dividing it into smaller subarrays, sorting each subarray, and then merging the sorted subarrays back together.");

        algorithms.add("Quick Sort");
        purposes.add("Sorts an array by selecting a pivot element, partitioning the array around the pivot, and then recursively sorting the subarrays on either side of the pivot.");

        algorithms.add("Linear Search");
        purposes.add("Searches for an element in an array by iterating through each element and checking if it matches the target element.");

        algorithms.add("Binary Search");
        purposes.add("Searches for an element in a sorted array by repeatedly dividing the search interval in half and searching for the element in the appropriate half.");

        algorithms.add("Breadth-First Search (BFS)");
        purposes.add("Traverses a graph by visiting all the nodes at the current level before moving on to the next level.");

        algorithms.add("Depth-First Search (DFS)");
        purposes.add("Traverses a graph by visiting as far as possible along each branch before backtracking.");

        algorithms.add("Fibonacci Series");
        purposes.add("Computes the nth Fibonacci number using a recursive formula.");

        algorithms.add("Longest Common Subsequence (LCS)");
        purposes.add("Finds the longest sequence of elements that is common to two arrays.");

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        int x = 20;
        int y = 20;
        int width = 200;
        int height = 30;

         for (int i = 0; i < algorithms.size(); i++) {
            JLabel keywordLabel = new JLabel(algorithms.get(i));
            keywordLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
            keywordLabel.setForeground(new Color(30, 144, 255));
            keywordLabel.setBounds(x, y, width, height);
            contentPanel.add(keywordLabel);

            JTextField purposeLabel = new JTextField(purposes.get(i));
            purposeLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
            purposeLabel.setBounds(x + 220, y, width, height);
            purposeLabel.setForeground(Color.ORANGE);
            purposeLabel.setEditable(false);
            contentPanel.add(purposeLabel);

            y += 40;
        }


        panel = new JEditorPane();
        panel.setContentType("text/html");
        panel.setBounds(0, 0, 780, 600);
        scrollPane = new JScrollPane(panel);
        scrollPane.setBounds(0, 0, 780, 550);
        scrollPane.getViewport().add(contentPanel);
        scrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        add(scrollPane);

        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AlgorithmVisualizer().setVisible(true);
    }
}

