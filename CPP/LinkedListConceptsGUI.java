package CPP;

import Concepts.AbstractConceptsGUI;
import javax.swing.SwingUtilities;

public class LinkedListConceptsGUI extends AbstractConceptsGUI {

    public LinkedListConceptsGUI() {
        super("Linked Lists in C++");
    }

    @Override
    protected String getTheoryText() {
        return """
               Linked Lists in C++ are linear data structures where each element is a separate object with a data part and a reference (link) to the next element.
               
               Key Concepts:
               1. Singly Linked Lists
               2. Doubly Linked Lists
               3. Circular Linked Lists
               4. Operations: Insertion, Deletion, and Traversal
               """;
    }

    @Override
    protected String getExampleCode() {
        return """
               #include <iostream>
               using namespace std;

               struct Node {
                   int data;
                   Node* next;
               };

               // Example of a singly linked list in C++
               void printList(Node* node) {
                   while (node != nullptr) {
                       cout << node->data << " ";
                       node = node->next;
                   }
               }

               int main() {
                   Node* head = nullptr;
                   Node* second = nullptr;
                   Node* third = nullptr;

                   head = new Node;
                   second = new Node;
                   third = new Node;

                   head->data = 1;
                   head->next = second;

                   second->data = 2;
                   second->next = third;

                   third->data = 3;
                   third->next = nullptr;

                   printList(head);

                   return 0;
               }
               """;
    }

    @Override
    protected void addQuizQuestions() {
        addQuizQuestion("Linked Lists in C++ store elements sequentially in memory.", false);
        addQuizQuestion("Doubly Linked Lists allow traversal in both directions: forward and backward.", true);
        addQuizQuestion("Circular Linked Lists have a single link field per node.", false);
        addQuizQuestion("Insertion at the end of a singly linked list in C++ requires traversal from the head to the last node.", true);
        addQuizQuestion("Deletion from a doubly linked list requires updating pointers in both the previous and next nodes of the deleted node.", true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LinkedListConceptsGUI frame = new LinkedListConceptsGUI();
            frame.setVisible(true);
        });
    }
}
