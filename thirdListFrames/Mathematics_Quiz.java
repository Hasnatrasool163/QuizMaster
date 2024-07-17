package thirdListFrames;

/**
 * @author MuhammadHasnatRasool
 */
import frame.Quiz;
import java.awt.event.ActionEvent;



public class Mathematics_Quiz extends Quiz{
    

    public Mathematics_Quiz(String name) {
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


    // questions:55
    @Override
    public final void loadQuestions() {
        
        questions.add("What is the value of π (pi) correct to two decimal places?");
        options.add("A) 3.12, B) 3.14, C) 3.16, D) 3.18");
        answers.add("B) 3.14");

        questions.add("Which of the following is a prime number?");
        options.add("A) 12, B) 21, C) 29, D) 36");
        answers.add("C) 29");

        questions.add("What is the square root of 144?");
        options.add("A) 10, B) 12, C) 14, D) 16");
        answers.add("B) 12");

        questions.add("Simplify: 3x + 5x - 2x.");
        options.add("A) 6x, B) 8x, C) 10x, D) 12x");
        answers.add("B) 8x");

        questions.add("What is the value of 5^3?");
        options.add("A) 125, B) 250, C) 375, D) 500");
        answers.add("A) 125");

        questions.add("If a triangle has sides of lengths 3 cm, 4 cm, and 5 cm, what type of triangle is it?");
        options.add("A) Equilateral, B) Isosceles, C) Scalene, D) Right-angled");
        answers.add("D) Right-angled");

        questions.add("What is the next prime number after 23?");
        options.add("A) 24, B) 25, C) 26, D) 29");
        answers.add("D) 29");

        questions.add("What is the value of 7! (7 factorial)?");
        options.add("A) 5040, B) 720, C) 120, D) 42");
        answers.add("A) 5040");

        questions.add("If a = 3 and b = 4, what is the value of a^2 + b^2?");
        options.add("A) 5, B) 7, C) 9, D) 25");
        answers.add("D) 25");

        questions.add("What is the solution to the equation 2x + 5 = 15?");
        options.add("A) x = 5, B) x = 6, C) x = 7, D) x = 8");
        answers.add("A) x = 5");

        questions.add("Which of the following is not a prime number?");
        options.add("A) 11, B) 13, C) 15, D) 17");
        answers.add("C) 15");

        questions.add("What is the area of a rectangle with length 8 cm and width 5 cm?");
        options.add("A) 30 cm², B) 35 cm², C) 40 cm², D) 45 cm²");
        answers.add("C) 40 cm²");

        questions.add("Evaluate: 4 × (6 + 3) ÷ 2.");
        options.add("A) 15, B) 18, C) 20, D) 24");
        answers.add("B) 18");

        questions.add("What is the sum of the interior angles of a triangle?");
        options.add("A) 90°, B) 180°, C) 270°, D) 360°");
        answers.add("B) 180°");

        questions.add("If a = 5 and b = 2, what is the value of a - b?");
        options.add("A) 1, B) 2, C) 3, D) 4");
        answers.add("C) 3");

        questions.add("What is the value of 10 ÷ (2 + 3)?");
        options.add("A) 1, B) 2, C) 5, D) 10");
        answers.add("B) 2");

        questions.add("Which of the following numbers is a perfect square?");
        options.add("A) 25, B) 27, C) 32, D) 36");
        answers.add("A) 25");

        questions.add("What is the value of 2^4 × 2^3?");
        options.add("A) 8, B) 16, C) 32, D) 64");
        answers.add("D) 64");

        questions.add("If a circle has a diameter of 10 cm, what is its radius?");
        options.add("A) 2 cm, B) 5 cm, C) 7.5 cm, D) 10 cm");
        answers.add("B) 5 cm");

        questions.add("What is the value of 3^2 + 4^2?");
        options.add("A) 17, B) 25, C) 29, D) 34");
        answers.add("B) 25");

        questions.add("If x = 4 and y = 3, what is the value of 2x + 3y?");
        options.add("A) 11, B) 12, C) 13, D) 14");
        answers.add("B) 12");

        questions.add("What is the value of 8 ÷ 0.5?");
        options.add("A) 4, B) 8, C) 12, D) 16");
        answers.add("D) 16");

        questions.add("Which of the following is a composite number?");
        options.add("A) 7, B) 11, C) 13, D) 15");
        answers.add("D) 15");

        questions.add("If a square has a side length of 6 cm, what is its area?");
        options.add("A) 24 cm², B) 30 cm², C) 36 cm², D) 42 cm²");
        answers.add("C) 36 cm²");

        questions.add("What is the value of √25?");
        options.add("A) 4, B) 5, C) 6, D) 7");
        answers.add("B) 5");

        questions.add("Which of the following is equivalent to 0.25?");
        options.add("A) 1/2, B) 1/4, C) 1/5, D) 1/8");
        answers.add("B) 1/4");

        questions.add("What is the value of 12 ÷ 4 + 3 × 2?");
        options.add("A) 7, B) 8, C) 9, D) 10");
        answers.add("B) 8");

        questions.add("If a triangle has sides of lengths 7 cm, 8 cm, and 9 cm, what type of triangle is it?");
        options.add("A) Equilateral, B) Isosceles, C) Scalene, D) Right-angled");
        answers.add("C) Scalene");

        questions.add("What is the value of 2^5?");
        options.add("A) 24, B) 30, C) 32, D) 40");
        answers.add("C) 32");

        questions.add("If x = 3 and y = 4, what is the value of x^2 + y^2?");
        options.add("A) 9, B) 12, C) 15, D) 25");
        answers.add("D) 25");

        questions.add("What is the solution to the equation 3x - 7 = 11?");
        options.add("A) x = 2, B) x = 4, C) x = 6, D) x = 8");
        answers.add("B) x = 6");

        questions.add("Which of the following is a rational number?");
        options.add("A) √2, B) π, C) 0.5, D) e");
        answers.add("C) 0.5");

        questions.add("What is the area of a circle with radius 5 cm (use π = 3.14)?");
        options.add("A) 31.4 cm², B) 39.25 cm², C) 50 cm², D) 78.5 cm²");
        answers.add("D) 78.5 cm²");

        questions.add("Evaluate: 3 × (4 + 2) ÷ 2.");
        options.add("A) 7, B) 9, C) 10, D) 12");
        answers.add("D) 12");

        questions.add("What is the sum of the first 10 positive integers?");
        options.add("A) 45, B) 50, C) 55, D) 60");
        answers.add("C) 55");

        questions.add("If a = 6 and b = 2, what is the value of a ÷ b?");
        options.add("A) 2, B) 3, C) 4, D) 5");
        answers.add("B) 3");

        questions.add("What is the value of 4^3?");
        options.add("A) 64, B) 128, C) 256, D) 512");
        answers.add("A) 64");

        questions.add("What is the next perfect square after 49?");
        options.add("A) 50, B) 64, C) 81, D) 100");
        answers.add("B) 64");

        questions.add("If a rectangle has a perimeter of 30 cm and a width of 4 cm, what is its length?");
        options.add("A) 5 cm, B)11 cm, C) 9 cm, D) 8 cm");
        answers.add("B) 11 cm");

        questions.add("What is the value of 15% of 80?");
        options.add("A) 10, B) 12, C) 15, D) 18");
        answers.add("B) 12");

        questions.add("If x = 7 and y = 2, what is the value of 3x - 2y?");
        options.add("A) 15, B) 17, C) 19, D) 21");
        answers.add("A) 15");

        questions.add("What is the value of 2.5 × 4?");
        options.add("A) 8, B) 9, C) 10, D) 12.5");
        answers.add("C) 10");

        questions.add("What is the value of 7^2?");
        options.add("A) 49, B) 56, C) 63, D) 72");
        answers.add("A) 49");

        questions.add("If a square has a diagonal of 10 cm, what is its side length?");
        options.add("A) 5 cm, B) 7 cm, C) 8 cm, D) 10 cm");
        answers.add("B) 7 cm");

        questions.add("What is the value of 18 ÷ 3 × 2?");
        options.add("A) 6, B) 8, C) 9, D) 12");
        answers.add("D) 12");

        questions.add("Which of the following numbers is a prime number?");
        options.add("A) 41, B) 42, C) 43, D) 44");
        answers.add("C) 43");

        questions.add("What is the value of 3^3?");
        options.add("A) 27, B) 30, C) 33, D) 36");
        answers.add("A) 27");

        questions.add("If a = 4 and b = 3, what is the value of a² - b²?");
        options.add("A) 1, B) 7, C) 9, D) 16");
        answers.add("B) 7");

        questions.add("What is the solution to the equation 4x = 24?");
        options.add("A) x = 4, B) x = 5, C) x = 6, D) x = 7");
        answers.add("C) x = 6");

        questions.add("Which of the following is not a composite number?");
        options.add("A) 10, B) 12, C) 14, D) 15");
        answers.add("A) 10");

        questions.add("What is the value of 0.2 × 0.3?");
        options.add("A) 0.06, B) 0.08, C) 0.12, D) 0.18");
        answers.add("A) 0.06");

        questions.add("What is the value of √16?");
        options.add("A) 2, B) 3, C) 4, D) 5");
        answers.add("C) 4");

        questions.add("Which of the following is equivalent to 0.125?");
        options.add("A) 1/8, B) 1/4, C) 1/3, D) 1/2");
        answers.add("A) 1/8");

        questions.add("What is the value of 6 ÷ (2 × 3)?");
        options.add("A) 1, B) 2, C) 3, D) 4");
        answers.add("A) 1");

        questions.add("If a triangle has sides of lengths 5 cm, 5 cm, and 5 cm, what type of triangle is it?");
        options.add("A) Equilateral, B) Isosceles, C) Scalene, D) Right-angled");
        answers.add("A) Equilateral");
    }
    
 
    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
    }
    
    public static void main(String[]args){
        new Mathematics_Quiz(name).setVisible(true);
    }
    
}
