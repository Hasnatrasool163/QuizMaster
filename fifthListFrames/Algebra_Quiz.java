package fifthListFrames;


import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */
public class Algebra_Quiz extends Quiz{
    

    public Algebra_Quiz(String name) {
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


    // questions: 37
    @Override
    public final void loadQuestions() {

        questions.add("What is the value of x in the equation 2x + 5 = 11?");
        options.add("A) 2, B) 3, C) 4, D) 5");
        answers.add("B) 3");

        questions.add("What is the slope of the line passing through the points (2,3) and (4,5)?");
        options.add("A) 1/2, B) 1, C) 3/2, D) 2");
        answers.add("C) 3/2");

        questions.add("What is the equation of the line perpendicular to the line 2x + 3y = 5?");
        options.add("A) 3x - 2y = 0, B) 2x + 3y = 0, C) x + 2y = 0, D) x - 3y = 0");
        answers.add("A) 3x - 2y = 0");

        questions.add("What is the value of x in the equation x^2 + 4x - 5 = 0?");
        options.add("A) -5, B) -1, C) 1, D) 5");
        answers.add("B) -1");

        questions.add("What is the equation of the circle with center (0,0) and radius 3?");
        options.add("A) x^2 + y^2 = 9, B) x^2 - y^2 = 9, C) x^2 + y^2 = -9, D) x^2 - y^2 = -9");
        answers.add("A) x^2 + y^2 = 9");

        questions.add("What is the value of x in the equation 3x - 2 = 11?");
        options.add("A) 3, B) 4, C) 5, D) 6");
        answers.add("C) 5");

        questions.add("What is the slope of the line passing through the points (1,2) and (3,4)?");
        options.add("A) 1/2, B) 1, C) 3/2, D) 2");
        answers.add("B) 1");

        questions.add("What is the equation of the line parallel to the line x + 2y = 3?");
        options.add("A) x - 2y = 0, B) x + 2y = 0, C) 2x + y = 0, D) 2x - y = 0");
        answers.add("B) x + 2y = 0");

        questions.add("What is the value of x in the equation x^3 - 2x^2 - 5x + 6 = 0?");
        options.add("A) -1, B) 1, C) 2, D) 3");
        answers.add("B) 1");

        questions.add("What is the equation of the ellipse with foci at (0,+-2) and vertices at (0,+-3)?");
        options.add("A) x^2/4 + y^2/9 = 1, B) x^2/9 + y^2/4 = 1, C) x^2/9 + y^2/9 = 1, D) x^2/4 + y^2/4 = 1");
        answers.add("B) x^2/9 + y^2/4 = 1");

        questions.add("What is the value of x in the equation 2x + 5 = 13?");
        options.add("A) 2, B) 3, C) 4, D) 5");
        answers.add("C) 4");

        questions.add("What is the slope of the line passing through the points (2,1) and (4,3)?");
        options.add("A) 1/2, B) 1, C) 3/2, D) 2");
        answers.add("C) 3/2");

        questions.add("What is the equation of the line perpendicular to the line x - 2y = 3?");
        options.add("A) 2x + y = 0, B) 2x - y = 0, C) x + 2y = 0, D) x - 2y = 0");
        answers.add("A) 2x + y = 0");

        questions.add("What is the value of x in the equation x^2 - 4x - 3 = 0?");
        options.add("A) -1, B) 1, C) 3, D) 5");
        answers.add("C) 3");
        
        questions.add("What is the equation of the circle with center (1,1) and radius 2?");
        options.add("A) (x-1)^2 + (y-1)^2 = 4, B) (x-1)^2 + (y-1)^2 = 2, C) (x+1)^2 + (y+1)^2 = 4, D) (x+1)^2 + (y+1)^2 = 2");
        answers.add("A) (x-1)^2 + (y-1)^2 = 4");

        questions.add("What is the value of x in the equation 3x + 2 = 14?");
        options.add("A) 2, B) 3, C) 4, D) 5");
        answers.add("C) 4");

        questions.add("What is the slope of the line passing through the points (1,3) and (2,5)?");
        options.add("A) 1/2, B) 1, C) 3/2, D) 2");
        answers.add("C) 3/2");

        questions.add("What is the equation of the line parallel to the line 2x + 3y = 5?");
        options.add("A) 2x - 3y = 0, B) 2x + 3y = 0, C) 3x + 2y = 0, D) 3x - 2y = 0");
        answers.add("B) 2x + 3y = 0");
        
        questions.add("What is the equation of the circle with center (2,2) and radius 3?");
        options.add("A) (x-2)^2 + (y-2)^2 = 9, B) (x-2)^2 + (y-2)^2 = 3, C) (x+2)^2 + (y+2)^2 = 9, D) (x+2)^2 + (y+2)^2 = 3");
        answers.add("A) (x-2)^2 + (y-2)^2 = 9");

        questions.add("What is the value of x in the equation 4x + 5 = 25?");
        options.add("A) 3, B) 4, C) 5, D) 6");
        answers.add("C) 5");

        questions.add("What is the slope of the line passing through the points (2,4) and (4,6)?");
        options.add("A) 1/2, B) 1, C) 3/2, D) 2");
        answers.add("B) 1");

        questions.add("What is the equation of the line parallel to the line x - 3y = 2?");
        options.add("A) x + 3y = 0, B) x - 3y = 0, C) 3x + y = 0, D) 3x - y = 0");
        answers.add("B) x - 3y = 0");

        questions.add("What is the value of x in the equation x^3 - 3x^2 - 2x + 12 = 0?");
        options.add("A) -1, B) 1, C) 2, D) 3");
        answers.add("C) 2");

        questions.add("What is the equation of the ellipse with foci at (0,+-3) and vertices at (0,+-4)?");
        options.add("A) x^2/16 + y^2/9 = 1, B) x^2/9 + y^2/16 = 1, C) x^2/9 + y^2/9 = 1, D) x^2/16 + y^2/16 = 1");
        answers.add("B) x^2/9 + y^2/16 = 1");

        questions.add("What is the value of x in the equation 3x + 2 = 17?");
        options.add("A) 3, B) 4, C) 5, D) 6");
        answers.add("C) 5");

        questions.add("What is the slope of the line passing through the points (1,2) and (3,4)?");
        options.add("A) 1/2, B) 1, C) 3/2, D) 2");
        answers.add("B) 1");

        questions.add("What is the equation of the line perpendicular to the line 2x + 5y = 7?");
        options.add("A) 5x - 2y = 0, B) 5x + 2y = 0, C) 2x - 5y = 0, D) 2x + 5y = 0");
        answers.add("A) 5x - 2y = 0");

        questions.add("What is the value of x in the equation x^2 - 4x - 5 = 0?");
        options.add("A) -1, B) 1, C) 5, D) 6");
        answers.add("C) 5");

        questions.add("What is the equation of the circle with center (3,3) and radius 2?");
        options.add("A) (x-3)^2 + (y-3)^2 = 4, B) (x-3)^2 + (y-3)^2 = 2, C) (x+3)^2 + (y+3)^2 = 4, D) (x+3)^2 + (y+3)^2 = 2");
        answers.add("A) (x-3)^2 + (y-3)^2 = 4");

        questions.add("What is the value of x in the equation 2x - 3 = 9?");
        options.add("A) 2, B) 3, C) 4, D) 5");
        answers.add("C) 4");

        questions.add("What is the slope of the line passing through the points (2,3) and (4,5)?");
        options.add("A) 1/2, B) 1, C) 3/2, D) 2");
        answers.add("B) 1");


        questions.add("What is the value of x in the equation x^3 + 2x^2 - 7x - 12 = 0?");
        options.add("A) -1, B) 1, C) 2, D) 3");
        answers.add("C) 2");

        questions.add("What is the equation of the ellipse with foci at (+-2,0) and vertices at (+-3,0)?");
        options.add("A) x^2/4 + y^2/9 = 1, B) x^2/9 + y^2/4 = 1, C) x^2/9 + y^2/9 = 1, D) x^2/4 + y^2/4 = 1");
        answers.add("A) x^2/4 + y^2/9 = 1");

        questions.add("What is the value of x in the equation 2x - 5 = 11?");
        options.add("A) 2, B) 3, C) 4, D) 5");
        answers.add("D) 5");

        questions.add("What is the slope of the line passing through the points (3,2) and (5,4)?");
        options.add("A) 1/2, B) 1, C) 3/2, D) 2");
        answers.add("B) 1");

        questions.add("What is the equation of the line perpendicular to the line 3x + 4y = 7?");
        options.add("A) 4x - 3y = 0, B) 4x + 3y = 0, C) 3x - 4y = 0, D) 3x + 4y = 0");
        answers.add("A) 4x - 3y = 0");

        questions.add("What is the value of x in the equation x^2 + 2x - 6 = 0?");
        options.add("A) -3, B) -1, C) 1, D) 3");
        answers.add("A) -3");
        
        
    }

    public static void main(String[]args){
        new Algebra_Quiz(name).setVisible(true);
    }
    
}
