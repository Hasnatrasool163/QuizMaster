package Concepts;

import javax.swing.SwingUtilities;

public class HTMLImagesGUI extends AbstractConceptsGUI {

    public HTMLImagesGUI() {
        super("HTML Images");
    }

    @Override
    protected String getTheoryText() {
        return """
               HTML Images are used to display graphics on a web page.
               
               Key Concepts:
               1. <img> tag and its attributes: src, alt, width, height
               2. Image Formats: JPEG, PNG, GIF
               3. Image Alignment and Styling
               4. Responsive Images and Image Maps
               
               Example of Adding an Image:
               <img src="example.jpg" alt="Example Image" width="200" height="150">
               """;
    }

    @Override
    protected String getExampleCode() {
        return """
               <img src="example.jpg" alt="Example Image" width="200" height="150">
               """;
    }

    @Override
    protected void addQuizQuestions() {
        addQuizQuestion("<img> tag in HTML is used to display graphics on a web page.", true);
        addQuizQuestion("The 'alt' attribute in <img> tag specifies the path of the image file.", false);
        addQuizQuestion("Responsive images in HTML ensure that images are scaled appropriately based on the screen size.", true);
        addQuizQuestion("Image maps in HTML allow defining clickable areas on an image.", true);
        addQuizQuestion("HTML images cannot be aligned using CSS styles.", false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            HTMLImagesGUI frame = new HTMLImagesGUI();
            frame.setVisible(true);
        });
    }
}
