package firstListFrames;

import frame.True_False_Questions;

public class C_TF extends True_False_Questions{

    public C_TF(String name) {
        super(name);
    }

// c tf 82
    @Override
    public final void loadQuestions() {
             
questions.add("In C, a pointer to a function can be assigned to a pointer to an object.");
answers.add("False"); // Because pointers to functions and objects are incompatible

questions.add("In C, a struct can have a member with the same name as the struct.");
answers.add("True"); // Because structs can have members with the same name as the struct

questions.add("In C, a union can have multiple members with the same name.");
answers.add("True"); // Because unions can have multiple members with the same name

questions.add("In C, a bit-field can have a width of 0 bits.");
answers.add("True"); // Because bit-fields can have a width of 0 bits

questions.add("In C, a enumeration constant can be used as a case label in a switch statement.");
answers.add("True"); // Because enumeration constants can be used as case labels

questions.add("In C, a variable length array (VLA) can be used as a parameter to a function.");
answers.add("True"); // Because VLAs can be used as parameters to functions

questions.add("In C, a function can return a structure by value.");
answers.add("True"); // Because functions can return structures by value

questions.add("In C, a function can have a variable number of parameters.");
answers.add("True"); // Because functions can have a variable number of parameters

questions.add("In C, a macro can be redefined with a different definition.");
answers.add("True"); // Because macros can be redefined with different definitions

questions.add("In C, a static variable can be initialized with a non-constant expression.");
answers.add("False"); // Because static variables must be initialized with constant expressions

questions.add("In C, a const qualified variable can be modified using a cast.");
answers.add("True"); // Because const qualified variables can be modified using a cast

questions.add("In C, a volatile qualified variable can be used to communicate with hardware devices.");
answers.add("True"); // Because volatile qualified variables can be used to communicate with hardware devices

questions.add("In C, a character constant is enclosed in single quotes.");
answers.add("True");

questions.add("In C, a string literal is enclosed in double quotes.");
answers.add("True");

questions.add("In C, a variable declaration must include a data type.");
answers.add("True");

questions.add("In C, a function declaration must include a return type.");
answers.add("True");

questions.add("In C, a switch statement can have multiple default cases.");
answers.add("False");

questions.add("In C, a break statement can be used in a switch statement.");
answers.add("True");

questions.add("In C, a continue statement can be used in a for loop.");
answers.add("True");

questions.add("In C, a goto statement can be used to jump to any location in a program.");
answers.add("True");

questions.add("In C, a array can be resized dynamically.");
answers.add("False");

questions.add("In C, a pointer can be used to access elements of an array.");
answers.add("True");

questions.add("In C, a string literal can be modified.");
answers.add("False");

questions.add("In C, a constant variable can be modified using a cast.");
answers.add("False");

questions.add("In C, a variable can be declared inside a for loop.");
answers.add("True");

questions.add("In C, a function can be called recursively.");
answers.add("True");

questions.add("In C, a array of structures can be passed to a function.");
answers.add("True");

questions.add("In C, a pointer to a function can be passed to another function.");
answers.add("True");

questions.add("In C, a macro can be used to define a constant value.");
answers.add("True");

questions.add("In C, a static variable retains its value between function calls.");
answers.add("True");

questions.add("In C, a variable can be declared with an initial value in the declaration.");
answers.add("True");

questions.add("In C, a function can return multiple values using a structure.");
answers.add("True");

questions.add("In C, a pointer can be used to access elements of a linked list.");
answers.add("True");

questions.add("In C, a file can be opened in both read and write modes simultaneously.");
answers.add("True");

questions.add("In C, a string literal can be concatenated using the + operator.");
answers.add("False");

questions.add("In C, a variable can be declared inside a switch statement.");
answers.add("True");

questions.add("In C, a function can be called using a function pointer.");
answers.add("True");

questions.add("In C, a array can be passed to a function by reference.");
answers.add("True");

questions.add("In C, a const variable can be used as an array size.");
answers.add("True");

questions.add("In C, a volatile variable can be used to prevent optimization.");
answers.add("True");

questions.add("In C, a enum value can be used as a case label in a switch statement.");
answers.add("True");

questions.add("In C, a union can have multiple members with different data types.");
answers.add("True");

questions.add("In C, a bit-field can have a width of more than 8 bits.");
answers.add("True");

questions.add("In C, a function can return a pointer to a local variable.");
answers.add("False");

questions.add("In C, a static variable can be accessed using a pointer.");
answers.add("True");

questions.add("In C, a macro can be used to define a function-like macro.");
answers.add("True");

questions.add("In C, a variable can be declared with an initial value using a designation.");
answers.add("True");

questions.add("In C, a flexible array member in a struct can be used to store variable-sized data.");
answers.add("True");

questions.add("In C, a anonymous struct or union can be declared without a name.");
answers.add("True");

questions.add("In C, a nested function can be defined inside another function.");
answers.add("True");

questions.add("In C, a function can return a struct by value.");
answers.add("True");

questions.add("In C, a variable argument list can be accessed using the va_arg macro.");
answers.add("True");

questions.add("In C, a function can be declared with a variable number of arguments using an ellipsis (...).");
answers.add("True");

questions.add("In C, a static variable can be initialized using a function call.");
answers.add("False");

questions.add("In C, a thread-local storage can be declared using the _Thread_local keyword.");
answers.add("True");

questions.add("In C, a atomic operation can be performed using the atomic_fetch_add function.");
answers.add("True");

questions.add("In C, a mutex lock can be used to synchronize access to a shared resource.");
answers.add("True");

questions.add("In C, a condition variable can be used to signal between threads.");
answers.add("True");

questions.add("In C, a future can be used to retrieve the result of an asynchronous operation.");
answers.add("True");

questions.add("In C, a stdatomic.h header file is used for atomic operations.");
answers.add("True");

questions.add("In C, a stdthread.h header file is used for threading operations.");
answers.add("True");

questions.add("In C, a chrono header file is used for time-related operations.");
answers.add("True");

questions.add("In C, a pointer can be arithmetic operations like addition and subtraction.");
answers.add("True");

questions.add("In C, a array and pointer are not same thing.");
answers.add("True");

questions.add("In C, a string literal is an array of characters.");
answers.add("True");

questions.add("In C, a struct can have same name as variable.");
answers.add("True");

questions.add("In C, a header file can be included multiple times.");
answers.add("True");

questions.add("In C, the strcpy function returns a pointer to the destination string.");
answers.add("True");

questions.add("In C, the strlen function counts the null character at the end of the string.");
answers.add("False");

questions.add("In C, the strstr function returns a pointer to the first occurrence of the substring.");
answers.add("True");

questions.add("In C, the strcmp function returns 0 if the strings are equal.");
answers.add("True");

questions.add("In C, the strcat function appends the source string to the destination string.");
answers.add("True");

questions.add("In C, the printf function returns the number of characters printed.");
answers.add("True");

questions.add("In C, the scanf function returns the number of successful assignments.");
answers.add("True");

questions.add("In C, the strtok function returns a pointer to the next token in the string.");
answers.add("True");

questions.add("In C, the strtok function modifies the original string by inserting null characters.");
answers.add("True");

questions.add("In C, the fgets function includes the newline character in the string.");
answers.add("True");

questions.add("In C, the isalpha function returns true for uppercase letters only.");
answers.add("False");

questions.add("In C, the isdigit function returns true for decimal digits only.");
answers.add("True");

questions.add("In C, the Windows API function CreateFile can be used to create a new file.");
answers.add("True");

questions.add("In C, the Windows API function SendMessage can be used to send a message to a window.");
answers.add("True");

questions.add("In C, the toupper function converts lowercase to uppercase.");
answers.add("True");
    }
    
    public static void main(String[]args){
        new C_TF(name).setVisible(true);
    }
    
}

