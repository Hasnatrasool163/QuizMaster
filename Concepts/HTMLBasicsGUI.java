package Concepts;

import javax.swing.SwingUtilities;

public class HTMLBasicsGUI extends AbstractConceptsGUI {

    public HTMLBasicsGUI() {
        super("HTML Basics");
    }

    @Override
    protected String getTheoryText() {
        return """
               HTML (HyperText Markup Language) is the standard markup language for creating web pages.
               
               Key Concepts:
               1. HTML Tags and Elements
               2. Document Structure: <!DOCTYPE>, <html>, <head>, <title>, <body>
               3. Text Formatting: <h1>-<h6>, <p>, <strong>, <em>
               4. Lists: <ul>, <ol>, <li>
               5. Links and Images: <a>, <img>
               """;
    }

    @Override
    protected String getExampleCode() {
        return """
               <!DOCTYPE html>
               <html>
               <head>
                   <title>My First Web Page</title>
               </head>
               <body>
                   <h1>Welcome to My Web Page</h1>
                   <p>This is a paragraph.</p>
                   <a href="https://www.example.com">Visit Example</a>
               </body>
               </html>
               """;
    }

    @Override
    protected void addQuizQuestions() {
        addQuizQuestion("HTML stands for HyperText Markup Language.", true);
        addQuizQuestion("<p> tag in HTML is used to define a paragraph.", true);
        addQuizQuestion("<head> tag in HTML contains the content that is directly visible on the web page.", false);
        addQuizQuestion("<a> tag in HTML is used for creating an image.", false);
        addQuizQuestion("<ul> tag in HTML is used for creating an unordered list.", true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            HTMLBasicsGUI frame = new HTMLBasicsGUI();
            frame.setVisible(true);
        });
    }
}
