package Visualization_Frames;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class BigOVisualizer extends JFrame {
private JEditorPane panel;
JScrollPane scrollPane;
private ArrayList<String>bigONotations;
private ArrayList<String>names;
private ArrayList<String> purposes;

public BigOVisualizer() {
    setTitle("Big O Notations");
    setLayout(null);
    setLocationRelativeTo(null);
    setResizable(false);
    setLocationByPlatform(true);
    setAlwaysOnTop(true);

    bigONotations = new ArrayList<>();
    names = new ArrayList<>();
    purposes = new ArrayList<>();

    
    bigONotations.add("O(1)");
    names.add("Constant Time");
    purposes.add("Accessing an element in an array by its index");

    bigONotations.add("O(log n)");
    names.add("Logarithmic Time");
    purposes.add("Finding an element in a sorted array using binary search");

    bigONotations.add("O(n)");
    names.add("Linear Time");
    purposes.add("Finding an element in an array by iterating through each element");

    bigONotations.add("O(n log n)");
    names.add("Linearithmic Time");
    purposes.add("Sorting an array using merge sort or quick sort");

    bigONotations.add("O(n^2)");
    names.add("Quadratic Time");
    purposes.add("Sorting an array using bubble sort or selection sort");

    bigONotations.add("O(2^n)");
    names.add("Exponential Time");
    purposes.add("Finding the shortest path in a graph using breadth-first search");

    bigONotations.add("O(n!)");
    names.add("Factorial Time");
    purposes.add("Finding the shortest path in a graph using depth-first search");

    JPanel contentPanel = new JPanel();
    contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

    int x = 20;
    int y = 20;
    int width = 200;
    int height = 30;

    for (int i = 0; i < bigONotations.size(); i++) {
        JLabel bigOLabel = new JLabel(bigONotations.get(i));
        bigOLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
        bigOLabel.setForeground(new Color(30, 144, 255));
        bigOLabel.setBounds(x, y, width, height);
        contentPanel.add(bigOLabel);

        JTextField nameLabel = new JTextField(names.get(i));
        nameLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        nameLabel.setBounds(x + 220, y, width, height);
        nameLabel.setForeground(Color.ORANGE);
        contentPanel.add(nameLabel);

        JTextField purposeLabel = new JTextField("e.g->"+purposes.get(i));
        purposeLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        purposeLabel.setBounds(x + 440, y, width, height);
        purposeLabel.setForeground(Color.CYAN);
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
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setVisible(true);

   
}

public static void main(String[] args) {
    new BigOVisualizer().setVisible(true);
}

}
