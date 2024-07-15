
package firstListFrames;

/**
 *
 * @author MuhammadHasnatRasool
 */


import frame.Quiz;
import java.awt.event.ActionEvent;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Js_Quiz extends Quiz{
    
    public Js_Quiz(String name){
         super(name);
        loadQuestions();
        
        for (int i = 0; i < questions.size(); i++) {
            indices.add(i);
        }
        Collections.shuffle(indices);
        System.out.println(indices);

        // Select number of questions
          String input = null;
        // Select number of questions
        while(input==null || input.isEmpty()){
        input = JOptionPane.showInputDialog("Enter number of questions : (1- "+questions.size()+")");
        }
       totalQuestions = Integer.parseInt(input);
       if(totalQuestions<1 || totalQuestions> questions.size()){
           JOptionPane.showMessageDialog(null,"5 mcqs set as a default value!");
           totalQuestions=5;
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

    // quiz:39
    @Override
    public final void loadQuestions() {
            
       questions.add("What is the basic syntax to print output in JavaScript?");
        options.add("A) console.log(), B) alert(), C) prompt(), D) print()");
        answers.add("A) console.log()");

        questions.add("What is the purpose of the var keyword in JavaScript?");
        options.add("A) To define a global variable, B) To define a local variable, C) To define a constant, D) To define a function");
        answers.add("B) To define a local variable");

        questions.add("What is the difference between == and === in JavaScript?");
        options.add("A) == is used for assignment === is used for comparison, B) == is used for comparison === is used for assignment, C) Both are used for assignment, D) Both are used for comparison");
        answers.add("B) == is used for comparison === is used for strict comparison");

        questions.add("What is the purpose of the document.getElementById() method in JavaScript?");
        options.add("A) To select an element by its id, B) To select an element by its class, C) To select an element by its tag name, D) To select an element by its name");
        answers.add("A) To select an element by its id");

        questions.add("What is the data type used to store large integers in JavaScript?");
        options.add("A) number, B) integer, C) long, D) float");
        answers.add("A) number");

        questions.add("What is the purpose of the forEach() method in JavaScript?");
        options.add("A) To loop through an array, B) To loop through an object, C) To loop through a string, D) To loop through a function");
        answers.add("A) To loop through an array");

        questions.add("What is the difference between null and undefined in JavaScript?");
        options.add("A) null is used to represent an empty value undefined is used to represent an uninitialized variable, B) null is used to represent an uninitialized variable- undefined is used to represent an empty value, C) Both are used to represent an empty value, D) Both are used to represent an uninitialized variable");
        answers.add("A) null is used to represent an empty value undefined is used to represent an uninitialized variable");

        questions.add("What is the purpose of the setTimeout() function in JavaScript?");
        options.add("A) To delay the execution of a function, B) To immediately execute a function, C) To repeat the execution of a function, D) To stop the execution of a function");
        answers.add("A) To delay the execution of a function");

        questions.add("What is the data type used to store decimal numbers in JavaScript?");
        options.add("A) number, B) float, C) double, D) decimal");
        answers.add("A) number");

        questions.add("What is the purpose of the JSON.parse() method in JavaScript?");
        options.add("A) To parse a JSON string into an object, B) To parse an object into a JSON string, C) To validate a JSON string, D) To format a JSON string");
        answers.add("A) To parse a JSON string into an object");
        
        questions.add("What is the purpose of the 'use strict' directive in JavaScript?");
        options.add("A) To enable strict mode, B) To disable strict mode, C) To check for syntax errors, D) To improve code performance");
        answers.add("A) To enable strict mode");

        questions.add("Which method is used to concatenate two strings in JavaScript?");
        options.add("A) concat(), B) join(), C) merge(), D) +");
        answers.add("D) +");

        questions.add("What is the difference between null and undefined in JavaScript?");
        options.add("A) null is an object undefined is a primitive, B) null is a primitive undefined is an object, C) null is a variable, undefined is a value, D) null is a value, undefined is a variable");
        answers.add("B) null is a primitive undefined is an object");

        questions.add("How do you check if a variable is an array in JavaScript?");
        options.add("A) typeof(), B) instanceof(), C) isArray(), D) isObject()");
        answers.add("C) isArray()");

        questions.add("What is the purpose of the 'this' keyword in JavaScript?");
        options.add("A) To refer to the global object, B) To refer to the current object, C) To refer to the parent object, D) To refer to the child object");
        answers.add("B) To refer to the current object");

        questions.add("Which method is used to find the index of an element in an array in JavaScript?");
        options.add("A) indexOf(), B) findIndex(), C) search(), D) locate()");
        answers.add("A) indexOf()");

        questions.add("What is the difference between the '==' and '===' operators in JavaScript?");
        options.add("A) '==' checks for value '===' checks for type, B) '==' checks for type '===' checks for value, C) '==' checks for both value and type '===' checks for neither, D) '==' checks for neither '===' checks for both value and type");
        answers.add("A) '==' checks for value '===' checks for type");

        questions.add("How do you create a regular expression in JavaScript?");
        options.add("A) new RegExp(), B) regex(), C) pattern(), D) expression()");
        answers.add("A) new RegExp()");

        questions.add("What is the purpose of the 'prototype' property in JavaScript?");
        options.add("A) To create a new object, B) To inherit properties from another object, C) To add properties to an existing object, D) To remove properties from an existing object");
        answers.add("B) To inherit properties from another object");

        questions.add("Which method is used to sort an array in JavaScript?");
        options.add("A) sort(), B) arrange(), C) organize(), D) order()");
        answers.add("A) sort()");

        questions.add("What is the difference between the 'var', 'let', and 'const' keywords in JavaScript?");
        options.add("A) 'var' declares a global variable 'let' declares a local variable 'const' declares a constant, B) 'var' declares a local variable 'let' declares a global variable 'const' declares a constant, C) 'var' declares a constant 'let' declares a local variable 'const' declares a global variable, D) 'var' declares a global variable, 'let' declares a constant, 'const' declares a local variable");
        answers.add("A) 'var' declares a global variable 'let' declares a local variable 'const' declares a constant");

        questions.add("How do you check if a variable is a function in JavaScript?");
        options.add("A) typeof(), B) instanceof(), C) isFunction(), D) isObject()");
        answers.add("C) isFunction()");

        questions.add("What is the purpose of the 'bind' method in JavaScript?");
        options.add("A) To bind a function to an object, B) To bind an object to a function, C) To bind a variable to a value, D) To bind a value to a variable");
        answers.add("A) To bind a function to an object");

        questions.add("Which method is used to find the maximum value in an array in JavaScript?");
        options.add("A) max(), B) min(), C) sum(), D) average()");
        answers.add("A) max()");
        
        questions.add("What is the purpose of the 'Promise' object in JavaScript?");
        options.add("A) To handle asynchronous operations, B) To handle synchronous operations, C) To handle errors, D) To handle callbacks");
        answers.add("A) To handle asynchronous operations");

        questions.add("Which method is used to parse a JSON string in JavaScript?");
        options.add("A) JSON.parse(), B) JSON.stringify(), C) JSON.deserialize(), D) JSON.serialize()");
        answers.add("A) JSON.parse()");

        questions.add("What is the difference between the '==}' and '===' operators in JavaScript?");
        options.add("A) '==}' checks for value and type, '===' checks for value only, B) '==}' checks for value only '===' checks for value and type, C) '==}' checks for type only '===' checks for value and type, D) '==}' checks for value and type '===' checks for type only");
        answers.add("B) '==}' checks for value only '===' checks for value and type");

        questions.add("How do you create a new object in JavaScript?");
        options.add("A) new Object(), B) {}, C) Object.create(), D) Object.construct()");
        answers.add("B) {}");

        questions.add("What is the purpose of the 'Symbol' type in JavaScript?");
        options.add("A) To create a unique identifier, B) To create a shared identifier, C) To create a private variable, D) To create a public variable");
        answers.add("A) To create a unique identifier");

        questions.add("Which method is used to concatenate two arrays in JavaScript?");
        options.add("A) concat(), B) join(), C) merge(), D) push()");
        answers.add("A) concat()");

        questions.add("What is the difference between the 'null' and 'undefined' values in JavaScript?");
        options.add("A) null is an object undefined is a primitive, B) null is a primitive undefined is an object, C) null is a value undefined is a variable, D) null is a variable undefined is a value");
        answers.add("B) null is a primitive undefined is an object");

        questions.add("How do you check if a variable is a boolean in JavaScript?");
        options.add("A) typeof(), B) instanceof(), C) isBoolean(), D) isPrimitive()");
        answers.add("C) isBoolean()");

        questions.add("What is the purpose of the 'Proxy' object in JavaScript?");
        options.add("A) To create a proxy for an object, B) To create a proxy for a function, C) To create a proxy for a variable, D) To create a proxy for a value");
        answers.add("A) To create a proxy for an object");

        questions.add("Which method is used to find the index of an element in an array in JavaScript?");
        options.add("A) indexOf(), B) findIndex(), C) search(), D) locate()");
        answers.add("A) indexOf()");

        questions.add("What is the difference between the 'for...of' and 'for...in' loops in JavaScript?");
        options.add("A) for...of loops over values for...in loops over keys, B) for...of loops over keys for...in loops over values, C) for...of loops over indices for...in loops over properties, D) for...of loops over properties for...in loops over indices");
        answers.add("A) for...of loops over values for...in loops over keys");

        questions.add("How do you create a new date object in JavaScript?");
        options.add("A) new Date(), B) Date.now(), C) Date.parse(), D) Date.stringify()");
        answers.add("A) new Date()");

        questions.add("What is the purpose of the 'RegExp' object in JavaScript?");
        options.add("A) To create a regular expression, B) To create a string, C) To create a number, D) To create a boolean");
        answers.add("A) To create a regular expression");

        questions.add("Which method is used to replace a substring in a string in JavaScript?");
        options.add("A) replace(), B) substring(), C) substr(), D) slice()");
        answers.add("A) replace()");

        questions.add("What is the difference between the 'async/await' and 'Promise' APIs in JavaScript?");
        options.add("A) async/await is for synchronous programming Promise is for asynchronous programming, B) async/await is for asynchronous programming Promise is for synchronous programming, C) async/await is for parallel programming Promise is for sequential programming, D) async/await is for sequential programming Promise is for parallel programming");
        answers.add("B) async/await is for asynchronous programming Promise is for synchronous programming");

    }
    
   
     @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
    }
    
    public static void main(String[]args){
        new Js_Quiz(name).setVisible(true);
    }
}

