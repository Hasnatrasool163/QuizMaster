package Java;

import Concepts.AbstractConceptsGUI;


public class ExceptionsGUI extends AbstractConceptsGUI {

    public ExceptionsGUI() {
        super("Exception Handling Basics in Java");
    }
    @Override
    public String getTheoryText() {
        return """
               Exception Handling:
               1. Exceptions are events that disrupt the normal flow of a program.
               2. The 'try' block contains code that might throw an exception.
               3. The 'catch' block contains code that handles the exception.
               4. The 'finally' block contains code that will always execute, regardless of an exception.
               """;
    }

    @Override
    public String getExampleCode() {
        return """
               public class ExceptionExample {
                   public static void main(String[] args) {
                       try {
                           int[] arr = new int[5];
                           System.out.println(arr[10]); // Throws ArrayIndexOutOfBoundsException
                       } catch (ArrayIndexOutOfBoundsException e) {
                           System.out.println("Array index out of bounds!");
                       } finally {
                           System.out.println("This block always executes.");
                       }
                   }
               }
               """;
    }

   
      @Override
    protected void addQuizQuestions() {
        addQuizQuestion("The 'try' block must be followed by either a 'catch' or 'finally' block.", true);
        addQuizQuestion("The 'finally' block is executed only when an exception occurs.", false);
        addQuizQuestion("In the example, \"Array index out of bounds!\" will be printed", true);
        addQuizQuestion("Multiple 'catch' blocks can be used to handle different types of exceptions", true);
    }
}
