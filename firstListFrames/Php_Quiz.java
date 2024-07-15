
package firstListFrames;

/**
 *
 * @author MuhammadHasnatRasool
 */

import frame.Quiz;
import java.awt.event.ActionEvent;
import java.util.Collections;
import javax.swing.JOptionPane;


public class Php_Quiz extends Quiz{

    public Php_Quiz(String name) {
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
       meter.setMaximumValue(totalQuestions);

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

  
    // quiz: 35
    @Override
    public final void loadQuestions() {
       
        questions.add("What is the basic syntax to print output in PHP?");
        options.add("A) echo, B) print, C) printf, D) print_r");
        answers.add("A) echo");

        questions.add("What is the purpose of the  <?php tag");
        options.add("A) To start a PHP code block, B) To end a PHP code block, C) To declare a variable, D) To define a function");
        answers.add("A) To start a PHP code block");

        questions.add("What is the difference between = and == in PHP?");
        options.add("A) = is used for assignment == is used for comparison, B) = is used for comparison == is used for assignment, C) Both are used for assignment, D) Both are used for comparison");
        answers.add("A) = is used for assignment == is used for comparison");

        questions.add("What is the purpose of the include statement in PHP?");
        options.add("A) To define a class, B) To declare a variable, C) To include a file, D) To access a method");
        answers.add("C) To include a file");

        questions.add("What is the data type used to store large integers in PHP?");
        options.add("A) int, B) long, C) float, D) string");
        answers.add("B) long");

        questions.add("What is the purpose of the count() function in PHP?");
        options.add("A) To find the length of a string, B) To find the length of an array, C) To find the length of an object, D) To find the length of a file");
        answers.add("B) To find the length of an array");

        questions.add("What is the difference between foreach and for loops in PHP?");
        options.add("A) foreach is used for iterative loops for is used for conditional loops, B) foreach is used for conditional loops for is used for iterative loops, C) Both are used for iterative loops, D) Both are used for conditional loops");
        answers.add("A) foreach is used for iterative loops for is used for conditional loops");

        questions.add("What is the purpose of the try-catch block in PHP?");
        options.add("A) To handle exceptions, B) To declare a variable, C) To define a function, D) To exit a program");
        answers.add("A) To handle exceptions");

        questions.add("What is the data type used to store decimal numbers in PHP?");
        options.add("A) int, B) float, C) string, D) boolean");
        answers.add("B) float");

        questions.add("What is the purpose of the $_POST variable in PHP?");
        options.add("A) To access GET variables, B) To access POST variables, C) To access COOKIE variables, D) To access SESSION variables");
        answers.add("B) To access POST variables");
        
        questions.add("How do you define a constant in PHP?");
        options.add("A) define(), B) const, C) constant(), D) define_constant()");
        answers.add("A) define()");

        questions.add("What is the purpose of the 'namespace' keyword in PHP?");
        options.add("A) To define a class, B) To define a function, C) To define a namespace, D) To define a variable");
        answers.add("C) To define a namespace");

        questions.add("Which PHP function is used to sort an array in ascending order?");
        options.add("A) sort(), B) rsort(), C) asort(), D) ksort()");
        answers.add("A) sort()");

        questions.add("What is the difference between the 'include' and 'require' statements in PHP?");
        options.add("A) include is for files require is for functions, B) include is for functions require is for files, C) include is for classes require is for objects, D) include is for objects require is for classes");
        answers.add("A) include is for files require is for functions");

        questions.add("How do you check if a variable is an array in PHP?");
        options.add("A) is_array(), B) is_object(), C) is_string(), D) is_int()");
        answers.add("A) is_array()");

        questions.add("What is the purpose of the 'use' keyword in PHP?");
        options.add("A) To import a namespace, B) To import a class, C) To import a function, D) To import a variable");
        answers.add("A) To import a namespace");

        questions.add("Which PHP function is used to get the current timestamp?");
        options.add("A) time(), B) date(), C) timestamp(), D) now()");
        answers.add("A) time()");

        questions.add("What is the difference between the 'public', 'private', and 'protected' access modifiers in PHP?");
        options.add("A) public is for classes private is for objects protected is for inheritance, B) public is for objects private is for classes protected is for interfaces, C) public is for inheritance private is for classes protected is for objects, D) public is for interfaces private is for objects protected is for classes");
        answers.add("A) public is for classes private is for objects protected is for inheritance");


        questions.add("What is the purpose of the 'interface' keyword in PHP?");
        options.add("A) To define a class, B) To define a function, C) To define an interface, D) To define a variable");
        answers.add("C) To define an interface");

        questions.add("Which PHP function is used to get the number of elements in an array?");
        options.add("A) count(), B) size(), C) length(), D) num_elements()");
        answers.add("A) count()");

        questions.add("What is the difference between the 'echo' and 'print' statements in PHP?");
        options.add("A) echo is for strings print is for integers, B) echo is for integers print is for strings, C) echo is for arrays print is for objects, D) echo is for objects print is for arrays");
        answers.add("A) echo is for strings print is for integers");

        questions.add("How do you check if a variable is a string in PHP?");
        options.add("A) is_string(), B) is_int(), C) is_array(), D) is_object()");
        answers.add("A) is_string()");
        
        questions.add("What is the purpose of the PHP tag <?php?");
        options.add("A) To start a PHP code block, B) To end a PHP code block, C) To define a function, D) To include a file");
        answers.add("A) To start a PHP code block");

        questions.add("Who is the founder of PHP?");
        options.add("A) Rasmus Lerdorf, B) Andi Gutmans, C) Zend Technologies, D) PHP Group");
        answers.add("A) Rasmus Lerdorf");

        questions.add("What is the difference between PHP 5 and PHP 7?");
        options.add("A) PHP 5 is for Windows, PHP 7 is for Linux, B) PHP 5 is for Linux, PHP 7 is for Windows, C) PHP 5 is for older versions, PHP 7 is for newer versions, D) PHP 5 is for newer versions, PHP 7 is for older versions");
        answers.add("C) PHP 5 is for older versions, PHP 7 is for newer versions");

        questions.add("What is the purpose of the php.ini file?");
        options.add("A) To configure PHP settings, B) To define PHP functions, C) To include PHP files, D) To start PHP sessions");
        answers.add("A) To configure PHP settings");

        questions.add("What is the difference between include and require in PHP?");
        options.add("A) include is for files require is for functions, B) include is for functions, require is for files, C) include is for classes, require is for objects, D) include is for objects, require is for classes");
        answers.add("A) include is for files, require is for files");

        questions.add("What is the purpose of the $_GET superglobal array in PHP?");
        options.add("A) To store form data, B) To store session data, C) To store cookie data, D) To store GET request data");
        answers.add("D) To store GET request data");

        questions.add("What is the difference between mysql and mysqli in PHP?");
        options.add("A) mysql is for MySQL 4 mysqli is for MySQL 5, B) mysql is for MySQL 5 mysqli is for MySQL 4, C) mysql is for older versions mysqli is for newer versions, D) mysql is for newer versions mysqli is for older versions");
        answers.add("C) mysql is for older versions mysqli is for newer versions");

        questions.add("What is the purpose of the PDO extension in PHP?");
        options.add("A) To connect to MySQL databases, B) To connect to PostgreSQL databases, C) To connect to SQLite databases, D) To connect to multiple databases");
        answers.add("D) To connect to multiple databases");

        questions.add("What is the difference between foreach and for loops in PHP?");
        options.add("A) foreach is for arrays for is for objects, B) foreach is for objects for is for arrays, C) foreach is for iterating for is for indexing, D) foreach is for indexing for is for iterating");
        answers.add("C) foreach is for iterating for is for indexing");

        questions.add("What is the purpose of the namespace keyword in PHP?");
        options.add("A) To define a class, B) To define a function, C) To define a namespace, D) To define a variable");
        answers.add("C) To define a namespace");

        questions.add("What is the difference between public, private, and protected access modifiers in PHP?");
        options.add("A) public is for classes private is for objects protected is for inheritance, B) public is for objects private is for classes protected is for interfaces, C) public is for inheritance private is for classes protected is for objects, D) public is for interfaces private is for objects protected is for classes");
        answers.add("A) public is for classes private is for objects protected is for inheritance");

        questions.add("What is the purpose of the abstract keyword in PHP?");
        options.add("A) To define an abstract class, B) To define an abstract function, C) To define an abstract variable, D) To define an abstract interface");
        answers.add("A) To define an abstract class");

        questions.add("What is the difference between interface and abstract class in PHP?");
        options.add("A) interface is for multiple inheritance abstract class is for single inheritance, B) interface is for single inheritance abstract class is for multiple inheritance, C) interface is for abstract methods abstract class is for concrete methods, D) interface is for concrete methods abstract class is for abstract methods");
        answers.add("A) interface is for multiple inheritance abstract class is for single inheritance");

    }
    

    
    public static void main(String[]args){
        new Php_Quiz(name).setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);

    }
    
}
