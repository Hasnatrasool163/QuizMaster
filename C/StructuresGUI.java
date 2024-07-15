package C;

import Concepts.AbstractConceptsGUI;
import javax.swing.SwingUtilities;

public class StructuresGUI extends AbstractConceptsGUI {

    public StructuresGUI() {
        super("Structures in C");
    }

    @Override
    protected String getTheoryText() {
        return """
               Structures in C allow grouping different data types together.
               
               Key Concepts:
               1. struct keyword
               2. Structure Members: fields or members
               3. Accessing Structure Members
               4. Nested Structures
               
               Example of Using Structures:
               struct Employee {
                   char name[50];
                   int age;
                   float salary;
               };
               """;
    }

    @Override
    protected String getExampleCode() {
        return """
               #include <stdio.h>

               struct Employee {
                   char name[50];
                   int age;
                   float salary;
               };

               int main() {
                   struct Employee emp;
                   emp.age = 30;
                   printf("Employee age: %d", emp.age);
                   return 0;
               }
               """;
    }

    @Override
    protected void addQuizQuestions() {
        addQuizQuestion("Structures in C allow grouping different data types together.", true);
        addQuizQuestion("Structure members in C cannot have different data types.", false);
        addQuizQuestion("Nested structures in C are not supported.", false);
        addQuizQuestion("Accessing structure members in C is done using the dot (.) operator.", true);
        addQuizQuestion("Structures in C are similar to classes in object-oriented programming languages.", true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            StructuresGUI frame = new StructuresGUI();
            frame.setVisible(true);
        });
    }
}
