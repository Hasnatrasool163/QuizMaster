package firstListFrames;

/**
 *
 * @author MuhammadHasnatRasool
 */


import frame.Quiz;

public class Python_Quiz extends Quiz{
    
    public Python_Quiz(String name){
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

    // quiz 88.
    @Override
    public final void loadQuestions() {
        
        questions.add("What is the output of print(range(10))?");
        options.add("A) [0 1 2 3 4 5 6 7 8 9], B) (0 1 2 3 4 5 6 7 8 9), C) 0 1 2 3 4 5 6 7 8 9, D) None");
        answers.add("A) [0 1 2 3 4 5 6 7 8 9]");
        
        questions.add("What is the purpose of the __init.py file in a Python package?");
        options.add("A) To define the package's version B) To define the package's author C) To define the package's dependencies D) To mark the directory as a package");
        answers.add("D) To mark the directory as a package");
        
        questions.add("What is the purpose of the yield keyword in Python?");
        options.add("A) To define a generator B) To define a function C) To define a class D) To define a variable");
        answers.add("A) To define a generator");
        
        questions.add("What is the output of print(1 + 2j)?"); 
        options.add("A) 3 B) 1 + 2j C) 1 - 2j D) 2 + 1j"); 
        answers.add("B) 1 + 2j");
        
        questions.add("What is the purpose of the slots attribute in Python?"); 
        options.add("A) To define the class's attributes B) To define the class's methods C) To define the class's inheritance D) To optimize memory usage"); 
        answers.add("D) To optimize memory usage");
        
        questions.add("What is the difference between is and == in Python?"); 
        options.add("A) is checks for identity == checks for equality B) is checks for equality == checks for identity C) is checks for type == checks for value D) is checks for value == checks for type"); 
        answers.add("A) is checks for identity == checks for equality");

        questions.add("What is the purpose of the lambda function in Python?"); 
        options.add("A) To define a small anonymous function B) To define a large anonymous function C) To define a named function D) To define a class"); 
        answers.add("A) To define a small anonymous function");

        questions.add("What is the output of print(1 // 2)?"); 
        options.add("A) 0 B) 0.5 C) 1 D) 2"); 
        answers.add("A) 0");
        
        questions.add("What is the purpose of the enumerate function in Python?");
        options.add("A) To iterate over a list B) To iterate over a dictionary C) To iterate over a set D) To iterate over a tuple"); 
        answers.add("A) To iterate over a list");
        
        questions.add("What is the purpose of the reversed function in Python?"); 
        options.add("A) To reverse a list B) To reverse a string C) To reverse a tuple D) To reverse a dictionary"); 
        answers.add("A) To reverse a list");
        
        questions.add("What is the output of print(set([1, 2, 3, 2, 1]))?"); 
        options.add("A) {1 2 3} B) {1 2 3 2 1} C) {1 1 2 2 3} D) {}"); 
        answers.add("A) {1 2 3}");
        
        questions.add("What is the purpose of the sorted function in Python?"); 
        options.add("A) To sort a list in ascending order B) To sort a list in descending order C) To sort a dictionary by key D) To sort a dictionary by value"); 
        answers.add("A) To sort a list in ascending order");
        
        questions.add("What is the purpose of the pickle module in Python?");
        options.add("A) To serialize objects, B) To deserialize objects, C) To compress data, D) To encrypt data");
        answers.add("A) To serialize objects");

        questions.add("What is the use case for the json module in Python?");
        options.add("A) To work with JSON data, B) To work with XML data, C) To work with CSV data, D) To work with HTML data");
        answers.add("A) To work with JSON data");

        questions.add("What is the purpose of the yaml module in Python?");
        options.add("A) To work with YAML data, B) To work with JSON data, C) To work with XML data, D) To work with CSV data");
        answers.add("A) To work with YAML data");

        questions.add("What is the use case for the csv module in Python?");
        options.add("A) To work with CSV data, B) To work with JSON data, C) To work with XML data, D) To work with HTML data");
        answers.add("A) To work with CSV data");

        questions.add("What is the purpose of the sqlite3 module in Python?");
        options.add("A) To work with SQLite databases, B) To work with MySQL databases, C) To work with PostgreSQL databases, D) To work with Oracle databases");
        answers.add("A) To work with SQLite databases");

        questions.add("What is the use case for the pandas module in Python?");
        options.add("A) To work with data analysis, B) To work with data visualization, C) To work with machine learning, D) To work with web development");
        answers.add("A) To work with data analysis");

        questions.add("What is the purpose of the numpy module in Python?");
        options.add("A) To work with numerical data, B) To work with text data, C) To work with image data, D) To work with audio data");
        answers.add("A) To work with numerical data");

        questions.add("What is the use case for the scipy module in Python?");
        options.add("A) To work with scientific computing, B) To work with data analysis, C) To work with machine learning, D) To work with web development");
        answers.add("A) To work with scientific computing");

        questions.add("What is the purpose of the matplotlib module in Python?");
        options.add("A) To work with data visualization, B) To work with data analysis, C) To work with machine learning, D) To work with web development");
        answers.add("A) To work with data visualization");

        questions.add("What is the use case for the seaborn module in Python?");
        options.add("A) To work with data visualization, B) To work with data analysis, C) To work with machine learning, D) To work with web development");
        answers.add("A) To work with data visualization");

        questions.add("What is the purpose of the scikit-learn module in Python?");
        options.add("A) To work with machine learning, B) To work with data analysis, C) To work with data visualization, D) To work with web development");
        answers.add("A) To work with machine learning");

        questions.add("What is the use case for the tensorflow module in Python?");
        options.add("A) To work with machine learning, B) To work with data analysis, C) To work with data visualization, D) To work with web development");
        answers.add("A) To work with machine learning");

        questions.add("What is the purpose of the keras module in Python?");
        options.add("A) To work with deep learning, B) To work with machine learning, C) To work with data analysis, D) To work with web development");
        answers.add("A) To work with deep learning");

        questions.add("What is the use case for the openCV module in Python?");
        options.add("A) To work with computer vision, B) To work with machine learning, C) To work with data analysis, D) To work with web development");
        answers.add("A) To work with computer vision");
        
        questions.add("What is the basic syntax to print output in Python?");
        options.add("A) print(), B) printf(), C) output(), D) display()");
        answers.add("A) print()");

        questions.add("What is the purpose of the def keyword in Python?");
        options.add("A) To define a variable, B) To declare a function, C) To include a module, D) To exit a program");
        answers.add("B) To declare a function");

        questions.add("What is the difference between = and == in Python?");
        options.add("A) = is used for assignment == is used for comparison, B) = is used for comparison == is used for assignment, C) Both are used for assignment, D) Both are used for comparison");
        answers.add("A) = is used for assignment == is used for comparison");

        questions.add("What is the purpose of the import statement in Python?");
        options.add("A) To define a class, B) To declare a variable, C) To include a module, D) To access a method");
        answers.add("C) To include a module");

        questions.add("What is the data type used to store large integers in Python?");
        options.add("A) int, B) long, C) float, D) complex");
        answers.add("B) long");

        questions.add("What is the purpose of the len() function in Python?");
        options.add("A) To find the length of a string, B) To find the length of a list, C) To find the length of a dictionary, D) To find the length of a tuple");
        answers.add("B) To find the length of a list");

        questions.add("What is the difference between for and while loops in Python?");
        options.add("A) for is used for iterative loops while is used for conditional loops, B) for is used for conditional loops while is used for iterative loops, C) Both are used for iterative loops, D) Both are used for conditional loops");
        answers.add("A) for is used for iterative loops while is used for conditional loops");

        questions.add("What is the purpose of the try-except block in Python?");
        options.add("A) To handle exceptions, B) To declare a variable, C) To define a function, D) To exit a program");
        answers.add("A) To handle exceptions");

        questions.add("What is the data type used to store decimal numbers in Python?");
        options.add("A) int, B) float, C) complex, D) string");
        answers.add("B) float");

        questions.add("What is the purpose of the lambda function in Python?");
        options.add("A) To define a regular function, B) To define a lambda function, C) To declare a variable, D) To exit a program");
        answers.add("B) To define a lambda function");
        
        questions.add("What is the purpose of the print() function in Python?");
        options.add("A) To assign a value to a variable, B) To print a message to the screen, C) To ask the user for input, D) To define a function");
        answers.add("B) To print a message to the screen");

        questions.add("Who is the creator of the Python programming language?");
        options.add("A) Guido van Rossum, B) Linus Torvalds, C) Larry Wall, D) Richard Stallman");
        answers.add("A) Guido van Rossum");

        questions.add("What is the difference between list and tuple in Python?");
        options.add("A) list is mutable tuple is immutable, B) list is immutable tuple is mutable, C) list is for strings tuple is for integers, D) list is for integers tuple is for strings");
        answers.add("A) list is mutable tuple is immutable");

        questions.add("What is the purpose of the def keyword in Python?");
        options.add("A) To define a variable, B) To define a function, C) To define a class, D) To define a module");
        answers.add("B) To define a function");

        questions.add("What is the difference between for and while loops in Python?");
        options.add("A) for is for iterating over a sequence while is for repeating a block of code, B) for is for repeating a block of code while is for iterating over a sequence, C) for is for integers while is for strings, D) for is for strings while is for integers");
        answers.add("A) for is for iterating over a sequence while is for repeating a block of code");

        questions.add("What is the purpose of the import statement in Python?");
        options.add("A) To define a function, B) To define a class, C) To import a module, D) To export a module");
        answers.add("C) To import a module");

        questions.add("What is the difference between class and object in Python?");
        options.add("A) class is a blueprint object is an instance, B) class is an instance object is a blueprint, C) class is for inheritance object is for polymorphism, D) class is for polymorphism object is for inheritance");
        answers.add("A) class is a blueprint object is an instance");

        questions.add("What is the purpose of the try/except block in Python?");
        options.add("A) To handle errors, B) To handle exceptions, C) To handle warnings, D) To handle messages");
        answers.add("B) To handle exceptions");

        questions.add("What is the difference between str and bytes in Python?");
        options.add("A) str is for strings bytes is for integers, B) str is for integers bytes is for strings, C) str is for text bytes is for binary data, D) str is for binary data bytes is for text");
        answers.add("C) str is for text bytes is for binary data");

        questions.add("What is the purpose of the lambda function in Python?");
        options.add("A) To define a function, B) To define a variable, C) To define a class, D) To define a module");
        answers.add("A) To define a function");

        questions.add("What is the difference between sorted() and sort() in Python?");
        options.add("A) sorted() is for lists sort() is for tuples, B) sorted() is for tuples sort() is for lists, C) sorted() is for ascending order sort() is for descending order, D) sorted() is for descending order sort() is for ascending order");
        answers.add("C) sorted() is for ascending order sort() is for descending order");

        questions.add("What is the purpose of the enumerate() function in Python?");
        options.add("A) To iterate over a sequence, B) To iterate over a dictionary, C) To iterate over a set, D) To iterate over a tuple");
        answers.add("A) To iterate over a sequence");

        questions.add("What is the difference between zip() and unzip() in Python?");
        options.add("A) zip() is for compressing unzip() is for decompressing, B) zip() is for decompressing unzip() is for compressing, C) zip() is for combining unzip() is for separating, D) zip() is for separating unzip() is for combining");
        answers.add("C) zip() is for combining unzip() is for separating");
        
        questions.add("What is the purpose of the requests library in Python?");
        options.add("A) To make HTTP requests, B) To parse HTML documents, C) To work with databases, D) To perform data analysis");
        answers.add("A) To make HTTP requests");

        questions.add("What is the use case for the pandas library in Python?");
        options.add("A) Data analysis and manipulation, B) Web development, C) Game development, D) Network programming");
        answers.add("A) Data analysis and manipulation");

        questions.add("What is the purpose of the numpy library in Python?");
        options.add("A) To work with numerical data, B) To work with text data, C) To work with images, D) To work with audio");
        answers.add("A) To work with numerical data");

        questions.add("What is the use case for the matplotlib library in Python?");
        options.add("A) Data visualization, B) Web development, C) Game development, D) Network programming");
        answers.add("A) Data visualization");

        questions.add("What is the purpose of the scikit-learn library in Python?");
        options.add("A) Machine learning, B) Data analysis, C) Web development, D) Game development");
        answers.add("A) Machine learning");

        questions.add("What is the use case for the seaborn library in Python?");
        options.add("A) Data visualization, B) Data analysis, C) Machine learning, D) Web development");
        answers.add("A) Data visualization");

        questions.add("What is the purpose of the tensorflow library in Python?");
        options.add("A) Machine learning, B) Data analysis, C) Web development, D) Game development");
        answers.add("A) Machine learning");

        questions.add("What is the use case for the keras library in Python?");
        options.add("A) Deep learning, B) Data analysis, C) Web development, D) Game development");
        answers.add("A) Deep learning");

        questions.add("What is the purpose of the openCV library in Python?");
        options.add("A) Computer vision, B) Data analysis, C) Web development, D) Game development");
        answers.add("A) Computer vision");

        questions.add("What is the use case for the scipy library in Python?");
        options.add("A) Scientific computing, B) Data analysis, C) Web development, D) Game development");
        answers.add("A) Scientific computing");

        questions.add("What is the purpose of the statsmodels library in Python?");
        options.add("A) Statistical modeling, B) Data analysis, C) Web development, D) Game development");
        answers.add("A) Statistical modeling");

        questions.add("What is the use case for the pandas-datareader library in Python?");
        options.add("A) Financial data analysis, B) Data analysis, C) Web development, D) Game development");
        answers.add("A) Financial data analysis");

        questions.add("What is the purpose of the BeautifulSoup library in Python?");
        options.add("A) Web scraping, B) Data analysis, C) Web development, D) Game development");
        answers.add("A) Web scraping");

        questions.add("What is the use case for the Selenium library in Python?");
        options.add("A) Web automation, B) Data analysis, C) Web development, D) Game development");
        answers.add("A) Web automation");

        questions.add("What is the purpose of the pygame library in Python?");
        options.add("A) Game development, B) Data analysis, C) Web development, D) Scientific computing");
        answers.add("A) Game development");

        questions.add("What is the use case for the pyglet library in Python?");
        options.add("A) Game development, B) Data analysis, C) Web development, D) Scientific computing");
        answers.add("A) Game development");

        questions.add("What is the purpose of the pyQt library in Python?");
        options.add("A) GUI development, B) Data analysis, C) Web development, D) Game development");
        answers.add("A) GUI development");
        
        questions.add("What is cross platform library in Python for Gui development?");
        options.add("A) PyQt, B) Tkinter, C) pyglet, D) none of these");
        answers.add("B) PyQt");

        questions.add("What is the use case for the wxPython library in Python?");
        options.add("A) GUI development, B) Data analysis, C) Web development, D) Game development");
        answers.add("A) GUI development");
        
        questions.add("What is the use case for tags in tkinter library in Python?");
        options.add("A) marking, B) highlighting, C) bookmark, D) none of these");
        answers.add("B) highlighting");

        questions.add("What is the purpose of the pycryptodome library in Python?");
        options.add("A) Cryptography, B) Data analysis, C) Web development, D) Game development");
        answers.add("A) Cryptography");

        questions.add("What is the use case for the pyOpenSSL library in Python?");
        options.add("A) Cryptography, B) Data analysis, C) Web development, D) Game development");
        answers.add("A) Cryptography");
        
        questions.add("What is the purpose of the functools module in Python?");
        options.add("A) To work with functions, B) To work with data structures, C) To work with files, D) To work with networks");
        answers.add("A) To work with functions");

        questions.add("What is the use case for the itertools module in Python?");
        options.add("A) To work with iterators, B) To work with generators, C) To work with lists, D) To work with dictionaries");
        answers.add("A) To work with iterators");

        questions.add("What is the purpose of the collections module in Python?");
        options.add("A) To work with collections, B) To work with data structures, C) To work with files, D) To work with networks");
        answers.add("A) To work with collections");

        questions.add("What is the use case for the re module in Python?");
        options.add("A) To work with regular expressions, B) To work with strings, C) To work with lists, D) To work with dictionaries");
        answers.add("A) To work with regular expressions");

        questions.add("What is the purpose of the json module in Python?");
        options.add("A) To work with JSON data, B) To work with XML data, C) To work with CSV data, D) To work with HTML data");
        answers.add("A) To work with JSON data");

        questions.add("What is the use case for the urllib module in Python?");
        options.add("A) To work with URLs, B) To work with HTTP requests, C) To work with HTML parsing, D) To work with web scraping");
        answers.add("B) To work with HTTP requests");

        questions.add("What is the purpose of the datetime module in Python?");
        options.add("A) To work with dates and times, B) To work with strings, C) To work with lists, D) To work with dictionaries");
        answers.add("A) To work with dates and times");

        questions.add("What is the use case for the math module in Python?");
        options.add("A) To work with mathematical functions, B) To work with statistical analysis, C) To work with data visualization, D) To work with machine learning");
        answers.add("A) To work with mathematical functions");

        questions.add("What is the purpose of the random module in Python?");
        options.add("A) To generate random numbers, B) To work with statistical analysis, C) To work with data visualization, D) To work with machine learning");
        answers.add("A) To generate random numbers");

        questions.add("What is the use case for the os module in Python?");
        options.add("A) To work with operating system functions, B) To work with file systems, C) To work with networks, D) To work with databases");
        answers.add("A) To work with operating system functions");

        questions.add("What is the purpose of the sys module in Python?");
        options.add("A) To work with system functions, B) To work with file systems, C) To work with networks, D) To work with databases");
        answers.add("A) To work with system functions");

        questions.add("What is the use case for the logging module in Python?");
        options.add("A) To work with logging and debugging, B) To work with error handling, C) To work with testing, D) To work with deployment");
        answers.add("A) To work with logging and debugging");

        questions.add("What is the purpose of the unittest module in Python?");
        options.add("A) To work with unit testing, B) To work with integration testing, C) To work with functional testing, D) To work with acceptance testing");
        answers.add("A) To work with unit testing");

        questions.add("What is the use case for the concurrent.futures module in Python?");
        options.add("A) To work with concurrent programming, B) To work with parallel programming, C) To work with asynchronous programming, D) To work with synchronous programming");
        answers.add("A) To work with concurrent programming");

        questions.add("What is the purpose of the asyncio module in Python?");
        options.add("A) To work with asynchronous programming, B) To work with concurrent programming, C) To work with parallel programming, D) To work with synchronous programming");
        answers.add("A) To work with asynchronous programming");

        questions.add("What is the use case for the contextlib module in Python?");
        options.add("A) To work with context managers, B) To work with decorators, C) To work with generators, D) To work with iterators");
        answers.add("A) To work with context managers");
        
        questions.add("What library can be used to perform operating system related task in Python?");
        options.add("A) system, B) Os, C) controls, D) none of these");
        answers.add("B) Os");
    }
    

    public static void main(String[]args){
        new Python_Quiz(name).setVisible(true);
    }
}
