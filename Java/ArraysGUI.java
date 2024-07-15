package Java;

import Concepts.AbstractConceptsGUI;
import javax.swing.SwingUtilities;

public class ArraysGUI extends AbstractConceptsGUI {

    public ArraysGUI() {
        super("Java Arrays");
    }

    @Override
    protected String getTheoryText() {
        return """
               Arrays in Java are used to store multiple values in a single variable, indexed from 0.
               
               Key Concepts:
               1. Array Declaration and Initialization
               2. Accessing Array Elements
               3. Multidimensional Arrays
               4. Array Manipulations (Sorting, Searching)
               
               Example of Array Declaration:
               int[] arr; // Declaration
               arr = new int[5]; // Initialization with size 5
               
               Example of Using Arrays:
               int[] arr = {1, 2, 3, 4, 5}; // Initialization with values
               System.out.println("First element: " + arr[0]);
               """;
    }

    @Override
    protected String getExampleCode() {
        return """
               public class Main {
                   public static void main(String[] args) {
                       // Array Declaration and Initialization
                       int[] arr = new int[5];
                       arr[0] = 1;
                       arr[1] = 2;
                       arr[2] = 3;
                       arr[3] = 4;
                       arr[4] = 5;

                       // Accessing Array Elements
                       System.out.println("First element: " + arr[0]);
                       System.out.println("Second element: " + arr[1]);

                       // Multidimensional Arrays
                       int[][] matrix = {{1, 2}, {3, 4}};
                       System.out.println("Element at (0, 1): " + matrix[0][1]);

                       // Array Manipulations
                       Arrays.sort(arr); // Sorting
                       System.out.println("Sorted array: " + Arrays.toString(arr));

                       int index = Arrays.binarySearch(arr, 3); // Searching
                       System.out.println("Index of 3: " + index);
                   }
               }
               """;
    }

    @Override
    protected void addQuizQuestions() {
        addQuizQuestion("Arrays in Java store multiple values in a single variable.", true);
        addQuizQuestion("Array indexing in Java starts from 1.", false);
        addQuizQuestion("Multidimensional arrays are arrays of arrays.", true);
        addQuizQuestion("Arrays in Java can dynamically resize based on elements added.", false);
        addQuizQuestion("Arrays.sort(arr) sorts the array in ascending order.", true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ArraysGUI frame = new ArraysGUI();
            frame.setVisible(true);
        });
    }
}

