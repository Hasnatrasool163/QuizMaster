package Concepts;

import javax.swing.SwingUtilities;

public class SortingAlgorithmsGUI extends AbstractConceptsGUI {

    public SortingAlgorithmsGUI() {
        super("Sorting Algorithms in Java");
    }

    @Override
    protected String getTheoryText() {
        return """
               Sorting Algorithms in Java arrange elements in a specific order.
               
               Key Concepts:
               1. Bubble Sort
               2. Selection Sort
               3. Insertion Sort
               4. Merge Sort
               5. Quick Sort
               """;
    }

    @Override
    protected String getExampleCode() {
        return """
               public class Main {
                   // Example of Bubble Sort
                   static void bubbleSort(int[] arr) {
                       int n = arr.length;
                       for (int i = 0; i < n-1; i++) {
                           for (int j = 0; j < n-i-1; j++) {
                               if (arr[j] > arr[j+1]) {
                                   // swap arr[j+1] and arr[j]
                                   int temp = arr[j];
                                   arr[j] = arr[j+1];
                                   arr[j+1] = temp;
                               }
                           }
                       }
                   }

                   public static void main(String[] args) {
                       int[] arr = {64, 34, 25, 12, 22, 11, 90};
                       bubbleSort(arr);
                       System.out.println("Sorted array: " + Arrays.toString(arr));
                   }
               }
               """;
    }

    @Override
    protected void addQuizQuestions() {
        addQuizQuestion("Bubble Sort is a stable sorting algorithm.", true);
        addQuizQuestion("Selection Sort has a time complexity of O(n^2).", true);
        addQuizQuestion("Merge Sort uses a divide-and-conquer strategy.", true);
        addQuizQuestion("Quick Sort always performs better than Merge Sort.", false);
        addQuizQuestion("Insertion Sort is more efficient than Quick Sort for large datasets.", false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SortingAlgorithmsGUI frame = new SortingAlgorithmsGUI();
            frame.setVisible(true);
        });
    }
}
