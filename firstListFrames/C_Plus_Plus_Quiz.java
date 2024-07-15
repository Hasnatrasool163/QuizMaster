package firstListFrames;

/**
 *
 * @author MuhammadHasnatRasool
 */

import frame.Quiz;


public class C_Plus_Plus_Quiz extends Quiz{
    
     public C_Plus_Plus_Quiz(String name) {
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
        questions.add("What is the basic syntax to print output in C++?");
        options.add("A) cout , B) printf() , C) print() , D) output()");
        answers.add("A) cout");

        questions.add("What is the purpose of the #include directive in C++?");
        options.add("A) To define a function, B) To declare a variable, C) To include a header file, D) To start a program");
        answers.add("C) To include a header file");

        questions.add("What is the purpose of the main() function in C++?");
        options.add("A) To define a variable, B) To declare a function, C) To start a program, D) To end a program");
        answers.add("C) To start a program");

        questions.add("What is the data type used to store large integers in C++?");
        options.add("A) int, B) long, C) float, D) double");
        answers.add("B) long");

        questions.add("What is the purpose of the sizeof operator in C++?");
        options.add("A) To find the size of a variable, B) To find the size of a data type, C) To find the size of an array, D) To find the size of a function");
        answers.add("B) To find the size of a data type");

        questions.add("What is the purpose of the switch statement in C++?");
        options.add("A) To define a function, B) To declare a variable, C) To make a decision based on a value, D) To end a program");
        answers.add("C) To make a decision based on a value");

        questions.add("What is the data type used to store decimal numbers in C++?");
        options.add("A) int, B) float, C) double, D) char");
        answers.add("B) float");

        questions.add("What is the purpose of the namespace std in C++?");
        options.add("A) To define a class, B) To declare a variable, C) To include a header file, D) To access standard library functions");
        answers.add("D) To access standard library functions");
        
        questions.add("What is the basic syntax to print output in C++?");
        options.add("A) printf() , B) print() , C) output() , D) display()");
        answers.add("A) printf()");

        questions.add("Which keyword is used to declare variables in C++?");
        options.add("A) var , B) define , C) let , D) int ");
        answers.add("D) int");

        questions.add("What is the method used to add an element to the end of an ArrayList in C++?");
        options.add( "A) add() , B) push() , C) append() , D) insert()");
        answers.add("A) add()");
        
        questions.add("What is the basic syntax to print output in C++?");
        options.add("A) printf(), B) print() , C) output() , D) display()");
        answers.add("A) printf()");

        questions.add("Which keyword is used to declare variables in C++?");
        options.add("A) var , B) define , C) let , D) int");
        answers.add("D) int");

        questions.add("What are the basic data types in C++ to store integers?");
        options.add("A) float  double , B) char bool , C) int-short-long , D) string array");
        answers.add("C) int-short-long");

        questions.add("What is the correct way to declare a character variable named 'initial' in C++?");
        options.add("A) char initial = 'A'; , B) String initial = 'A'; , C) initial char = 'A'; , D) char 'initial' = A;");
        answers.add("A) char initial = 'A';");

        questions.add("What does the `++` operator do in C++?");
        options.add("A) Subtraction , B) Assignment , C) Increment , D) Modulus");
        answers.add("C) Increment");

        questions.add("What statement is used to create a loop that executes as long as a condition is true?");
        options.add("A) for (int i = 0; i < 5; i++) , B) if (condition) { ... } , C) while (condition) { ... } ,D) do { ... } while (condition);");
        answers.add("C) while (condition) { ... }");

        questions.add("What operator is used for logical AND in C++?");
        options.add("A) && , B) || , C) | , D) &");
        answers.add("A) &&");

        questions.add("What is the difference between pre-increment (`++x`) and post-increment (`x++`) in C++?");
        options.add("A) No difference , B) Pre-increment increments first then returns the value. Post-increment returns the value then increments. ,C) Pre-increment decrements  post-increment increments. ,D) They only work with floating-point numbers.");
        answers.add("B) Pre-increment increments first, then returns the value. Post-increment returns the value, then increments.");

        questions.add("What does the `break` statement do within a loop?");
        options.add("A) Continues the loop  ,B) Exits the loop immediately , C) Skips the current iteration , D) Decrements the loop counter");
        answers.add("B) Exits the loop immediately");

        questions.add("How do you declare an array named 'numbers' of size 10 to store integers in C++?");
        options.add("A) int numbers[10] = {0};, B) String numbers[10];, C) int number = 10; , D) None of the above");
        answers.add("A) int numbers[10] = {0};");

        questions.add("What is the purpose of a function in C++?");
        options.add("A) To store data , B) To define a reusable block of code , C) To create a loop , D) To print output");
        answers.add("B) To define a reusable block of code");

        questions.add("What does a pointer variable store in C++?");
        options.add("A) An integer value , B) The value of another variable , C) The memory address of another variable , D) A string");
        answers.add("C) The memory address of another variable");

        questions.add("What is the difference between a pointer and a reference in C++?");
        options.add("A) No difference , B) Pointers can be NULL references must always refer to a valid variable. , C) Pointers can be reassigned references cannot. , D) Both A and C");
        answers.add("D) Both A and C");

        questions.add("What is the syntax to declare a pointer variable named 'ptr' that can point to an integer?");
        options.add("A) int ptr = 0; , B) int* ptr; , C) String ptr = 'A'; , D) None of the above");
        answers.add("B) int* ptr;");

        questions.add("What is the keyword used to define a class in C++?");
        options.add("A) function , B) class , C) define , D) structure");
        answers.add("B) class");

        questions.add("What is an object in C++?");
        options.add("A) A variable , B) A function , C) An instance of a class , D) A loop");
        answers.add("C) An instance of a class");

        questions.add("How do you create an object named 'student' of class 'Student' in C++?");
        options.add("A) Student student = new Student(); , B) Student student; , C) String student = 'Student'; , D) None of the above");
        answers.add("A) Student student = new Student();");

        questions.add("What function is used to read an integer value from the user in C++?");
        options.add("A) scanf() , B) cin >> , C) input() , D) getchar()");
        answers.add("B) cin >>");

        questions.add("What does the `endl` manipulator do in C++ output with `cout`?");
        options.add("A) Prints a newline character , B) Flushes the output buffer , C) Both A and B , D) Reads input from the user");
        answers.add("C) Both A and B");

        questions.add("What is the difference between a copy constructor and a move constructor in C++?");
        options.add("A) No difference, B) Copy constructor copies data- Move constructor transfers ownership, C) Copy constructor for primitives- Move constructor for objects, D) None of the above");
        answers.add("B) Copy constructor copies data, Move constructor transfers ownership");
        
        questions.add("What is the purpose of inheritance in C++?");
        options.add("A) To define reusable blocks of code , B) To establish an 'is-a' relationship between classes , C) To create arrays , D) To handle input/output");
        answers.add("B) To establish an 'is-a' relationship between classes");

        questions.add("What does polymorphism allow you to achieve in C++?");
        options.add("A) Type safety , B) Code reusability , C) Runtime binding of function calls , D) All of the above");
        answers.add("C) Runtime binding of function calls");

        questions.add("What is the purpose of templates in C++?");
        options.add("A) To define reusable code that can work with different data types , B) To handle input/output , C) To create complex data structures , D) To manage memory allocation");
        answers.add("A) To define reusable code that can work with different data types");

        questions.add("What does the `try...catch` block do in C++ exception handling?");
        options.add("A) To loop a certain number of times , B) To define a function , C) To handle potential errors or exceptions during program execution , D) To read input from the user");
        answers.add("C) To handle potential errors or exceptions during program execution");

        questions.add("What function is used to open a file for reading in C++?");
        options.add("A) fopen() , B) open() , C) readFile() , D) None of the above");
        answers.add("A) fopen()");

        questions.add("What is the purpose of the `vector` class in the C++ STL?");
        options.add("A) To store a fixed-size array of elements , B) To store a dynamic array of elements that can grow or shrink as needed ,C) To handle input/output ,D) To create objects");
        answers.add("B) To store a dynamic array of elements that can grow or shrink as needed");
        
        questions.add("What does OOP stand for?");
        options.add("A) Object-Oriented Programming, B) Object-Oriented Protocol, C) Object-Oriented Procedure, D) Object-Oriented Process");
        answers.add("A) Object-Oriented Programming");

        questions.add("Which of the following is not a fundamental data type in C++?");
        options.add("A) int, B) float, C) string, D) double");
        answers.add("C) string");

        questions.add("What is the output of the following code?\n\nint x = 10;\ncout << ++x;");
        options.add("A) 9, B) 10, C) 11, D) Compiler error");
        answers.add("C) 11");

        questions.add("What is the purpose of a constructor in C++?");
        options.add("A) To initialize the class objects, B) To destroy the class objects, C) To allocate memory to class objects, D) To define class methods");
        answers.add("A) To initialize the class objects");

        questions.add("Which operator is used to allocate memory for a data type in C++?");
        options.add("A) alloc, B) new, C) allocate, D) malloc");
        answers.add("B) new");

        questions.add("What is the output of the following code?\n\nint a = 5, b = 10;\ncout << (a > b ? a : B);");
        options.add("A) 5, B) 10, C) 0, D) Compiler error");
        answers.add("B) 10");

        questions.add("Which keyword is used to define a class in C++?");
        options.add("A) struct, B) class, C) typedef, D) define");
        answers.add("B) class");

        questions.add("What does the 'virtual' keyword signify in C++?");
        options.add("A) It specifies that a function may be overridden in derived classes, B) It indicates that a function cannot be overridden, C) It specifies that a class cannot be inherited, D) It indicates that a function must be overridden in derived classes");
        answers.add("A) It specifies that a function may be overridden in derived classes");

        questions.add("Which of the following is not a valid storage class in C++?");
        options.add("A) static, B) dynamic, C) auto, D) register");
        answers.add("B) dynamic");

        questions.add("What is the default access specifier for members of a class in C++?");
        options.add("A) public, B) private, C) protected, D) static");
        answers.add("B) private");

        questions.add("What is the output of the following code?\n\nint x = 5;\ncout << sizeof(++x);");
        options.add("A) 1, B) 2, C) 4, D) Undefined");
        answers.add("C) 4");

        questions.add("What is the purpose of 'namespace' in C++?");
        options.add("A) To define constants, B) To declare variables, C) To organize code into logical groups, D) To access private members");
        answers.add("C) To organize code into logical groups");

        questions.add("Which operator is used to access the member functions and variables from objects in C++?");
        options.add("A) ::, B) ., C) ->, D) :");
        answers.add("B) .");

        questions.add("Which STL container provides constant time insert and erase operations from both beginning and end?");
        options.add("A) vector, B) list, C) deque, D) map");
        answers.add("C) deque");

        questions.add("What is the purpose of 'const' keyword in C++?");
        options.add("A) To declare a constant, B) To declare a variable, C) To define a function, D) To declare a class");
        answers.add("A) To declare a constant");

        questions.add("What is the output of the following code?\n\nint arr[] = {1, 2, 3, 4, 5};\ncout << *arr;");
        options.add("A) 1, B) 2, C) 3, D) Compiler error");
        answers.add("A) 1");

        questions.add("Which operator is used to refer to the current instance of a class in C++?");
        options.add("A) this->, B) self->, C) current->, D) class->");
        answers.add("A) this->");

        questions.add("What is the output of the following code?\n\nint i = 0;\nwhile (i < 5) {\n    cout << i++ << \" \";\n}");
        options.add("A) 0 1 2 3 4, B) 0 1 2 3 4 5, C) 1 2 3 4 5, D) Compiler error");
        answers.add("A) 0 1 2 3 4");

        questions.add("Which of the following is a correct way to dynamically allocate memory for an integer in C++?");
        options.add("A) int *p = new int();, B) int *p = new int;, C) int *p = malloc(sizeof(int));, D) Both a and b");
        answers.add("A) int *p = new int();");

        questions.add("What is the output of the following code?\n\nint x = 5;\nint *ptr = &x;\ncout << ptr << \" \" << *ptr;");
        options.add("A) address of x-5, B) 5-address of x, C) 5-5, D) Compiler error");
        answers.add("A) address of x, 5");

        questions.add("Which operator is used to obtain the memory address of a variable in C++?");
        options.add("A) &, B) *, C) $, D) %");
        answers.add("A) &");

        questions.add("What is the output of the following code?\n\nint arr[5] = {1, 2, 3, 4, 5};\ncout << arr[2];");
        options.add("A) 1, B) 2, C) 3, D) 4");
        answers.add("C) 3");

        questions.add("What is the purpose of 'inline' keyword in C++?");
        options.add("A) To indicate that a function's definition is provided in the same file, B) To declare a function, C) To declare a variable, D) To define a class");
        answers.add("A) To indicate that a function's definition is provided in the same file");

        questions.add("What is the output of the following code?\n\nint x = 10;\nif (x > 5) {\n    int x = 5;\n    cout << x;\n}");
        options.add("A) 10, B) 5, C) Compiler error, D) Undefined behavior");
        answers.add("B) 5");

        questions.add("Which of the following statements is true about references in C++?");
        options.add("A) A reference must be initialized when declared, B) A reference cannot be reassigned to refer to a different object, C) References are automatically dereferenced, D) All of the above");
        answers.add("D) All of the above");

        questions.add("What is the output of the following code?\n\nint x = 5;\nint &y = x;\ny = 10;\ncout << x;");
        options.add("A) 5, B) 10, C) Compiler error, D) Undefined behavior");
        answers.add("B) 10");

        questions.add("What does the 'friend' keyword indicate in C++?");
        options.add("A) It indicates a function that is a member of a class, B) It indicates a function that is not a member of a class but has access to its private and protected members, C) It indicates a function that cannot be inherited, D) It indicates a function that must be overridden in derived classes");
        answers.add("B) It indicates a function that is not a member of a class but has access to its private and protected members");

        questions.add("What is the output of the following code?\n\nint x = 5;\nint *p = &x;\ncout << ++*p;");
        options.add("A) 6, B) 5, C) Compiler error, D) Undefined behavior");
        answers.add("A) 6");

        questions.add("Which of the following is not a valid way to initialize a string in C++?");
        options.add("A) string s = \"Hello\";, B) string s(\"Hello\");, C) string s = {'H', 'e', 'l', 'l', 'o'};, D) string s = new string(\"Hello\");");
        answers.add("D) string s = new string(\"Hello\");");

        questions.add("What is the output of the following code?\n\nint x = 5, y = 10;\nint *ptr1 = &x, *ptr2 = &y;\ncout << ptr1 + ptr2;");
        options.add("A) 15, B) Error, C) address, D) Compiler error");
        answers.add("D) Compiler error");

        questions.add("Which of the following is true about a destructor in C++?");
        options.add("A) It is called when an object goes out of scope or is explicitly deleted, B) It is called when an object is created, C) It is used to create objects, D) It is used to initialize objects");
        answers.add("A) It is called when an object goes out of scope or is explicitly deleted");

        questions.add("What is the output of the following code?\n\nvoid print(int n) {\n    if (n == 0) return;\n    print(n - 1);\n    cout << n << \" \";\n}\nprint(5);");
        options.add("A) 1 2 3 4 5, B) 5 4 3 2 1, C) 5 4 3 2 1 (in reverse order), D) 1 2 3 4 5 (in reverse order)");
        answers.add("B) 5 4 3 2 1");

        questions.add("Which of the following is not a valid type of inheritance in C++?");
        options.add("A) Single inheritance, B) Multiple inheritance, C) Hierarchical inheritance, D) Dynamic inheritance");
        answers.add("D) Dynamic inheritance");

        questions.add("What is the output of the following code?\n\nint x = 5;\nint *ptr = &x;\ncout << ptr++;");
        options.add("A) 5, B) address of x, C) 6, D) Compiler error");
        answers.add("D) Compiler error");

        questions.add("Which of the following is true about function overloading in C++?");
        options.add("A) It allows a function to have multiple definitions with the same name but different parameters, B) It allows a function to have multiple definitions with the same name and same parameters, C) It allows a function to have multiple definitions with different return types, D) It allows a function to have multiple definitions with different access specifiers");
        answers.add("A) It allows a function to have multiple definitions with the same name but different parameters");

        questions.add("What is the output of the following code?\n\nint x = 10;\nint &y = x;\ny++;\ncout << x;");
        options.add("A) 10, B) 11, C) Compiler error, D) Undefined behavior");
        answers.add("B) 11");

        questions.add("Which of the following is true about virtual functions in C++?");
        options.add("A) They cannot be overridden, B) They are used to define constants, C) They allow a derived class to provide a specific implementation of a function that is already defined in its base class, D) They cannot be accessed using a derived class object");
        answers.add("C) They allow a derived class to provide a specific implementation of a function that is already defined in its base class");

        questions.add("What is the output of the following code?\n\nint x = 10;\nint *p = &x;\nint **q = &p;\ncout << **q;");
        options.add("A) 10, B) 0, C) Compiler error, D) Undefined behavior");
        answers.add("A) 10");

        questions.add("What is the output of the following code?\n\nint arr[] = {1, 2, 3, 4, 5};\ncout << *(arr + 2);");
        options.add("A) 1, B) 2, C) 3, D) 4");
        answers.add("C) 3");

        questions.add("What is the output of the following code?\n\nint arr[] = {1, 2, 3, 4, 5};\ncout << sizeof(arr) / sizeof(arr[0]);");
        options.add("A) 5, B) 1, C) 4, D) Compiler error");
        answers.add("A) 5");

        questions.add("Which of the following operators cannot be overloaded in C++?");
        options.add("A) +, B) ::, C) =, D) <<");
        answers.add("B) ::");

        questions.add("What is the output of the following code?\n\nint arr[] = {1, 2, 3, 4, 5};\nint *ptr = arr + 2;\ncout << *ptr;");
        options.add("A) 1, B) 2, C) 3, D) 4");
        answers.add("C) 3");

        questions.add("Which of the following is true about templates in C++?");
        options.add("A) They are used to define constants, B) They allow a function to operate with generic types, C) They define member functions of a class, D) They cannot be used with classes");
        answers.add("B) They allow a function to operate with generic types");

        questions.add("What is the output of the following code?\n\nint arr[5] = {1, 2, 3, 4, 5};\nfor (int i = 0; i < 5; ++i) {\n    cout << arr[i] << \" \";\n}");
        options.add("A) 1 2 3 4 5, B) 5 4 3 2 1, C) 5 4 3 2 1 (in reverse order), D) 1 2 3 4 5 (in reverse order)");
        answers.add("A) 1 2 3 4 5");

        questions.add("What is the output of the following code?\n\nvoid swap(int &a, int &B) {\n    int temp = a;\n    a = b;\n    b = temp;\n}\nint x = 5, y = 10;\nswap(x, y);\ncout << x << \" \" << y;");
        options.add("A) 5 10, B) 10 5, C) Compiler error, D) Undefined behavior");
        answers.add("B) 10 5");

        questions.add("Which of the following is true about multiple inheritance in C++?");
        options.add("A) A class can inherit from multiple classes, B) A class can inherit from only one class, C) A class cannot inherit from any class, D) A class cannot inherit from more than two classes");
        answers.add("A) A class can inherit from multiple classes");


    }

    
    public static void main(String[]args){
        new C_Plus_Plus_Quiz(name).setVisible(true);
    }
}
