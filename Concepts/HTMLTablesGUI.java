package Concepts;

import javax.swing.SwingUtilities;

public class HTMLTablesGUI extends AbstractConceptsGUI {

    public HTMLTablesGUI() {
        super("HTML Tables");
    }

    @Override
    protected String getTheoryText() {
        return """
               HTML Tables are used to display data in rows and columns format on a web page.
               
               Key Concepts:
               1. <table>, <tr>, <td>, <th> tags
               2. Table Structure: rows and columns
               3. Table Headers: <th> vs. <td>
               4. Spanning Rows and Columns: rowspan, colspan attributes
               
               Example of Creating a Table:
               <table border="1">
                   <tr>
                       <th>Name</th>
                       <th>Age</th>
                   </tr>
                   <tr>
                       <td>John</td>
                       <td>25</td>
                   </tr>
               </table>
               """;
    }

    @Override
    protected String getExampleCode() {
        return """
               <table border="1">
                   <tr>
                       <th>Name</th>
                       <th>Age</th>
                   </tr>
                   <tr>
                       <td>John</td>
                       <td>25</td>
                   </tr>
               </table>
               """;
    }

    @Override
    protected void addQuizQuestions() {
        addQuizQuestion("HTML tables are used to display data in rows and columns format.", true);
        addQuizQuestion("<th> tag in HTML is used for table data cells.", false);
        addQuizQuestion("The 'border' attribute in <table> tag specifies the width of the table border.", true);
        addQuizQuestion("Rowspan attribute in HTML table specifies the number of columns a cell should span.", false);
        addQuizQuestion("Tables in HTML cannot have headers and footers.", false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            HTMLTablesGUI frame = new HTMLTablesGUI();
            frame.setVisible(true);
        });
    }
}
