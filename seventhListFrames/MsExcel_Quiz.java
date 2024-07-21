package seventhListFrames;

import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */
public class MsExcel_Quiz extends Quiz{
    

    public MsExcel_Quiz(String name) {
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
        qno.setText("Question #: "+ currentQno);
        question.setText(questions.get(currentQuestionIndex));
        opt1.setText(options.get(currentQuestionIndex).split(", ")[0]);
        opt2.setText(options.get(currentQuestionIndex).split(", ")[1]);
        opt3.setText(options.get(currentQuestionIndex).split(", ")[2]);
        opt4.setText(options.get(currentQuestionIndex).split(", ")[3]);
    }

// 152 questions
    @Override
    public final void loadQuestions() {
        questions.add("What is Some of your data in Column C is displaying as hashtags (#) because the column is too narrow. How can you widen Column C just enough to show all the data??");
        options.add("A)Right-click column C select Format Cells and then select Best-Fit., B)Right-click column C and select Best-Fit., C)Double-click column C., D)Double-click the vertical boundary between columns C and D.");
        answers.add("D)Double-click the vertical boundary between columns C and D.");

        questions.add("What is Which two functions check for the presence of numerical or nonnumerical characters in cells??");
        options.add("A)ISNUMBER and ISTEXT, B)ISNUMBER and ISALPHA, C)ISVALUE AND ISNUMBER, D)ISVALUE and ISTEXT");
        answers.add("A)ISNUMBER and ISTEXT");

        questions.add("What is If you drag the fill handle (lower-right corner) of cell A2 downward into cells A3, A4, and A5, what contents will appear in those cells??");
        options.add("A)Jan Jan Jan, B)Feb Mar blank cell, C)Feb Mar Apr, D)FEB MAB APR");
        answers.add("C)Feb Mar Apr");

        questions.add("What is If cell A3 contains the text THE DEATH OF CHIVALRY, what will the function =PROPER(A3) return??");
        options.add("A)the death of chivalry, B)The death of Chivalry, C)THE DEATH OF CHIVALRY, D)The Death Of Chivalry");
        answers.add("D)The Death Of Chivalry");

        questions.add("What is In the worksheet below, you want to use Data > Subtotal to show a subtotal value per sport. What must you do BEFORE applying the Subtotal fun??");
        options.add("A)Sort by the data in Column E., B)Format the data in Column D., C)Sort by the data in Column D., D)Format the data in Column E.");
        answers.add("C)Sort by the data in Column D.");

        questions.add("What is When editing a cell, what do you press to cycle between relative, mixed, and absolute cell references??");
        options.add("A)Alt+F4 (Windows) or Option+F4 (Mac), B)Alt+Shift+4 (Windows) or Option+Shift+4 (Mac), C)Ctrl+Shift+4 (Windows) or Command+Shift+4 (Mac), D)the F4 (Windows) or Command+T (Mac)");
        answers.add("D)the F4 (Windows) or Command+T (Mac)");
        
        questions.add("What is You need to add a line chart showing a sales trends over the last 12 months and you have only a little space to work with. How can you convey the required information within a single cell?");
        options.add("A)Add an image of the chart to a comment., B)Add a hyperlink to another worksheet that displays a chart when clicked., C)Add an image of the chart to the worksheet., D)Add a sparkline a graphic that summarizes data visually within a single worksheet cell.");
        answers.add("D)Add a sparkline a graphic that summarizes data visually within a single worksheet cell.");

        questions.add("What is What is the best way to activate the Excel Help system?");
        options.add("A)Right-click anywhere and select Help., B)Press F1 or click the Help tab in the ribbon., C)Press F10., D)all of these answers.");
        answers.add("B)Press F1 or click the Help tab in the ribbon.");

        questions.add("What is Which format will display the value 27,500,000 as 27.5?");
        options.add("A)#####, B)###.0, C)999.9, D)######.0");
        answers.add("B)###.0,,");

        questions.add("What is When using Goal Seek, you can find a target result by varying _ at most?");
        options.add("A)three inputs, B)four inputs, C)two inputs, D)one input");
        answers.add("D)one input");

        questions.add("What is In the image below, which option(s) can you select so that the appropriate field headers appear in cells A4 and B3 instead of the terms Row Labels and Column Labels, respectivel?");
        options.add("A)Show in Tabular Form, B)Show in Compact Form, C)Show in Compact For or Show in Outline Form, D)Show in Tabular Form or Show in Outline Form");
        answers.add("D)Show in Tabular Form or Show in Outline Form");

        questions.add("What is Which formula is NOT equivalent to all of the others?");
        options.add("A)=A3+A4+A5+A6, B)=SUM(A3:A6), C)=SUM(A3A6), D)=SUM(A3A4A5A6)");
        answers.add("D)=SUM(A3,A6)");

        questions.add("What is What custom formatting can be applied to make the cells in column A resemble the cells in column B?");
        options.add("A)MMM-YYYY, B)MMMM-YYYY, C)MMMM& (-) &YYYY, D)M-YYYY");
        answers.add("B)MMMM-YYYY");

        questions.add("What is Which function returns a reference to a cell (or cell range) that is a specified distance from a base cell?");
        options.add("A)OFFSET, B)VLOOKUP, C)INDEX, D)MATCH");
        answers.add("A)OFFSET");
        
        questions.add("You're working with columns whose width and font-size should not be changed. Yet the columns are too narrow to display all the text in each cell. What tool should you use to solve the problem?");
        options.add("A)Sparklines, B)Wrap Text, C)Fill Handle, D)Centered Alignment");
        answers.add("B)Wrap Text");

        questions.add("Of the four chart types listed, which works best for summarizing time-based data?");
        options.add("A)pie chart, B)line chart, C)XY scatter chart, D)bar chart");
        answers.add("B)line chart");

        questions.add("The AutoSum formulas in the range C9:F9 below return unexpected values. Why is this?");
        options.add("A)The AutoSum formulas include their own cells, creating a circular reference. , B)The AutoSum formulas refer to the column to the left of their cells., C)The AutoSum formulas exclude the bottom row of data., D)The AutoSum formulas include the year at the top of each column in the calculation.");
        answers.add("D)The AutoSum formulas include the year at the top of each column in the calculation.");

        questions.add("The text filter in column A is designed to display only those rows where column A entry has a particular attribute.this attribute?");
        options.add("A)The second character in the cell is 9., B)The number 9 appears one or more times within the cell., C)The cell is comprised of 9 characters., D)The number 9 appears once and only once within the cell.");
        answers.add("A)The second character in the cell is 9.");

        questions.add("An organization chart, which shows the hierarchy within a company or organization, is available as _____ that is included with Excel.?");
        options.add("A)a 3D model, B)SmartArt, C)a Treemap chart, D)a drawing object");
        answers.add("B)SmartArt");

        questions.add("You want to be able to restrict values allowed in a cell and need to create a drop-down list of values from which users can choose. Which feature should you use?");
        options.add("A)Protect Worksheet, B)Conditional Formatting, C)Allow Users to Edit Ranges, D)Data Validation");
        answers.add("D)Data Validation");

        questions.add("To round up a value to the nearest increment of your choice, such as the next five cents, what function should you use?");
        options.add("A)`ROUNDUP`, B)`MAX`, C)`ROUND`, D)`CEILING`");
        answers.add("A)-`ROUNDUP`");

        questions.add("Which function returns the largest value amongst all values within the range H2:H30?");
        options.add("A)`=MAX(H2:H30)`, B)`=MAXIMUM(H2:H30)`, C)`=LARGE(H2:H3029)`, D)`=UPPER(H2:H301)`");
        answers.add("A)-`=MAX(H2:H30)`");

        questions.add("Which chart type can display two different data series as a different series type within the same cha?");
        options.add("A)XY chart, B)clustered column, C)bubble chart, D)combo chart");
        answers.add("D)combo chart");

        questions.add("In the image below, what does clicking the button indicated by the green arrow?");
        options.add("A)Hides or shows the formula bar., B)Selects all., C)Hides or shows the ribbon., D)Selects objects.");
        answers.add("B)Selects all.");

        questions.add("Which formula returns the value in cell A1 of the worksheet named MySheet?");
        options.add("A)`=MySheet!A1`, B)`=MySheet_A1`, C)`=MySheet&A1`, D)`=MySheet@A1`");
        answers.add("A)-`=MySheet!A1`");

        questions.add("Which formula correctly counts the number of numeric values in both B4:E4 and G4:I4?");
        options.add("A)`=COUNT(B4:E4&G4:I4)`, B)`=COUNT(B4:E4G4:I4)`, C)`=COUNT(B4:E4 G4:I4)`, D)`=COUNT(B4:I4)`");
        answers.add("A)-`=COUNT(B4:E4,G4:I4)`");

        questions.add("After activating a chart, which sequence adds a trendline to the chart?");
        options.add("A)In the Format group select Trendline from the Insert Shapes list., B)Click outside the plot area and select Add Trendline, C)Click inside the plot and select Forecast., D)Right-click a data series and select Add Trendline.");
        answers.add("D)Right-click a data series and select Add Trendline.");

        questions.add("Which Excel add-in will help you find a target result by varying multiple inputs to a formula?");
        options.add("A)Goal Seek, B)Power Pivot, C)Data Analysis, D)Solver");
        answers.add("A)Goal Seek");

        questions.add("What tool would you use to prevent the input in a cell of a date outside a specific range?");
        options.add("A)Protect Workbook, B)Watch Window, C)Data Validation, D)Filter");
        answers.add("C)Data Validation");

        questions.add("When you sort a list of numerical value into ascending or descending order, the value in the middle of the list is the _______.?");
        options.add("A)mode, B)modulus, C)average, D)median");
        answers.add("D)median");

        questions.add("Which format setting does not change the background appearance of a cell?");
        options.add("A)Cell style, B)Fill color, C)Pattern style, D)Font color");
        answers.add("D)Font color");

        questions.add("In Excel, what do most formulas begin with?");
        options.add("A):, B)=, C)(, D)-");
        answers.add("B)=");

        questions.add("If you start a date series by dragging down the fill handle of a single cell that contains the date 12/1/19, what will you get?");
        options.add("A)a series of consecutive days following the initial date, B)a series of days exactly one month apart, C)a series of days identical to the initial date, D)a series of days exactly one year apart");
        answers.add("A)a series of consecutive days following the initial date");

        questions.add("To discover how many cells in a range contain values that meet a single criterion, use the _____ function.?");
        options.add("A)`COUNT`, B)`SUMIFS`, C)`COUNTA`, D)`COUNTIF`");
        answers.add("D)-`COUNTIF`");

        questions.add("Your worksheet has the value 27 in cell B3. What value is returned by the function `=MOD (B3,6)`?");
        options.add("A)4, B)1, C)5, D)3");
        answers.add("D)3");

        questions.add("For an IF function to check whether cell B3 contains a value between 15 and 20 inclusively, what condition should you use?");
        options.add("A)`OR(B3=>15B3<=20)`, B)`AND (B3>=15B3<=20)`, C)`OR(B3>15B3<20)`, D)`AND(B3>15 B3<20)`");
        answers.add("B)-`AND (B3>=15,B3<=20)`");

        questions.add("The charts below are based on the data in cells A3:G5. The chart on the right was created by copying the one on the left. Which ribbon button was clicked to change the layout of the chart on th?");
        options.add("A)Move Chart, B)Switch Row/Column, C)Quick Layout, D)Change Chart Type");
        answers.add("D)Change Chart Type");

        questions.add("Cell A20 displays an orange background when its value is 5. Changing the value to 6 changes the background color to green. What type of formatting is applied to cell A20?");
        options.add("A)Value Formatting, B)Cell Style Formatting, C)Conditional Formatting, D)Tabular format");
        answers.add("C)Conditional Formatting");

        questions.add("What does this formula do? `=Sum(Sheet1:Sheet4!D18)`?");
        options.add("A)It adds data from cell D18 of Sheet1 and cell D18 of Sheet4, B)It adds data from cell A1 of Sheet1 and cell D18 of sheet4, C)It adds all data in the range A1:D18 in Sheet1 Sheet2 Sheet3 and Sheet4, D)It adds data from all D18 cells in Sheet1 Sheet2 Sheet3 and Sheet4");
        answers.add("D)It adds data from all D18 cells in Sheet1, Sheet2, Sheet3 and Sheet4");

        questions.add("the term for an expression that is entered into a worksheet cell and begins with an equal sign?");
        options.add("A)function, B)argument, C)formula, D)contents");
        answers.add("C)formula");

        questions.add("How does the appearance of an array formula differ from that of a standard formula?");
        options.add("A)In a worksheet cell array formulas have a small blue triangle in the cell's upper-right corner., B)A heavy border appears around the range that is occupied by the array formula., C)In the formula bar an array formula appears surrounded by curly brackets., D)When a cell that contains an array formula is selected range finders appear on the worksheet around the formula's precedent cells.");
        answers.add("C)In the formula bar, an array formula appears surrounded by curly brackets.");

        questions.add("In a worksheet, column A contains employee last names, column B contains their middle initials (if any), and column C contains their first names. Which tool can combine the last names, initials, and first names in column D without using a worksheet formula?");
        options.add("A)Concatenation, B)Columns to Text, C)Flash Fill, D)AutoFill");
        answers.add("A)Concatenation");

        questions.add("Which function returns the leftmost five characters in cell A1?");
        options.add("A)`=FIND(A115)`, B)`=SEARCH(A15)`, C)`=LEFT(A15)`, D)`=A1-RIGHT(A1LEN(A1)-5)`");
        answers.add("C)`=LEFT(A1,5)`");

        questions.add("Which function returns TRUE if cell A1 contains a text value?");
        options.add("A)`=ISALPHA(A1)`, B)`=ISCHAR(A1)`, C)`=ISSTRING(A1)`, D)`=ISTEXT(A1)`");
        answers.add("D)`=ISTEXT(A1)`");

        questions.add("You select cell A1, hover the pointer over the cell border to reveal the move icon, then drag the cell to a new location. Which ribbon commands achieve the same result?");
        options.add("A)Cut and Fill, B)Cut and Paste, C)Copy and Transpose, D)Copy and Paste");
        answers.add("B)Cut and Paste");

        questions.add("You want to add a column to the PivotTable below that shows a 5% bonus for each sales rep. That data does not exists in the original data table. How can you do this without adding more data to the table?");
        options.add("A), B), C)Add a new PivotTable field., D)Add a calculated item");
        answers.add("D)Add a calculated field.");

        questions.add("You need to determine the commission earned by each Sales rep, based on the Sales amount in B3:B50 and the Commission rate specified in cell A1. You want to enter a formula in C3 and copy it down to C50. Which formula should?");
        options.add("A)`=A1*$B3`, B)`=A1*B3`, C)`=$A$1*B3`, D)`=$A1*B3`");
        answers.add("C)`=$A$1*B3`");

        questions.add("The `NOW()` function returns the current date and time as 43740.665218. Which part of this value indicates the time?");
        options.add("A)6652, B)43740.665218, C)43740, D)665218");
        answers.add("D)665218");

        questions.add("Cell A2 contains the value 8 and cell B2 contains the value 9. What happens when cells A2 and B2 are merged and then unmerged?");
        options.add("A)Both values are lost., B)Cell A2 contains the value 8 and cell B2 is empty., C)Cell A2 contains the value 8 and cell B2 contains the value 9., D)Cell A2 contains the value 17 and cell B2 is empty.");
        answers.add("B)Cell A2 contains the value 8 and cell B2 is empty.");

        questions.add("In the formula `=VLOOKUP(A1,D1:H30,3,FALSE)`, the lookup value (A1) is being looked for in _____.?");
        options.add("A)column D, B)columns D through H, C)column H, D)column F");
        answers.add("A)column D");

        questions.add("An .xlsx workbook is saved into .csv format.preserved in the new .csv file?");
        options.add("A)cell values only, B)cell values and formats, C)cell values and formulas, D)cell value formats and formulas");
        answers.add("A)cell values only");

        questions.add("Which function, when entered into cell G7, allows you to determine the sum total of annual sles for market regions 18 and?");
        options.add("A)`=SUMIF(G2:G6 >17 F2:F6)`, B)`=SUM(G2:G6 >=18F2:F6)`, C)`=SUMIF(F2:F6 >=18 G2:G6)`, D)`=SUM(F2:F6 18+ G2:G6)`");
        answers.add("C)-`=SUMIF(F2:F6, >=18,G2:G6)`");

        questions.add("Which function, when entered into cell F2 and then dragged to cell F6, returns the performance rating text (e.g., Good, Poor) for each repres?");
        options.add("A)`=RIGHT(E2LEN(E2)-27)`, B)`=LEN(E2MID(E2)-27)`, C)`=LEFT(E2LEN(E2)-27)`, D)`=RIGHT(E2MID(E2)-27)`");
        answers.add("A)`=RIGHT(E2,LEN(E2)-27)`");

        questions.add("`Colors[Inventory]` referring to here?");
        options.add("A)`=SUMIFS(Colors[Inventory]Colors[Colors]Orange)`, B), C)the Inventory worksheet in the Colors workbook, D)the Inventory column in the Colors table");
        answers.add("D)the Inventory column in the Colors table");

        questions.add("Which `VLOOKUP` function, when entered into cell L2 and then dragged to cell L5, returns the average number of calls for the representative IDs listed in?");
        options.add("A)`=VLOOKUP(A2J2:L51FALSE)`, B)`=VLOOKUP(J2A$2:C$71FALSE)`, C)`=VLOOKUP(J2A$2:C$73FALSE)`, D)`=VLOOKUP(J2A2:C73FALSE)`");
        answers.add("D)`=VLOOKUP(J2,A$2:C$7,3,FALSE)`");

        questions.add("Which formula calculates the total value of a single row of cells across a range of columns?");
        options.add("A)`=SUBTOTAL(C1:Y15)`, B)`=SUM(15L:15Z)`, C)`=SUM(C15:Y15)`, D)`=SUM(C11:C35)`");
        answers.add("C)-`=SUM(C15:Y15)`");

        questions.add("Which value is returned when you enter `=LEN(C3)` into?");
        options.add("A)4, B)5, C)3, D)2");
        answers.add("B)5");

        questions.add("How can you create the lower table from the top one when the tables are no?");
        options.add("A)Select `Paste Special > Values.`, B)Select `Paste Special > Transpose.`, C)Use the `TRANSPOSE` function, D)Click `Switch Rows & Columns`");
        answers.add("B)Select `Paste Special > Transpose.`");

        questions.add("Which function returns the number of characters in a text string in cell A1?");
        options.add("A)`=RIGHT(A1)-LEFT(A1)+1`, B)`=LEN(A1)`, C)`=EXACT(A1)`, D)`=CHARS(A1)`");
        answers.add("B)`=LEN(A1)`");

        questions.add("Which formula, when entered into cell D2 and then dragged to cell D6, calculates the average total number of minutes spent on phone calls for each repres?");
        options.add("A)`=B$2*C$2`, B)`=$C$2/$B$2`, C)`=C2/B2`, D)`=B2*C2`");
        answers.add("D)`=B2*C2`");

        questions.add("Which Excel feature allows you to hide rows or columns with an easily visible expand/?");
        options.add("A)grouping, B)filtering, C)hiding, D)cut and paste");
        answers.add("A)grouping");

        questions.add("Monthly revenues of 2019 are entered in B2:M2, as shown below, To get year-to-date running total revenues, what formula should you enter in B3 and autofill th?");
        options.add("A)`=SUMIF($B$2:$M$2 COLUMN($B$2:$M$2)<=COLUMN()))`, B)`=SUM($B2:B2)`, C)`=SUM(OFFSET($A1001COLUMN()))`, D)`=B2+B3`");
        answers.add("B)-`=SUM($B2:B2)`");

        questions.add("From which field list was the pivotTalble created?");
        options.add("A)(Missing screenshot), B), C)rows:event donor / values: Sum of amount, D)columns: event / row:donor / values: Sum of amount");
        answers.add("B)rows:donor, event / values: Sum of amount");

        questions.add("In the worksheet shown below, cell C6 contains the formula `=VLOOKUP(A6,$F$2:$G$10,2,FALSE)`.the most likely reason that `#N/A` is returned in cell `C6` instead of mallory's `I?");
        options.add("A)The absolute/relative cell references in the formula are wrong, B)Cell A6 is not actualy text its a formula that need to be copied and pasted as a value, C)Column C in the lookup range is not sorted properly, D)A trailing space probably exist in cell A6 or F7");
        answers.add("D)A trailing space probably exist in cell A6 or F7");

        questions.add("the difference between pressing the delete key and using the clear command in the Home tab's Editing group?");
        options.add("A)Deletes removes the entire column or row. Clear removes the content from the column or row, B)Deletes removes formulas values and hyperlinks. clear removes formulas values hyperlinks formats comments and notes, C)Delete removes the cell itself shifting cells either up or to the left. Clear removes content and properties but does not muves cells, D)Delete removes formulas and values. clear removes formulas values hyperlinks formats comments and notes");
        answers.add("B)Deletes removes formulas, values and hyperlinks. clear removes formulas, values, hyperlinks, formats, comments and notes");

        questions.add("the intersection of a worksheet row and column?");
        options.add("A)Cell, B)Selection, C)Element, D)Scalar");
        answers.add("A)Cell");

        questions.add("In this PivotTable, the continuous variable weight is shown in the **Row** field. Another continuous variable is in the **Sum** Values field. It is important to reduce a long list of body weights to a smaller set of weight categories. How do you?");
        options.add("A)Use weight as a filter field as well as a row field in the PivotTable., B)Use `IF()` to show weight by categories instead of by pounds., C)Click the _Row Labels_ arrow and select _Group_., D)Right-click any row field value in the PivotTable and select _Group_.");
        answers.add("D)Right-click any row field value in the PivotTable and select _Group_.");

        questions.add("How can you drill down into a PivotTable to show details?");
        options.add("A)Select the cell into which you want to drill down right-click and select _Show Summary_., B)Select the cell into which you want to drill down right-click and select _Drill-down_., C)Select the cell into which you want to drill down and double-click., D)Select the cell into which you want to drill down right-click and select _Show Details > Summary Page_");
        answers.add("C)Select the cell into which you want to drill down and double-click.");

        questions.add("To ensure the `VLOOKUP` function returns the value of an exact match, what do you need to enter into the Range_look?");
        options.add("A)0, B)1, C)FALSE, D)TRUE");
        answers.add("C)FALSE");

        questions.add("Cell D2 contains the formula `=B2-C2`.the fastest way to copy that formula into cells D3:D501 (the bottom of the d?");
        options.add("A)Right-click D2 and select _Fill Down_., B)Click D2's fill handle and drag it down to D501., C)On the ribbon's _Data_ tab select _Flash fill_., D)Double-click D2's fill handle.");
        answers.add("D)Double-click D2's fill handle.");

        questions.add("Which is a valid Excel formula?");
        options.add("A)`=(A5+B5)*B7`, B)`=A3-7(B3:B5+4)`, C)`=(A5+B5)B7`, D)`=B3^[2*/3]`");
        answers.add("A)`=(A5+B5)*B7`");

        questions.add("Columns D, E, and F are hidden in your worksheet.one way to unhide these columns?");
        options.add("A)Select column G then right-click and select `Unhide`., B)Select column C then right-click and select `Unhide`., C)On the Page Layout tab in the `Rows` and `Columns` section select `Unhide`., D)Click and drag to select columns C and G then right-click and select `Unhide`.");
        answers.add("D)Click and drag to select columns C and G, then right-click and select `Unhide`.");

        questions.add("Before publishing a document, you want to identify issues that may make it difficult for people with disabilities to read. Which feature should you use?");
        options.add("A)Check Accessibility, B)Check Compatibility, C)Protect Document, D)Inspect Document");
        answers.add("A)Check Accessibility");

        questions.add("How do you remove the background of an inserted image?");
        options.add("A)Select the image and on the `Picture Tools Format` tab use the `Compress Picture` feature., B)Select the image and on the `Design` tab use the `Format Background` feature., C)On the `Drawing Tools Format` tab select `Graphics Fill` > `Remove Background`., D)Select the image and on the `Picture Tools Format` tab click the Remove Background button.");
        answers.add("D)Select the image and, on the `Picture Tools Format` tab, click the Remove Background button.");

        questions.add("What is the result of the formula =4&3?");
        options.add("A)43, B)12, C)`#VALUE!`, D)7");
        answers.add("A)43");

        questions.add("How do you remove everything (values, formatting, etc.) from a cell?");
        options.add("A)Select the cell. On the Home tab click Clear., B)Select the cell and press Delete., C)Right-click the cell and select Delete., D)Select the cell. On the Home tab click Clear > Clear All.");
        answers.add("D)Select the cell. On the Home tab, click Clear > Clear All.");

        questions.add("the difference between a workbook and a worksheet?");
        options.add("A)An Excel file is a workbook. A workbook contains one or more worksheets., B)Nothing-these two terms mean the same thing., C)A workbook contains only data. A worksheet contains both data and formulas., D)An Excel file is a worksheet. A worksheet contains one or more workbooks.");
        answers.add("A)An Excel file is a workbook. A workbook contains one or more worksheets.");

        questions.add("How would you connect the slicer to both PivotTab?");
        options.add("A)You cannot use one slicer for two PivotTables., B)Right-click the slicer and select Slicer Settings., C)Merge the two PivotTables right-click the merged PivotTable and select Combine Slicer., D)Right-click the slicer and select Report Connections or click Report Connections on the Slicer tab.");
        answers.add("D)Right-click the slicer and select Report Connections, or click Report Connections on the Slicer tab.");

        questions.add("Which formula contains a valid absolute reference?");
        options.add("A)`=B7*$G$3`, B)`=(B7)*G3`, C)`=B7*$[G3]`, D)`=B7$*G3`");
        answers.add("A)`=B7*$G$3`");

        questions.add("What happens if you use the **AutoSum** button in?");
        options.add("A)AutoSum shows the total in the bottom-right of the page, B)AutoSum will total the numbers in cells B4:G8, C)AutoSum will total the numbers in cells B4:G4, D)AutoSum will return a **#VALUE!** error.");
        answers.add("C)AutoSum will total the numbers in cells B4:G4");

        questions.add("To create this PivotTable, drag the _ field to the Rows area and the _ field to the Val?");
        options.add("A)Total Sales This Year; Total Sales This Year, B)Total Sales This Year; Market Region, C)Representative ID Number; Total Sales This Year, D)Market Region; Total Sales This Year");
        answers.add("D)Market Region; Total Sales This Year");

        questions.add("Cell A1 contains the number 3. Which formula returns the text Apple?");
        options.add("A)`=SELECT(A1 Banana Orange Apple Mango)`, B)`=CHOOSE(A1 Banana Orange Apple Mango), C)=RETURN(A1 Banana Orange Apple Mango)`, D)`=MATCH({A1 Banana Orange Apple Mango})");
        answers.add("B)`=CHOOSE(A1, Banana, Orange, Apple, Mango)`");

        questions.add("Which value is calculated when the formula `=AVERAGE(G2:G6)/AVERAGE(C2:C6)` is entered into)?");
        options.add("A)average number of minutes per call, B)average annual sales per minute, C)average number sales, D)average annual sales per call");
        answers.add("D)average annual sales per call");

        questions.add("How would you search an entire workbook with **Find & Select**?");
        options.add("A)On the **Home** tab click **Find & Select > Find > Options** (Windows) or **Find & Select > Find** (Mac). Change the **Within** drop-down to **Workbook**., B)On the **Home** tab click **Find & Select > Find > Options** (Windows) or **Find & Select > Find** (Mac). Change the **Look in** drop-down to **Workbook**., C)On the **Home** tab click **Find & Select > Find > Options** (Windows) or **Find & Select > Find** (Mac). Change the **Search** drop-down to **All**., D)You cannot search an entire workbook you must search the worksheets individually.");
        answers.add("A)On the **Home** tab, click **Find & Select > Find > Options** (Windows) or **Find & Select > Find** (Mac). Change the **Within** drop-down to **Workbook**.");

        questions.add("How do you create a heatmap in a table, such as this one, which is responsive to th?");
        options.add("A)map chart, B)color scales (within conditional formatting), C)manual highlighting, D)data bars (within conditional formatting)");
        answers.add("B)color scales (within conditional formatting)");

        questions.add("To split text across cells without using Merge & Center, click **Formt Cells**. The, on ____?");
        options.add("A)Alignment** tab click**., B)Verical split , C)Text control > Merge cells, D)Horizontal > Center across selection");
        answers.add("C)Text control > Merge cells");

        questions.add("In the worksheet below, what do the symbols in rows 4, 6, 7, and 11?");
        options.add("A)The dates are erroneous such as October 39 2015., B)The columns aren't wide enough to show the full date., C)The time are incorrectly formatted as dates., D)The text is incorrectly formatted as dates.");
        answers.add("B)The columns aren't wide enough to show the full date.");

        questions.add("You are determining `%` growth by dividing Growth by Sales. Which Excel function would you use to avoid #DIV/0?");
        options.add("A)`IFERROR`, B)`ROUND`, C)`ISERROR`, D)`DIVIDE`");
        answers.add("A)-`IFERROR`");

        questions.add("You have a worksheet in Excel that will print as 10 pages. How can you ensure that the header row is printed at the top of each page?");
        options.add("A)Use Print Titles on the Page Layout tab., B)Use Page Setup from the Backstage View., C)Use Freeze Panes on the View tab., D)Format your data as a table; the header prints automatically.");
        answers.add("A)Use Print Titles on the Page Layout tab.");

        questions.add("Which value is returned when you enter this function into cell G2? `=IF(SUM(F2:F6)>12,(Too Many Tardy Days),(No Tardiness Issu)?");
        options.add("A)Too Many Tardy Days, B)#NUM!, C)No Tardiness Issue, D)#REF!");
        answers.add("C)No Tardiness Issue");

        questions.add("What ribbon command on the Home tab can you use to change a cell's fill color automatically, based on the value of the cell?");
        options.add("A)Conditional Formatting, B)Format, C)Cell Styles, D)Fill");
        answers.add("A)Conditional Formatting");

        questions.add("In this worksheet, how are cells A2:D2 related to?");
        options.add("A)Cells A2:D2 are comments relating to the formula in cell C4., B)Cells A2:D2 are the source of an error in the formula in cell C4., C)Cells A2:D2 are precedents of the formula in cell C4., D)Cells A2:D2 are dependents of the formula in cell C4.");
        answers.add("C)Cells A2:D2 are precedents of the formula in cell C4.");

        questions.add("What is the name given to the numbers in or above each bar in a column chart,?");
        options.add("A)data table, B)data numbers, C)data labels, D)data values");
        answers.add("A)data labels");

        questions.add("Which chart type provides the best visual display of the relationship between two numeric variables?");
        options.add("A)radar chart, B)box and whisker chart, C)XY scatter chart, D)combo chart");
        answers.add("C)XY scatter chart");

        questions.add("To ensure that a collection of shapes are evenly spaced apart from left to right, select the shapes, click Page Layout > Align, and then click ______.?");
        options.add("A)Distribute Horizontally, B)Align Center, C)Distribute Vertically, D)Align Middle");
        answers.add("A)Distribute Horizontally");

        questions.add("A file extension of .xlsm indicates what type of workbook?");
        options.add("A)macro-enabled workbook, B)XML-standard workbook, C)Excel 2003 workbook, D)workbook where macros are not allowed");
        answers.add("A)macro-enabled workbook");

        questions.add("How do you remove only the conditional formatting from a cell and leave all other formatting intact?");
        options.add("A)This is not possible-you can remove only all formatting from a cell., B)Select the cell. On the Home tab click Conditional Formatting > Clear Rules > Clear Rules from Selected Cells., C)Right-click the cell and select Delete Conditional Formatting., D)Right-click the cell and select Remove Conditional Formatting.");
        answers.add("B)Select the cell. On the Home tab, click Conditional Formatting > Clear Rules > Clear Rules from Selected Cells.");

        questions.add("If a range name is used in a formula and the name is deleted, what happens to the formula?");
        options.add("A)The formula display a warning but the actual cell address is substituted for the deleted name., B)The formula becomes invalid and displays a #NAME? error., C)The actual cell addresses replace the original range name in the formula., D)The formula becomes invalid and displays a #N/A error");
        answers.add("B)The formula becomes invalid and displays a #NAME? error.");

        questions.add("You want to restrict the values entered in a cell to a specified set, such as Hop, Skip, Jump. Which type of data validation should you use?");
        options.add("A)input range, B)list, C)custom, D)database");
        answers.add("B)list");

        questions.add("You want to find the second-largest invoice in a column containing all the invoices in a given month. What function would you use?");
        options.add("A)`NEXT`, B)`MAX`, C)`LARGE`, D)`MATCH`");
        answers.add("C)-`LARGE`");

        questions.add("How can you see the data in?");
        options.add("A)Close the workbook without saving and reopen it., B)Turn off conditional formatting., C)On the Home tab of the ribbon select Fit to Column., D)Expand the width of its column.");
        answers.add("C)On the Home tab of the ribbon, select Fit to Column.");

        questions.add("In the worksheet below, a table called Projects extends from cell A1 to D10. Cell D1 contains the text Status. Cell E12 contains the formula =Projects[@Status]. What does this formul?");
        options.add("A)`#VALUE!`, B)a blank cell, C)`#REF!`, D)0");
        answers.add("C)`#REF!`");

        questions.add("Which Excel feature allows you to select all cells in the column with inconsistent formulas compared to the rest of th?");
        options.add("A)On the Home tab click Go To > Special > Column differences., B)On the Formulas tab click Trace precedents., C)On the Formulas tab click Trace errors., D)On the Formulas tab click show formulas");
        answers.add("A)On the Home tab, click Go To > Special > Column differences.");

        questions.add("What is one way to center text in a cell?");
        options.add("A)Right-click the cell and select **Center** (Windows) or **Center Text** (Mac)., B)Select the cell and on the **View** tab in the **Cells** section click **Alignment** and select **Center** (Windows) or **Center Text** (Mac)., C)Select the cell and on the **Home** tab in the **Alignment** section click **Center** (Windows) or **Center Text** (Mac)., D)Change the width of the cell until the **text** is centered.");
        answers.add("C)Select the cell and, on the **Home** tab in the **Alignment** section, click **Center** (Windows) or **Center Text** (Mac).");

        questions.add("Cell D1 contains the value 7.877. You want cell D1 to display this value as 7.9 but keep the original number in calculations. How can you accomplish this?");
        options.add("A)Click the **Decrease Decimal** button once., B)Click the **Decrease Decimal** button twice., C)Use the `ROUND()` function., D)In the **Cells** group on the **Home** tab click **Format > Format Cells**. Then click the **Alignment** tab and select **Right Indent**.");
        answers.add("B)Click the **Decrease Decimal** button twice.");

        questions.add("Given the image below, what happens if you type (P) in?");
        options.add("A)The word (Perez) appears and immediately the active cell moves down., B)The word (Perez) appears and the active cell remains in Edit mode., C)A pop-up list appears with the previous four names., D)The letter (P) appears.");
        answers.add("B)The word (Perez) appears and the active cell remains in Edit mode.");

        questions.add("To insert a new column to the left of a specific column, right-click the header containing the column's letter and select _____.?");
        options.add("A)Insert Column, B)Paste Special, C)Insert, D)Insert Column Left");
        answers.add("C)Insert");

        questions.add("Your transactions data set contains more than 10,000 rows. Some rows contain the same transaction. How would you remove the rows containing the identical transactions?");
        options.add("A)Filter the relevant column right-click the column head and select **Remove Duplicates**., B)This is possible only with Power Query., C)With the data selected on the **Data** tab click **Remove Duplicates**., D)This is possible only using formulas.");
        answers.add("C)With the data selected, on the **Data** tab click **Remove Duplicates**.");

        questions.add("A colleague shared an excel file with you, and you want to display a worksheet that is hidden in it. How you can do that?");
        options.add("A)On the **Home** tab click **Unhide**., B)On the **Review** tab click **Unhide Sheet**., C)On the **View** tab click **New Window**., D)Right-click on any worksheet tab and select **Unhide**");
        answers.add("D)Right-click on any worksheet tab and select **Unhide**");

        questions.add("You have a column of dog breeds that are in all capital letters. What function would you use to convert those dog breeds so that only the first letter of each word is capitalized?");
        options.add("A)Sentence, B)Upper, C)Titlecase, D)Proper");
        answers.add("D)Proper");

        questions.add("In cell C2, how would you limit the user to choosing one of the company's five regions(East, Central, North, Sout?");
        options.add("A)Use reference tabs to create a drop-down list, B)Use a PivotTable slicer to create a drop-down list, C)Insert a table in the data to create a drop-down list, D)Use data validation to create a drop-down list");
        answers.add("A)Use data validation to create a drop-down list");

        questions.add("To calculate gross pay, hours are multiplied by the hourly rate. What formula would you put in cell C4 to then able to copy that cell down to the rest of t?");
        options.add("A)`=B1*$B$4`, B)`=$B1*B4`, C)`=B1*B4`, D)`=$B$1*B4`");
        answers.add("D)`=$B$1*B4`");

        questions.add("What do blue row numbers?");
        options.add("A)The cells are selected/highlighted, B)Excel's options have been changed, C)Certain rows in the data set are hidden, D)A filter is applied");
        answers.add("D)A filter is applied");

        questions.add("Based on the data in columns D,G,H, and K below, what formula will calculate the average compensation for full-time employees who have a job rat?");
        options.add("A)`=AVERAGEIF(D:DK2H:H5G:G)`, B)`=AVERAGEIF(G:GD:DK2H:H5)`, C)`=AVERAGEIFS(K2H:H5G:G)`, D)`=AVERAGEIFS(G:GD:DK2H:H5)`");
        answers.add("D)`=AVERAGEIFS(G:GD:DK2H:H5)`");

        questions.add("Which feature enables you to quickly sort and reduce data to a subset?");
        options.add("A)data validation, B)conditional formatting, C)advanced sort, D)filters");
        answers.add("D)filters");

        questions.add("You have a formula in cell A1. You want to display that formula in cell B1. What function can you use in cell B1?");
        options.add("A)`TEXT`, B)`FORMULATEXT`, C)`ISFORMULA`, D)`ISTEXT`");
        answers.add("B)`FORMULATEXT`");

        questions.add("You want to remove the unprintable characters and unnecessary spaces from column A. What formula would you put into cell B2 to copy down to the rest of th?");
        options.add("A)`=ERROR.TYPE(A2)`, B)`=CLEAN(TRIM(A2))`, C)`=CHOOSE(A2)`, D)`=TRIM(A2)`");
        answers.add("B)-`=CLEAN(TRIM(A2))`");

        questions.add("What isthe output of the formula `=(8+2*3)/7`?");
        options.add("A)13, B)2, C)11, D)15");
        answers.add("B)2");

        questions.add("The amount of sales tax on each sale is calculated as the selling price times the quantity sold times the sales tax rate. What formula would you use in celle E4 to then be able ro copy that cell to the rest of th?");
        options.add("A)=`C4*D4*$B$1`, B)=`(C4*D4)*B1`, C)=`C4*D4*B1`, D)=`C4*D4(*B1)`");
        answers.add("A)=`C4*D4*$B$1`");

        questions.add("Which is not a way to edit a formula in a cell?");
        options.add("A)Press F2., B)Select the cell and then click in the formula bar., C)Double-click the cell, D)Right-click the cell and select **Edit**");
        answers.add("D)Right-click the cell and select **Edit**");

        questions.add("You realize that you named a table Quraters and you want to correct it to be Quarters. How could you accomplish this ?");
        options.add("A)On the Table Design tab (Windows) or Table tab (Mac)rename the table in the Table Name box., B)Copy the table to another worksheet and rename it Quarters., C)Right click in the table and select Rename., D)On the Table Design tab (Windows) or Table tab (Mac)click Name Manager.");
        answers.add("A)On the Table Design tab (Windows) or Table tab (Mac), rename the table in the Table Name box.");

        questions.add("Which function is best used to look up and retrieve data from a specific row in a table?");
        options.add("A)`HLOOKUP`, B)`MATCH`, C)`VLOOKUP`, D)`ADDRESS`");
        answers.add("C)-`VLOOKUP`");

        questions.add("When you provide alt text for an image, what type of control are you including?");
        options.add("A)password protection, B)presentation, C)layout, D)accessibility");
        answers.add("D)accessibility");

        questions.add("Which tool provides the easiest way to create and insert an organizational chart into a presentation?");
        options.add("A)Charts, B)3D Models, C)Shapes, D)SmartArt");
        answers.add("D)SmartArt");

        questions.add("You are creating a slide that shows annual rainfall in different regions of Europe. What chart type would most effectively communicate that relationship?");
        options.add("A)line chart, B)scatter chart, C)pie chart, D)map chart");
        answers.add("D)map chart");

        questions.add("Column A contains a list of book titles. To ensure that no book title appears more than once, first you select column A. What should you do next?");
        options.add("A)Right-click the column head and select Unique, B)On the (Home) ribbon click **Clear > Duplicates**, C)On the **Data** ribbon click **Remove Duplicates**, D)On the **Data** ribbon click (Data Validation)");
        answers.add("C)On the **Data** ribbon, click **Remove Duplicates**");

        questions.add("You want to copy only the cells that are displayed here - not the hidden cells - into another worksheet. After selecting the cells in the worksheet, how do you accomplish this?");
        options.add("A)On the View tab select Visible cells only Paste into the destination worksheet, B)On the Home tab clear the Hidden cells check box. Paste into the destination worksheet, C)Copy the cells. Then in the destination worksheet click Paste special > Paste only visible cells, D)On the Home tab click Find & Select > Go to special > Visible cells only. Paste into the destination worksheet");
        answers.add("D)On the Home tab, click Find & Select > Go to special > Visible cells only. Paste into the destination worksheet");

        questions.add("You want to define a reusable process to reshape data (removing blank rows, merging columns, etc.). What toold can you use to accomplush this?");
        options.add("A)Power Query, B)Data Analysis, C)Power Pivot, D)Data Modeler");
        answers.add("A)Power Query");

        questions.add("You want to be able restrict values allowed in a cell and need to create a drop-down list of values from which users can choose. Which feature should you use?");
        options.add("A)Project Worksheet, B)Data validation, C)Conditional Formatting, D)Allow Users to Edit Ranges");
        answers.add("B)Data validation");

        questions.add("Which situation will result in a `#REF!` error?");
        options.add("A)The cell referenced in the error message has been deleted, B)A nonnumeric agument is used in a function when a numeric value is expected, C)A required operator is omitted in a formula, D)The formula contains an undefined range");
        answers.add("A)The cell referenced in the error message has been deleted");

        questions.add("Which feature allows formatting to be automatically added to new columns and rows?");
        options.add("A)AutoFormat, B)conditional formatting, C)Format as Table, D)PivotTable");
        answers.add("C)Format as Table");

        questions.add("What Excel feature can you use to automatically format cells that are greater than a specified value with designated fill and text colors?");
        options.add("A)Flash Fill, B)Conditional Formatting, C)Format as Table, D)Theme Colors");
        answers.add("B)Conditional Formatting");

        questions.add("Which formula could _not_ have been entered in?");
        options.add("A)`=SUBTOTAL(9 C2:C4)`, B)`=C2+C3+C4`, C)`=SUBTOTAL(C2:C4)`, D)`=SUM(C2:C4)`");
        answers.add("A)`=SUBTOTAL(9, C2:C4)`");

        questions.add("The last two digits of the Representative ID Number is the Office ID. Which function, when entered into cell B2 and then dragged to cell B6, returns the Office ID for each repres)?");
        options.add("A)`=TRIM(A22)`, B)`=LEFT(A22)`, C)`=RIGHT(A22)`, D)`=MID(A22)`");
        answers.add("C)`=RIGHT(A2,2)`");

        questions.add("the fastest way to see the data in?");
        options.add("A)Double-click between column headers E and F, B)Double-click between column headers F and G, C)On the **Home** tab of the ribbon select **Fit to Column**, D)Drag to resize the column");
        answers.add("A)Double-click between column headers E and F");

        questions.add("Excel's default view contains the Quick Access Toolbar and the ribbon. Which can you customize?");
        options.add("A)You cannot customize either., B)only the ribbon, C)both the Quick Access Toolbar and the ribbon, D)only the Quick Access Toolbar");
        answers.add("C)both the Quick Access Toolbar and the ribbon");

        questions.add("Other than pasting an image, how can you insert an image file from your computer into a worksheet?");
        options.add("A)On the **Insert** tab click **Pictures > This Device** (Windows) or **Pictures > Picture from file** (Mac), B)On the **Insert** tab click **SmartArt > Copy Image from Device** (Windows) or **SmartArt > Copy** (Mac), C)On the **Insert** tab click **Illustrations > Insert Illustration from This Device**, D)On the **Insert** tab click **Icons > Insert > Picture from This Device**");
        answers.add("A)On the **Insert** tab, click **Pictures > This Device** (Windows) or **Pictures > Picture from file** (Mac)");

        questions.add("You want to restrict a user from entering any amount greater than $100 or less than $20 in a row. Which Excel feature would you use?");
        options.add("A)There is not a feature in Excel that will do this., B)Data Limiting, C)Data Parameters, D)Data Validation");
        answers.add("C)Data Parameters");

        questions.add("the output of the formula `=(8+2*3)/2`?");
        options.add("A)13, B)15, C)11, D)7");
        answers.add("D)7");

        questions.add("How many columns in Excel sheet by default ?");
        options.add("A)16000, B)1048576, C)16384, D)1048000");
        answers.add("C)16384");

        questions.add("What feature can you use to populate B2:B7 with the number from each sectence?");
        options.add("A)No Excel feature can accomplish this; this is possible only using formulas., B)Flash Fill, C)Merge cells, D)Text to columns");
        answers.add("B)Flash Fill");

        questions.add("Which choice causes a circular error when it is included in a worksheet formula?");
        options.add("A)a reference to the cell occupied by the formula, B)a named constant, C)a worksheet function, D)a defined formula name");
        answers.add("A)a reference to the cell occupied by the formula");

        questions.add("You have a workheet with the year in column A, the month in column B, and the day in column C. All fields contain numbers. What function would you use to create the date column in D?");
        options.add("A)`DATEVALUE`, B)`CONCATENATE`, C)`TEXTJOIN`, D)`DATE`");
        answers.add("A)`DATEVALUE`");

        questions.add("You have a column containing runner times for a recent race. What function could you use to find the second-place finisher (the runner with the second-lowest time)?");
        options.add("A)`SMALL`, B)`MATCH`, C)`MIN`, D)`NEXT`");
        answers.add("B)`MATCH`");

        questions.add("the default horizontal alignment of text in a cell?");
        options.add("A)left, B)bottom, C)top, D)right");
        answers.add("A)left");

        questions.add("Which formula adds 8 and 5 in a cell?");
        options.add("A)`=ADD(8+5)`, B)8+5, C)None of these answers as you cannot add without a `SUM` function., D)`=8+5`");
        answers.add("D)`=8+5`");

        questions.add("What feature allow you to make the text appear as it does in ce?");
        options.add("A)cell border, B)merge cells, C)text orientation, D)wrap text");
        answers.add("C)text orientation");

        questions.add("How do you override Excel's automatic axis scaling to enter custom axis maximum and minimum values?");
        options.add("A)You cannot do this in Excel., B)Right-click the axis select **Format Axis** and scroll to the desired minimum and maximum values., C)Right-click the axis and select **Format Axis > Axis Options**. Then change the minimum and maximum values., D)Click the individual axis values and change them manually.");
        answers.add("C)Right-click the axis and select **Format Axis > Axis Options**. Then change the minimum and maximum values.");

        questions.add("Which formula will calculate the number of blank cells in the range A1:A20?");
        options.add("A)=COUNTBLANK(A1:A20), B)=COUNTA(A1:A20), C)=COUNTIF(A1:A20(>0)), D)=COUNT(A1:A20)");
        answers.add("A)`=COUNTBLANK(A1:A20)`");

        questions.add("A mortgage lender requires a 20% down payment and is offering a 30-year loan with a 3.5% interest rate. Which Excel function can you use to calculate the maximum purchase price you can afford?");
        options.add("A)Power Query, B)NPV, C)Goal Seek, D)Scenario Manager");
        answers.add("B)NPV");

        questions.add("You have filtered a table. How can you tell which column a table is sorted by?");
        options.add("A)The sorted by column heading will be italicized, B)The sorted by column heading will be bold, C)The sorted by column heading filter will have an arrow icon, D)The sorted by column will be lightly shaded");
        answers.add("C)The sorted by column heading filter will have an arrow icon");

        questions.add("How many users can open a excel file at same time?");
        options.add("A)64, B)128, C)256, D)512");
        answers.add("C)256");
        
    }
    
    public static void main(String[]args){
        new MsExcel_Quiz(name).setVisible(true);
    }
    
}
