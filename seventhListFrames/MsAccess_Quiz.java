package seventhListFrames;

import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */
public class MsAccess_Quiz extends Quiz {

    public MsAccess_Quiz(String name) {
        super(name);
        loadQuestions();
        setupQuiz();
    }

    private void setupQuiz() {
        shuffleIndices();
        selectTotalQuestions();
        setCurrentQuestion();
        setQuestionTextAndOptions();
    }

    @Override
    public void setQuestionTextAndOptions() {
        qno.setText("Question #: " + currentQno);
        question.setText(questions.get(currentQuestionIndex));
        opt1.setText(options.get(currentQuestionIndex).split(", ")[0]);
        opt2.setText(options.get(currentQuestionIndex).split(", ")[1]);
        opt3.setText(options.get(currentQuestionIndex).split(", ")[2]);
        opt4.setText(options.get(currentQuestionIndex).split(", ")[3]);
    }

// Questions:48
    @Override
    public final void loadQuestions() {

        questions.add(" Which form view mode allows you to preview live data while you work on the design of the form?");
        options.add("A) **Preview** view, B) **Layout** view, C) **Design** view, D) **Form** view");
        answers.add("B) **Layout** view");

        questions.add(" How can you add multiple button controls to a form at once?");
        options.add("A) Double-click the button control to lock it on then left-click in the form to add each button, B) Right-click the button control and select Drop Multiple Controls. Then left-click to add each button to a form, C) Select the Multiple Object check box in the Design tab before selecting the button control, D) Left-click the button control to select it then add multiples to the form by right-clicking in the position you'd like to add them");
        answers.add("B) Right-click the button control and select Drop Multiple Controls. Then left-click to add each button to a form");

        questions.add(" What is the Access string operator that joins or concatenates text strings together?");
        options.add("A) `&`, B) `!`, C) `#`, D) `-`");
        answers.add("A) `&`");

        questions.add(" The relationship field in this table has been created with what feature?");
        options.add("A)  lookup, B) reference integrity, C) pick list, D) validation rule");
        answers.add("A) lookup");

        questions.add(" On a report, you want to display a header for each change in month name. How should you set up the Group and Sort options so that they are in the proper chronological order?");
        options.add("A) Sort on month number then sort on month name, B) Sort on month number then group on month name, C) Group on month number then sort by month name, D)   Group on month number then sort on month number");
        answers.add("B) Group on month number, then sort on month number");

        questions.add(" What kind of query will display data with both column headers and row headers?");
        options.add("A) crosstab, B) select, C) simple, D) spreadsheet");
        answers.add("A) crosstab");

        questions.add(" What currency format displays a thousands separator, but not a currency symbol, such as $ or �?");
        options.add("A) Scientific, B) Standard, C) General Number, D) Fixed");
        answers.add("B) Standard");

        questions.add(" In Access Option > Current Database, what does turning off the Allow Full Menus option do?");
        options.add("A) removes the ribbon interface, B) removes all ribbon tabs except Home and Print Preview, C) disable the right-click menu when working with objects, D)   removes the **Design** view contextual tabs which forces most design changes to be made in **Layout** view");
        answers.add("D) removes the **Design** view contextual tabs, which forces most design changes to be made in **Layout** view");

        questions.add(" You want to create a form to view a customer's details, as well as some information about all order that the customer has placed with your company. What is the best way to display this information on a single screen?");
        options.add("A) Use a form to display the customer details with a subform linked to their order information, B) Create a split form that displays the customer information at the top and the order history in the table below, C) Create a navigation form that includes a form for the customer details and a separate form for the order history, D) Create a continous form that uses a query to gather all of the customer details and order history in a single record source");
        answers.add("B) Create a split form that displays the customer information at the top and the order history in the table below");

        questions.add(" You want a form to appear automatically, whenever the database starts. How would you do this?");
        options.add("A) In the **Access Options** dialog box click **Current Database** then select the form you want to open in the **Display Form** property, B) Open the form you want to display automatically in **Design** view. Then in the property sheet set **Open on Launch** to **true**, C) Right-click the form you want to open automatically and select **Startup Form**, D) On the **Database Tools** tab click **Database Options** then set the form you want to open as the **Initial View** object");
        answers.add("B) Open the form you want to display automatically in **Design** view. Then in the property sheet, set **Open on Launch** to **true**");

        questions.add(" In Design view, which area of a form is the primary location for text boxes, buttons, and other control objects?");
        options.add("A) **Page Layout**, B) **View** section, C) Form body, D)   **Detail** section");
        answers.add("D) **Detail** section");

        questions.add(" What tool builds a report containing detailed information about the object in the database?");
        options.add("A) Object dependencies, B) Table analyzer, C) Access database manager, D)   Database documenter");
        answers.add("D) Database documenter");

        questions.add(" You want to validate a proposed modification to a record's value before the table is saved to the database. What data macro can you add to the table to do this?");
        options.add("A) After Insert, B) Before Change, C) After Update, D) Before Delete");
        answers.add("B) Before Change");

        questions.add(" When you add a group to a report, what automatically gets added to the structure?");
        options.add("A)  a group header, B) nothing, C) a group header and footer, D) a group footer");
        answers.add("A) a group header");

        questions.add(" What program flow function evaluates a condition and returns either a truepart or a falsepart?");
        options.add("A) `Switch()`, B) `IsError()`, C) `IIf()`, D) `Choose()`");
        answers.add("C) `IIf()`");

        questions.add(" The display for numerical data defaults to a ____ alignment, and text data defaults to _____ aligntment");
        options.add("A) left; right, B) right; left, C) left; left, D) right; right");
        answers.add("B) right; left");

        questions.add(" Which data type is a modern replacement for the OLE Object data type?");
        options.add("A) Attachment, B) Replication ID, C) BLOB, D) Hyperlink");
        answers.add("A) Attachment");

        questions.add(" How can you ensure that each value saved in a particular field is unique from all other values in the field?");
        options.add("A) Set the Indexed property to No, B) Set the Required property to Yes (Unique Values), C) Set the Validation Rule property to No Duplicates, D)   Set the Indexed property to Yes (No Duplicates)");
        answers.add("D) Set the Indexed property to Yes (No Duplicates)");

        questions.add(" Which Access database tool will help you split a single, large, unnormalized data table into multiple related tables that follow the best practices of good database design?");
        options.add("A) Database Documenter, B) Compact and Repair Database, C) Database Splitter Wizard, D)   Table Analyzer Wizard");
        answers.add("D) Table Analyzer Wizard");

        questions.add(" When backing up an Access database, what is added to the file name automatically?");
        options.add("A) `A serialized backup number such as (_Backup_2)`, B) `The current date such as (_2019-08-21)`, C) `The characters (_bu)`, D) `The word (_Archive)`");
        answers.add("B) `The current date, such as (_2019-08-21`");

        questions.add(" Which table field property, if supplied, will display instead of the field name as a column header when viewing the datasheet of as a label when the field is added toa form or report?");
        options.add("A) Popup Text, B) Description, C) Caption, D) Tool Tip");
        answers.add("C) Caption");

        questions.add(" Which form control property creates a small pop-up flag that contains text when a user hovers the mouse cursor over the object?");
        options.add("A) ControlTip Text, B) Status Text, C) Tool Text, D) Help Text");
        answers.add("A) ControlTip Text");

        questions.add(" The expression values <=, <>, and > are found in what expression category?");
        options.add("A) comparison operators, B) logical operators, C) string operators, D) arithmetic operators");
        answers.add("A) comparison operators");

        questions.add(" Which section of a report appears at the top of every page in the printed report?");
        options.add("A) page header, B) group header, C) detail header, D) report header");
        answers.add("A) page header");

        questions.add(" When would you use a left join query?");
        options.add("A) When you want to retrieve every record from the left table plus any matching information from the right table where it exists, B) When you want to retrieve all of the records from the right table that have matching records in the left table, C) When you want to retrieve just the records from the left table that have matching records in the right table, D) When you want to retrieve just the records from the left table that do not have any matching records in the right table");
        answers.add("A) When you want to retrieve every record from the left table, plus any matching information from the right table where it exists");

        questions.add(" How can you run a submacro saved in a macro?");
        options.add("A) Use an If container in the macro., B) Call the submacro with the [MacroName]![SubMacroName] syntax., C) Use a RunMacro or OnError macro action., D) Expand the macro in the **Navigation Pane** and double-click the submacro name.");
        answers.add("C) Use a RunMacro or OnError macro action.");

        questions.add(" Which combo box property defines what values appears when the user clicks the drop-down arrow?");
        options.add("A) Control Source, B) Row Source, C) Value List, D) Data Source");
        answers.add("B) Row Source");

        questions.add(" What does the expression Now() evaluate to?");
        options.add("A) the current system date, B) the current system date time and time zone, C) the current system date and time, D) the current system time");
        answers.add("C) the current system date and time");

        questions.add(" Certain words have special meaning to Access, and you should avoid using them as table or field names. What are these words called?");
        options.add("A) discouraged terms, B) reserved words, C) retired objects, D) system names");
        answers.add("B) reserved words");

        questions.add(" What is the operator for (not equal to)");
        options.add("A) < >, B) ==, C)=!  , D)-> ");
        answers.add("A) < >");

        questions.add(" You need to email a report to a coworker that maintains all formatting and page layout attributes. Which file format should you choose from the **Print Preview** ribbon?");
        options.add("A) Excel, B) HTML, C) Word, D)   PDF");
        answers.add("D) PDF");

        questions.add(" Which section can a form _not_ contain?");
        options.add("A) Group Header & Footer, B) Form Header & Footer, C) Detail, D) Page Header & Footer");
        answers.add("A) Group Header & Footer");

        questions.add(" The **Run** button and the **View Datasheet** button do exactly the same thing for which query type?");
        options.add("A) select, B) append, C) make table, D) delete");
        answers.add("A) select");

        questions.add(" You have a database file that generates an error from a custom macro immediately after opening. How can you open the database and bypass the startup options to prevent the macro from running so that you can fix the error?");
        options.add("A) In the **Open File** dialog box click the down arrow on the **Open** button and select **Disable Macros**., B) Hold the Shift key while double-clicking the **database** icon., C) Right-click the database icon and select **Run as Administrator**., D) From the **File** menu select **Open as Read-Only**.");
        answers.add("B) Hold the Shift key while double-clicking the **database** icon.");

        questions.add(" You want to ensure that a query recordset is read-only and cannot modify the underlying data tables it references. How can you do that?");
        options.add("A) Set the Recordset Type property to Snapshot., B) Set the Output All Fields property to No., C) Set the Link Master Fields property to No., D) Set the Recordset Type property to Dynaset (Inconsistent Updates).");
        answers.add("A) Set the Recordset Type property to Snapshot.");

        questions.add(" Which form control object contains a number of option buttons, check boxes, or toggle buttons, and allows the user to make only a single selection?");
        options.add("A) option group, B) switch control, C) bound selection, D) object selector");
        answers.add("A) option group");

        questions.add(" Which query criteria will return records for (Debra) and (Donna) but not (Daniel)?");
        options.add("A) `Like *n*`, B) `Like *[ro]*`, C) `Like De* or Do*`, D) `Like D*`");
        answers.add("B) `Like *[ro]*`");

        questions.add(" When using the **Expression Builder** to create a calculated column in a table, which statement is _not_ true?");
        options.add("A) The calculation cannot use custom Visual Basic functions., B) The calculation can include built-in functions., C) The calculation can use fields from a related table., D) The calculation can include fields from the same table.");
        answers.add("A) The calculation cannot use custom Visual Basic functions.");

        questions.add(" You are implementing an OnError action and want the macro to continue on to the following step if it encounters an error. What should you set as the Go To argument?");
        options.add("A) Skip, B) Next, C) Fail, D) Macro Name");
        answers.add("B) Next");

        questions.add(" You have several label objects in a form. You customized the font and size of one, and want to format the others to match. What is the best way to do this?");
        options.add("A) Select the unformatted labels click the Format Painter tool then click the formatted label., B) Select the formatted label click the Format Painter tool then drag a box around the unformatted labels., C) Select all of the labels and then click the Format Painter tool., D)   Select the formatted label double-click the Format Painter tool then click each of the unformatted labels.");
        answers.add("D) Select the formatted label, double-click the Format Painter tool, then click each of the unformatted labels.");

        questions.add("When adding a picture to a form, which Picture Size Mode property will keep the image at 100% of its original size, even if the bounding box is smaller?");
        options.add("A) Clip, B) Locked, C) Stretch, D) Zoom");
        answers.add("A) Clip");

        questions.add(" When designing a form, you add a horizontal line object that is the full width of the Detail section. Yet when you view the form, the line goes only part way across the screen. How can you make the line extend to the edges of the screen?");
        options.add("A) From the **Anchoring** menu select **Stretch Across Top**., B) From the **Align** menu select **Full Justify**., C) From the **Anchoring** menu select **Top Right**., D) From the **Size/Space** menu select **To Fit**.");
        answers.add("A) From the **Anchoring** menu, select **Stretch Across Top**.");

        questions.add(" A Decimal data type field with a Precision of 5 and a Scale of 3 can store how many digits on the left side of the decimal point?");
        options.add("A) three, B) eight, C) two, D) five");
        answers.add("C) two");

        questions.add(" A databse has a form with the AllowEdits property set to No. You open the form using an OpenForm macro step with the Data Mode property set to Edit. Given this, which statement is true?");
        options.add("A) You cannot edit existing records but can add new records., B) You cannot edit or add records., C) You can edit existing records but cannot add new records., D) You can edit existing records and new records.");
        answers.add("A) You cannot edit existing records but can add new records.");

        questions.add(" What rule type must you choose to conditionally format a value in a report based on another value in the same record?");
        options.add("A) Field Value Is..., B) Evaluation Is..., C) Expression Is..., D) Compare to...");
        answers.add("A) Field Value Is...");

        questions.add(" What can not be used as the record source for a report?");
        options.add("A) embedded query, B) linked table, C) embedded table, D) linked query");
        answers.add("C) embedded table");

        questions.add(" You're building a database to track the books that library members check out. How can you ensure that every record in the checkout table is associated with a valid library member?");
        options.add("A) Create a data macro to validate the foreign key values in the chekcout table., B) Create a combo box on a checkout form that displays only valid library members., C) Create a one-to-many relationship between the checkout table and the member table., D)   Enforce referential integrity between the checkout table and the member table.");
        answers.add("D) Enforce referential integrity between the checkout table and the member table.");

        questions.add(" When designing a report, clicking the Build button (..) in the Record Source property will do what?");
        options.add("A) create a linked table reference in the Navigation Pane, B) create an expression in the report object, C) create an embedded query in the report object, D) create a data macro in the report object");
        answers.add("C) create an embedded query in the report object");

    }

    public static void main(String[] args) {
        new MsAccess_Quiz(name).setVisible(true);
    }

}
