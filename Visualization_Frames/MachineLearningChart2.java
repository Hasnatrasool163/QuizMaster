package Visualization_Frames;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.*;
import java.awt.*;

public class MachineLearningChart2 extends JFrame {
    public MachineLearningChart2() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Supervised Learning", 40);
        dataset.setValue("Unsupervised Learning", 30);
        dataset.setValue("Reinforcement Learning", 30);

        JFreeChart chart = ChartFactory.createPieChart("Machine Learning", dataset, true, true, false);
        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setSectionOutlinesVisible(false);

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setMouseWheelEnabled(true);

        add(chartPanel, BorderLayout.CENTER);

        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MachineLearningChart2().setVisible(true);
    }
}