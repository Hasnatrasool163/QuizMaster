package Games;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

public class AlgorithmVisualizer extends JFrame {

    private static final int WIDTH = 1120;
    private static final int HEIGHT = 600;
    private static final int DATA_SIZE = 50;
    private static final int[] algorithms = {0, 1, 2}; // 0: Bubble sort, 1: Selection sort, 2: Insertion sort

    private DefaultCategoryDataset dataset;
    private JPanel chartPanel;
    private int[] data;
    private int currentAlgorithm;

    public AlgorithmVisualizer() {
        setTitle("Algorithm Visualizer");
        setLocationRelativeTo(null);
        setLocationByPlatform(true);
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        data = new int[DATA_SIZE];
        Random random = new Random();
        for (int i = 0; i < DATA_SIZE; i++) {
            data[i] = random.nextInt(1000);
        }

        dataset = new DefaultCategoryDataset();
        updateDataset(data);

        JFreeChart chart = ChartFactory.createBarChart("Sorting Algorithm Visualization", "Index", "Value", dataset);
        chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(WIDTH - 50, HEIGHT - 100));
        add(chartPanel, BorderLayout.CENTER);

        JButton sortButton = new JButton("Sort");
        sortButton.addActionListener(e -> {
            restart();
            sort(data, currentAlgorithm);
            updateDataset(data);
        });

        JButton restartButton = new JButton("Restart");
        restartButton.addActionListener(e -> {
            restart();
        });

        JComboBox algorithmComboBox = new JComboBox();
        for (int algorithm : algorithms) {
            algorithmComboBox.addItem(getAlgorithmName(algorithm));
        }
        algorithmComboBox.setSelectedIndex(0);
        algorithmComboBox.addActionListener(e -> {
            currentAlgorithm = algorithms[algorithmComboBox.getSelectedIndex()];
        });

        JPanel controlPanel = new JPanel();
        controlPanel.add(sortButton);
        controlPanel.add(restartButton);
        controlPanel.add(algorithmComboBox);
        add(controlPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void updateDataset(int[] data) {
        dataset.clear();
        for (int i = 0; i < data.length; i++) {
            dataset.addValue(data[i], "Values", String.valueOf(i));
        }
    }

    private void sort(int[] data, int algorithm) {
        switch (algorithm) {
            case 0:
                bubbleSort(data);
                break;
            case 1:
                selectionSort(data);
                break;
            case 2:
                insertionSort(data);
                break;
        }
    }

    private void bubbleSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    private void selectionSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = data[i];
            data[i] = data[minIndex];
            data[minIndex] = temp;
        }
    }

    private void insertionSort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int key = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = key;
        }
    }

    private void restart() {
        Random random = new Random();
        for (int i = 0; i < DATA_SIZE; i++) {
            data[i] = random.nextInt(100);
        }
        updateDataset(data);
    }

    private String getAlgorithmName(int algorithm) {
        return switch (algorithm) {
            case 0 ->
                "Bubble Sort";
            case 1 ->
                "Selection Sort";
            case 2 ->
                "Insertion Sort";
            default ->
                "Unknown";
        };
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AlgorithmVisualizer());
    }
}
