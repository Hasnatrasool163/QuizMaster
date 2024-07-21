package seventhListFrames;

import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */
public class MsPowerPoint_Quiz extends Quiz{
    

    public MsPowerPoint_Quiz(String name) {
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

// 114 questions
    @Override
    public final void loadQuestions() {

questions.add(" When you create a new, blank presentation, you begin with one blank slide. What is the layout name of this slide?");
options.add("A)Blank, B)Title slide, C)Title and Content, D)Title Onty");
answers.add("B)Title slide");

questions.add(" What do you use to align objects on a slide with each other?");
options.add("A)Layout tools, B)Arrange tools, C)Design Ideas feature, D)Picture tools");
answers.add("B)Arrange tools");

questions.add(" Which option must be enabled if you want to manipulate the playback of a video file during a presentation?");
options.add("A)Record Side Show, B)Use Presenter View, C)Show Playback Controls, D)Show Media Controls");
answers.add("D)Show Media Controls");

questions.add(" Which feature analyzes the content of your slides and offers suggested options?");
options.add("A)Design ideas/ Designer, B)Smartart, C)Browse for Themes, D)Add-Ins");
answers.add("A)Design ideas/ Designer");

questions.add(" Where can you configure advanced PDF options?");
options.add("A)the Options tab, B)the Home tab, C)the Print dialog box, D)the Share tab");
answers.add("C)the Print dialog box");

questions.add(" Which tab is best for adding various types of objects to slides?");
options.add("A)Animations, B)View, C)File, D)Insert");
answers.add("D)Insert");

questions.add(" Which SmartArt category can you use to make informational graphics out of bullet points?");
options.add("A)All of these answers, B)Pyramid, C)List, D)Matrix");
answers.add("A)All of these answers");

questions.add(" What is NOT checked when you run the Accessibility Checker?");
options.add("A)Reading order, B)Slide titles, C)Missing alt text, D)Grammar");
answers.add("D)Grammar");

questions.add(" How can you change the appearance of a table in one click?");
options.add("A)Apply a cell stye., B)Apply a graphic style., C)Apply a table style., D)Right-click a table and choose a new style.");
answers.add("C)Apply a table style.");

questions.add(" Which option facilitates a text box to automatically changes shape to fit longer text?");
options.add("A)Resize shape to fit text, B)Do not autofit, C)Shrink text on overflow, D)None of these answers");
answers.add("A)Resize shape to fit text");

questions.add(" Which three shadow properties can be adjusted in PowerPoint? A. Focal Point B. Depth C. Blur D. Angle E. Distance");
options.add("A)A B C, B)A C E, C)B C D, D)C D E");
answers.add("D)C, D, E");

questions.add(" If you want your presentation to play continuously on screen, what option must you set?");
options.add("A)Use Presenter view, B)Advance slides manually, C)Advance slides automatically, D)Loop continuously until 'Esc'");
answers.add("D)Loop continuously until 'Esc'");

questions.add(" Which statement about the Compress Pictures command is true?");
options.add("A)You can compress all images at the same time., B)You cannot delete cropped areas., C)There are no options for print output., D)You can compress only one image at a time.");
answers.add("A)You can compress all images at the same time.");

questions.add(" You have a Word document you would like to import as an outline into a PowerPoint presentation. How should you format the text in the Word document that you want to be the content of the?");
options.add("A)Heading Style 2, B)Subtitle, C)Content Style, D)List 2");
answers.add("A)Heading Style 2");

questions.add(" In what manner can you filter comments?");
options.add("A)by length, B)by author, C)by date, D)by urgency");
answers.add("B)by author");

questions.add(" Which Arrow Options choice will hide the mouse cursor while presenting, except when the cursor is moved?");
options.add("A)Automatic, B)Hidden, C)None of these answers, D)Visible");
answers.add("A)Automatic");

questions.add(" Which chart type is best suited for displaying annual financial data for a 10-year period?");
options.add("A)Donut chart, B)Line or area chart, C)Area chart, D)Pie chart");
answers.add("B)Line or area chart");

questions.add(" If you want to create an organizational chart, which SmartArt category works best?");
options.add("A)Pyramid, B)Relationship, C)Hierarchy, D)Matrix");
answers.add("C)Hierarchy");

questions.add(" When printing multiple handouts, which option will group multipage documents together and make them easier to distribute?");
options.add("A)Print on Both Sides, B)Uncollated, C)Print One-sided, D)Collated");
answers.add("D)Collated");

questions.add(" How can you adjust which data in a table is used when working on a chart?");
options.add("A)Click the Switch Row/Column button., B)Click the Refresh Data button., C)Click the Select Data button., D)Click the Edit Data button.");
answers.add("C)Click the Select Data button.");

questions.add(" Which view lets you see additional information on a second monitor when delivering a presentation?");
options.add("A)Normal view, B)Reading view, C)Slide Sorter view, D)Presenter view");
answers.add("D)Presenter view");

questions.add(" A picture looks good in your slide show but pixelated when you print it. How can you fix this?");
options.add("A)Compress the picture and use the Print (220 ppi) resolution setting., B)Select Best scale for slide show increase the picture resolution and resize the picture to the original size, C)Remove picture compression., D)Change the printer property settings to print in a higher resolution.");
answers.add("C)Remove picture compression.");

questions.add(" You have inserted a video on a slide and want the video to automatically start 2 seconds after the associated slide appears. How can you accomplish this?");
options.add("A)Use playback timings., B)Use animation timings., C)Use animation triggers., D)Use video timings.");
answers.add("B)Use animation timings.");

questions.add(" When inserting pictures, how can you avoid distorting the picture if it is resized later?");
options.add("A)Use best scale for slide show., B)Lock the aspect ratio., C)Compress the picture., D)Set the picture to be relative to the orignal picture size.");
answers.add("B)Lock the aspect ratio.");

questions.add(" Which Protect Presentation option protects a presentation from accidental changes?");
options.add("A)Always Open Read-Only, B)Add a Digital Signature, C)Encrypt with Password, D)Mark as Final");
answers.add("A)Always Open Read-Only");

questions.add(" How can you change colors in your presentation all at once without changing the design?");
options.add("A)Apply a Color Template., B)Apply a Color Theme., C)Apply a Color Palette., D)Customize the Color Fills.");
answers.add("B)Apply a Color Theme.");

questions.add(" What function allows you to borrow slides from a presentation fro an other presentation?");
options.add("A)Borrow Slides, B)There is no special fuction. You must use Copy and Pase, C)Reuse Slides, D)Find Slides");
answers.add("C)Reuse Slides");

questions.add(" What is the term used for the arrangement of elements on a slide, such as Title and Content?");
options.add("A)theme, B)design, C)sheme, D)layout");
answers.add("D)layout");

questions.add(" How would you change a list of text to a visual diagram on a slide?");
options.add("A)Convert to WordArt., B)Convert to Shapes., C)Convert to SmartArt., D)Convert to Picture.");
answers.add("C)Convert to SmartArt.");

questions.add(" How can you reorder the levels of shapes in a SmartArt diagram?");
options.add("A)Retype the text, B)Change the shapes from rifht to left., C)Promote or Demote the shapes, D)Move the shapes up and down.");
answers.add("C)Promote or Demote the shapes");

questions.add(" Why would you trim a video?");
options.add("A)To crop the video thumbnail., B)To resize the video., C)To remove background noise in the video., D)To remove some of the beginning and/or end of the video.");
answers.add("D)To remove some of the beginning and/or end of the video.");

questions.add(" How would you save your layouts, colors, fonts, effects, background styles and content for others to use with their presentations?");
options.add("A)Export the file as a template., B)Save the file as a PDF., C)Save the file as a POTX., D)Save the file as a PPTX.");
answers.add("A)Export the file as a template.");

questions.add(" You are creating an industrial presentation of a new software program and would like to include an image of your program. How can you use PowerPoint to do this?");
options.add("A)Use the Copy command., B)Use the Screenshot command. (Office2019), C)Use the Print key., D)Use the Capture Screen command.");
answers.add("B)Use the Screenshot command. (Office2019)");

questions.add(" How can you add more layouts to the Layout Gallery?");
options.add("A)Customize the Layout Gallery., B)Add Slide Layouts to the Slide Master., C)Use the Add Layouts command., D)Use the Insert Layouts command.");
answers.add("B)Add Slide Layouts to the Slide Master.");

questions.add(" Why would you use the Outline view?");
options.add("A)To see only the text in placeholders., B)To present the slides at a high level., C)To add text from a Word document., D)To organize your slides.");
answers.add("A)To see only the text in placeholders.");

questions.add(" The text on the left and right of the slide are cut off in print preview. How can you fix this in the printer settings?");
options.add("A)Unselect High Quality., B)Select Scale to Fit Paper., C)Select Frame Slides., D)Select Frame Slides.");
answers.add("B)Select Scale to Fit Paper.");

questions.add(" In addition to organizing your slides, how else can sections increase your productivity?");
options.add("A)In addition to organizing your slides how else can sections increase your productivity?., B)All the slides in a section can be selected at once to apply changes such as transitions layouts or hiding slides., C)Sections can be exported as a separate presentation., D)You can resize all the slides in a section at once.");
answers.add("B)All the slides in a section can be selected at once to apply changes such as transitions, layouts or hiding slides.");

questions.add(" You have many slides that you need to reorder. How would you accomplish this?");
options.add("A)Move the slides in Slide Show view., B)Renumber the slides in Outline view., C)Move the slides in the Slide Sorter view., D)Reset the slide footers.");
answers.add("C)Move the slides in the Slide Sorter view.");

questions.add(" What can be seen in Presenter view?");
options.add("A)Timer., B)Notes., C)Side Navigator., D)all of these answers.");
answers.add("D)all of these answers.");

questions.add(" How can you format the entire contents of a text box?");
options.add("A)Click the dashed/dotted border of the text box., B)Right-click the text box and select Select All., C)Click the Fond button on the Home tab., D)Double-click any word in the text box.");
answers.add("A)Click the dashed/dotted border of the text box.");

questions.add(" You have a large number of objects on your slide. How can you use the selection pane to help you identify the objects quickly?");
options.add("A)Select the show/hide icons next to the objects., B)Rename the objects with meaningful names., C)Drag and drop the objects., D)Tab through the objects and note each object as it's highlighted.");
answers.add("B)Rename the objects with meaningful names.");

questions.add(" How would you ensure a consistent appearance and placement across your slides even though the content might be different?");
options.add("A)Use fonts., B)Use styles., C)Use bullet points., D)Use layouts.");
answers.add("D)Use layouts.");

questions.add(" How can you add icons to SmartArt?");
options.add("A)Select the picture icon in a SmartArt Picture Diagram., B)Select the icon in a SmartArt Icon Diagram., C)Select Insert Icon and place it on top of the SmartArt Diagram., D)Select a SmartArt shape and select Insert Icon.");
answers.add("C)Select Insert Icon and place it on top of the SmartArt Diagram.");

questions.add(" You are having trouble playing back a presentation smoothly. What should you do?");
options.add("A)Copy the presentation to your internal hard drive., B)Clear the **Disable hardware graphics acceleration** option., C)all of these answers, D)Select the **Show without animation** option.");
answers.add("C)all of these answers");

questions.add(" Which feature lets you configure multiple combinations of specific slides for playback from a larger slide show?");
options.add("A)Record Slide Show, B)Rehearse Timings, C)Custom Slide Show, D)Hide Slide");
answers.add("C)Custom Slide Show");

questions.add(" When working with a mapchart, which options can be drawn?");
options.add("A)Postal code, B)State, C)Country, D)All of these answers");
answers.add("D)All of these answers");

questions.add(" You receive feedback from two clients on your presentation. Each person sent you an edited file. What's the best way to review their changes?");
options.add("A)Review > Accept, B)Review > Smart Lookup, C)Review > Compare, D)Review > Show Comments");
answers.add("C)Review > Compare");

questions.add(" How do you promote subbullets to top-level bullets?");
options.add("A)Press Shift+Tab., B)Right-click the bulleted text and select Promote., C)Press the Esc key., D)Press the Spacebar.");
answers.add("A)Press Shift+Tab.");

questions.add(" After you select the chart icon in a placeholder, what is the next step to create a chart?");
options.add("A)Select the chart elements., B)Select the chart type., C)Select the chart data in Excel., D)Select the chart style.");
answers.add("C)Select the chart data in Excel.");

questions.add(" How would you show a correlation between the amount of chocolate a city consumes and the number of crimes committed?");
options.add("A)Use a bar chart., B)Use a column chart., C)Use a line chart., D)Use a scatter chart.");
answers.add("D)Use a scatter chart.");

questions.add(" You want to use a morph transition between two slides. How do you set up the slides?");
options.add("A)The two slides must have multiple objects in common with different names in the Selection pane, B)The two slides must have at least one obiect in common that is in a different position on the second slide, C)The second slide must have different objects that are in the same position as the objects on the first slide, D)The two slides must have at least one obiect in common that is in the same position on the second slide");
answers.add("B)The two slides must have at least one obiect in common that is in a different position on the second slide");

questions.add(" Why would you use the Rehearse Timings command?");
options.add("A)to adiust animation timings, B)to record your slide show, C)to remove transition timings, D)to determine how long it takes to present your slide show");
answers.add("D)to determine how long it takes to present your slide show");

questions.add(" How can you make an inserted picture look like it has been sketched or painted?");
options.add("A)Apply a picture effect, B)Apply a draw effect, C)Apply an artistic effect, D)Apply a picture style");
answers.add("C)Apply an artistic effect");

questions.add(" How can you modify your presentations entire set of colors with a single change?");
options.add("A)Apply a color template, B)Customize a color fill, C)Apply a color palette, D)Apply a color theme");
answers.add("D)Apply a color theme");

questions.add(" You want to print full-page slides to fill 8. 5-by-11-inch paper, but they appear too small in the preview. What is the best way to rectify this?");
options.add("A)Change the slide size to standard, B)Repeatedly bump up the scale setting print option until it fills the page in the preview, C)Change the scale setting print option to 100%, D)Select the **Scale to Fit Paper** print option");
answers.add("D)Select the **Scale to Fit Paper** print option");

questions.add(" You want to import a Word document as an outline into a Powerpoint presentation. How should you format the Word documents text that you want to be the slide content?");
options.add("A)List 2, B)Content Style, C)Subtitle, D)Heading Style 2");
answers.add("D)Heading Style 2");

questions.add(" What is not reviewed when you check a slide shows accessibility?");
options.add("A)missing alt text, B)slide titles, C)grammar, D)reading order");
answers.add("A)missing alt text");

questions.add(" What is the easiest way to change the appearance of a table?");
options.add("A)Apply a graphic style, B)Apply a table style, C)Right-click a table and select a new style, D)Apply a cell style");
answers.add("B)Apply a table style");

questions.add(" Why would you use Outline view?");
options.add("A)to quickly edit titles or bulleted text in the Slide pane, B)to view the comments on all slides, C)to add notes in the Slide pane, D)to change the font on all slides");
answers.add("A)to quickly edit titles or bulleted text in the Slide pane");

questions.add(" Before publishing a presentation, which option should you use to scan a presentation and look for issues that may make it difficult for someone with a visual impairment to read?");
options.add("A)Protect Presentation, B)Inspect Document, C)Check Compatibility, D)Check Accessibility");
answers.add("D)Check Accessibility");

questions.add(" How can you filter the series and/or categories in a chart?");
options.add("A)Edit the data to remove the data for the series or category., B)Switch the rows and columns., C)Use a filter so the data series or category does not display., D)Change the chart type.");
answers.add("C)Use a filter so the data series or category does not display.");

questions.add(" You have an object that needs to follow a specific motion path - including curves, straight lines, and loops - on the slide. Which animation gives the capability to draw this?");
options.add("A)Loops, B)Arc, C)Turns, D)Custom Path.");
answers.add("D)Custom Path.");

questions.add(" When you add encryption to a PowerPoint presentation, what does it do?");
options.add("A)scrambles the text so it is unreadable when opened., B)shares the file in cloud-based platform., C)protects the file with a password., D)requires the user to log in to their Office 365 account.");
answers.add("C)protects the file with a password.");

questions.add(" Which type of shape allows you to add text that can be moved around, formatted with styles and effects, or grouped with other objects?");
options.add("A)screenshot, B)text box, C)icon, D)3D model");
answers.add("B)text box");

questions.add(" You need to apply a special effect that will display as the presentation moves from one slide to the next slide. Which should you apply?");
options.add("A)theme, B)transition, C)animation, D)design ideas");
answers.add("B)transition");

questions.add(" Which option can be used to import selected slides from a previously created presentation into a new presention without manually copying and pasting them?");
options.add("A)Slide Zoom, B)Reuse Slides, C)Slides from Outline, D)Add Section");
answers.add("B)Reuse Slides");

questions.add(" You are copying and pasting slides from another presentation into your presentation. How will you ensure the new slides are consistent in appearance with your existing slides?");
options.add("A)Select **Keep Source Formatting** when pasting the slides., B)Select **Use Destination Theme** when pasting the slides., C)Change both presentations to the same theme before copying and pasting., D)Select **Picture** when pasting the slides.");
answers.add("B)Select **Use Destination Theme** when pasting the slides.");

questions.add(" What happens when you press the Esc key while playing a **From Current Slide** or **From Beginning** slide show?");
options.add("A)The current slide is temporary hidden., B)The slide show ends and you return to your previous view., C)The next slide appears., D)Nothing happens.");
answers.add("B)The slide show ends and you return to your previous view.");

questions.add(" When you save a presentation with a `.potx` file extension, which type of Powerpoint file is created?");
options.add("A)macro-eanbled presentation, B)template, C)show, D)theme");
answers.add("B)template");

questions.add(" You are presenting with two monitors. Which view displays a preview of next slide and speaker notes on the second monitor?");
options.add("A)Presenter view, B)Master view, C)Normal view, D)Reading view");
answers.add("A)Presenter view");

questions.add(" Which effect can a presenter use to add motion to an object on a slide?");
options.add("A)Add-in, B)Zoom, C)Animation, D)Transition");
answers.add("C)Animation");

questions.add(" When you copy data from an Excel worksheet into a slide to create a table, which Paste option will allow you to edit the table data in Excel?");
options.add("A)Keep Formatting, B)Embed, C)Keep Text Only, D)Picture");
answers.add("B)Embed");

questions.add(" You created a photo album with transitions and want to send it to friends, but the file size is too large for email. How can you use one command to fix this?");
options.add("A)Click **Export** in Backstage view and embed the presentation in an email., B)Compress all the pictures to the **Email (96 ppi) resolution**., C)Use the Share feature in Backstage view and petty email to automatically compress the pictures., D)Use the Share feature in Backstage view to create a pdf to send as an attachment.");
answers.add("B)Compress all the pictures to the **Email (96 ppi) resolution**.");

questions.add(" In a presentation about voter turnout, you are illustrating various data with charts. Which type of information would you present in a pie chart?");
options.add("A)the decline of voter turnout by county, B)trends in voter turnout over the part 10 years, C)what percentage of the whole population voted, D)how many people voted in various geographic regions on a map");
answers.add("C)what percentage of the whole population voted");

questions.add(" If you want to create an organizational chart that illustrates the reporting relationships within the organization, which SmartArt category would you use?");
options.add("A)Hierarchy, B)Matrix, C)Pyramid, D)Relationship");
answers.add("A)Hierarchy");

questions.add(" What do the labels Introduction and ProjectsByMonth indicate?");
options.add("A)designs , B)section names, C)layouts, D)hidden slides");
answers.add("B)section names");

questions.add(" There are objects and text hidden behind an image on your slide. With the image selected, what could you adjust to make the objects and text appear (through) the image?");
options.add("A)Compress Picture, B)Transparency, C)Corrections, D)Artistic Effects");
answers.add("B)Transparency");

questions.add(" How can you create a new presentation that includes prebuild layouts, colors, fonts, background styles, and content?");
options.add("A)Use a theme., B)Use a design., C)Use a template., D)Use a style.");
answers.add("A)Use a theme.");

questions.add(" How can you reorder the levels of shapes in a SmartArt diagram?");
options.add("A)Promote or demote the shapes., B)Move the shapes up and down., C)Change shapes from left to right., D)Retype the text.");
answers.add("B)Move the shapes up and down.");

questions.add(" When you insert a new slide in a presentation, where is it placed in relation to the exsisting slides?");
options.add("A)as the first slide., B)before the current slide., C)at the end of the exsisting slide., D)after the currently selected slide.");
answers.add("D)after the currently selected slide.");

questions.add(" In Normal view, which pane is used to add text and reference information for the speaker?");
options.add("A)Comments, B)Reading, C)Slide, D)Notes");
answers.add("D)Notes");

questions.add(" What is the best way to modify slide's appearance or content while in Note Page view?");
options.add("A)Edit the thumbnail of the slide as needed., B)Slides cannot be modified while in Note Page view., C)Use the Zoom slider to magnify the slide contents, D)Right-click the slide and select edit");
answers.add("A)Edit the thumbnail of the slide as needed.");

questions.add(" You want to group your slides based on their content to better organize your presentation. How would you accomplish this?");
options.add("A)Create an outline in the outline view and rearrange slides., B)Add a table of contents slide and link the remaining slides to it., C)Add sections and move the slides into the appropriate sections., D)Create custom shows and add the slides into the shows.");
answers.add("C)Add sections and move the slides into the appropriate sections.");

questions.add(" How do you remove the background of an inserted impage?");
options.add("A)Select the image and on the Design tab use the Format Background feature, B)Select the image and on the Picture Format tab use the Compress Picture feature, C)Select the image and on the Picture Format tab click the Remove Background button, D)On the Drawing Tools Format tab select Graphics Fill > Remove Background");
answers.add("C)Select the image and, on the Picture Format tab, click the Remove Background button");

questions.add(" In a SmartArt graphic, how can you add text to the shapes other than directly in each shape?");
options.add("A)Open th Text Pane for the graphic and enter the text., B)Create a bulleted list and then convert it to a shape., C)Select all of the shapes and start typing., D)You can only add text by typing directly into each shape.");
answers.add("A)Open th Text Pane for the graphic and enter the text.");

questions.add(" You want to add two images to a presentation, but one is a bit blurry and another is quite dark. What feature on the Picture Format tab can you use to adjust them?");
options.add("A)Corrections., B)Picture Effects., C)Trasparency., D)Crop.");
answers.add("A)Corrections.");

questions.add(" A colleague has given you a presentation file, and you want to use one of the slides from that presentation in your own. How would you do this?");
options.add("A)Use the Reuse Slides command., B)Use the Import slides command., C)Use the Insert Slides command., D)Use the Duplicate Slides command.");
answers.add("C)Use the Import slides command.");

questions.add(" Which type of shape allows you to add text that can be moved around, formatted with styles and effects, or grouped with other objects?");
options.add("A)Screenshot, B)Textbox, C)Icon, D)3D model");
answers.add("B)Textbox");

questions.add(" Which view allows you to select individual objects on a slide?");
options.add("A)Slide Sorter view, B)Slide Show view, C)Normal view, D)Design view");
answers.add("C)Normal view");

questions.add(" When in Slide Show view, what happens when you hold Ctrl (Windows) or Command (Mac)and click the left mouse button?");
options.add("A)You activate the laser pointer, B)You end the slide show, C)You toggle the mouse pointer on/off, D)You terminate animations");
answers.add("A)You activate the laser pointer");

questions.add(" Which PowerPoint feature is best used to set up slide timings so slides automatically advance?");
options.add("A)**Timing** on the **Animations** tab, B)**Advanced Animation** on the **Animations** tab, C)**Reharse Timings** on the **Slide Show** tab, D)**Timing** on the **Transitions** tab");
answers.add("D)**Timing** on the **Transitions** tab");

questions.add(" You plan to distribute a presentation. In which format might you save it to ensure that it appears as an automatically playing slide show composed of individual slides, regardless of the recipients' platform or software applications?");
options.add("A)PDF (.pdf), B)PowerPoint Show (.ppsx), C)OpenDocument Presentation (.odp), D)MPEG-4 Video (.mp4)");
answers.add("D)MPEG-4 Video (.mp4)");

questions.add(" Which type of illustration can be rotated while in Slide Show view, allowing the audience to see all sides of an image?");
options.add("A)action button, B)animated image, C)icon, D)3D model");
answers.add("D)3D model");

questions.add(" You inserted audio into a presentation. Which two options must you enable for the audio to play throughout all slides and repeat until it is stopped A. Loop until Stopped B. Play Across Slides C. Rewind after Playing D. Start When Clicked On?");
options.add("A)B and C, B)C and D, C)B and D, D)A and B");
answers.add("D)A and B");

questions.add(" Your presentation has a slide on which the text appears scrambled. What happened?");
options.add("A)The text direction has been changed to 90 degrees, B)The text direction has been changed to Vertical., C)The text direction has been changed to Stacked., D)The text direction has been changed to 360 degrees.");
answers.add("A)The text direction has been changed to 90 degrees.");

questions.add(" Your colleagues have collaborated in a presentation with you, adding new content and reusing slides from other presentations. You notice the layouts vary throughout the slides: differently sized and positioned containers, and different headers and footers. Where can you make a change that will automatically be applied to all slides in the presentation?");
options.add("A)Quick Styles, B)Slide Master, C)Header & Footer, D)Handout Master");
answers.add("B)Slide Master");

questions.add(" Your company logo appears on all slides in a presentation as part of the overall design template's Slide Master. How can you prevent the logo from appearing on one particular slide?");
options.add("A)Hide the graphic using Design > Format Background., B)Right-click the logo (Windows) or select the logo (Mac)and then select Delete., C)Insert a blank shape to mask the logo., D)Remove the logo graphic from the Slide Master template.");
answers.add("A)Hide the graphic using Design > Format Background.");

questions.add(" Many PowerPoint slide backgrounds use a color effect that is gradually shaded from top to bottom. What is this effect called?");
options.add("A)pattern fill, B)solid fill, C)texture fill, D)gradient fill");
answers.add("D)gradient fill");

questions.add(" The picture on the left is the original image. Which type of picture format has been applied to the picture on the right?");
options.add("A)Picture Styles, B)Artistic Effects, C)Picture Layout, D)Picture Effects");
answers.add("B)Artistic Effects");

questions.add(" To create a stacked image with the campfire icon on top of the yellow circle, select the campfire icon, then drag it to the center of the yellow circle, What is the next step?");
options.add("A)On the graphics format tab press Enter (windows) or Return (mac), B)on the graphics format tab click the send backward arrow and select Send to back, C)On the graphics format tab click the Bring forwarrd arrow and select bring to front, D)On the graphics format tab in the selection pane drag the campfire icon below the orange circle");
answers.add("C)On the graphics format tab, click the Bring forwarrd arrow and select bring to front");

questions.add(" In this image, a link to ___ is being added?");
options.add("A), B)create a new file, C)a section, D)a slide");
answers.add("D)a slide");

questions.add(" You are creating columns in a text box using the Format Shape menu. What properties of the column can you adjust under the Text Options tab?");
options.add("A)space between lines of text and space between columns, B)number of columns and length of columns, C)only the number of columns, D)number of columns and space between columns");
answers.add("D)number of columns and space between columns");

questions.add(" You would like several of the slides in your presentation to use the same font for the title text. The slides all use the same slide layout. What is the most efficient way to apply the desired font to those slides?");
options.add("A)Change the font on each individual slide as it is added., B)Use the Duplicate Selected Slides command., C)Change the font on the Slide Master for that layout., D)Use the Reuse Slides command.");
answers.add("A)Change the font on the Slide Master for that layout.");

questions.add(" Which tool provides the easiest way to to create and insert an organizational chart into a presentation");
options.add("A)smartArt, B)3D Models, C)shapes, D)charts");
answers.add("A)smartArt");

questions.add(" What can You enable to help align objects on a slide?");
options.add("A)Cascade, B)Arrange all, C)Fit to window, D)Gridlines");
answers.add("D)Gridlines");

questions.add(" Which Bullets and Numbering function should you use to start a numbered list at a value other than 1 ?");
options.add("A)Custom Numer, B)AutoNumber, C)Align Number, D)Start At");
answers.add("D)Start At");

questions.add(" While in Outline view, what does (promoting)) a paragraph do to its placement?");
options.add("A)It copies the paragraph to the PowerPoint clipboard., B)It moves the paragraph down one level in the outline., C)It moves the paragraph up one level in the outline., D)It moves the paragraph to the top of the outline.");
answers.add("B)It moves the paragraph up one level in the outline.");

questions.add(" You want to create the image on the right from the one on the left - i.e., place the blue star behind both of the others. How can you do this with a single command?");
options.add("A)nope, B)Select the blue star and click Send Backward., C)Select the blue star and click Send to Back., D)Select the gold star and click Bring to Front.");
answers.add("B)Select the blue star and click Send to Back.");

questions.add(" How would you ensure a uniform appearance and placement across your slides even though the content might be different?");
options.add("A)Use styles., B)Use embedded fonts., C)Use consistent layouts., D)Use numbered lists.");
answers.add("C)Use consistent layouts.");

questions.add(" When you provide alt text for an image, what type of control are you including?");
options.add("A)password protection, B)layout, C)accessibility, D)presentation");
answers.add("C)accessibility");

questions.add(" In Normal view, which pane is used to add text and reference information for the speaker?In Normal view, which pane is used to add text and reference information for the speaker?");
options.add("A)NotesNotes, B)CommentsComments, C)SlideSlide, D)ReadingReading");
answers.add("A)NotesNotes");

questions.add(" You want to use a chart from an existing Excel file in your presentation. You need to ensure that the data is always up to date in PowerPoint, even when the workbook is updated in Excel. Which method should you use to do this and include only the chart?You want to use a chart from an existing Excel file in your presentation. You need to ensure that the data is always up to date in PowerPoint, even when the workbook is updated in Excel. Which method should you use to do this and include only the chart?");
options.add("A)Copy the chart in Excel and in the presentation and select Paste Special using the Link Data option.Copy the chart in Excel and in the presentation and select Paste Special using the Link Data option., B)Copy the chart in Excel and in the presentation Paste Special using an Embed Workbook option.Copy the chart in Excel and in the presentation Paste Special using an Embed Workbook option., C)Copy the chart in Excel and in the presentation Paste Special as a Picture.Copy the chart in Excel and in the presentation Paste Special as a Picture., D)In the presentation insert an object and select Create from File.In the presentation insert an object and select Create from File.");
answers.add("A)Copy the chart in Excel and in the presentation, and select Paste Special using the Link Data option.Copy the chart in Excel and in the presentation, and select Paste Special using the Link Data option.");

questions.add(" Which type of shape allows you to add text that can be moved around, formatted with styles and effects, or grouped with other objects?Which type of shape allows you to add text that can be moved around, formatted with styles and effects, or grouped with other objects?");
options.add("A)text box, B)iconicon, C)3D model3D model, D)screenshot");
answers.add("A)text box");

questions.add(" How do you eliminate the blank columns on the char, as indicated by the arrow in this image?");
options.add("A)In the Chart in Microsoft PowerPoint window use the sizing handler in the lower-right corner of the range dragging it up to cell D4., B)In the Chart in Microsoft PowerPoint window select the range A5:D5 and press Delete., C)Click the chart and then on the Shape format tab click Edit Shape. Then crop the chart to show only A1:D4., D)Click Change Chart Type.");
answers.add("A)In the Chart in Microsoft PowerPoint window, use the sizing handler in the lower-right corner of the range, dragging it up to cell D4.");

}
    

    
    public static void main(String[]args){
        new MsPowerPoint_Quiz(name).setVisible(true);
    }
    
}
