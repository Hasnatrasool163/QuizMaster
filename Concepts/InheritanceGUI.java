package Concepts;

import javax.swing.SwingUtilities;

public class InheritanceGUI extends AbstractConceptsGUI {

    public InheritanceGUI() {
        super("Inheritance in C++");
    }

    @Override
    protected String getTheoryText() {
        return """
               Inheritance in C++ allows one class (derived class) to inherit the members of another class (base class).
               
               Key Concepts:
               1. Single Inheritance vs. Multiple Inheritance
               2. Derived Class and Base Class
               3. Access Specifiers: public, protected, private
               4. Overriding vs. Overloading
               
               Example of Single Inheritance:
               class Animal {
               protected:
                   string name;
               public:
                   void setName(string n) {
                       name = n;
                   }
               };

               class Dog : public Animal {
               public:
                   void bark() {
                       cout << "Woof! My name is " << name << endl;
                   }
               };
               """;
    }

    @Override
    protected String getExampleCode() {
        return """
               #include <iostream>
               using namespace std;

               class Animal {
               protected:
                   string name;
               public:
                   void setName(string n) {
                       name = n;
                   }
               };

               class Dog : public Animal {
               public:
                   void bark() {
                       cout << "Woof! My name is " << name << endl;
                   }
               };

               int main() {
                   Dog myDog;
                   myDog.setName("Buddy");
                   myDog.bark();
                   return 0;
               }
               """;
    }

    @Override
    protected void addQuizQuestions() {
        addQuizQuestion("Inheritance in C++ allows a class to inherit the members of another class.", true);
        addQuizQuestion("Private members of the base class are accessible in the derived class.", false);
        addQuizQuestion("Multiple inheritance is supported in C++.", true);
        addQuizQuestion("Overloading a function in C++ involves having multiple functions with the same name but different parameters.", true);
        addQuizQuestion("Inheritance is used primarily for code reuse and modularity in C++.", true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            InheritanceGUI frame = new InheritanceGUI();
            frame.setVisible(true);
        });
    }
}
