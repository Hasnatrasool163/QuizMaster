
package Concepts;

class OverloadingVsOverridingHandler  {
    
    public String getTheoryText() {
        return """
               Overloading:
               1. Occurs when two or more methods in the same class have the same name but different parameters.
               2. Is resolved at compile time.
               
               Overriding:
               1. Occurs when a subclass provides a specific implementation for a method that is already defined in its superclass.
               2. Is resolved at runtime.
               """;
    }

    public String getExampleCode() {
        return """
               class OverloadingExample {
                   public void display(int a) {
                       System.out.println("Argument: " + a);
                   }
                   
                   public void display(int a, int b) {
                       System.out.println("Arguments: " + a + ", " + b);
                   }
               }
               
               class OverridingExample extends OverloadingExample {
                   @Override
                   public void display(int a) {
                       System.out.println("Overridden Argument: " + a);
                   }
               }
               
               public class TestOverloadingOverriding {
                   public static void main(String[] args) {
                       OverloadingExample obj1 = new OverloadingExample();
                       obj1.display(10);
                       obj1.display(10, 20);
                       
                       OverridingExample obj2 = new OverridingExample();
                       obj2.display(10);
                   }
               }
               """;
    }

    public String getQuizQuestions() {
        return """
               1. Overloading is resolved at runtime. (True/False)
               2. Overriding occurs when a subclass provides a specific implementation for a method already defined in its superclass. (True/False)
               3. In the example, obj1.display(10) will output "Arguments: 10". (True/False)
               4. Overloading occurs when two or more methods in the same class have the same name but different parameters. (True/False)
               """;
    }

    public String[] getCorrectAnswers() {
        return new String[] {
            "False",
            "True",
            "False",
            "True"
        };
    }
}

