package Concepts;

public class GenericsGUI extends AbstractConceptsGUI {

    public GenericsGUI() {
        super("Generics Basics in Java");
    }
    @Override
    public String getTheoryText() {
        return """
               Generics:
               1. Generics allow classes, interfaces, and methods to operate on types specified by the caller.
               2. They provide type safety by catching invalid types at compile time.
               3. Common generic types include T (Type), E (Element), K (Key), and V (Value).
               """;
    }

    @Override
    public String getExampleCode() {
        return """
               import java.util.ArrayList;
               import java.util.List;
               
               public class GenericExample<T> {
                   private T value;
               
                   public GenericExample(T value) {
                       this.value = value;
                   }
               
                   public T getValue() {
                       return value;
                   }
               
                   public static void main(String[] args) {
                       GenericExample<String> example = new GenericExample<>("Hello");
                       System.out.println(example.getValue()); // Outputs: Hello
               
                       List<Integer> list = new ArrayList<>();
                       list.add(10);
                       list.add(20);
                       System.out.println(list); // Outputs: [10, 20]
                   }
               }
               """;
    }

   
      @Override
    protected void addQuizQuestions() {
        addQuizQuestion("Generics provide type safety by catching invalid types at compile time.", true);
        addQuizQuestion("A generic class can only operate on one type specified by the caller.", false);
        addQuizQuestion("In the example, example.getValue() will output 10", false);
        addQuizQuestion("Generics can be used with collections to specify the type of elements they contain", true);
    }
}

