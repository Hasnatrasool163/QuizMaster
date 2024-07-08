package Concepts;

import javax.swing.SwingUtilities;

public class PolymorphismGUI extends AbstractConceptsGUI {

    public PolymorphismGUI() {
        super("Polymorphism in C++");
    }

    @Override
    protected String getTheoryText() {
        return """
               Polymorphism in C++ allows objects of different classes to be treated as objects of a common superclass.
               
               Key Concepts:
               1. Compile-time Polymorphism: Function Overloading
               2. Run-time Polymorphism: Virtual Functions, Override
               3. Abstract Classes and Pure Virtual Functions
               4. Object Slicing and Pointers
               
               Example of Virtual Functions:
               class Animal {
               public:
                   virtual void makeSound() {
                       cout << "Animal sound" << endl;
                   }
               };

               class Dog : public Animal {
               public:
                   void makeSound() override {
                       cout << "Bark!" << endl;
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
               public:
                   virtual void makeSound() {
                       cout << "Animal sound" << endl;
                   }
               };

               class Dog : public Animal {
               public:
                   void makeSound() override {
                       cout << "Bark!" << endl;
                   }
               };

               int main() {
                   Animal* animal = new Dog();
                   animal->makeSound(); // Output: Bark!
                   delete animal;
                   return 0;
               }
               """;
    }

    @Override
    protected void addQuizQuestions() {
        addQuizQuestion("Polymorphism in C++ allows objects of different classes to be treated as objects of a common superclass.", true);
        addQuizQuestion("Function overloading is an example of run-time polymorphism.", false);
        addQuizQuestion("Virtual functions in C++ are resolved at compile-time.", false);
        addQuizQuestion("Object slicing occurs when a derived class object is assigned to a base class object.", true);
        addQuizQuestion("Abstract classes in C++ cannot have any concrete methods.", false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PolymorphismGUI frame = new PolymorphismGUI();
            frame.setVisible(true);
        });
    }
}
