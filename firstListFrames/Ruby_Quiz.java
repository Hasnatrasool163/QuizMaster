package firstListFrames;

/**
 *
 * @author MuhammadHasnatRasool
 */

import frame.Quiz;
import java.awt.event.ActionEvent;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Ruby_Quiz extends Quiz{
    
    public Ruby_Quiz(String name){
         super(name);
        loadQuestions();
        
        for (int i = 0; i < questions.size(); i++) {
            indices.add(i);
        }
        Collections.shuffle(indices);
        System.out.println(indices);

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

    // quiz: 53
    @Override
    public final void loadQuestions() {
       
        
questions.add("What is Ruby?");
options.add("A) A database management system, B) A programming language, C) An operating system, D) A web browser");
answers.add("B) A programming language");

questions.add("Which of the following is true about Ruby?");
options.add("A) It is statically typed, B) It is dynamically typed, C) It is compiled, D) It is procedural");
answers.add("B) It is dynamically typed");

questions.add("How do you print 'Hello World!' in Ruby?");
options.add("A) echo 'Hello World!';, B) print 'Hello World!';, C) System.out.println('Hello World!');, D) console.log('Hello World!');");
answers.add("B) print 'Hello World!';");

questions.add("What is a symbol in Ruby?");
options.add("A) A string literal, B) A data type, C) A unique identifier, D) A reserved keyword");
answers.add("C) A unique identifier");

questions.add("Which keyword is used to define a method in Ruby?");
options.add("A) function, B) def, C) method, D) define");
answers.add("B) def");

questions.add("How do you define a class in Ruby?");
options.add("A) class MyClass, B) create class MyClass, C) define class MyClass, D) class MyClass {}");
answers.add("D) class MyClass {}");

questions.add("Which symbol is used for single-line comments in Ruby?");
options.add("A) //, B) #, C) --, D) /* */");
answers.add("B) #");

questions.add("How do you define a variable in Ruby?");
options.add("A) var x = 5;, B) let x = 5;, C) x = 5;, D) int x = 5;");
answers.add("C) x = 5;");

questions.add("What is the 'puts' method used for in Ruby?");
options.add("A) Adding elements to an array, B) Printing output with a newline, C) Performing mathematical operations, D) Defining a class");
answers.add("B) Printing output with a newline");

questions.add("How do you concatenate strings in Ruby?");
options.add("A) str1 + str2, B) str1.concat(str2), C) str1.join(str2), D) concat(str1, str2)");
answers.add("A) str1 + str2");

questions.add("Which method is used to convert a string to uppercase in Ruby?");
options.add("A) str.to_uppercase(), B) str.upper(), C) str.upcase(), D) toUpperCase(str)");
answers.add("C) str.upcase()");

questions.add("What does the 'each' method do in Ruby?");
options.add("A) Iterates over an array or hash, B) Adds elements to an array, C) Removes elements from an array, D) Sorts an array");
answers.add("A) Iterates over an array or hash");

questions.add("How do you check if a variable is nil in Ruby?");
options.add("A) var.nil?, B) var == nil, C) isNil(var), D) nil?(var)");
answers.add("B) var == nil");

questions.add("Which operator is used for range in Ruby?");
options.add("A) .., B) ..., C) :, D) =>");
answers.add("A) ..");

questions.add("How do you define a hash in Ruby?");
options.add("A) {key1: value1 key2: value2}, B) hashmap[key1] = value1;, C) create hash key1=value1 key2=value2, D) hash(key1 value1; key2 value2)");
answers.add("A) {key1: value1 key2: value2}");

questions.add("Which method is used to add an element to the end of an array in Ruby?");
options.add("A) array.append(element), B) array.push(element), C) array.add(element), D) array.insert(element)");
answers.add("B) array.push(element)");

questions.add("How do you access the last element of an array in Ruby?");
options.add("A) array.last(), B) array[-1], C) array.get_last(), D) array.end()");
answers.add("A) array.last()");

questions.add("Which loop is used for iterating a fixed number of times in Ruby?");
options.add("A) for loop, B) while loop, C) loop, D) times loop");
answers.add("A) for loop");

questions.add("How do you define a range of numbers in Ruby?");
options.add("A) range(1..10), B) (1..10).to_range(), C) 1.to(10), D) (1..10)");
answers.add("D) (1..10)");

questions.add("Which method is used to remove an element from an array by value in Ruby?");
options.add("A) array.remove(element), B) array.delete(element), C) array.erase(element), D) array.remove_element(element)");
answers.add("B) array.delete(element)");

questions.add("How do you check if a key exists in a hash in Ruby?");
options.add("A) hash.key?(key), B) hash.exists(key), C) key.exists?(hash), D) has_key?(hash, key)");
answers.add("A) hash.key?(key)");

questions.add("What does the 'map' method do in Ruby?");
options.add("A) Creates a new array based on existing array, B) Modifies existing array, C) Removes elements from array, D) Sorts array");
answers.add("A) Creates a new array based on existing array");

questions.add("How do you define a lambda function in Ruby?");
options.add("A) lambda { |params| ... }, B) func.lambda { |params| ... }, C) def lambda(params): ..., D) create lambda function (params) {}");
answers.add("A) lambda { |params| ... }");

questions.add("Which module provides support for regular expressions in Ruby?");
options.add("A) regex, B) re, C) regexp, D) regexlib");
answers.add("B) re");

questions.add("How do you open and read from a file in Ruby?");
options.add("A) file.read(), B) open(file).read, C) File.open(file 'r') { |f| f.read }, D) read(file.open())");
answers.add("C) File.open(file 'r') { |f| f.read }");

questions.add("What is the purpose of 'attr_accessor' in Ruby?");
options.add("A) Create an attribute with getter and setter methods, B) Define a private attribute, C) Access an attribute without methods, D) Define static attributes");
answers.add("A) Create an attribute with getter and setter methods");

questions.add("Which method is used to convert an object to JSON in Ruby?");
options.add("A) obj.to_json(), B) json.convert(obj), C) JSON.encode(obj), D) convert_to_json(obj)");
answers.add("A) obj.to_json()");

questions.add("How do you raise an exception in Ruby?");
options.add("A) raise Exception, B) throw Exception, C) exception.raise(), D) throw_error(Exception)");
answers.add("A) raise Exception");

questions.add("Which method is used to get current time in Ruby?");
options.add("A) time.now(), B) Time.now, C) current_time(), D) now.time()");
answers.add("B) Time.now");

questions.add("What is the purpose of 'include' keyword in Ruby?");
options.add("A) Include a module's methods in a class, B) Import another file, C) Include a file as module, D) Define include condition");
answers.add("A) Include a module's methods in a class");

questions.add("How do you check the type of an object in Ruby?");
options.add("A) obj.type(), B) obj.class(), C) typeof obj, D) get_type(obj)");
answers.add("B) obj.class()");

questions.add("Which method is used to convert a string to an integer in Ruby?");
options.add("A) str.to_i, B) parseInt(str), C) convert_to_integer(str), D) str.convert_integer()");
answers.add("A) str.to_i");

questions.add("How do you define a constant in Ruby?");
options.add("A) const MY_CONSTANT = value, B) define constant MY_CONSTANT = value, C) MY_CONSTANT = value, D) constant.set(MY_CONSTANT, value)");
answers.add("A) const MY_CONSTANT = value");

questions.add("What is the purpose of 'yield' in Ruby?");
options.add("A) Return a value from a method, B) Pass control to a block, C) Invoke a method, D) Exit a block");
answers.add("B) Pass control to a block");

questions.add("Which method is used to sort an array in Ruby?");
options.add("A) array.sort(), B) sort(array), C) array.sorted(), D) sorted_array(array)");
answers.add("A) array.sort()");

questions.add("How do you round a floating-point number in Ruby?");
options.add("A) round(number), B) number.round(), C) float.round(), D) round_float(number)");
answers.add("B) number.round()");

questions.add("Which method is used to iterate over key-value pairs in a hash in Ruby?");
options.add("A) hash.each, B) each_pair(hash), C) hash.iterate_pairs, D) pairs.each(hash)");
answers.add("A) hash.each");

questions.add("How do you check if a file exists in Ruby?");
options.add("A) File.exists?(file), B) file.exists?, C) file.exist?, D) exists(file)");
answers.add("C) file.exist?");

questions.add("What does the 'reduce' method do in Ruby?");
options.add("A) Combine elements of an array into a single value, B) Reduce array size, C) Remove elements from array, D) Sort array");
answers.add("A) Combine elements of an array into a single value");

questions.add("How do you convert a number to a string in Ruby?");
options.add("A) number.to_s, B) str(number), C) convert_to_string(number), D) str.convert(number)");
answers.add("A) number.to_s");

questions.add("Which method is used to shuffle elements of an array in Ruby?");
options.add("A) array.shuffle, B) shuffle_array(array), C) shuffle(array), D) array.shuffle()");
answers.add("D) array.shuffle()");

questions.add("How do you check if a string contains another substring in Ruby?");
options.add("A) str.contains?(substr), B) str.include?(substr), C) contains(str, substr), D) includes(str, substr)");
answers.add("B) str.include?(substr)");

questions.add("What is the purpose of 'super' keyword in Ruby?");
options.add("A) Call superclass constructor, B) Define a superclass, C) Invoke superclass method, D) Pass control to superclass");
answers.add("C) Invoke superclass method");

questions.add("Which method is used to find the index of an element in an array in Ruby?");
options.add("A) array.find_index, B) index(array, element), C) find(array, element), D) array.index(element)");
answers.add("D) array.index(element)");

questions.add("How do you convert a string to a symbol in Ruby?");
options.add("A) str.to_symbol, B) symbol(str), C) convert_to_symbol(str), D) str.to_sym");
answers.add("D) str.to_sym");

questions.add("Which method is used to split a string into an array in Ruby?");
options.add("A) str.split, B) split_string(str), C) array.split(str), D) split(str)");
answers.add("A) str.split");

questions.add("How do you get the current process ID in Ruby?");
options.add("A) Process.id, B) pid(), C) get_pid(), D) Process.pid");
answers.add("D) Process.pid");

questions.add("What is the purpose of 'module' keyword in Ruby?");
options.add("A) Define a module, B) Import a module, C) Include a module, D) Extend a module");
answers.add("A) Define a module");

questions.add("Which method is used to convert a string to lowercase in Ruby?");
options.add("A) str.lowercase, B) str.downcase, C) to_lowercase(str), D) convert_to_lowercase(str)");
answers.add("B) str.downcase");

questions.add("How do you remove leading and trailing whitespace from a string in Ruby?");
options.add("A) str.trim, B) trim(str), C) str.strip, D) strip(str)");
answers.add("C) str.strip");

questions.add("What is the purpose of 'self' keyword in Ruby?");
options.add("A) Reference current object, B) Define class method, C) Call superclass method, D) Return object itself");
answers.add("A) Reference current object");

questions.add("Which method is used to convert a string to uppercase in Ruby?");
options.add("A) str.to_uppercase, B) str.upper, C) to_upper(str), D) str.upcase");
answers.add("D) str.upcase");

questions.add("How do you convert a string to an integer in Ruby?");
options.add("A) str.to_integer, B) parseInt(str), C) convert_to_integer(str), D) str.to_i");
answers.add("D) str.to_i");

    }
    
 
     @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
    }
    
    public static void main(String[]args){
        new Ruby_Quiz(name).setVisible(true);
    }
}
