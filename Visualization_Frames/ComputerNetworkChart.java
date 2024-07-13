package Visualization_Frames;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

public class ComputerNetworkChart extends JFrame {
private DefaultPieDataset dataset;
private String title = "Computer Networks";

public ComputerNetworkChart() {
    dataset = new DefaultPieDataset();
    dataset.setValue("TCP/IP", 30);
    dataset.setValue("DNS", 20);
    dataset.setValue("HTTP", 20);
    dataset.setValue("FTP", 15);
    dataset.setValue("SSH", 15);

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
    new ComputerNetworkChart().setVisible(true);
}

}