package seventhListFrames;

import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */
public class MsWord_Quiz extends Quiz{
    

    public MsWord_Quiz(String name) {
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

// 111 questions
    @Override
    public final void loadQuestions() {
        
        questions.add("Before you send a document to an external client, you must remove personal information--including document author names, comments, and hidden text--from the doc. What tool can help you locate and clean up these details?");
        options.add("A)Accessibility Checker, B)Check Compatibility, C)Manage Document, D)Document Inspector");
        answers.add("D)Document Inspector");

        questions.add("What chart type cannot be used for more than one data series?");
        options.add("A)Pie, B)Column, C)Line, D)Ba");
        answers.add("A)Pie");

        questions.add("Which page orientation should you select to accommodate a wide chart or table?");
        options.add("A)Tall, B)Portrait, C)Wide, D)Landscape");
        answers.add("D)Landscape");

        questions.add("The first step in sharing a document that is currently saved on your local hard drive?");
        options.add("A)Get a sharing link for the document., B)Create a new document in OneDrive., C)Upload the document to OneDrive., D)Send an invitation to the document");
        answers.add("C)Upload the document to OneDrive.");

        questions.add("You are working in another application and want to move text into a Word document. How can you do it?");
        options.add("A)Export the text from the other application as a Word document., B)Use the Insert command and select the Word document., C)Select the text and save it as Word document., D)Use the Clipboard to copy and paste text into the Word document");
        answers.add("B)Use the Insert command and select the Word document.");

        questions.add("Typically created as the first page of a document and contains information such as the document title and author?");
        options.add("A)cover page, B)master page, C)blank page, D)table of contents pag");
        answers.add("A)cover page");

        questions.add("Before publishing a document, you want to identify issues that may make it difficult for people with disabilities to read. which feature should you use?");
        options.add("A)check Accessibility, B)inspect document, C)check compatibility, D)protect documen");
        answers.add("A)check Accessibility");

        questions.add("After selecting the entire document, he quickest way to find out how many paragraphs there are in your current Word document?");
        options.add("A)From the start of the document hold down the Ctrl (Windows) or Command (Mac) key and press the Down Arrow key repeatedly counting each paragraph as you go., B)Click File > Properties > Content to display file information including the number of paragraphs., C)On the status bar select Word Count to display file information including the number of paragraphs., D)Click File > Info > Inspect Document to display file information including the number of paragraphs");
        answers.add("C)On the status bar, select Word Count to display file information, including the number of paragraphs.");

        questions.add("You want to be able to read one page in your document while editing another page in the same document. What's the most efficient way to do this with only one monitor?");
        options.add("A)On the View tab of the ribbon click Split., B)Save a duplicate copy of your document then view both documents side by side., C)On the Insert tab of the ribbon create a bookmark for the location that you want to read., D)On the View tab of the ribbon click New Window");
        answers.add(" A)On the View tab of the ribbon, click Split.");

        questions.add("The purpose of adding alternative text (alt text) to an image in your document?");
        options.add("A)Alt text improves accessibility in your document., B)all of these answers, C)Alt text describes what appears in the image., D)Screen readers read the text aloud for users with visual impairments");
        answers.add("C)all of these answers");

        questions.add("You are inserting several images in a document and need to include descriptive information about them. Numbering the images will also make it easier to reference them in the associated document text. Which command can help you set this up?");
        options.add("A)Insert Footnote, B)Insert Citation, C)Insert Caption, D)Insert Table of Figure");
        answers.add("C)Insert Caption");

        questions.add("You want an image to move with the surrounding text as you make changes to the document. Which option should you select?");
        options.add("A)In Line with Text, B)With Text Wrapping, C)Behind Text, D)Through");
        answers.add("B)With Text Wrapping");

        questions.add("You want to place a triangle shape on your page. Where do you find the shape?");
        options.add("A)On the Insert tab click SmartArt., B)On the Insert tab click Shapes and look in the Rectangles & Triangles section., C)On the Insert tab click Icons., D)On the Insert tab click Shapes and look in the Basic Shapes section");
        answers.add("D)On the Insert tab, click Shapes and look in the Basic Shapes section.");

        questions.add("When printing multiple copies of a document, which option groups consecutive pages together, making them easier to distribute?");
        options.add("A)Collated, B)Print One-Sided, C)Uncollated, D)Print on Both Side");
        answers.add("A)Collated");

        questions.add("You are sharing your computer screen to collaborate on a document. Which view should you use to minimize the ribbon and give your document the most screen space?");
        options.add("A)Read Mode (Windows) or Focus (Mac), B)Draft view, C)Web Layout view, D)Outline vie");
        answers.add("A)Read Mode (Windows) or Focus (Mac)");

        questions.add("You want a different header and footer to appear on alternating pages. Which option should you choose?");
        options.add("A)Different Odd & Even Pages, B)Insert Alt Header/Footer, C)Display on Odd Pages Only, D)Different First Pag");
        answers.add("A)Different Odd & Even Pages");

        questions.add("What formatting must you use to use both portrait and landscape pages in the same Word document?");
        options.add("A)templates, B)page, C)columns, D)section");
        answers.add("D)sections");

        questions.add("Which option does the Find and Replace feature **NOT** support?");
        options.add("A)Match Punctuation, B)Replace All, C)Match Case, D)Whole Word Onl");
        answers.add("A)Match Punctuation");

        questions.add("he name of the text effect that displays a large capital letter at the beginning of a paragraph?");
        options.add("A)superscript, B)drop cap, C)subscript, D)small cap");
        answers.add("B)drop cap");

        questions.add("You need to document a procedure. Which paragraph format is best to help readers follow the sequence of instructions?");
        options.add("A)line numbers, B)numbered list, C)columns, D)bulleted lis");
        answers.add("B)numbered list");

        questions.add("How can you adjust which data in a table is used when creating a chart?");
        options.add("A)Click the Select Data button., B)Click the Refresh Data button., C)Click the Switch Row/Column button., D)Click the Edit Data button");
        answers.add("D)Click the Edit Data button.");
        
        questions.add("How can you break a table into two parts?");
        options.add("A)Use the Split Table command., B)Press Shift + Enter (Windows) or Sift + Return (Mac)., C)Use the Section Break command., D)Use the Split Cells command");
        answers.add("A)Use the Split Table command.");

        questions.add("What can you **NOT** create from a Word document?");
        options.add("A)a Word macro-enabled document, B)a plain text file, C)a multipage website, D)a Word 2003 XML documen");
        answers.add("C)a multipage website");

        questions.add("How can you add a manual line break to a paragraph?");
        options.add("A)Press Enter twice (Windows) or Return twice (Mac)., B)Press Alt+Enter (Windows) or Option+Return (Mac)., C)Press Enter (Windows) or Return (Mac)., D)Press Shift+Enter (Windows) or Shift+Return (Mac");
        answers.add("D)Press Shift+Enter (Windows) or Shift+Return (Mac)");

        questions.add("You want to repeat an element (such as the date) on all pages of the document. Which options should you choose?");
        options.add("A)Insert > Header & Footer, B)Insert > Text, C)Design > Header & Footer, D)View > Header & Foote");
        answers.add("A)Insert > Header & Footer");

        questions.add("You want to repeat an element (such as the date) at the bottom of all pages of a document. Which option should you choose?");
        options.add("A)Insert > Text, B)View > Header & Footer, C)Design > Footer, D)Insert > Foote");
        answers.add("D)Insert > Footer");

        questions.add("A document has been shared with you from your colleague's OneDrive library. They have given only you editing access. What can you do with this document?");
        options.add("A)Share the document with others., B)Assume ownership of the document., C)Remove access from another user., D)Coauthor the document with your colleague");
        answers.add("A)Share the document with others.");
        
        questions.add("Which feature allows you to copy attributes of selected text and apply them to another selection?");
        options.add("A)Merge Formatting command, B)Copy and Paste Styles command, C)Copy and Paste Attributes command, D)Format Painter too");
        answers.add("D)Format Painter tool");

        questions.add("To protect a document from accidental changes, which option should you select from the Protect Document (Windows) or Protect (Mac) menu?");
        options.add("A)Mark as Final., B)Add a Digital Signature., C)Encrypt with Password., D)Always Open Read-Only");
        answers.add("D)Always Open ReadOnly.");

        questions.add("You are finalizing a two-page document. Rather than having Word decide where page 1 ends, you want the next paragraph to begin on the top of page 2. How do you achieve this?");
        options.add("A)Change the bottom margin to your current location., B)Insert a page break., C)Press Shift + Enter (Shift + Return)., D)Insert a column break");
        answers.add("B)Insert a page break.");

        questions.add("How do you insert the content of an existing Word document into your current Word document?");
        options.add("A)Click Layout > Text > Text from File., B)Click Insert > Text > Building Blocks Organizer., C)Click Insert > Text > Text from File., D)Click Insert > Media");
        answers.add("C)Click Insert > Text > Text from File.");

        questions.add("You want to set a wider inside margin to accommodate binding a document where pages are printed in both sides. Which option should you choose in the Page Setup dialog box?");
        options.add("A)Book Fold., B)Different Odd & Even Pages., C)Mirror Margins., D)Landscape");
        answers.add("A)Book Fold.");

        questions.add("How can I place a ghosted logo or text behind the regular text in my document using a specific feature?");
        options.add("A)Background., B)Watermark., C)Imagemark., D)Overlay");
        answers.add("B)Watermark.");

        questions.add("Where do you select the paper size for a document?");
        options.add("A)Design > Size., B)File > Page Setup., C)Layout > Size., D)Layout > Margins");
        answers.add("C)Layout > Size.");

        questions.add("Which option lets you mark your favorite templates for quick reuse in the future?");
        options.add("A)Drag to Home tab., B)Add to chooser., C)Pin to list., D)Mark as favorite");
        answers.add("C)Pin to list.");

        questions.add("Which tab contains the option to add caption to a table?");
        options.add("A)Insert, B)Design, C)References, D)Layou");
        answers.add("C)References");

        questions.add("How can you change the appearance of an entire table in a single step?");
        options.add("A)Apply a table style., B)Apply a graphic style., C)Right-click a table and choose a new style., D)Apply a cell style");
        answers.add("A)Apply a table style.");

        questions.add("Which option does the Find and Replace feature **NOT** support?");
        options.add("A)Whole Word Only., B)Replace All., C)Check Spelling., D)Match Case");
        answers.add("C)Check Spelling.");

        questions.add("Which statement best describes how a bookmark is used in a Word document?");
        options.add("A)A bookmark is a hyperlink where the label is automatically generated., B)A bookmark works in conjunction with hyperlinks to allow you to quickly jump to a specific location in your document., C)A bookmark is a link in your document that can give you quick access to webpages files and other locations within your document., D)A bookmark is a color-coded graphic that appears in the navigation pane for easy access to a specific location in your document");
        answers.add("B)A bookmark works in conjunction with hyperlinks to allow you to quickly jump to a specific location in your document.");

        questions.add("*NOT** an option when inviting a colleague to collaborate on a document?");
        options.add("A)including a personalized message, B)giving the collaborator the option to edit a document, C)setting the collaborator's access to view only, D)granting administrator acces");
        answers.add("D)granting administrator access");

        questions.add("You split a document into three sections. What happens if you change the margins in the first section?");
        options.add("A)The document reverts back to a single section with the new margin settings., B)The new margin settings are applied to all of the sections., C)The new margin settings are applied to the second and third sections., D)The new margin settings are applied to just the first section");
        answers.add("D)The new margin settings are applied to just the first section.");

        questions.add("Which ribbon tab includes commands to add various types of objects or media to your document?");
        options.add("A)Insert, B)File, C)Layout, D)Desig");
        answers.add("A)Insert");

        questions.add("What type of page is useful at the front of a large document, to identify the document title, author, and other metadata?");
        options.add("A)cover page, B)blank page, C)master page, D)table of contents pag");
        answers.add("A)cover page");
        
        questions.add("Which command builds an overview of document contents based on applied headings styles?");
        options.add("A)Manage Sources, B)Cross-Reference, C)Insert Index, D)Table of Content");
        answers.add("D)Table of Contents");

        questions.add("Which statistic does the Word Count feature **NOT** collect?");
        options.add("A)paragraphs, B)lines, C)page breaks, D)characters (no spaces");
        answers.add("C)page breaks");

        questions.add("he default view when you open a document or create a new document?");
        options.add("A)Print Layout view, B)Draft view, C)Edit view, D)Web Layout vie");
        answers.add("A)Print Layout view");

        questions.add("You are working on a local copy of a document when Word unexpectedly closes. After you relaunch Word, how can you find the most recently saved version of the document?");
        options.add("A)Click Open > Recent and select Recover Unsaved Documents, B)Click File > Options > Recover Unsaved Documents, C)Click File > Open > Recent > Documents., D)Click File > Recent > Recover Unsaved Documents");
        answers.add("C)Click File > Open > Recent > Documents.");

        questions.add("Which object type can you _not_ insert into a Word document from the **Insert** tab?");
        options.add("A)a sketch, B)a symbol, C)a 3D model, D)an equatio");
        answers.add("A)a sketch");

        questions.add("What Microsoft Word feature lets you capture a portion of your screen to be used as an image in your document?");
        options.add("A)Screen Clipping, B)Screen Grab, C)Screen Capture, D)none of these answer");
        answers.add("A)Screen Clipping");

        questions.add("You want to create a shortcut that replaces an acronym that you type with the acronym's full text-for example, replacing `(/mt)` with `(Microsoft Teams)`. What Word feature do you use to create this shortcut?");
        options.add("A)Replace All, B)AutoFormat As You Type, C)Find and Replace, D)AutoCorrect Option");
        answers.add("D)AutoCorrect Options");

        questions.add("What is the shortcut to save a document in MS Word?");
        options.add("A)Ctrl+P, B)Ctrl+S, C)Ctrl+Z, D)Ctrl+S");
        answers.add("B)Ctrl+S");

        questions.add("How do you bold text in MS Word?");
        options.add("A)Ctrl+I, B)Ctrl+B, C)Ctrl+U, D)Ctrl+V");
        answers.add("B)Ctrl+B");

        questions.add("What is the shortcut to undo an action in MS Word?");
        options.add("A)Ctrl+Y, B)Ctrl+X, C)Ctrl+Z, D)Ctrl+C");
        answers.add("C)Ctrl+Z");

        questions.add("How do you italicize text in MS Word?");
        options.add("A)Ctrl+U, B)Ctrl+U, C)Ctrl+I, D)Ctrl+F");
        answers.add("C)Ctrl+I");

        questions.add("What is the shortcut to copy text in MS Word?");
        options.add("A)Ctrl+V, B)Ctrl+C, C)Ctrl+X, D)Ctrl+Z");
        answers.add("B)Ctrl+C");

        questions.add("How do you underline text in MS Word?");
        options.add("A)Ctrl+F, B)Ctrl+B, C)Ctrl+U, D)Ctrl+U");
        answers.add("D)Ctrl+U");

        questions.add("What is the shortcut to paste text in MS Word?");
        options.add("A)Ctrl+C, B)Ctrl+V, C)Ctrl+X, D)Ctrl+Z");
        answers.add("B)Ctrl+V");

        questions.add("How do you select all text in a document in MS Word?");
        options.add("A)Ctrl+F, B)Ctrl+S, C)Ctrl+P, D)Ctrl+A");
        answers.add("D)Ctrl+A");

        questions.add("What is the shortcut to print a document in MS Word?");
        options.add("A)Ctrl+Z, B)Ctrl+S, C)Ctrl+F, D)Ctrl+P");
        answers.add("D)Ctrl+P");

        questions.add("How do you align text to the left in MS Word?");
        options.add("A)Ctrl+R, B)Ctrl+L, C)Ctrl+E, D)Ctrl+J");
        answers.add("B)Ctrl+L");

        questions.add("What is the shortcut to open a new document in MS Word?");
        options.add("A)Ctrl+F, B)Ctrl+S, C)Ctrl+O, D)Ctrl+N");
        answers.add("D)Ctrl+N");

        questions.add("How do you insert a page break in MS Word?");
        options.add("A)Ctrl+Page Up, B)Ctrl+Shift+Enter, C)Ctrl+Page Down, D)Ctrl+Enter");
        answers.add("B)Ctrl+Shift+Enter");

        questions.add("What is the shortcut to redo an action in MS Word?");
        options.add("A)Ctrl+Z, B)Ctrl+Y, C)Ctrl+X, D)Ctrl+C");
        answers.add("B)Ctrl+Y");

        questions.add("How do you center align text in MS Word?");
        options.add("A)Ctrl+J, B)Ctrl+R, C)Ctrl+E, D)Ctrl+L");
        answers.add("C)Ctrl+E");

        questions.add("What is the shortcut to check spelling and grammar in MS Word?");
        options.add("A)Ctrl+F5, B)Ctrl+F3, C)Ctrl+F1, D)Ctrl+F7");
        answers.add("D)Ctrl+F7");

        questions.add("How do you insert a hyperlink in MS Word?");
        options.add("A)Ctrl+N, B)Ctrl+M, C)Ctrl+K, D)Ctrl+L");
        answers.add("C)Ctrl+K");

        questions.add("What is the shortcut to go to the next page in MS Word?");
        options.add("A)Ctrl+End, B)Ctrl+Home, C)Ctrl+Page Up, D)Ctrl+Page Down");
        answers.add("D)Ctrl+Page Down");
        
        questions.add("How do you superscript text in MS Word?");
        options.add("A)Ctrl+Shift+F, B)Ctrl+Shift+=, C)Ctrl+Shift+Plus, D)Ctrl+Shift+>");
        answers.add("B)Ctrl+Shift+=");
        
        questions.add("How do you insert a footnote in MS Word?");
        options.add("A)Ctrl+Shift+F, B)Ctrl+Shift+Fn, C)Ctrl+Shift+F12, D)Ctrl+Shift+F1");
        answers.add("D)Ctrl+Shift+F1");
        questions.add("What is the shortcut to toggle bookmarks in MS Word?");
        options.add("A)Ctrl+Shift+F1, B)Ctrl+Shift+F2, C)Ctrl+Shift+F3, D)Ctrl+Shift+F4");
        answers.add("B)Ctrl+Shift+F2");
        questions.add("How do you insert a column break in MS Word?");
        options.add("A)Ctrl+Shift+Enter, B)Ctrl+Shift+Page Down, C)Ctrl+Shift+Page Up, D)Ctrl+Shift+PgBk");
        answers.add("B)Ctrl+Shift+Page Down");
        questions.add("What is the shortcut to show or hide the ribbon in MS Word?");
        options.add("A)Ctrl+F1, B)Ctrl+Shift+F1, C)Ctrl+Shift+F2, D)Ctrl+F2");
        answers.add("A)Ctrl+F1");
        questions.add("How do you insert a section break in MS Word?");
        options.add("A)Ctrl+Shift+Enter, B)Ctrl+Shift+Page Up, C)Ctrl+Shift+Page Down, D)Ctrl+Shift+PgBk");
        answers.add("C)Ctrl+Shift+Page Down");
        questions.add("What is the shortcut to toggle the navigation pane in MS Word?");
        options.add("A)Ctrl+F1, B)Ctrl+F2, C)Ctrl+F3, D)Ctrl+F4");
        answers.add("B)Ctrl+F2");
        
        questions.add("There is a circle shape in your document. Which of the shape's style can you format?");
        options.add("A)all of these answers, B)Outline, C)Effects, D)Fill");
        answers.add("A)all of these answers");

        questions.add("A word theme is composed of settings for which document attributes?");
        options.add("A)fonts and paragraph spacing, B)colors fonts paragraph spacing and effects, C)colors fonts and paragraph spacing, D)colors fonts and effect");
        answers.add("C)colors, fonts, and effects");

        questions.add("When using the Compare function, the differences between two documents are outlineD ______.");
        options.add("A)in red, B)on the most recent of the two documents, C)on the original document, D)on a third documen");
        answers.add("A)in red");

        questions.add("You have inserted a picture in your Word document, and you want to ensure that users with visual impairments can access the picture. How can you do this?");
        options.add("A)Insert an object., B)Insert a caption., C)Insert AutoText., D)Insert alt text");
        answers.add("D)Insert alt text.");

        questions.add("You are creating a company newsletter. The first page has three columns, and the second page will need four columns. How would you do this?");
        options.add("A)Insert a column break at the beginning of the second page., B)Insert a page break at the end of the first page., C)Insert a section break at the end of the first page., D)Insert a text wrapping break at the beginning of the second page");
        answers.add("C)Insert a section break at the end of the first page.");

        questions.add("You want to start a new text section at the current cursor position without adding a new page. Which type of section break should you choose?");
        options.add("A)Continuous, B)Even Page, C)Next Page, D)Odd Pag");
        answers.add("A)Continuous");

        questions.add("Which function allows you to treat multiple objects as a single object for the purpose of manipulating their display or placement within a document?");
        options.add("A)Group, B)Merge, C)Copy, D)Combin");
        answers.add("A)Group");

        questions.add("Which function turns a document into a webpage?");
        options.add("A)Style, B)Format, C)Translate, D)Transfor");
        answers.add("B)Format");

        questions.add("Which is not a text wrapping option for a picture?");
        options.add("A)justify, B)through, C)behind text, D)tigh");
        answers.add("A)justify");

        questions.add("You are editing a paragraph that begins on one page and ends on the next after selecting the entire paragraph, how can you display it on one page?");
        options.add("A)In paragraph settings click Indent and Spacing > pagination and select Keep with next, B)In paragraph settings click Line and Page Break > pagination and select Keep with next, C)In paragraph settings click Line and Page Break > pagination and select keep lines together, D)In paragraph settings click Line and Page Break > pagination and select Widow/Orphan contro");
        answers.add("B)In paragraph settings, click Line and Page Break > pagination and select Keep with next");

        questions.add("Double clicking in the left margin will ______ the paragraph to the right.");
        options.add("A)double indent, B)select, C)delete, D)underlin");
        answers.add("B)select");

        questions.add("When using Track Changes, what formatting indicates that text has been deleted?");
        options.add("A)strikethrough, B)wavy line, C)italic, D)underlin");
        answers.add("A)strikethrough");

        questions.add("What action allows you to quickly access a specific document from your list of saved files?");
        options.add("A)Pin to list, B)Add to chooser, C)Mark as favorite, D)Drag to Home ta");
        answers.add("C)Mark as favorite");

        questions.add("How do you insert a symbol in MS Word?");
        options.add("A)Ctrl+Shift+F, B)Ctrl+Shift+7, C)Ctrl+Shift+8, D)Ctrl+Shift+=");
        answers.add("B)Ctrl+Shift+7");
        
        questions.add("What is the shortcut to show or hide the status bar in MS Word?");
        options.add("A)Ctrl+F1, B)Ctrl+F2, C)Ctrl+F3, D)Ctrl+F4");
        answers.add("C)Ctrl+F3");
        
        questions.add("How do you insert a table of contents in MS Word?");
        options.add("A)Ctrl+Shift+F, B)Ctrl+Shift+F1, C)Ctrl+Shift+F2, D)Ctrl+Shift+F3");
        answers.add("D)Ctrl+Shift+F3");
        
        questions.add("You and your colleagues are asked to reply to some comments in a documents you have addressed your comments. Which choice is not a good way to indicate that you have taken care of the comments before sending the file to the next person?");
        options.add("A)Insert a new comment, B)Reply to the comment, C)Delete the comment, D)Resolve the commen");
        answers.add(" C)Delete the comment");

        questions.add("What action allow you to quickly access a specific docuemnt from your list of saved file?");
        options.add("A)List, B)Go to file, C)Bookmark, D)Jum");
        answers.add("C)Bookmark");

        questions.add("Which page orientation should you select to accommodate a wide chart or table?");
        options.add("A)Wide, B)Portrait, C)Landscape, D)None of the abov");
        answers.add("C)Landscape");

        questions.add("For what task can you not use the style inspector?");
        options.add("A)displaying the paragraph formatting at the insertion point, B)resetting or clearing paragraph or text-level formatting, C)recommending style changes for improved accessibility, D)displaying the text-level formatting at the insertion poin");
        answers.add("C)recommending style changes for improved accessibility");

        questions.add("Your industry uses a lot of terminology that is not included in regular dictionaries, so document checking is both inaccurate and laborious. How can you modify Word to make document checking more efficient and accurate?");
        options.add("A)In the Word proofing options enable Suggest (Windows) or Select (Mac) from main dictionary only, B)Add your terminology to the default Word dictionary, C)In the Word proofing tools enable checking for both Cliches and Jargon (Windows) or Cliches colloquialisms and jargon (Mac), D)Create a custom dictionary that includes your specific terminolog");
        answers.add("D)Create a custom dictionary that includes your specific terminology");

        questions.add("What happens when you resolve a comment?");
        options.add("A)The comment is deleted, B)There is no change to the comment, C)A reply is added to the comment, D)The comment appears dimme");
        answers.add("D)The comment appears dimmed");

        questions.add("Using the Styles group in Word lets you quickly ______ ?");
        options.add("A)apply frames and artistic effects to graphics, B)modify page margins, C)apply a different theme, D)apply styles for heading levels body text and title");
        answers.add("D)apply styles for heading levels, body text, and titles");

        questions.add("You need to direct a reader from specific text to a related graphic that clarifies the content in another place in your document. Which command can you use to set this up?");
        options.add("A)Citation, B)Table of Contents, C)Cross-Reference, D)Table of Figure");
        answers.add("C)CrossReference");

        questions.add("When are mirrored margins typically used?");
        options.add("A)when printing on both sides of the paper, B)when the document has a header or a footer, C)when the text is formatted into multiple columns, D)when you need all the margins to be the same siz");
        answers.add("A)when printing on both sides of the paper");

        questions.add("You created a professional-looking business letter and would like to have all your letters look like this. he best way to do this?");
        options.add("A)Save a copy of the file and type over it for each new letter., B)Set the file as default theme., C)Use the Format Painter to apply the format to new letters., D)Create a template by saving the file as a .dot file");
        answers.add("D)Create a template by saving the file as a .dot file.");

        questions.add("Which style type should you create in order to control font, font color, tab positions, and line breaks?");
        options.add("A)table, B)hybrid, C)character, D)paragraph");
        answers.add("D)paragraph");

        questions.add("You realize unwanted changes were made to a document, so you want to go back to the file you previously saved. What should you use to accomplish this task?");
        options.add("A)No Markup, B)Compare, C)Version History, D)Track Change");
        answers.add("C)Version History");

        questions.add("Which of the following is an example of page orientation?");
        options.add("A)Landscape, B)subscript, C)A4, D)All of the abov");
        answers.add("A)Landscape");

        questions.add("The file extension for a Microsoft Word document?");
        options.add("A).docx, B).txt, C).pdf, D).xls");
        answers.add("A).docx");

        questions.add("Which view in Microsoft Word is best for editing and formatting a document?");
        options.add("A)Print Layout, B)Read Mode, C)Web Layout, D)Outline Vie");
        answers.add("A)Print Layout");

        questions.add("Which ribbon tab in Microsoft Word is used for changing the font and text formatting?");
        options.add("A)Page Layout, B)Home, C)References, D)Inser");
        answers.add("B)Home");

        questions.add("What does (Ctrl+S) do in Microsoft Word?");
        options.add("A)Copy selected text, B)Paste copied text, C)Save the document, D)Cut selected tex");
        answers.add("C)Save the document");

        questions.add("Which feature in Microsoft Word allows you to repeat the same text on each page, such as a header or footer?");
        options.add("A)Page Break, B)Page Numbering, C)Header and Footer, D)Text Bo");
        answers.add("C)Header and Footer");

        questions.add("Which option allows you to change the orientation of a page in Microsoft Word from portrait to landscape?");
        options.add("A)Page Setup, B)Page Break, C)Line Spacing, D)Paragraph Forma");
        answers.add("A)Page Setup");

        questions.add("The default file format for saving a Word document in the newer versions of Microsoft Word?");
        options.add("A).doc, B).txt, C).rtf, D).doc");
        answers.add("A).docx");

        questions.add("In Word, he purpose of the (Find and Replace) feature?");
        options.add("A)Spell check, B)Formatting text, C)Searching for and replacing specific text, D)Creating hyperlink");
        answers.add("D)Creating hyperlinks");

        
    }
    

    public static void main(String[]args){
        new MsWord_Quiz(name).setVisible(true);
    }
    
}

