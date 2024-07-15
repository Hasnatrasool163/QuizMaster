package firstListFrames;

/**
 *
 * @author MuhammadHasnatRasool
 */
import frame.Quiz;
import java.awt.event.ActionEvent;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Css_Quiz extends Quiz {

    public Css_Quiz(String name) {
        super(name);
        loadQuestions();

        for (int i = 0; i < questions.size(); i++) {
            indices.add(i);
        }
        Collections.shuffle(indices);
        System.out.println(indices);

        String input = null;
        // Select number of questions
        while (input == null || input.isEmpty()) {
            input = JOptionPane.showInputDialog("Enter number of questions : (1- " + questions.size() + ")");
        }
        totalQuestions = Integer.parseInt(input);
        if (totalQuestions < 1 || totalQuestions > questions.size()) {
            JOptionPane.showMessageDialog(null, "5 mcqs set as a default value!");
            totalQuestions = 5;
        }

        // Set the current question index to 0
        currentQuestionIndex = indices.get(0);

//         Set the question text and options
        qno.setText("question #: " + currentQuestionNumber);
        question.setText(questions.get(currentQuestionIndex));
        opt1.setText(options.get(currentQuestionIndex).split(", ")[0]);
        opt2.setText(options.get(currentQuestionIndex).split(", ")[1]);
        opt3.setText(options.get(currentQuestionIndex).split(", ")[2]);
        opt4.setText(options.get(currentQuestionIndex).split(", ")[3]);
    }

    // css quiz 35
    @Override
    public final void loadQuestions() {

        questions.add("What does CSS stand for?");
        options.add("A) Creative Style Sheets, B) Cascading Style Sheets, C) Computer Style Sheets, D) Colorful Style Sheets");
        answers.add("B) Cascading Style Sheets");

        questions.add("Which CSS property is used to change the text color of an element?");
        options.add("A) text-color, B) color, C) font-color, D) bgcolor");
        answers.add("B) color");

        questions.add("Which CSS property controls the text size?");
        options.add("A) font-size, B) text-style, C) font-style, D) text-size");
        answers.add("A) font-size");

        questions.add("Which CSS property is used to make text bold?");
        options.add("A) font-weight, B) bold, C) text-style, D) font-style");
        answers.add("A) font-weight");

        questions.add("Which CSS property controls the spacing between lines of text?");
        options.add("A) line-spacing, B) spacing, C) line-height, D) text-spacing");
        answers.add("C) line-height");

        questions.add("Which CSS property is used to change the left margin of an element?");
        options.add("A) padding-left, B) margin-left, C) indent-left, D) spacing-left");
        answers.add("B) margin-left");

        questions.add("Which CSS property is used to underline text?");
        options.add("A) text-decoration: underline;, B) text-decoration-style: underline;, C) font-decoration: underline;, D) decoration: underline;");
        answers.add("A) text-decoration: underline;");

        questions.add("Which CSS property controls the size of the space between elements in a list?");
        options.add("A) spacing, B) list-space, C) list-spacing, D) margin");
        answers.add("D) margin");

        questions.add("Which CSS property is used to change the background color of an element?");
        options.add("A) background-color, B) color-background, C) bgcolor, D) background");
        answers.add("A) background-color");

        questions.add("Which CSS property is used to change the font of an element?");
        options.add("A) font-family, B) font-style, C) font-variant, D) font");
        answers.add("A) font-family");

        questions.add("How do you add a background color for all <h1> elements?");
        options.add("A) all.h1 {background-color:#FFFFFF;}, B) h1 {background-color:#FFFFFF;}, C) h1.all {background-color:#FFFFFF;}, D) h1#all {background-color:#FFFFFF;}");
        answers.add("B) h1 {background-color:#FFFFFF;}");

        questions.add("How do you select an element with id 'demo'?");
        options.add("A) .demo, B) *demo, C) #demo, D) $demo");
        answers.add("C) #demo");

        questions.add("How do you select elements with class name 'test'?");
        options.add("A) #test, B) .test, C) test, D) *test");
        answers.add("B) .test");

        questions.add("How do you group selectors?");
        options.add("A) Separate each selector with a comma, B) Separate each selector with a plus sign, C) Separate each selector with a space, D) Separate each selector with a period");
        answers.add("A) Separate each selector with a comma");

        questions.add("How do you apply a style to an element when a user mouses over it?");
        options.add("A) :hover, B) :mouseover, C) :mouse-over, D) :onmouseover");
        answers.add("A) :hover");

        questions.add("How do you make a list that lists its items with squares?");
        options.add("A) list-type: square;, B) list-style-type: square;, C) list: square;, D) list-style: square;");
        answers.add("B) list-style-type: square;");

        questions.add("How do you change the font of an element?");
        options.add("A) font: Arial;, B) font-family: Arial;, C) font-type: Arial;, D) font-name: Arial;");
        answers.add("B) font-family: Arial;");

        questions.add("How do you prevent a floated image from flowing outside the container?");
        options.add("A) float: left;, B) float: right;, C) float: center;, D) float: none;");
        answers.add("D) float: none;");

        questions.add("How do you create a fixed-width layout with CSS?");
        options.add("A) Set the width of the container to a fixed number of pixels;, B) Set the layout to fixed-width;, C) Use the fixed-width property in CSS;, D) Use pixels for all measurements in the layout;");
        answers.add("A) Set the width of the container to a fixed number of pixels;");

        questions.add("How do you make a rounded corner with CSS3?");
        options.add("A) border-style: rounded;, B) border-corner: round;, C) border-radius: 10px;, D) corner-radius: 10px;");
        answers.add("C) border-radius: 10px;");

        questions.add("How do you make the text bold using CSS?");
        options.add("A) font-weight: bold;, B) font: bold;, C) style: bold;, D) text-weight: bold;");
        answers.add("A) font-weight: bold;");

        questions.add("What is the purpose of the box-sizing property in CSS?");
        options.add("A) To control the layout of an element, B) To control the size of an element, C) To control the padding of an element, D) To control the border of an element");
        answers.add("B) To control the size of an element");

        questions.add("Which CSS property is used to add a background image to an element?");
        options.add("A) background-color, B) background-image, C) background-repeat, D) background-position");
        answers.add("B) background-image");

        questions.add("What is the difference between the margin and padding properties in CSS?");
        options.add("A) margin is used for spacing between elements padding is used for spacing within an element, B) margin is used for spacing within an element padding is used for spacing between elements, C) margin is used for layout padding is used for design, D) margin is used for design padding is used for layout");
        answers.add("A) margin is used for spacing between elements padding is used for spacing within an element");

        questions.add("How do you center an element horizontally in CSS?");
        options.add("A) By using the text-align property, B) By using the margin property, C) By using the padding property, D) By using the position property");
        answers.add("B) By using the margin property");

        questions.add("What is the purpose of the display property in CSS?");
        options.add("A) To control the layout of an element, B) To control the size of an element, C) To control the visibility of an element, D) To control the position of an element");
        answers.add("A) To control the layout of an element");

        questions.add("Which CSS property is used to add a border to an element?");
        options.add("A) border-width, B) border-style, C) border-color, D) border-radius");
        answers.add("B) border-style");

        questions.add("How do you create a responsive design in CSS?");
        options.add("A) By using media queries, B) By using flexible grids, C) By using images, D) By using tables");
        answers.add("A) By using media queries");

        questions.add("What is the purpose of the float property in CSS?");
        options.add("A) To control the layout of an element, B) To control the size of an element, C) To control the position of an element, D) To control the display of an element");
        answers.add("A) To control the layout of an element");

        questions.add("Which CSS property is used to add a shadow to an element?");
        options.add("A) box-shadow, B) text-shadow, C) border-shadow, D) background-shadow");
        answers.add("A) box-shadow");

        questions.add("How do you create a CSS animation?");
        options.add("A) By using the animation property, B) By using the transition property, C) By using the transform property, D) By using the keyframes rule");
        answers.add("D) By using the keyframes rule");

        questions.add("What is the purpose of the z-index property in CSS?");
        options.add("A) To control the position of an element, B) To control the size of an element, C) To control the display of an element, D) To control the stacking order of elements");
        answers.add("D) To control the stacking order of elements");

        questions.add("Which CSS property is used to add a background color to an element?");
        options.add("A) background-color, B) background-image, C) background-repeat, D) background-position");
        answers.add("A) background-color");

        questions.add("How do you create a CSS grid?");
        options.add("A) By using the grid property, B) By using the flex property, C) By using the table property, D) By using the block property");
        answers.add("A) By using the grid property");

        questions.add("What is the purpose of the cursor property in CSS?");
        options.add("A) To control the shape of the cursor, B) To control the size of the cursor, C) To control the color of the cursor, D) To control the behavior of the cursor");
        answers.add("D) To control the behavior of the cursor");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
    }

    public static void main(String[] args) {
        new Css_Quiz(name).setVisible(true);
    }
}
