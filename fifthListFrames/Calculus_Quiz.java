package fifthListFrames;


import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */
public class Calculus_Quiz extends Quiz{
    

    public Calculus_Quiz(String name) {
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

// questions:20
    @Override
    public final void loadQuestions() {

        questions.add("What is the derivative of x^2 + 3x?");
        options.add("A) 2x + 3, B) 2x - 3, C) x + 3, D) x - 3");
        answers.add("A) 2x + 3");

        questions.add("What is the integral of x^2 dx from 0 to 1?");
        options.add("A) 1/3, B) 1/2, C) 2/3, D) 1");
        answers.add("A) 1/3");

        questions.add("What is the limit as x approaches 0 of (sin(x))/x?");
        options.add("A) 0, B) 1, C) -1, D) infinity");
        answers.add("B) 1");

        questions.add("What is the derivative of e^x?");
        options.add("A) e^x, B) -e^x, C) x_e^x, D) x^2_e^x");
        answers.add("A) e^x");

        questions.add("What is the integral of e^x dx from 0 to infinity?");
        options.add("A) 1, B) -1, C) 0, D) infinity");
        answers.add("A) 1");

        questions.add("What is the derivative of ln(x)?");
        options.add("A) 1/x, B) -1/x, C) x, D) -x");
        answers.add("A) 1/x");

        questions.add("What is the integral of (1/x) dx from 1 to e?");
        options.add("A) 1, B) -1, C) 0, D) ln(e)");
        answers.add("D) ln(e)");

        questions.add("What is the derivative of sin(x)?");
        options.add("A) cos(x), B) -cos(x), C) sin(x), D) -sin(x)");
        answers.add("A) cos(x)");

        questions.add("What is the integral of cos(x) dx from 0 to pi?");
        options.add("A) 0, B) 1, C) -1, D) 2");
        answers.add("A) 0");

        questions.add("What is the limit as x approaches infinity of (e^x)/(x^2)?");
        options.add("A) 0, B) 1, C) infinity, D) -infinity");
        answers.add("C) infinity");

        questions.add("What is the derivative of x^3 + 2x^2 - 3x?");
        options.add("A) 3x^2 + 4x - 3, B) 3x^2 - 4x + 3, C) x^2 + 2x - 3, D) x^2 - 2x + 3");
        answers.add("A) 3x^2 + 4x - 3");
        
        questions.add("What is the derivative of x^4 - 4x^3 + 7x^2?");
        options.add("A) 4x^3 - 12x^2 + 14x, B) 4x^3 + 12x^2 - 14x, C) x^3 - 4x^2 + 7x, D) x^3 + 4x^2 - 7x");
        answers.add("A) 4x^3 - 12x^2 + 14x");

        questions.add("What is the integral of x^3 dx from 0 to 2?");
        options.add("A) 4, B) 8, C) 12, D) 16");
        answers.add("B) 8");

        questions.add("What is the limit as x approaches 2 of (x^2 - 4)/(x - 2)?");
        options.add("A) 0, B) 2, C) 4, D) infinity");
        answers.add("C) 4");

        questions.add("What is the derivative of cos(2x)?");
        options.add("A) -2sin(2x), B) 2sin(2x), C) -sin(2x), D) sin(2x)");
        answers.add("A) -2sin(2x)");

        questions.add("What is the integral of e^2x dx from 0 to 1?");
        options.add("A) 1/2, B) 1, C) 2, D) e^2");
        answers.add("C) 2");

        questions.add("What is the derivative of x^2_sin(x)?");
        options.add("A) 2x_sin(x) + x^2_cos(x), B) 2x_sin(x) - x^2_cos(x), C) x_sin(x) + x^2_cos(x), D) x_sin(x) - x^2_cos(x)");
        answers.add("A) 2x_sin(x) + x^2*cos(x)");

        questions.add("What is the integral of (x+1)/(x^2+2x+1) dx from 0 to 1?");
        options.add("A) 1/2, B) 1, C) 3/2, D) 2");
        answers.add("B) 1");

        questions.add("What is the limit as x approaches infinity of (x^2)/(e^x)?");
        options.add("A) 0, B) 1, C) infinity, D) -infinity");
        answers.add("A) 0");

        questions.add("What is the derivative of x^3_e^x?");
        options.add("A) 3x^2_e^x + x^3_e^x, B) 3x^2_e^x - x^3_e^x, C) x^2_e^x + x^3_e^x, D) x^2_e^x - x^3_e^x");
        answers.add("A) 3x^2_e^x + x^3*e^x");
    }
    

    public static void main(String[]args){
        new Calculus_Quiz(name).setVisible(true);
    }
    
}

// graphics related

//questions.add("What is the purpose of a graphics driver?");
//options.add("A) To display text on the screen, B) To control the keyboard and mouse, C) To render images on the screen, D) To connect to the internet");
//answers.add("C) To render images on the screen");
//
//questions.add("What is the difference between a bitmap and a vector graphic?");
//options.add("A) A bitmap is a vector graphic, B) A bitmap is a raster graphic, C) A vector graphic is a bitmap, D) A vector graphic is a 3D graphic");
//answers.add("B) A bitmap is a raster graphic");
//
//questions.add("What is the term for the process of converting a vector graphic into a bitmap?");
//options.add("A) Rasterization, B) Vectorization, C) Rendering, D) Scaling");
//answers.add("A) Rasterization");
//
//questions.add("What is the purpose of a graphics processing unit (GPU)?");
//options.add("A) To control the keyboard and mouse, B) To render images on the screen, C) To connect to the internet, D) To perform calculations");
//answers.add("B) To render images on the screen");
//
//questions.add("What is the term for the study of computer graphics?");
//options.add("A) Computer science, B) Graphic design, C) Computer graphics, D) Animation");
//answers.add("C) Computer graphics");
//
//questions.add("What is the difference between a 2D and 3D graphic?");
//options.add("A) A 2D graphic is a 3D graphic, B) A 2D graphic is a flat image, C) A 3D graphic is a flat image, D) A 2D graphic is a vector graphic");
//answers.add("B) A 2D graphic is a flat image");
//
//questions.add("What is the term for the process of creating a 3D model from a 2D image?");
//options.add("A) Rendering, B) Rasterization, C) Vectorization, D) Extrusion");
//answers.add("D) Extrusion");
//
//questions.add("What is the purpose of a texture map in computer graphics?");
//options.add("A) To add color to a 3D model, B) To add depth to a 2D image, C) To add texture to a 3D model, D) To add animation to a 3D model");
//answers.add("C) To add texture to a 3D model");
//
//questions.add("What is the term for the study of computer animation?");
//options.add("A) Computer science, B) Graphic design, C) Computer graphics, D) Animation");
//answers.add("D) Animation");
//
//questions.add("What is the difference between a sprite and a 3D model?");
//options.add("A) A sprite is a 3D model, B) A sprite is a 2D image, C) A 3D model is a 2D image, D) A sprite is a vector graphic");
//answers.add("B) A sprite is a 2D image");
//
//questions.add("What is the term for the process of rendering a 3D scene in real-time?");
//options.add("A) Rendering, B) Rasterization, C) Vectorization, D) Ray tracing");
//answers.add("A) Rendering");
//
//questions.add("What is the purpose of a shader in computer graphics?");
//options.add("A) To add color to a 3D model, B) To add depth to a 2D image, C) To add texture to a 3D model, D) To calculate lighting and shading");
//answers.add("D) To calculate lighting and shading");
//
//questions.add("What is the term for the study of human-computer interaction?");
//options.add("A) Computer science, B) Graphic design, C) Human-computer interaction, D) Animation");
//answers.add("C) Human-computer interaction");
//
//questions.add("What is the difference between a GUI and a CLI?");
//options.add("A) A GUI is a CLI, B) A GUI is a graphical user interface, C) A CLI is a graphical user interface, D) A GUI is a command-line interface");
//answers.add("B) A GUI is a graphical user interface");
//
//questions.add("What is the term for the process of designing a user interface?");
//options.add("A) User experience design, B) Graphic design, C) Web design, D) Interface design");
//answers.add("A) User experience design");
//
//questions.add("What is the purpose of a wireframe in graphic design?");
//options.add("A) To create a final design, B) To create a prototype, C) To plan a layout, D) To test a design");
//answers.add("C) To plan a layout");