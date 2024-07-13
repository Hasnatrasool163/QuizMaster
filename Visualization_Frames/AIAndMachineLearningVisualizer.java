package Visualization_Frames;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class AIAndMachineLearningVisualizer extends JFrame {
    private JEditorPane panel;
    JScrollPane scrollPane;
    private ArrayList<String> aiAndMachineLearningConcepts;
    private ArrayList<String> descriptions;
    private ArrayList<String> visualizations;

    public AIAndMachineLearningVisualizer() {
        setTitle("AI and Machine Learning");
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setLocationByPlatform(true);
//        setAlwaysOnTop(true);

        aiAndMachineLearningConcepts = new ArrayList<>();
        descriptions = new ArrayList<>();
        visualizations = new ArrayList<>();

      
        aiAndMachineLearningConcepts.add("Decision Trees");
        descriptions.add("A tree-like model used for classification and regression");
        visualizations.add("A tree with nodes and edges, representing decisions and outcomes");

        aiAndMachineLearningConcepts.add("Neural Networks");
        descriptions.add("A model inspired by the human brain, used for classification and regression");
        visualizations.add("A network of nodes and edges, representing artificial neurons and connections");

        aiAndMachineLearningConcepts.add("Clustering");
        descriptions.add("A technique used for grouping similar data points");
        visualizations.add("A scatter plot with clusters, representing groups of similar data points");

        aiAndMachineLearningConcepts.add("Regression");
        descriptions.add("A technique used for predicting continuous outcomes");
        visualizations.add("A line graph, representing the relationship between input and output variables");

        aiAndMachineLearningConcepts.add("Classification");
        descriptions.add("A technique used for predicting categorical outcomes");
        visualizations.add("A bar chart, representing the distribution of classes");
        
        aiAndMachineLearningConcepts.add("Support Vector Machines");
        descriptions.add("A model used for classification and regression, finding the best hyperplane");
        visualizations.add("A graph with a hyperplane, separating classes or predicting outcomes");

        aiAndMachineLearningConcepts.add("Natural Language Processing");
        descriptions.add("A field focused on human-computer interaction, text analysis, and language understanding");
        visualizations.add("A word cloud, representing text analysis and language processing");

        aiAndMachineLearningConcepts.add("Deep Learning");
        descriptions.add("A subfield of machine learning, using neural networks with multiple layers");
        visualizations.add("A neural network with multiple layers, representing deep learning architecture");

        aiAndMachineLearningConcepts.add("Reinforcement Learning");
        descriptions.add("A technique where an agent learns from interactions with an environment");
        visualizations.add("A graph with an agent and environment, representing reinforcement learning");

        aiAndMachineLearningConcepts.add("Unsupervised Learning");
        descriptions.add("A technique where a model learns from unlabeled data");
        visualizations.add("A scatter plot with clusters, representing unsupervised learning");

        aiAndMachineLearningConcepts.add("Supervised Learning");
        descriptions.add("A technique where a model learns from labeled data");
        visualizations.add("A graph with labeled data points, representing supervised learning");

        aiAndMachineLearningConcepts.add("Dimensionality Reduction");
        descriptions.add("A technique used to reduce the number of features in a dataset");
        visualizations.add("A scatter plot with reduced dimensions, representing dimensionality reduction");

        aiAndMachineLearningConcepts.add("Generative Adversarial Networks");
        descriptions.add("A model used for generating new data, competing with a discriminator");
        visualizations.add("A graph with a generator and discriminator, representing GAN architecture");

        aiAndMachineLearningConcepts.add("Transfer Learning");
        descriptions.add("A technique where a model uses pre-trained weights for a new task");
        visualizations.add("A graph with a pre-trained model and new task, representing transfer learning");

        aiAndMachineLearningConcepts.add("Time Series Analysis");
        descriptions.add("A technique used for analyzing sequential data");
        visualizations.add("A line graph with time series data, representing trends and patterns");


        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        int x = 20;
        int y = 20;
        int width = 200;
        int height = 30;

         for (int i = 0; i < aiAndMachineLearningConcepts.size(); i++) {
        JLabel bigOLabel = new JLabel(aiAndMachineLearningConcepts.get(i));
        bigOLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
        bigOLabel.setForeground(new Color(30, 144, 255));
        bigOLabel.setBounds(x, y, width, height);
        contentPanel.add(bigOLabel);

        JTextField nameLabel = new JTextField(descriptions.get(i));
        nameLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        nameLabel.setBounds(x + 220, y, width, height);
        nameLabel.setForeground(Color.MAGENTA);
        contentPanel.add(nameLabel);

        JTextField purposeLabel = new JTextField(visualizations.get(i));
        purposeLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        purposeLabel.setBounds(x + 440, y, width, height);
        purposeLabel.setForeground(Color.ORANGE);
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
        new AIAndMachineLearningVisualizer().setVisible(true);
    }
}
