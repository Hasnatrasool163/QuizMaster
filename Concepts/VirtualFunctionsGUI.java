package Concepts;

import javax.swing.SwingUtilities;

class VirtualFunctionsGUI extends AbstractConceptsGUI {

    public VirtualFunctionsGUI() {
        super("Virtual Functions");
    }
    @Override
    public String getTheoryText() {
        return """
               Virtual Functions:
               1. Functions that can be overridden in derived classes.
               2. Allow runtime polymorphism.
               
               Pure Virtual Functions:
               1. Declared by assigning 0 in their declaration.
               2. Makes a class abstract and cannot be instantiated.
               """;
    }

    @Override
    public String getExampleCode() {
        return """
               #include <iostream>
               using namespace std;
               
               class Base {
                   public:
                       virtual void display() {
                           cout << "Base display" << endl;
                       }
               };
               
               class Derived : public Base {
                   public:
                       void display() override {
                           cout << "Derived display" << endl;
                       }
               };
               
               class PureBase {
                   public:
                       virtual void show() = 0; // Pure virtual function
               };
               
               class PureDerived : public PureBase {
                   public:
                       void show() override {
                           cout << "PureDerived show" << endl;
                       }
               };
               
               int main() {
                   Base* b = new Derived();
                   b->display(); // Outputs: Derived display
                   
                   PureBase* pb = new PureDerived();
                   pb->show(); // Outputs: PureDerived show
                   return 0;
               }
               """;
    }

    
     @Override
    protected void addQuizQuestions() {
        addQuizQuestion(" Virtual functions allow runtime polymorphism.", true);
        addQuizQuestion("Pure virtual functions make a class abstract and cannot be instantiated.", true);
        addQuizQuestion("In the example, b->display() will output \"Base display.", false);
        addQuizQuestion("A pure virtual function is declared by assigning 0 in its declaration.", true);
    }

      public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VirtualFunctionsGUI frame = new VirtualFunctionsGUI();
            frame.setVisible(true);
        });
    }

}

