package Visualization_Frames;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class CompilerVsInterpreterVisualizer extends JFrame {

    private JPanel compilerPanel;
    private JPanel interpreterPanel;

    public CompilerVsInterpreterVisualizer() {
        setTitle("Compiler vs Interpreter Visualizer");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(800, 650);

        compilerPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawCompilerProcess(g);
            }
        };
        compilerPanel.setBackground(Color.decode("#ADD8E6")); // light blue

        interpreterPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawInterpreterProcess(g);
            }
        };
        interpreterPanel.setBackground(Color.decode("#FFD7BE")); // light orange

        JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, compilerPanel, interpreterPanel);
        splitPane.setResizeWeight(0.5);

        add(splitPane);

        setVisible(true);
    }

    private void drawCompilerProcess(Graphics g) {
        g.setColor(new Color(30, 144, 255)); // dark blue
        g.drawString("Compiler Process:", 10, 20);

// Draw steps as rectangles
        int x = 50;
        int y = 40;
        int width = 150;
        int height = 30;
        g.drawRect(x, y, width, height);
        g.drawString("1. Preprocessing", x + 10, y + 20);

        y += height + 10;
        g.drawRect(x, y, width, height);
        g.drawString("2. Lexical Analysis", x + 10, y + 20);

        y += height + 10;
        g.drawRect(x, y, width, height);
        g.drawString("3. Syntax Analysis", x + 10, y + 20);

        y += height + 10;
        g.drawRect(x, y, width, height);
        g.drawString("4. Semantic Analysis", x + 10, y + 20);

        y += height + 10;
        g.drawRect(x, y, width, height);
        g.drawString("5. Code Generation", x + 10, y + 20);

        y += height + 10;
        g.drawRect(x, y, width, height);
        g.drawString("6. Code Optimization", x + 10, y + 20);

// Draw arrows
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(2));
        g2d.draw(new Line2D.Double(x + width, y + height / 2, x + width, y + height + 10));
        g2d.draw(new Line2D.Double(x + width, y + height + 10, x, y + height + 10));

        y += height + 10;
        g2d.draw(new Line2D.Double(x + width, y + height / 2, x + width, y + height + 10));
        g2d.draw(new Line2D.Double(x + width, y + height + 10, x, y + height + 10));

        y += height + 10;
        g2d.draw(new Line2D.Double(x + width, y + height / 2, x + width, y + height + 10));
        g2d.draw(new Line2D.Double(x + width, y + height + 10, x, y + height + 10));
    }

    private void drawInterpreterProcess(Graphics g) {
        g.setColor(Color.RED); // dark orange
        g.drawString("Interpreter Process:", 10, 20);

// Draw steps as rectangles
        int x = 50;
        int y = 40;
        int width = 150;
        int height = 30;
        g.drawRect(x, y, width, height);
        g.drawString("1. Lexical Analysis", x + 10, y + 20);

        y += height + 10;
        g.drawRect(x, y, width, height);
        g.drawString("2. Syntax Analysis", x + 10, y + 20);

        y += height + 10;
        g.drawRect(x, y, width, height);
        g.drawString("3. Semantic Analysis", x + 10, y + 20);

        y += height + 10;
        g.drawRect(x, y, width, height);
        g.drawString("4. Execution", x + 10, y + 20);

// Draw arrows
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(2));
        g2d.draw(new Line2D.Double(x + width, y + height / 2, x + width, y + height + 10));
        g2d.draw(new Line2D.Double(x + width, y + height + 10, x, y + height + 10));
    }

    public static void main(String[] args) {
        new CompilerVsInterpreterVisualizer().setVisible(true);
    }
}
