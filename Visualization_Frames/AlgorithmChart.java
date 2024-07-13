package Visualization_Frames;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

public class AlgorithmChart extends JFrame {
private DefaultPieDataset dataset;

public AlgorithmChart(String title) {
    dataset = new DefaultPieDataset();
    dataset.setValue("Sorting", 30);
    dataset.setValue("Searching", 20);
    dataset.setValue("Graph Algorithms", 20);
    dataset.setValue("Dynamic Programming", 15);
    dataset.setValue("Backtracking", 15);

    JFreeChart chart = ChartFactory.createPieChart(title, dataset, true, true, false);
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
    new AlgorithmChart("Algorithms").setVisible(true);
}

}

