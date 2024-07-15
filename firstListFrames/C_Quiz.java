package firstListFrames;

/**
 * @author MuhammadHasnatRasool
 */
import frame.Quiz;

public class C_Quiz extends Quiz{
    

    public C_Quiz(String name) {
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


  // 77 mcqs
    
    @Override
    public final void loadQuestions() {
       
        questions.add("What is the basic syntax to print output in C?");
        options.add("A) printf(), B) print(), C) output(), D) display()");
        answers.add("A) printf()");

        questions.add("What is the data type used to store characters in C?");
        options.add("A) int, B) char, C) float, D) double");
        answers.add("B) char");

        questions.add("What is the purpose of the #include directive in C?");
        options.add("A) To define a function, B) To declare a variable, C) To include a header file, D) To start a program");
        answers.add("C) To include a header file");

        questions.add("What is the purpose of the main() function in C?");
        options.add("A) To define a variable, B) To declare a function, C) To start a program, D) To end a program");
        answers.add("C) To start a program");

        questions.add("What is the data type used to store large integers in C?");
        options.add("A) int, B) long, C) float, D) double");
        answers.add("B) long");

        questions.add("What is the purpose of the sizeof operator in C?");
        options.add("A) To find the size of a variable, B) To find the size of a data type, C) To find the size of an array, D) To find the size of a function");
        answers.add("B) To find the size of a data type");

        questions.add("What is the purpose of the switch statement in C?");
        options.add("A) To define a function, B) To declare a variable, C) To make a decision based on a value, D) To end a program");
        answers.add("C) To make a decision based on a value");

        questions.add("What is the data type used to store decimal numbers in C?");
        options.add("A) int, B) float, C) double, D) char");
        answers.add("B) float");
        
        questions.add("What is the data type used to store a single character in C?");
        options.add("A) int, B) char, C) float, D) double");
        answers.add("B) char");

        questions.add("What is the operator used to assign a value to a variable in C?");
        options.add("A) =, B) ==, C) !=, D) !");
        answers.add("A) =");

        questions.add("What is the control structure used to repeat a statement multiple times in C?");
        options.add("A) if, B) else, C) for, D) while");
        answers.add("C) for");

        questions.add("What is the function used to find the length of a string in C?");
        options.add("A) strlen(), B) sizeof(), C) strcpy(), D) strcmp()");
        answers.add("A) strlen()");
        
        questions.add("What is the keyword used to define a function in C?");
        options.add("A) func, B) function, C) void, D) return");
        answers.add("C) void");

        questions.add("What is the operator used to compare two values in C?");
        options.add("A) =, B) ==, C) !=, D) >");
        answers.add("B) ==");

        questions.add("What is the data type used to store a large integer in C?");
        options.add("A) int, B) long, C) float, D) double");
        answers.add("B) long");

        questions.add("What is the function used to convert a string to uppercase in C?");
        options.add("A) toupper(), B) tolower(), C) strcpy(), D) strcmp()");
        answers.add("A) toupper()");

        questions.add("What is the control structure used to make a decision in C?");
        options.add("A) if, B) else, C) for, D) while");
        answers.add("A) if");

        questions.add("What is the operator used to perform modulo operation in C?");
        options.add("A) %, B) /, C) *, D) +");
        answers.add("A) %");

        questions.add("What is the function used to find the square root of a number in C?");
        options.add("A) sqrt(), B) pow(), C) ceil(), D) floor()");
        answers.add("A) sqrt()");

        questions.add("What is the keyword used to define a variable in C?");
        options.add("A) var, B) let, C) const, D) int");
        answers.add("D) int");

        questions.add("What is the operator used to perform bitwise AND operation in C?");
        options.add("A) &, B) |, C) ^, D) ~");
        answers.add("A) &");

        questions.add("What is the function used to copy a string in C?");
        options.add("A) strcpy(), B) strcmp(), C) strlen(), D) strcat()");
        answers.add("A) strcpy()");

        questions.add("What is the control structure used to repeat a statement while a condition is true in C?");
        options.add("A) if, B) else, C) for, D) while");
        answers.add("D) while");

        questions.add("What is the data type used to store a floating-point number in C?");
        options.add("A) int, B) float, C) double, D) char");
        answers.add("B) float");

        questions.add("What is the function used to convert a string to lowercase in C?");
        options.add("A) toupper(), B) tolower(), C) strcpy(), D) strcmp()");
        answers.add("B) tolower()");

        questions.add("What is the operator used to perform bitwise OR operation in C?");
        options.add("A) &, B) |, C) ^, D) ~");
        answers.add("B) |");
        
        questions.add("What is the purpose of the 'break' statement in C?");
        options.add("A) To exit a loop, B) To skip a iteration, C) To restart a loop, D) To end a program");
        answers.add("A) To exit a loop");

        questions.add("What is the function used to search a string in C?");
        options.add("A) strstr(), B) strchr(), C) strrchr(), D) strlen()");
        answers.add("A) strstr()");

        questions.add("What is the data type used to store a boolean value in C?");
        options.add("A) int, B) char, C) float, D) bool");
        answers.add("D) bool");

        questions.add("What is the operator used to perform bitwise XOR operation in C?");
        options.add("A) &, B) |, C) ^, D) ~");
        answers.add("C) ^");

        
        questions.add("What is the purpose of the 'continue' statement in C?");
        options.add("A) To exit a loop, B) To skip a iteration, C) To restart a loop, D) To end a program");
        answers.add("B) To skip a iteration");

        questions.add("What is the function used to convert a string to an integer in C?");
        options.add("A) atoi(), B) itoa(), C) strlen(), D) strcpy()");
        answers.add("A) atoi()");

        questions.add("What is the data type used to store a complex number in C?");
        options.add("A) int, B) float, C) double, D) complex");
        answers.add("D) complex");

        questions.add("What is the operator used to perform logical AND operation in C?");
        options.add("A) &&, B) ||, C) !, D) ^");
        answers.add("A) &&");

        questions.add("What is the purpose of the 'return' statement in C?");
        options.add("A) To exit a function, B) To start a function, C) To skip a function, D) To end a program");
        answers.add("A) To exit a function");
        
        questions.add("What is the function used to find the maximum of two numbers in C?");
        options.add("A) max(), B) min(), C) abs(), D) pow()");
        answers.add("A) max()");

        questions.add("What is the purpose of the 'sizeof' operator in C?");
        options.add("A) To find the size of a variable, B) To find the size of a data type, C) To find the size of an array, D) To find the size of a function");
        answers.add("B) To find the size of a data type");

        questions.add("What is the function used to convert a string to a float in C?");
        options.add("A) atof(), B) atoi(), C) itoa(), D) strlen()");
        answers.add("A) atof()");

        questions.add("What is the data type used to store a pointer in C?");
        options.add("A) int, B) char, C) float, D) void*");
        answers.add("D) void*");

        questions.add("What is the operator used to perform logical OR operation in C?");
        options.add("A) &&, B) ||, C) !, D) ^");
        answers.add("B) ||");

        questions.add("What is the purpose of the 'switch' statement in C?");
        options.add("A) To make a decision, B) To repeat a statement, C) To skip a statement, D) To end a program");
        answers.add("A) To make a decision");

        questions.add("What is the function used to find the minimum of two numbers in C?");
        options.add("A) max(), B) min(), C) abs(), D) pow()");
        answers.add("B) min()");

        questions.add("What is the purpose of the 'enum' keyword in C?");
        options.add("A) To define a variable, B) To define a function, C) To define an enumeration, D) To define a structure");
        answers.add("C) To define an enumeration");

      
        questions.add("What is the purpose of the 'typedef' keyword in C?");
        options.add("A) To define a new data type, B) To define a new function, C) To define a new variable, D) To define a new structure");
        answers.add("A) To define a new data type");

        questions.add("What is the function used to find the square root of a number in C?");
        options.add("A) sqrt(), B) pow(), C) ceil(), D) floor()");
        answers.add("A) sqrt()");

        questions.add("What is the purpose of the 'extern' keyword in C?");
        options.add("A) To declare a global variable, B) To define a global variable, C) To declare a local variable, D) To define a local variable");
        answers.add("A) To declare a global variable");

        questions.add("What is the data type used to store a large integer in C?");
        options.add("A) int, B) long, C) float, D) double");
        answers.add("B) long");

        questions.add("What is the purpose of the 'const' keyword in C?");
        options.add("A) To declare a constant variable, B) To define a constant variable, C) To declare a global variable, D) To define a global variable");
        answers.add("A) To declare a constant variable");

        questions.add("What is the function used to convert a string to uppercase in C?");
        options.add("A) toupper(), B) tolower(), C) strcpy(), D) strcmp()");
        answers.add("A) toupper()");

        questions.add("What is the data type used to store a boolean value in C?");
        options.add("A) int, B) char, C) float, D) bool");
        answers.add("D) bool");

        questions.add("What is the operator used to perform logical NOT operation in C?");
        options.add("A) !, B) &&, C) ||, D) ^");
        answers.add("A) !");

        questions.add("What is the purpose of the 'static' keyword in C?");
        options.add("A) To declare a global variable, B) To define a global variable, C) To declare a local variable, D) To define a local variable");
        answers.add("B) To define a global variable");

        questions.add("What is the function used to find the length of a string in C?");
        options.add("A) strlen(), B) strcpy(), C) strcmp(), D) strcat()");
        answers.add("A) strlen()");

        questions.add("What is the data type used to store a complex number in C?");
        options.add("A) int, B) float, C) double, D) complex");
        answers.add("D) complex");

        questions.add("What is the purpose of the 'register' keyword in C?");
        options.add("A) To declare a global variable, B) To define a global variable, C) To declare a local variable, D) To define a local variable");
        answers.add("C) To declare a local variable");

        questions.add("What is the function used to convert a string to a float in C?");
        options.add("A) atof(), B) atoi(), C) itoa(), D) strlen()");
        answers.add("A) atof()");

        questions.add("What is the data type used to store a pointer in C?");
        options.add("A) int, B) char, C) float, D) void*");
        answers.add("D) void*");
        
        questions.add("What is the operator used to perform logical AND operation in C?");
        options.add("A) &&, B) ||, C) !, D) ^");
        answers.add("A) &&");

        questions.add("What is the purpose of the 'volatile' keyword in C?");
        options.add("A) To declare a global variable, B) To define a global variable, C) To declare a local variable, D) To define a local variable");
        answers.add("A) To declare a global variable");
        
        questions.add("What is the purpose of the 'assert' keyword in C?");
        options.add("A) To check if a condition is true, B) To check if a condition is false, C) To exit a program, D) To start a program");
        answers.add("A) To check if a condition is true");

        questions.add("What is the function used to find the absolute value of a number in C?");
        options.add("A) abs(), B) fabs(), C) ceil(), D) floor()");
        answers.add("A) abs()");

        questions.add("What is the data type used to store a character in C?");
        options.add("A) int, B) char, C) float, D) double");
        answers.add("B) char");

        questions.add("What is the operator used to perform bitwise XOR operation in C?");
        options.add("A) &, B) |, C) ^, D) ~");
        answers.add("C) ^");

        questions.add("What is the purpose of the 'sizeof' operator in C?");
        options.add("A) To find the size of a variable, B) To find the size of a data type, C) To find the size of an array, D) To find the size of a function");
        answers.add("B) To find the size of a data type");

        questions.add("What is the function used to convert a string to a integer in C?");
        options.add("A) atoi(), B) itoa(), C) strlen(), D) strcpy()");
        answers.add("A) atoi()");

        questions.add("What is the data type used to store a boolean value in C?");
        options.add("A) int, B) char, C) float, D) bool");
        answers.add("D) bool");

        questions.add("What is the operator used to perform logical OR operation in C?");
        options.add("A) &&, B) ||, C) !, D) ^");
        answers.add("B) ||");

        questions.add("What is the purpose of the 'switch' statement in C?");
        options.add("A) To make a decision, B) To repeat a statement, C) To skip a statement, D) To end a program");
        answers.add("A) To make a decision");
        
        questions.add("What is the function used to find the maximum of two numbers in C?");
        options.add("A) max(), B) min(), C) abs(), D) pow()");
        answers.add("A) max()");

        questions.add("What is the data type used to store a large integer in C?");
        options.add("A) int, B) long, C) float, D) double");
        answers.add("B) long");

        questions.add("What is the purpose of the 'const' keyword in C?");
        options.add("A) To declare a constant variable, B) To define a constant variable, C) To declare a global variable, D) To define a global variable");
        answers.add("A) To declare a constant variable");

        questions.add("What is the function used to convert a string to uppercase in C?");
        options.add("A) toupper(), B) tolower(), C) strcpy(), D) strcmp()");
        answers.add("A) toupper()");

        questions.add("What is the data type used to store a complex number in C?");
        options.add("A) int, B) float, C) double, D) complex");
        answers.add("D) complex");

        questions.add("What is the purpose of the 'register' keyword in C?");
        options.add("A) To declare a global variable, B) To define a global variable, C) To declare a local variable, D) To define a local variable");
        answers.add("C) To declare a local variable");

        questions.add("What is the function used to convert a string to a float in C?");
        options.add("A) atof(), B) atoi(), C) itoa(), D) strlen()");
        answers.add("A) atof()");

        questions.add("What is the data type used to store a pointer in C?");
        options.add("A) int, B) char, C) float, D) void*");
        answers.add("D) void*");

        questions.add("What is the purpose of the 'volatile' keyword in C?");
        options.add("A) To declare a global variable, B) To define a global variable, C) To declare a local variable, D) To define a local variable");
        answers.add("A) To declare a global variable");

    }

    
    public static void main(String[]args){
        new C_Quiz(name).setVisible(true);
    }
    
}
