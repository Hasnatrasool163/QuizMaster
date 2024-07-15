package firstListFrames;

import frame.True_False_Questions;

public class Ruby_TF extends True_False_Questions {

    public Ruby_TF(String name) {
        super(name);
    }
// ruby tf 57
    @Override
    public final void loadQuestions() {

        questions.add("Ruby is a compiled language.");
        answers.add("False");

        questions.add("Ruby has built-in support for parallel processing.");
        answers.add("False");

        questions.add("The String class in Ruby is immutable.");
        answers.add("False");

        questions.add("Ruby has a built-in method for generating random numbers.");
        answers.add("False");

        questions.add("The Array class in Ruby has a fixed size.");
        answers.add("False");

        questions.add("Ruby has built-in support for functional programming.");
        answers.add("False");

        questions.add("The Hash class in Ruby is ordered.");
        answers.add("False");

        questions.add("Ruby has a built-in method for converting strings to symbols.");
        answers.add("False");

        questions.add("The Module class in Ruby is used to define classes.");
        answers.add("False");

        questions.add("Ruby has built-in support for operator overloading.");
        answers.add("False");

        questions.add("The Class class in Ruby is a subclass of the Module class.");
        answers.add("False");

        questions.add("Ruby has a built-in method for cloning objects.");
        answers.add("False");

        questions.add("The Symbol class in Ruby has a to_s method.");
        answers.add("False");

        questions.add("Ruby has built-in support for multithreading.");
        answers.add("False");

        questions.add("The Exception class in Ruby is a subclass of the StandardError class.");
        answers.add("False");

        questions.add("The def keyword is used to define a class in Ruby.");
        answers.add("False");

        questions.add("The class keyword is used to define a method in Ruby.");
        answers.add("False");

        questions.add("The module keyword is used to define a namespace in Ruby.");
        answers.add("True");

        questions.add("The include keyword is used to mix in a module into a class in Ruby.");
        answers.add("True");

        questions.add("The extend keyword is used to add methods to a class in Ruby.");
        answers.add("True");

        questions.add("The require keyword is used to load a Ruby file into memory.");
        answers.add("True");

        questions.add("The load keyword is used to execute a Ruby file immediately.");
        answers.add("True");

        questions.add("The yield keyword is used to define a block in Ruby.");
        answers.add("True");

        questions.add("The Proc class is used to define a procedure in Ruby.");
        answers.add("True");

        questions.add("The Lambda class is used to define a lambda function in Ruby.");
        answers.add("True");

        questions.add("The enum keyword is used to define an enumeration in Ruby.");
        answers.add("False");

        questions.add("The struct keyword is used to define a structure in Ruby.");
        answers.add("False");

        questions.add("The gemit command is used to install a Ruby package.");
        answers.add("False");

        questions.add("The bundler command is used to manage Ruby dependencies.");
        answers.add("True");

        questions.add("The rails command is used to generate a new Ruby on Rails project.");
        answers.add("True");

        questions.add("The ruby command is used to execute a Ruby script.");
        answers.add("True");

        questions.add("Ruby was created by Yukihiro Matsumoto in 1995.");
        answers.add("True");

        questions.add("Ruby is a statically-typed language.");
        answers.add("False");

        questions.add("Ruby is an object-oriented language.");
        answers.add("True");

        questions.add("Ruby has built-in support for concurrency.");
        answers.add("True");

        questions.add("The Ruby standard library includes a module for parsing XML.");
        answers.add("True");

        questions.add("The Ruby standard library includes a module for generating JSON.");
        answers.add("True");

        questions.add("Ruby has a built-in method for sorting arrays.");
        answers.add("True");

        questions.add("Ruby has a built-in method for reversing strings.");
        answers.add("True");

        questions.add("The Symbol class in Ruby represents a string literal.");
        answers.add("False");

        questions.add("The Hash class in Ruby represents a collection of key-value pairs.");
        answers.add("True");

        questions.add("The Array class in Ruby represents a collection of elements of different types.");
        answers.add("True");

        questions.add("Ruby has built-in support for regular expressions.");
        answers.add("True");

        questions.add("Ruby has built-in support for exception handling.");
        answers.add("True");

        questions.add("The rescue keyword in Ruby is used to catch exceptions.");
        answers.add("True");

        questions.add("The ensure keyword in Ruby is used to guarantee that code will run regardless of exceptions.");
        answers.add("True");

        questions.add("Ruby has a built-in method for converting strings to integers.");
        answers.add("True");

        questions.add("Ruby has a built-in method for converting integers to strings.");
        answers.add("True");

        questions.add("The Rails framework is built on top of the Ruby language.");
        answers.add("True");

        questions.add("The Sinatra framework is built on top of the Ruby language.");
        answers.add("True");

        questions.add("Ruby has a built-in method for reading files line-by-line.");
        answers.add("True");

        questions.add("Ruby has a built-in method for writing to files.");
        answers.add("True");

        questions.add("The CSV library in Ruby is used for parsing comma-separated values.");
        answers.add("True");

        questions.add("The JSON library in Ruby is used for generating and parsing JSON data.");
        answers.add("True");

        questions.add("The Nokogiri library in Ruby is used for parsing HTML and XML documents.");
        answers.add("True");

        questions.add("The RSpec library in Ruby is used for unit testing.");
        answers.add("True");

        questions.add("The Cucumber library in Ruby is used for behavior-driven development.");
        answers.add("True");

    }

    public static void main(String[] args) {
        new Ruby_TF(name).setVisible(true);
    }

}
