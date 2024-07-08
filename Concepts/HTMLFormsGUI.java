package Concepts;

import javax.swing.SwingUtilities;

public class HTMLFormsGUI extends AbstractConceptsGUI {

    public HTMLFormsGUI() {
        super("HTML Forms");
    }

    @Override
    protected String getTheoryText() {
        return """
               HTML Forms are used to collect user input data and send it to a server for processing.
               
               Key Concepts:
               1. <form> tag and its attributes: action, method
               2. Input Elements: <input>, <textarea>, <select>, <button>
               3. Form Validation: required attribute, pattern attribute
               4. Handling Form Data on the Server Side
               
               Example of a Simple Form:
               <form action="/submit_form" method="post">
                   <label for="name">Name:</label>
                   <input type="text" id="name" name="name" required>
                   <br><br>
                   <label for="email">Email:</label>
                   <input type="email" id="email" name="email" required>
                   <br><br>
                   <button type="submit">Submit</button>
               </form>
               """;
    }

    @Override
    protected String getExampleCode() {
        return """
               <form action="/submit_form" method="post">
                   <label for="name">Name:</label>
                   <input type="text" id="name" name="name" required>
                   <br><br>
                   <label for="email">Email:</label>
                   <input type="email" id="email" name="email" required>
                   <br><br>
                   <button type="submit">Submit</button>
               </form>
               """;
    }

    @Override
    protected void addQuizQuestions() {
        addQuizQuestion("HTML form is used to collect user input data.", true);
        addQuizQuestion("The 'action' attribute in <form> tag specifies the URL where form data is submitted.", true);
        addQuizQuestion("Textarea element in HTML is used for single-line input.", false);
        addQuizQuestion("The 'required' attribute in HTML form elements specifies that the input must be filled out.", true);
        addQuizQuestion("Form validation in HTML can only be done using JavaScript.", false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            HTMLFormsGUI frame = new HTMLFormsGUI();
            frame.setVisible(true);
        });
    }
}
