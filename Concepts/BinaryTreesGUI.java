package Concepts;

import javax.swing.SwingUtilities;

public class BinaryTreesGUI extends AbstractConceptsGUI {

    public BinaryTreesGUI() {
        super("Binary Trees in Java");
    }

    @Override
    protected String getTheoryText() {
        return """
               Binary Trees in Java are hierarchical data structures where each node has at most two children.
               
               Key Concepts:
               1. Binary Tree Traversal: Inorder, Preorder, Postorder
               2. Binary Search Tree (BST)
               3. Operations: Insertion, Deletion, Search
               4. Balanced vs. Unbalanced Trees
               
               Example of Binary Tree Node:
               class Node {
                   int data;
                   Node left, right;

                   Node(int data) {
                       this.data = data;
                       left = right = null;
                   }
               }
               """;
    }

    @Override
    protected String getExampleCode() {
        return """
               public class Main {
                   // Example of Binary Search Tree (BST) Insertion
                   static Node insert(Node root, int data) {
                       if (root == null) {
                           return new Node(data);
                       }

                       if (data < root.data) {
                           root.left = insert(root.left, data);
                       } else if (data > root.data) {
                           root.right = insert(root.right, data);
                       }

                       return root;
                   }

                   public static void main(String[] args) {
                       Node root = null;
                       root = insert(root, 50);
                       insert(root, 30);
                       insert(root, 20);
                       insert(root, 40);
                       insert(root, 70);
                       insert(root, 60);
                       insert(root, 80);
                   }
               }
               """;
    }

    @Override
    protected void addQuizQuestions() {
        addQuizQuestion("Binary Trees in Java are hierarchical data structures.", true);
        addQuizQuestion("A Binary Search Tree (BST) guarantees constant time complexity for all operations.", false);
        addQuizQuestion("Inorder traversal visits nodes in Left-Root-Right order.", true);
        addQuizQuestion("Balanced trees have better worst-case time complexity compared to unbalanced trees.", true);
        addQuizQuestion("Binary Trees can only have up to two children per node.", true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BinaryTreesGUI frame = new BinaryTreesGUI();
            frame.setVisible(true);
        });
    }
}
