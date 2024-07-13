package Visualization_Frames;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DataStructuresVisualizer extends JFrame {
    private JEditorPane panel;
    JScrollPane scrollPane;
    private ArrayList<String> dataStructures;
    private ArrayList<String> purposes;
    private ArrayList<String> differences;

    public DataStructuresVisualizer() {
        setTitle("Data Structures");
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setLocationByPlatform(true);
        setAlwaysOnTop(true);

        dataStructures = new ArrayList<>();
        purposes = new ArrayList<>();
        differences = new ArrayList<>();

        
        dataStructures.add("Array");
        purposes.add("Store a collection of elements of the same data type");
        differences.add("Fixed size, homogeneous elements");

        dataStructures.add("Linked List");
        purposes.add("Store a collection of elements with dynamic size");
        differences.add("Dynamic size, heterogeneous elements");

        dataStructures.add("Stack");
        purposes.add("Last In First Out (LIFO) data structure");
        differences.add("Last element added is the first one removed");

        dataStructures.add("Queue");
        purposes.add("First In First Out (FIFO) data structure");
        differences.add("First element added is the first one removed");

        dataStructures.add("Tree");
        purposes.add("Hierarchical data structure");
        differences.add("Each node has a value and zero or more child nodes");

        dataStructures.add("Graph");
        purposes.add("Non-linear data structure");
        differences.add("Nodes and edges represent relationships");
        
        dataStructures.add("Hash Table");
        purposes.add("Key-value data structure");
        differences.add("Fast lookups, insertions, and deletions");

        dataStructures.add("Heap");
        purposes.add("Specialized tree-based data structure");
        differences.add("Used for efficient sorting and priority queuing");

        dataStructures.add("Trie");
        purposes.add("Prefix tree data structure");
        differences.add("Used for efficient string matching and autocomplete");

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        int x = 20;
        int y = 20;
        int width = 200;
        int height = 30;

         for (int i = 0; i < dataStructures.size(); i++) {
        JLabel bigOLabel = new JLabel(dataStructures.get(i));
        bigOLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
        bigOLabel.setForeground(new Color(30, 144, 255));
        bigOLabel.setBounds(x, y, width, height);
        contentPanel.add(bigOLabel);

        JTextField nameLabel = new JTextField(purposes.get(i));
        nameLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        nameLabel.setBounds(x + 220, y, width, height);
        nameLabel.setForeground(new java.awt.Color(10, 255, 143));
        contentPanel.add(nameLabel);

        JTextField purposeLabel = new JTextField(differences.get(i));
        purposeLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        purposeLabel.setBounds(x + 440, y, width, height);
        purposeLabel.setForeground(Color.ORANGE);
        purposeLabel.setOpaque(true);
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
        new DataStructuresVisualizer().setVisible(true);
    }
}
