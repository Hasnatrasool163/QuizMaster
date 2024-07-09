package CPP;

import Concepts.AbstractConceptsGUI;
import javax.swing.SwingUtilities;

public class BSTConceptsGUI extends AbstractConceptsGUI {

    public BSTConceptsGUI() {
        super("Binary Search Trees in C++");
    }

    @Override
    protected String getTheoryText() {
        return """
               Binary Search Trees (BSTs) in C++ are data structures that maintain the properties of a binary tree where the left subtree of a node contains only nodes with keys less than the node's key and the right subtree contains only nodes with keys greater than the node's key.
               
               Key Concepts:
               1. Insertion and Deletion in BST
               2. Searching in BST
               3. Inorder, Preorder, and Postorder Traversal
               4. Balancing Techniques like AVL Trees
               """;
    }

    @Override
    protected String getExampleCode() {
        return """
               #include <iostream>
               using namespace std;

               struct Node {
                   int key;
                   Node* left;
                   Node* right;
               };

               // Example of BST insertion in C++
               Node* insert(Node* root, int key) {
                   if (root == nullptr) {
                       Node* newNode = new Node;
                       newNode->key = key;
                       newNode->left = newNode->right = nullptr;
                       return newNode;
                   }
                   if (key < root->key)
                       root->left = insert(root->left, key);
                   else if (key > root->key)
                       root->right = insert(root->right, key);
                   return root;
               }

               int main() {
                   Node* root = nullptr;
                   root = insert(root, 50);
                   insert(root, 30);
                   insert(root, 20);
                   insert(root, 40);
                   insert(root, 70);
                   insert(root, 60);
                   insert(root, 80);

                   cout << "Inorder traversal: ";
                   inorder(root);
                   return 0;
               }
               """;
    }

    @Override
    protected void addQuizQuestions() {
        addQuizQuestion("Binary Search Trees in C++ maintain the property where the left subtree of a node contains only nodes with keys less than the node's key.", true);
        addQuizQuestion("AVL Trees are a type of balanced BST in C++.", true);
        addQuizQuestion("In a BST, the inorder traversal visits nodes in the order: left, root, right.", true);
        addQuizQuestion("BST deletion always involves replacing a deleted node with its left child.", false);
        addQuizQuestion("Searching in a BST has an average time complexity of O(log n).", true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BSTConceptsGUI frame = new BSTConceptsGUI();
            frame.setVisible(true);
        });
    }
}
