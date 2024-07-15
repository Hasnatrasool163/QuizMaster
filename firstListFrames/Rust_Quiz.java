package firstListFrames;

import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */

public class Rust_Quiz extends Quiz{
    

    public Rust_Quiz(String name) {
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


  // quiz: 31
    @Override
    public final void loadQuestions() {
       
       questions.add("What is the basic syntax to print output in Rust?");
options.add("A) println!(), B) print(), C) output(), D) display()");
answers.add("A) println!()");

questions.add("What is the keyword used to define a constant in Rust?");
options.add("A) let, B) const, C) static, D) final");
answers.add("B) const");

questions.add("Which of the following is used to declare a mutable variable in Rust?");
options.add("A) var, B) mut, C) let, D) val");
answers.add("B) mut");

questions.add("What is the data type used to store a sequence of characters in Rust?");
options.add("A) str, B) char, C) String, D) text");
answers.add("C) String");

questions.add("What is the default integer type in Rust?");
options.add("A) u8, B) i32, C) u32, D) i64");
answers.add("B) i32");

questions.add("How do you declare an array in Rust?");
options.add("A) let arr = [1, 2, 3], B) var arr = [1, 2, 3], C) array arr = [1, 2, 3], D) arr = [1, 2, 3]");
answers.add("A) let arr = [1, 2, 3]");

questions.add("What is the keyword used to create a new module in Rust?");
options.add("A) package, B) mod, C) module, D) namespace");
answers.add("B) mod");

questions.add("How do you define a function in Rust?");
options.add("A) fn function_name(), B) function function_name(), C) def function_name(), D) func function_name()");
answers.add("A) fn function_name()");

questions.add("Which trait is used for formatting strings in Rust?");
options.add("A) Display, B) Format, C) Show, D) Print");
answers.add("A) Display");

questions.add("What does the unwrap() method do in Rust?");
options.add("A) Handles Option values, B) Unwraps a Result, C) Panics if the value is None, D) Prints the value");
answers.add("C) Panics if the value is None");

questions.add("How do you handle errors in Rust?");
options.add("A) try-catch, B) Result and Option, C) throw-catch, D) error handling");
answers.add("B) Result and Option");

questions.add("What is the purpose of the ownership system in Rust?");
options.add("A) Manage memory allocation, B) Ensure thread safety, C) Prevent data races, D) All of the above");
answers.add("D) All of the above");

questions.add("How do you borrow a reference to a variable in Rust?");
options.add("A) using &, B) using *, C) using @, D) using #");
answers.add("A) using &");

questions.add("Which keyword is used to import modules in Rust?");
options.add("A) include, B) require, C) use, D) import");
answers.add("C) use");

questions.add("What is the syntax to create a new vector in Rust?");
options.add("A) vec![], B) new Vector(), C) Vector::new(), D) Array::new()");
answers.add("A) vec![]");

questions.add("What is the result of the expression 1 + 2 in Rust?");
options.add("A) 3, B) '3', C) 1 + 2, D) Error");
answers.add("A) 3");

questions.add("What is the size of the u8 type in Rust?");
options.add("A) 1 byte, B) 2 bytes, C) 4 bytes, D) 8 bytes");
answers.add("A) 1 byte");

questions.add("How do you declare a struct in Rust?");
options.add("A) struct Name { ... }, B) class Name { ... }, C) type Name { ... }, D) data Name { ... }");
answers.add("A) struct Name { ... }");

questions.add("What is the default value of an uninitialized variable in Rust?");
options.add("A) null, B) undefined, C) 0, D) Variables must be initialized");
answers.add("D) Variables must be initialized");

questions.add("Which of the following is a valid way to create a new String in Rust?");
options.add("A) String::new(), B) new String(), C) String.create(), D) str::new()");
answers.add("A) String::new()");

questions.add("What is the purpose of the match statement in Rust?");
options.add("A) Pattern matching, B) Error handling, C) Looping, D) Variable assignment");
answers.add("A) Pattern matching");

questions.add("How do you create a mutable reference in Rust?");
options.add("A) let x = &mut y, B) let x = mut y, C) let x = *mut y, D) let x = &y");
answers.add("A) let x = &mut y");

questions.add("What is the result of the following code: let x: i32 = \"5\".parse().unwrap();?");
options.add("A) 5, B) \"5\", C) Error, D) Undefined");
answers.add("A) 5");

questions.add("How do you define a public function in Rust?");
options.add("A) pub fn function_name(), B) public fn function_name(), C) fn public function_name(), D) fn function_name() public");
answers.add("A) pub fn function_name()");

questions.add("Which type is used to represent a boolean value in Rust?");
options.add("A) bool, B) Boolean, C) boolean, D) bit");
answers.add("A) bool");

questions.add("How do you define an enum in Rust?");
options.add("A) enum Name { ... }, B) class Name { ... }, C) type Name { ... }, D) data Name { ... }");
answers.add("A) enum Name { ... }");

questions.add("What is the syntax to create a new HashMap in Rust?");
options.add("A) HashMap::new(), B) new HashMap(), C) HashMap[], D) Map::new()");
answers.add("A) HashMap::new()");

questions.add("How do you create a for loop in Rust?");
options.add("A) for x in y { ... }, B) for (x in y) { ... }, C) foreach (x in y) { ... }, D) for each x in y { ... }");
answers.add("A) for x in y { ... }");

questions.add("What is the purpose of the impl keyword in Rust?");
options.add("A) Implement methods for a type, B) Declare a function, C) Create an interface, D) Import a module");
answers.add("A) Implement methods for a type");

questions.add("How do you define a closure in Rust?");
options.add("A) |x| x + 1, B) {x -> x + 1}, C) lambda(x) { x + 1 }, D) fn(x) -> x + 1");
answers.add("A) |x| x + 1");

questions.add("Which macro is used to handle errors in Rust?");
options.add("A) panic!, B) error!, C) handle!, D) try!");
answers.add("A) panic!");

    }
    

    public static void main(String[]args){
        new Rust_Quiz(name).setVisible(true);
    }
    
}


