package firstListFrames;

/**
 * @author MuhammadHasnatRasool
 */
import frame.Quiz;

public class Basic_Quiz extends Quiz {

    public Basic_Quiz(String name) {
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

    @Override
    public final void loadQuestions() {

        /// 31 mcqs
        questions.add("Which keyword is used to start a BASIC program?");
        options.add("A) START, B) BEGIN, C) PROGRAM, D) REM");
        answers.add("B) BEGIN");

        questions.add("How do you print output to the screen in BASIC?");
        options.add("A) PRINT, B) DISPLAY, C) OUTPUT, D) SHOW");
        answers.add("A) PRINT");

        questions.add("Which operator is used for addition in BASIC?");
        options.add("A) +, B) *, C) -, D) /");
        answers.add("A) +");

        questions.add("How do you represent a single-line comment in BASIC?");
        options.add("A) //, B) /* */, C) REM, D) #");
        answers.add("C) REM");

        questions.add("What is the keyword used to end a BASIC program?");
        options.add("A) STOP, B) END, C) FINISH, D) QUIT");
        answers.add("B) END");

        questions.add("Which keyword is used to declare an integer variable in BASIC?");
        options.add("A) INT, B) INTEGER, C) DIM, D) VAR");
        answers.add("C) DIM");

        questions.add("How do you prompt the user for input in BASIC?");
        options.add("A) INPUT, B) GET, C) READ, D) ASK");
        answers.add("A) INPUT");

        questions.add("Which loop is used to execute a block of code a fixed number of times in BASIC?");
        options.add("A) FOR, B) WHILE, C) REPEAT, D) LOOP");
        answers.add("A) FOR");

        questions.add("What is the function used to convert a string to a number in BASIC?");
        options.add("A) VAL, B) STRTOINT, C) CONVERT, D) PARSEINT");
        answers.add("A) VAL");

        questions.add("Which statement is used to make a decision based on a condition in BASIC?");
        options.add("A) IF, B) CASE, C) SWITCH, D) DECIDE");
        answers.add("A) IF");

        questions.add("How do you concatenate two strings in BASIC?");
        options.add("A) +, B) CONCAT, C) & , D) CONCATENATE");
        answers.add("C) &");

        questions.add("BASIC was developed for?");
        options.add("A) Scientists, B) Professionals, C) Students , D) Business");
        answers.add("C) Students");

        questions.add("What is the purpose of the BASIC interpreter?");
        options.add("A) To compile code, B) To execute code, C) To debug code, D) To write code");
        answers.add("B) To execute code");

        questions.add("Which variable type is used to store a true or false value in BASIC?");
        options.add("A) INTEGER, B) STRING, C) BOOLEAN, D) ARRAY");
        answers.add("C) BOOLEAN");

        questions.add("How do you exit a program in BASIC?");
        options.add("A) STOP, B) END, C) QUIT, D) EXIT");
        answers.add("B) END");

        questions.add("Which function is used to get the length of a string in BASIC?");
        options.add("A) LEN, B) LENGTH, C) SIZE, D) STRLEN");
        answers.add("A) LEN");

        questions.add("What is the default data type for variables in BASIC?");
        options.add("A) INTEGER, B) STRING, C) FLOAT, D) VARIANT");
        answers.add("D) VARIANT");

        questions.add("Which statement is used to repeat a block of code in BASIC?");
        options.add("A) FOR, B) WHILE, C) REPEAT, D) LOOP");
        answers.add("B) WHILE");

        questions.add("How do you declare a constant in BASIC?");
        options.add("A) CONST, B) CONSTANT, C) DEFINE, D) SET");
        answers.add("A) CONST");

        questions.add("Which function is used to convert a number to a string in BASIC?");
        options.add("A) STR$, B) STRING$, C) CONVERT$, D) FORMAT$");
        answers.add("A) STR$");

        questions.add("What is the purpose of the GOTO statement in BASIC?");
        options.add("A) To jump to a label, B) To execute a subroutine, C) To repeat a block of code, D) To exit a program");
        answers.add("A) To jump to a label");

        questions.add("Which operator is used for multiplication in BASIC?");
        options.add("A) *, B) -, C) /, D) ^");
        answers.add("A) *");

        questions.add("How do you read data from a file in BASIC?");
        options.add("A) READ, B) INPUT, C) LOAD, D) OPEN");
        answers.add("A) READ");

        questions.add("Which statement is used to execute a block of code based on a condition in BASIC?");
        options.add("A) IF, B) CASE, C) SWITCH, D) DECIDE");
        answers.add("A) IF");

        questions.add("What is the purpose of the DIM statement in BASIC?");
        options.add("A) To declare a variable, B) To assign a value, C) To define a constant, D) To resize an array");
        answers.add("A) To declare a variable");

        questions.add("Which function is used to get the current date and time in BASIC?");
        options.add("A) DATE, B) TIME, C) NOW, D) CLOCK");
        answers.add("C) NOW");

        questions.add("How do you clear the screen in BASIC?");
        options.add("A) CLS, B) CLEAR, C) ERASE, D) RESET");
        answers.add("A) CLS");

        questions.add("Which variable type is used to store an array in BASIC?");
        options.add("A) INTEGER, B) STRING, C) ARRAY, D) VARIANT");
        answers.add("C) ARRAY");

        questions.add("What is the purpose of the ON statement in BASIC?");
        options.add("A) To execute a block of code, B) To jump to a label, C) To repeat a block of code, D) To handle an error");
        answers.add("D) To handle an error");

        questions.add("Which function is used to get the square root of a number in BASIC?");
        options.add("A) SQRT, B) ROOT, C) POWER, D) MATH");
        answers.add("A) SQRT");

        questions.add("How do you write a comment in BASIC?");
        options.add("A) //, B) /* */, C) REM, D) #");
        answers.add("C) REM");
    }


    public static void main(String[] args) {
        new Basic_Quiz(name).setVisible(true);
    }

}
