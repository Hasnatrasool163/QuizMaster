package Concepts;

public class GenericsVsRawTypesHandler implements ConceptHandler {
    @Override
    public String getTheoryText() {
        return """
               Generics:
               1. Allow classes and methods to operate on objects of various types while providing compile-time type safety.
               2. Use type parameters (e.g., <T>).
               
               Raw Types:
               1. Use of a generic type without specifying a type parameter.
               2. Can lead to runtime errors due to lack of type safety.
               """;
    }

    @Override
    public String getExampleCode() {
        return """
               import java.util.ArrayList;
               import java.util.List;
               
               public class GenericExample {
                   public static void main(String[] args) {
                       List<String> list = new ArrayList<>();
                       list.add("Hello");
                       // list.add(123); // Compile-time error
                       
                       List rawList = new ArrayList();
                       rawList.add("Hello");
                       rawList.add(123); // Allowed but can cause runtime errors
                       
                       for (Object obj : rawList) {
                           System.out.println(obj);
                       }
                   }
               }
               """;
    }

    @Override
    public String getQuizQuestions() {
        return """
               1. Generics provide compile-time type safety. (True/False)
               2. Raw types can lead to runtime errors due to lack of type safety. (True/False)
               3. In the example, list.add(123) will cause a compile-time error. (True/False)
               4. Using raw types is recommended for backward compatibility. (True/False)
               """;
    }

    @Override
    public String[] getCorrectAnswers() {
        return new String[] {
            "True",
            "True",
            "True",
            "False"
        };
    }
}

