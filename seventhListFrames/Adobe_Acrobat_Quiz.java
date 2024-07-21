package seventhListFrames;

import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */
public class Adobe_Acrobat_Quiz extends Quiz {

    public Adobe_Acrobat_Quiz(String name) {
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

    // questions:50
    @Override
    public final void loadQuestions() {

        questions.add(" In previous versions of Acrobat, you could mark a comment with a check mark, without having to use a drop-down menu. How can you restore this efficient functionality when using a newer version of Acrobat?");
        options.add("A) Preferences > identity, B) Preferences > Reviewing, C) Preferences > Reading, D) Preferences > Commenting");
        answers.add("D) Preferences > Commenting");

        questions.add(" A PDF containing complex engineering drawings is failing to print completely. The printing device is an older model with a small amount of RAM. What setting might enable you to print the complex file without error?");
        options.add("A) Print as image, B) Auto-orientation, C) Print in grayscale, D) Custom scale");
        answers.add("A) Print as image");

        questions.add(" Your client asks you to export their PDF brochure to multiple formats for various uses. However, you discover that you cannot meet one of their requests. Which is a format to which you CANNOT export?");
        options.add("A) JPEG, B) TIFF, C) EPS, D) SVG");
        answers.add("D) SVG");

        questions.add(" After you finish creating form fields for a complicated form, the client submits a new PDF, with color changes, a new logo, and minor text edits. What is the most efficient way to incorporate the new artwork?");
        options.add("A) Prepare Form, B) Compare Files, C) Edit PDF, D) Organize Pages > Replace");
        answers.add("D) Organize Pages > Replace");

        questions.add(" You need to send a 25 MB legal document to a client. However, their corporate email allows attachments of only 5 MB or fewer. You select File > Save As > Reduced Size PDF. This doesn�t reduce the file size enough, because the file has many photographs. Now you need to subdivide the document into smaller individual files. Where can you go to accomplish this?");
        options.add("A) Tools > Organize Pages > Split Document, B) Tools > Index, C) Tools > Edit PDF > Crop Pages, D) Tools > Optimize PDF");
        answers.add("A) Tools > Organize Pages > Split Document");

        questions.add(" You would like to use Bookmarks to navigate a PDF, but the Bookmarks panel is not available. Why would that panel be unavailable?");
        options.add("A) The PDF does not contain any articles., B) You are viewing the PDF in a web browser., C) The file creator did not give the article a title., D) You are viewing the PDF in Adobe Reader.");
        answers.add("B) You are viewing the PDF in a web browser.");

        questions.add(" As you examine large engineering documents, you would like to have the **Marquee Zoom** tool easily available all the time. What is the fastest way to add the **Marquee Zoom** tool to **Common Tools**?");
        options.add("A) Right-click in the toolbar and select **Show Page Navigation Tools**., B) Right-click in the toolbar and select **Show Page Display Tools**., C) Right-click in the toolbar and select **Show Select & Zoom**., D) Right-click in the toolbar and select **Customize Quick Tools**.");
        answers.add("C) Right-click in the toolbar and select **Show Select & Zoom**.");

        questions.add(" A person at a printing service provider is having difficulty printing a PDF due to font issues. Where can the person find out which fonts are used in the document?");
        options.add("A) Tools > Action Wizard, B) Tools > Print Production, C) File > Export To > Microsoft Word, D) File > Properties");
        answers.add("D) File > Properties");

        questions.add(" To work more efficiently, you would like to create a shortcut in the tools pane, to the right of the document window, that includes multiple operations, such as Edit PDF, Organize Pages, and Export PDF. Which feature will let you accomplish this?");
        options.add("A) Action Wizard, B) Optimize PDF, C) Create Custom Tool, D) Customize Quick Tools");
        answers.add("A) Action Wizard");

        questions.add(" You are printing a PDF of an instruction manual. On some pages the only content is a video, but you would like a visual representation of the video area in the printed version. Which option in the Print dialog box will ensure that the video areas will print?");
        options.add("A) More Options, B) Document and Markups, C) Advanced > Output, D) Document and Stamps");
        answers.add("C) Advanced > Output");

        questions.add(" In an effort to clean up a PDF form, you wish to align the top edges of a row of five fields. You used the Select tool (black arrow) to drag around the fields to select them all. You want to align all the fields to the top edge of the fifth field. How can you do that?");
        options.add("A) Alt-click (Windows) or Option-Click (Mac) in the fifth field to make it the origin field., B) Click once more in the fifth field to make it the origin field., C) Ctrl-click (Windows) or Command-click (Mac) in the fifth field to make it the origin field., D) Shift-click in the fifth field to make it the origin field.");
        answers.add("C) Ctrl-click (Windows) or Command-click (Mac) in the fifth field to make it the origin field.");

        questions.add(" You prefer seeing documents in the single document view, rather than in the tabbed document view. To accomplish this, you went to Edit > Preferences > General, and then cleared the check box for the tabbed preference. However, PDFs are still opening as tabs. How can you resolve this issue?");
        options.add("A) Reboot your computer., B) Switch from Tools view to Home view., C) Close any open files then reopen the files., D) Restart Acrobat.");
        answers.add("D) Restart Acrobat.");

        questions.add(" Using Adobe Sign, you would like to send a document for two colleagues to approve. However, when you attempt to add the document to the files to be sent for signature, that file type is grayed out. What file type is not eligible for Adobe Sign?");
        options.add("A) GIF, B) JPEG, C) BMP, D) PSD");
        answers.add("D) PSD");

        questions.add(" To ensure that users of older versions of Adobe Reader can fill and save forms, you chose File > Save As Other > Reader Extended PDF. Now you need to make further edits to the form. You have not applied any form security to the file, but you see an alert, (You cannot edit this file as a form due to its security settings.) What method can you use to edit the form?");
        options.add("A) File > Properties > Custom, B) File > Save a Copy, C) Preferences > Forms, D) File > Properties > Advanced");
        answers.add("D) File > Properties > Advanced");

        questions.add(" Users submitted forms to you via email. Some files are .fdf (forms data format), and some files are .pdf documents. Which method will let you combine all the data into a .csv file?");
        options.add("A) Prepare Form > Fields, B) Prepare Form > Document Actions, C) Prepare Form > Document JavaScripts, D) Prepare Form > More");
        answers.add("C) Prepare Form > Document JavaScripts");

        questions.add(" You turn around the files that you edit fairly quickly, and you edit many files. As a result, the long list of recent files in the Home view has become cumbersome. Where can you customize the number of recent files listed in the Home view?");
        options.add("A) Preferences > Page Display, B) Preferences > Reading, C) Preferences > General, D) Preferences > Documents");
        answers.add("D) Preferences > Documents");

        questions.add(" You are about to submit a client�s PDF to a commercial printer. However, at the last minute, you discover a blemish in one of the images in the PDF, which the client requested that you fix. With no access to the original file, how can you do this?");
        options.add("A) Select **Tools** > **Edit PDF** right-click the image and select the **Edit Using** option., B) Select **Tools** > **Enhance Scans** > **Enhance Camera Image**., C) Select **Tools** > **Enhance Scans** > **Enhance Scanned Document**., D) Right-click the image and select **Add Image**.");
        answers.add("A) Select **Tools** > **Edit PDF**, right-click the image, and select the **Edit Using** option.");

        questions.add(" You receive a PDF of a manuscript to be printed as an on-demand book. The writer also sent a new, single-page PDF to be added to the manuscript as the book's cover. Where can you go to accomplish this ?");
        options.add("A) Tools > Compare Files, B) Tools > Organize Pages, C) Tools > Edit PDF, D) Tools > Action Wizard");
        answers.add("B) Tools > Organize Pages");

        questions.add(" In the PDF form you are creating for a client, you are asked to create a drop-down field containing the list of states in the United States. The client requests that the field dispaly the instructional text (Select your state) as a default choice when the form is opened. How can you ensure that the instructional text is displayed by default in the drop-down field?");
        options.add("A) Select the instructional text entry in the Dropdown Properties dialog box., B) Choose commit Selected Value Immediately in the Dropdown Properties dialog box., C) Choose Sort Items in the Dropdown Properties dialog box., D) Choose Format Category > Special in the Dropdown Properties dialog box.");
        answers.add("A) Select the instructional text entry in the Dropdown Properties dialog box.");

        questions.add(" To streamline index creation for a collection of academic documents, which option would result in a smaller index and thus faster searching for the user?");
        options.add("A) Structure Tags, B) XMP Fields, C) Custom Properties, D) Stop Words");
        answers.add("D) Stop Words");

        questions.add(" You create a PDF portfolio, and you would like to add encryption, without having to deal with each individual file. To encrypt a complete portfolio with a certificate, to verify via digital signature, where would you go to start?");
        options.add("A) **Tools > Protect**, B) **Tools > Certificates**, C) **View > Portfolio Cover Sheet**, D) **Tools > Action Wizard**");
        answers.add("D) **Tools > Action Wizard**");

        questions.add(" You must prepare a PDF to meet the accessibility requirements of Section 508 compliance for a government agency. You have determined that there are some problems with the file which prevent it from passing accessibility tests. Where would you go to quickly to those issues and make the PDF accessible?");
        options.add("A) Tools > Edit PDF, B) Tools > Accessibility, C) Tools > Action Wizard, D) Tools > PDF Standards");
        answers.add("C) Tools > Action Wizard");

        questions.add(" In a fillable form, you would like the user to be able to enter their own text in a multi-choice form field, if none of the existing choices in the form field are suitable. Which type of form field would provide this option?");
        options.add("A) a list box field, B) a multi-line text field, C) a drop-down field, D) a text field with rich text formatting");
        answers.add("B) a multi-line text field");

        questions.add(" A client sent a PDF to be included as a page in a book you are designing. The client misspelled several words in the PDF. The PDF is a scan of text. What can you do to fix the misspelled words?");
        options.add("A) **Tools > Organize Pages**, B) **Tools > Accessibility**, C) **Took > Edit PDF**, D) **File > Export to > Microsoft Word**");
        answers.add("C) **Took > Edit PDF**");

        questions.add(" You would like to convert a layered Visio file to PDF. However, that option is not available. How can you control the conversion of Visio layers to layers in the exported PDF?");
        options.add("A) Click **Create Layer Set**., B) Click **Add Layers**., C) Deselect the **Convert All Pages in Drawing** option., D) Select **Retain Some Layers in the Selected Page**.");
        answers.add("D) Select **Retain Some Layers in the Selected Page**.");

        questions.add(" A small section of a 28-page PDF has been updated with new image and given to you as a 3-page PDF. You have both PDFs open in Acrobat. Before you update the 28-page file with the new pages, you need to verify that the text is unchanged. What is the best way to do this?");
        options.add("A) From the 28-page PDF extract and save the three pages as a new PDF. For each of the two three-page PDFs choose **File > Export to > Text (Plain).**, B) Arrange the two PDFs in side-by-side windows in Acrobat. Scroll to the first page of the section in the larger PDF and compare the visually line by line., C) Go to **View > Compare Files** and choose **Text Only**. Then in Settings edit the **Compare Page Range** field of the larger document so that it is the same three-page range. Then click **Compare**., D) Select the original text in the 3-page section of the 28-page PDF and copy it to the clipboard. Then paste it into the new 3-page PDF replacing all of it text.");
        answers.add("C) Go to **View > Compare Files** and choose **Text Only**. Then, in Settings, edit the **Compare Page Range** field of the larger document so that it is the same three-page range. Then click **Compare**.");

        questions.add(" You need to send multiple documents to a potential client, and you would like to add security to all of the documents at once. What is the easiest method?");
        options.add("A) Portfolio, B) LiveCycle Rights Management, C) Security Envelope, D) Email Review");
        answers.add("A) Portfolio");

        questions.add(" You need to reduce the resolution of image content in an existing PDF, while controlling the look of the images. Which option allows you to change the resolution of image content with options?");
        options.add("A) Press-ready PDF, B) Optimized PDF, C) Certified PDF, D) Reader Extended PDF");
        answers.add("B) Optimized PDF");

        questions.add(" You plan to post a PDF form online and gather the submitted data in a database. What must you have to do this?");
        options.add("A) A web server which supports Microsoft Access, B) A web server which supports WebDAV and CGI, C) A web server which supports XML and FDF, D) A web server which supports Microsoft Excel");
        answers.add("B) A web server which supports WebDAV and CGI");

        questions.add(" You would like to use a drag-and-drop method to convert multiple selected PDF files from color to greyscale. What feature will allow you to do this?");
        options.add("A) Action Wizard, B) Custom Tool, C) Preflight Droplet, D) Optimize PDF");
        answers.add("C) Preflight Droplet");

        questions.add(" You provide an interactive PDF to a client that you created. The interactive PDF includes multiple embedded videos. However, the client cannot view the videos. What is a reason that the client might be unable to view the video?");
        options.add("A) A browser is not installed., B) A GIF player is not installed., C) Flash Player is not installed., D) QuickTime is not installed.");
        answers.add("C) Flash Player is not installed.");

        questions.add(" You make a last-minute change to some text in a client's PDF. When you change the text, the appearance of the corrected text does not match the surrounding text. What might be the cause of this issue?");
        options.add("A) The font is embedded in the PDF., B) The surrounding text is in a locked layer., C) The font is not embedded in the PDF., D) The required font is not active on your system.");
        answers.add("D) The required font is not active on your system.");

        questions.add(" To attach a PDF to an email for a client's approval, you need to considerably reduce the size of the PDF. Which method will give you the most extensive options for reducing file size?");
        options.add("A) File > Save As Other > Reduced Size PDF, B) File > Save As Other > Optimized PDF, C) File > Export To > Image, D) File > Export To > PostScript");
        answers.add("B) File > Save As Other > Optimized PDF");

        questions.add(" You are signing a contract with a new client. Rather than using Adobe Sign, the client is requesting that you use the built-in Acrobat Digital Signature feature. You would like to add your written name as part of the digital signature. Where can you accomplish this?");
        options.add("A) Preferences > Signatures > Identities & Trusted Certificates, B) Preferences > Signatures > Document Timestamping, C) Preferences > Signatures > Verification, D) Preferences > Signatures > Creation and Appearance");
        answers.add("D) Preferences > Signatures > Creation and Appearance");

        questions.add(" You tried to extract and export each photo within a 12-page PDF newsletter to a specific folder as individual JPEGs. Instead of individual images, Acrobat exported each full page as a single JPEG image. How can you achieve an export of individual JPEGs instead?");
        options.add("A) Edit the image settings in **File > Save As Other > Optimized PDF**., B) Enable the **Export All Images** checkbox in **Tools > Export PDF > Image**., C) Turn off the **Extract Pages as Separate Files** checkbox in **Organize Pages > Extract**., D) Edit the conversion settings in **File > Export > Image > JPEG**.");
        answers.add("C) Turn off the **Extract Pages as Separate Files** checkbox in **Organize Pages > Extract**.");

        questions.add(" You are trying to find all instances of (medicine) in a scientific PDF document. Although you can clearly see the word on at least one page, a search returns no results. What might cause this?");
        options.add("A) The text is redacted., B) The text is in a locked layer., C) The PDF has limited permissions., D) The PDF is a scanned document.");
        answers.add("D) The PDF is a scanned document.");

        questions.add(" You are creating PDFs for a government agency. Which specification in the quote request from the agency contact indicates that the PDFs you submit must meet accessibility guidelines?");
        options.add("A) Section 501c compliance, B) Section 508 compliance, C) Section 509a compliance, D) Section 510 compliance");
        answers.add("B) Section 508 compliance");

        questions.add(" In the PDF of a textbook, all of the necessary bookmarks have been created. Later, an editor rearranges the pages in one chapter. What will you have to do to ensure that the bookmarks now link to the correct pages?");
        options.add("A) Set bookmark destination., B) Select the correct location and choose Go to Bookmark., C) Re-order the bookmarks in the Bookmarks pane by dragging., D) Nothing The bookmarks will still be correct.");
        answers.add("C) Re-order the bookmarks in the Bookmarks pane by dragging.");

        questions.add(" You tried to extract and export each photo within a 12-page PDF newsletter to a specific folder as individual JPEGs. Instead of individual images, Acrobat exported each full page as a single JPEG image. How can you achieve an export of indiviudal JPEGs instead?");
        options.add("A) Edit the conversion settings in **File > Export > Image > JPEG**., B) Turn off the **Extract Pages as Separate Files** checkbox in **Organize Pages > Extract**., C) Enable the **Export All Images** checkbox in **Tools > Export PDF > Image**., D) Edit the image settings in **File > Save As Other > Optimized PDF**.");
        answers.add("B) Turn off the **Extract Pages as Separate Files** checkbox in **Organize Pages > Extract**.");

        questions.add(" To facilitate the entry of common information, such as company name, address, and phone number, you have provided an FDF (forms data format) file for other users in your company to import into forms they've created. However, one user reports that the company name field isn't populated when they import data. Why might the company name field fail to populate in the form they created?");
        options.add("A) The field name is incorrect., B) The field font size is incorrect., C) The field is set to multi-line., D) The field location is incorrect.");
        answers.add("A) The field name is incorrect.");

        questions.add(" Before you begin a PDF review, you want to change the default line thickness, line color, fill color, and other settings for the Comment panel's drawing tools. Where do you change these defaults?");
        options.add("A) **Comment panel menu**, B) **Properties Toolbar**, C) **Preferences > Commenting**, D) **Preferences > Reviewing**");
        answers.add("C) **Preferences > Commenting**");

        questions.add(" In a complex forms document, one field is currently a drop-down list field. However, the client specifies that it should instead be a multi-line text field. How can you do what the client requests?");
        options.add("A) Select the drop-down field and then click the **Dropdown** icon in the secondary toolbar., B) Right-click the drop-down field and select **Properties** from the context menu., C) Delete the drop-down field and create a text field in its place., D) Select the drop-down field and then click **Prepare Form** in the right pane.");
        answers.add("B) Right-click the drop-down field and select **Properties** from the context menu.");

        questions.add(" A proprietary document is being sent to a new client. You would like to ensure that the client can open the PDF but not change any of the contents. In **Password Security Settings**, what should you choose?");
        options.add("A) Permissions, B) Certificates, C) Document Open, D) Compatibility");
        answers.add("A) Permissions");

        questions.add(" Before distributing a document containing proprietary information, you want to make sure that the document content cannot be printed. However, you want to ensure that the text can be read by screen-reading software for any users who have visual impairments. Where can you find the settings that will allow these parameters?");
        options.add("A) **Accessibility > Set Alternate Text**, B) **Tools > Action Wizard**, C) **Accessibility > Reading Options**, D) **Document Properties > Password > Security > Settings**");
        answers.add("C) **Accessibility > Reading Options**");

        questions.add(" You need to submit a PDF to a commercial printing company. They specify that the PDF shall only contain CMYK image content, with no RB images, no layers, and no live transparency. Which preset will meet these specifications?");
        options.add("A) PDF/X-3, B) PDF/X-4, C) PDF/X-1a, D) PDF/X-1b");
        answers.add("C) PDF/X-1a");

        questions.add(" A historical society asks you to design a book that will honor the society's founders. They want a PDF version of the book that ensures that the file will be readable in the distant future. What PDF format is designed for future readability?");
        options.add("A) PDF/X-1a, B) PDF/X-3, C) PDF/X-4, D) PDF/A-1a");
        answers.add("D) PDF/A-1a");

        questions.add(" Patients must fill out a 12-page form for gleaning personal and health information. They are required to put their name on every page. As you create the form for the doctor's office, you plan to take advantage og the fact that fields with the same name will display the same data. How can you automatically copy the Name field to every page of the PDF form?");
        options.add("A) Select the original field right-click and then select Add New Field., B) Select the original field right-click and then select Align Distribute or center, C) Select the original field right-click and then select Duplicate Accross pages, D) Select the original field right-click and then select create multiple copies.");
        answers.add("C) Select the original field, right-click and then select Duplicate Accross pages");

        questions.add(" On a new windows computer, you first installed adobe acrobat DC, then you installed the Microsoft Office suite. Because of the order of installtion, the PDFMaker option does not appear in the ribbons of your Office applications. How can you install PDFMaker in Microsoft Word on a PC?");
        options.add("A) FIle > Options > Add-ins, B) File > Transform > Intelligent Services, C) File > Options > Customize ribbons, D) File > Info > Manage Document");
        answers.add("C) File > Options > Customize ribbons");

        questions.add(" A PDF contains hyperlinks formatted with invisble rectanles. How can you see the locations of all the hyperlinks at once, without having to hover over each hyperlink to reveal it?");
        options.add("A) Destinations panel, B) Loupe tool, C) Object inspector, D) Select Object tool");
        answers.add("A) Destinations panel");

        questions.add(" You will be posting a 64-page PDF in your company's online library. You want to make sure that users can start reading the document immediately, rather than waiting for the entire document to download. which option provides for page-at-a-time downloading of a large, multi-page PDF?");
        options.add("A) Include Hyperlinks, B) Include Bookmarks, C) Create tagged PDF, D) Optimize for Last web view");
        answers.add("D) Optimize for Last web view");
    }



    public static void main(String[] args) {
        new Adobe_Acrobat_Quiz(name).setVisible(true);
    }
}
