package Difficult_Program_Questions;
//Node class for the Binary Search Tree
class Node {
 int data;       // Value of the node
 Node left;      // Left child
 Node right;     // Right child
// Constructor to create a new node
 Node(int value) {
     data = value;
     left = null;
     right = null;
 }
}
public class BinarySearchTree {
Node root;  // Root node of the tree
// Constructor to create an empty tree
 BinarySearchTree() {
     root = null;
 }
// Insert a value into the BST
 void insert(int value) {
     root = insertRec(root, value);
 }
// Recursive function to insert a value
 Node insertRec(Node root, int value) {
     // If the tree is empty, return a new node
     if (root == null) {
         root = new Node(value);
         return root;
     }

     // If value is less than root, go to left subtree
     if (value < root.data)
         root.left = insertRec(root.left, value);
     // If value is greater than root, go to right subtree
     else if (value > root.data)
         root.right = insertRec(root.right, value);

     return root;
 }

 // Inorder traversal of BST (Left, Root, Right)
 void inorder() {
     inorderRec(root);
 }

 // Recursive inorder function
 void inorderRec(Node root) {
     if (root != null) {
         inorderRec(root.left);          // Visit left subtree
         System.out.print(root.data + " "); // Visit node
         inorderRec(root.right);         // Visit right subtree
     }
 }
 	// Main method to test the BST
 public static void main(String[] args) {
     BinarySearchTree tree = new BinarySearchTree();
     // Insert elements into the BST
     tree.insert(50);
     tree.insert(30);
     tree.insert(70);
     tree.insert(20);
     tree.insert(40);
     tree.insert(60);
     tree.insert(80);
     // Print the BST in inorder (should be sorted)
     System.out.println("Inorder traversal of BST:");
     tree.inorder();
 }
}
