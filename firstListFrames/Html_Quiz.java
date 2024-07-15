package firstListFrames;

/**
 * @author MuhammadHasnatRasool
 */
import frame.Quiz;

public class Html_Quiz extends Quiz {

    public Html_Quiz(String name) {
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
//45
    @Override
     public final void loadQuestions() {

        questions.add("What does HTML stand for?");
        options.add("A) Hyper Text Markup Language, B) High Text Markup Language, C) Hyperlinks and Text Markup Language, D) Home Tool Markup Language");
        answers.add("A) Hyper Text Markup Language");

        questions.add("Which HTML tag is used to define an internal style sheet?");
        options.add("A) <style>, B) <css>, C) <script>, D) <link>");
        answers.add("A) <style>");

        questions.add("How do you create an ordered list (<ol>) with lowercase Roman numerals?");
        options.add("A) <ol type=\"i\">, B) <ol style=\"list-style-type: lower-roman;\">, C) <ol style=\"list-style-type: i;\">, D) <ol list-type=\"roman\">");
        answers.add("B) <ol style=\"list-style-type: lower-roman;\">");

        questions.add("Which HTML tag is used to define a hyperlink?");
        options.add("A) <a>, B) <link>, C) <href>, D) <hyperlink>");
        answers.add("A) <a>");

        questions.add("How can you make a numbered list in HTML?");
        options.add("A) <list>, B) <ul>, C) <ol>, D) <li>");
        answers.add("C) <ol>");

        questions.add("Which attribute is used to specify that an input field must be filled out in HTML?");
        options.add("A) validate, B) placeholder, C) required, D) mandatory");
        answers.add("C) required");

        questions.add("What is the correct HTML for creating a hyperlink?");
        options.add("A) <a href=\"http://www.example.com\">Example</a>, B) <link>http://www.example.com</link>, C) <href=\"http://www.example.com\">Example</href>, D) <hyperlink=\"http://www.example.com\">Example</hyperlink>");
        answers.add("A) <a href=\"http://www.example.com\">Example</a>");

        questions.add("Which HTML attribute specifies an alternate text for an image?");
        options.add("A) alt, B) title, C) src, D) image");
        answers.add("A) alt");

        questions.add("What does the <br> tag do in HTML?");
        options.add("A) Adds a line break, B) Defines a bold text, C) Defines a break point, D) Adds a bullet point");
        answers.add("A) Adds a line break");

        questions.add("How do you create a comment in HTML?");
        options.add("A) <!-- This is a comment -->, B) // This is a comment, C) /* This is a comment */, D) <comment>This is a comment</comment>");
        answers.add("A) <!-- This is a comment -->");

        questions.add("Which HTML tag is used to define a table row?");
        options.add("A) <tr>, B) <td>, C) <table>, D) <row>");
        answers.add("A) <tr>");

        questions.add("How do you add a background color to an HTML element?");
        options.add("A) bgcolor=\"yellow\", B) background-color: yellow;, C) <background>yellow</background>, D) <color>yellow</color>");
        answers.add("B) background-color: yellow;");

        questions.add("What is the correct HTML for making a checkbox?");
        options.add("A) <input type=\"check\">, B) <input type=\"checkbox\">, C) <checkbox>, D) <check>");
        answers.add("B) <input type=\"checkbox\">");

        questions.add("Which attribute is used to define inline styles in HTML?");
        options.add("A) style, B) css, C) class, D) inline");
        answers.add("A) style");

        questions.add("How do you add a tooltip to an element in HTML?");
        options.add("A) title=\"This is a tooltip\", B) tooltip=\"This is a tooltip\", C) <tooltip>This is a tooltip</tooltip>, D) alt=\"This is a tooltip\"");
        answers.add("A) title=\"This is a tooltip\"");

        questions.add("Which HTML tag is used to define a footer for a document or section?");
        options.add("A) <footer>, B) <bottom>, C) <end>, D) <foot>");
        answers.add("A) <footer>");

        questions.add("How do you create a new paragraph in HTML?");
        options.add("A) <p>, B) <paragraph>, C) <br>, D) <new>");
        answers.add("A) <p>");

        questions.add("What is the correct HTML for inserting an image?");
        options.add("A) <img src=\"image.jpg\" alt=\"Image\">, B) <image src=\"image.jpg\" alt=\"Image\">, C) <picture src=\"image.jpg\" alt=\"Image\">, D) <source src=\"image.jpg\" alt=\"Image\">");
        answers.add("A) <img src=\"image.jpg\" alt=\"Image\">");

        questions.add("Which attribute is used to provide additional information about an element in HTML?");
        options.add("A) info, B) title, C) description, D) meta");
        answers.add("B) title");

        questions.add("How do you create a hyperlink that opens in a new tab in HTML?");
        options.add("A) <a href=\"http://www.example.com\" target=\"_blank\">Example</a>, B) <a href=\"http://www.example.com\" newtab>Example</a>, C) <a href=\"http://www.example.com\" tab=\"_blank\">Example</a>, D) <a href=\"http://www.example.com\" open=\"new\">Example</a>");
        answers.add("A) <a href=\"http://www.example.com\" target=\"_blank\">Example</a>");

        questions.add("Which HTML attribute is used to define inline styles?");
        options.add("A) class, B) style, C) css, D) font");
        answers.add("B) style");

        questions.add("How do you create a button in HTML?");
        options.add("A) <button>, B) <input type=\"button\">, C) <input>, D) <btn>");
        answers.add("A) <button>");

        questions.add("Which tag is used to define a section in an HTML document?");
        options.add("A) <div>, B) <section>, C) <article>, D) <part>");
        answers.add("B) <section>");

        questions.add("What is the correct HTML for playing audio files?");
        options.add("A) <audio src=\"sound.mp3\" controls>, B) <sound src=\"sound.mp3\" controls>, C) <mp3 src=\"sound.mp3\" controls>, D) <music src=\"sound.mp3\" controls>");
        answers.add("A) <audio src=\"sound.mp3\" controls>");

        questions.add("How do you create a horizontal line in HTML?");
        options.add("A) <line>, B) <hr>, C) <horizontal>, D) <hl>");
        answers.add("B) <hr>");

        questions.add("Which HTML attribute specifies the URL of the page the link goes to?");
        options.add("A) link, B) src, C) href, D) url");
        answers.add("C) href");

        questions.add("How do you create a text input field in HTML?");
        options.add("A) <input type=\"text\">, B) <textinput>, C) <input>, D) <field>");
        answers.add("A) <input type=\"text\">");

        questions.add("What is the correct HTML for making a text input field required?");
        options.add("A) <input type=\"text\" required>, B) <input type=\"text\" validate=\"required\">, C) <input type=\"text\" validate>, D) <input type=\"text\" mandatory>");
        answers.add("A) <input type=\"text\" required>");

        questions.add("Which HTML tag is used to define a navigation menu?");
        options.add("A) <nav>, B) <menu>, C) <navbar>, D) <navigation>");
        answers.add("A) <nav>");

        questions.add("How do you create a drop-down list in HTML?");
        options.add("A) <list>, B) <dropdown>, C) <select>, D) <option>");
        answers.add("C) <select>");

        questions.add("What does the <iframe> tag do in HTML?");
        options.add("A) Embeds another HTML page within the current page, B) Creates a frame around an element, C) Inserts an image, D) Adds a video");
        answers.add("A) Embeds another HTML page within the current page");

        questions.add("Which attribute is used to specify the source of an image in HTML?");
        options.add("A) href, B) src, C) link, D) path");
        answers.add("B) src");

        questions.add("How do you make text bold in HTML?");
        options.add("A) <b>, B) <strong>, C) <bold>, D) Both <b> and <strong>");
        answers.add("D) Both <b> and <strong>");

        questions.add("Which HTML tag is used to define a description list?");
        options.add("A) <dl>, B) <list>, C) <ul>, D) <ol>");
        answers.add("A) <dl>");

        questions.add("How do you create a checkbox in HTML?");
        options.add("A) <input type=\"checkbox\">, B) <checkbox>, C) <input type=\"check\">, D) <input type=\"box\">");
        answers.add("A) <input type=\"checkbox\">");

        questions.add("Which HTML tag is used to define emphasized text?");
        options.add("A) <em>, B) <i>, C) <italic>, D) <strong>");
        answers.add("A) <em>");

        questions.add("How do you create a radio button in HTML?");
        options.add("A) <input type=\"radio\">, B) <radio>, C) <input type=\"button\">, D) <input type=\"option\">");
        answers.add("A) <input type=\"radio\">");

        questions.add("Which HTML tag is used to define preformatted text?");
        options.add("A) <pre>, B) <formatted>, C) <code>, D) <text>");
        answers.add("A) <pre>");

        questions.add("What is the correct HTML for making a text area?");
        options.add("A) <textarea>, B) <input type=\"textarea\">, C) <text>, D) <input type=\"text\">");
        answers.add("A) <textarea>");

        questions.add("Which attribute is used to specify the width of an image in HTML?");
        options.add("A) width, B) size, C) dimension, D) length");
        answers.add("A) width");

        questions.add("What is the correct HTML for adding a background color?");
        options.add("A) <body style=\"background-color: yellow;\">, B) <background>yellow</background>, C) <body bg=\"yellow\">, D) <body color=\"yellow\">");
        answers.add("A) <body style=\"background-color: yellow;\">");

        questions.add("How do you define an unordered list in HTML?");
        options.add("A) <ul>, B) <ol>, C) <list>, D) <unordered>");
        answers.add("A) <ul>");

        questions.add("Which attribute is used to specify the character encoding in HTML?");
        options.add("A) charset, B) encoding, C) lang, D) code");
        answers.add("A) charset");

        questions.add("What does the <head> tag in HTML contain?");
        options.add("A) Metadata and links to external resources, B) The main content of the page, C) The footer content, D) The navigation menu");
        answers.add("A) Metadata and links to external resources");

        questions.add("How do you create an email link in HTML?");
        options.add("A) <a href=\"mailto:someone@example.com\">Email</a>, B) <a href=\"email:someone@example.com\">Email</a>, C) <a href=\"mail:someone@example.com\">Email</a>, D) <a href=\"someone@example.com\">Email</a>");
        answers.add("A) <a href=\"mailto:someone@example.com\">Email</a>");
    }


    public static void main(String[] args) {
        new Html_Quiz(name).setVisible(true);
    }

}
