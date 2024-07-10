package utilities;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class LoadingDialog extends JDialog {

    private Timer timer;
    private int angle;

    private Color[] colors = {
    new Color(255, 255, 153),  
    new Color(255, 204, 153), 
    new Color(255, 153, 153)  
};


    private int currentColorIndex = 0;

    public LoadingDialog(JFrame parent) {
        super(parent, "Loading", ModalityType.APPLICATION_MODAL);
        setUndecorated(true);
        setSize(120, 100);
        setLocationRelativeTo(parent);

        startAnimation();

        timer = new Timer(3000, (ActionEvent e) -> {
            stopAnimation();
            dispose();
        });
        timer.setRepeats(false);
        timer.start();
    }

    private void startAnimation() {
        angle = 0;

        Timer animationTimer = new Timer(250, (ActionEvent e) -> {
            angle += 15;
            // Cycle through colors array
            currentColorIndex = (currentColorIndex + 1) % colors.length;
            repaint();
        });
        animationTimer.start();
    }

    private void stopAnimation() {
        if (timer != null) {
            timer.stop();
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.clearRect(0, 0, getWidth(), getHeight());

        int x = 20;
        int y = 10;
        int diameter = 80;

        Color circleColor = colors[currentColorIndex];
        g2d.setColor(circleColor);
        g2d.setStroke(new BasicStroke(9));
        g2d.rotate(Math.toRadians(angle), x + diameter / 2, y + diameter / 2);
        g2d.drawOval(x, y, diameter, diameter);
    }
}
