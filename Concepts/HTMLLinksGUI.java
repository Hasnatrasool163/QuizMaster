package Concepts;

import javax.swing.SwingUtilities;

public class HTMLLinksGUI extends AbstractConceptsGUI {

    public HTMLLinksGUI() {
        super("HTML Links");
    }

    @Override
    protected String getTheoryText() {
        return """
               HTML Links are used to navigate between web pages and resources.
               
               Key Concepts:
               1. <a> tag and its attributes: href, target
               2. Relative vs. Absolute URLs
               3. Linking to Sections within a Page: # fragment identifier
               4. Opening Links in New Windows: target="_blank"
               
               Example of Creating a Link:
               <a href="https://www.example.com" target="_blank">Visit Example</a>
               """;
    }

    @Override
    protected String getExampleCode() {
        return """
               <a href="https://www.example.com" target="_blank">Visit Example</a>
               """;
    }

    @Override
    protected void addQuizQuestions() {
        addQuizQuestion("<a> tag in HTML is used to create hyperlinks.", true);
        addQuizQuestion("Relative URLs in HTML specify the complete path to a web page.", false);
        addQuizQuestion("The 'target' attribute in <a> tag specifies where to open the linked document.", true);
        addQuizQuestion("Fragment identifier in HTML links can only be used for internal links",true);
    }
     public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            HTMLImagesGUI frame = new HTMLImagesGUI();
            frame.setVisible(true);
        });
}
}