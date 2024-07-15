package Java;

import Concepts.AbstractConceptsGUI;
import javax.swing.SwingUtilities;

public class LinkedListsGUI extends AbstractConceptsGUI {

    public LinkedListsGUI() {
        super("Java Linked Lists");
    }

    @Override
    protected String getTheoryText() {
        return """
               Linked Lists in Java are linear data structures where each element is a separate object.
               
               Key Concepts:
               1. Singly Linked Lists
               2. Doubly Linked Lists
               3. Operations: Insertion, Deletion, Traversal
               4. Comparison with Arrays
               
               Example of Singly Linked List Node:
               class Node {
                   int data;
                   Node next;
                   Node(int data) {
                       this.data = data;
                       this.next = null;
                   }
               }
               """;
    }

    @Override
    protected String getExampleCode() {
        return """
               public class Main {
                   public static void main(String[] args) {
                       // Singly Linked List Implementation
                       Node head = new Node(1);
                       head.next = new Node(2);
                       head.next.next = new Node(3);

                       // Traversing Linked List
                       Node current = head;
                       while (current != null) {
                           System.out.println(current.data);
                           current = current.next;
                       }
                   }
               }
               """;
    }

    @Override
    protected void addQuizQuestions() {
        addQuizQuestion("Linked Lists in Java are linear data structures.", true);
        addQuizQuestion("A node in a linked list contains only data.", false);
        addQuizQuestion("Doubly linked lists allow traversal in both directions.", true);
        addQuizQuestion("Linked lists are more efficient than arrays for random access.", false);
        addQuizQuestion("Insertion at the end of a singly linked list requires traversal from the head to the tail.", true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LinkedListsGUI frame = new LinkedListsGUI();
            frame.setVisible(true);
        });
    }
}
