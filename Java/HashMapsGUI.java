package Java;

import Concepts.AbstractConceptsGUI;
import javax.swing.SwingUtilities;

public class HashMapsGUI extends AbstractConceptsGUI {

    public HashMapsGUI() {
        super("Java HashMaps");
    }

    @Override
    protected String getTheoryText() {
        return """
               HashMaps in Java store key-value pairs and allow quick retrieval based on the key.
               
               Key Concepts:
               1. HashMap vs. HashTable
               2. Operations: Insertion, Deletion, Search
               3. Handling Collisions
               4. Iteration and Ordering
               
               Example of HashMap Usage:
               HashMap<String, Integer> map = new HashMap<>();
               map.put("John", 25);
               map.put("Jane", 30);
               int age = map.get("John");
               """;
    }

    @Override
    protected String getExampleCode() {
        return """
               import java.util.HashMap;

               public class Main {
                   public static void main(String[] args) {
                       // HashMap Usage Example
                       HashMap<String, Integer> map = new HashMap<>();
                       map.put("John", 25);
                       map.put("Jane", 30);

                       System.out.println("Age of John: " + map.get("John"));
                   }
               }
               """;
    }

    @Override
    protected void addQuizQuestions() {
        addQuizQuestion("HashMaps in Java store key-value pairs.", true);
        addQuizQuestion("HashTables in Java allow null keys and values.", false);
        addQuizQuestion("HashMap allows duplicate keys.", false);
        addQuizQuestion("HashMap handles collisions using separate chaining.", true);
        addQuizQuestion("HashMap provides ordered traversal based on key insertion order.", false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            HashMapsGUI frame = new HashMapsGUI();
            frame.setVisible(true);
        });
    }
}
