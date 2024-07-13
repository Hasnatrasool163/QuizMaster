package Visualization_Frames;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;


public class MachineLearningChart extends JFrame {

private DefaultPieDataset dataset;
private String title = "Machine Learning Applications";
public MachineLearningChart() {
    dataset = new DefaultPieDataset();

   
    dataset.setValue("Image Classification", 25);
    dataset.setValue("Natural Language Processing", 20);
    dataset.setValue("Predictive Maintenance", 15);
    dataset.setValue(" Fraud Detection", 10);
    dataset.setValue("Recommendation Systems", 30);

    JFreeChart chart = ChartFactory.createPieChart(title, dataset, true, true, false);
    PiePlot plot = (PiePlot) chart.getPlot();
    plot.setSectionOutlinesVisible(false);

    ChartPanel chartPanel = new ChartPanel(chart);
    chartPanel.setMouseWheelEnabled(true);

    add(chartPanel, BorderLayout.CENTER);

    setSize(800, 600);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    setVisible(true);
}

public static void main(String[] args) {
    new MachineLearningChart().setVisible(true);
}

}