package utilities;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class DiagramViewer extends JFrame{
    
    
private JLabel questionLabel;
private JLabel imageLabel;
private JScrollPane imageScrollPane;
private double zoomFactor = 1.0;
private double minZoom = 0.5;
private double maxZoom = 2.0;
public String extension = ".jpeg";

public DiagramViewer(String questionText ,String diagramUrl) {

        requestFocus();
        setAlwaysOnTop(true);
	setTitle("Diagram Viewer");
	setSize(800, 600);
        setLocationByPlatform(true);
        setLocationRelativeTo(null);
	questionLabel = new JLabel(questionText);
	questionLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
	questionLabel.setHorizontalAlignment(SwingConstants.CENTER);

        
        ClassLoader classLoader = getClass().getClassLoader();
        BufferedImage image = null;
	try {
            image = ImageIO.read(classLoader.getResource("diagrams/"+diagramUrl+extension));
	} catch (IOException e) {
	}
	ImageIcon icon = new ImageIcon(image);
	imageLabel = new JLabel(icon);
	imageScrollPane = new JScrollPane(imageLabel);

	getContentPane().add(questionLabel, BorderLayout.NORTH);
	getContentPane().add(imageScrollPane, BorderLayout.CENTER);

	imageLabel.addMouseWheelListener((MouseWheelEvent e) -> {
		int direction = e.getWheelRotation();
		if (direction < 0) {
			zoomFactor += 0.1;
		} else {
			zoomFactor -= 0.1;
		}
		zoomFactor = Math.max(minZoom, Math.min(maxZoom, zoomFactor));
		zoomImage();
	});

	imageLabel.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getButton() == MouseEvent.BUTTON3) {
				JPopupMenu menu = new JPopupMenu();
				JMenuItem saveItem = new JMenuItem("Save Image");
				saveItem.addActionListener((ActionEvent e1) -> {
					saveImage();
				});
				menu.add(saveItem);
				menu.show(imageLabel, e.getX(), e.getY());
			}
		}
	});

	setVisible(true);
	setDefaultCloseOperation(HIDE_ON_CLOSE);
}


@Override
 public void dispose() {
        super.dispose();
    }

private void zoomImage() {
    BufferedImage image = (BufferedImage) ((ImageIcon) imageLabel.getIcon()).getImage();
    double newZoomFactor = zoomFactor;
    
  
    if (newZoomFactor < minZoom) {
        newZoomFactor = minZoom;
    } else if (newZoomFactor > maxZoom) {
        newZoomFactor = maxZoom;
    }
    
    int width = (int) (image.getWidth() * newZoomFactor);
    int height = (int) (image.getHeight() * newZoomFactor);
    
    
    if (width <= 0 || height <= 0) {
        return; 
    }
    
    BufferedImage scaledImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
    
    AffineTransform transform = new AffineTransform();
    transform.scale(newZoomFactor, newZoomFactor);
    
    Graphics2D g = scaledImage.createGraphics();
    g.transform(transform);
    g.drawImage(image, 0, 0, null);
    g.dispose();
    
    imageLabel.setIcon(new ImageIcon(scaledImage));
    imageScrollPane.setViewportView(imageLabel);
}

private void saveImage() {
	JFileChooser fileChooser = new JFileChooser();
	int result = fileChooser.showSaveDialog(this);
	if (result == JFileChooser.APPROVE_OPTION) {
		File file = fileChooser.getSelectedFile();
		try {
			ImageIO.write((BufferedImage) ((ImageIcon) imageLabel.getIcon()).getImage(), "png", file);
		} catch (IOException e) {
		}
	}
}



}
