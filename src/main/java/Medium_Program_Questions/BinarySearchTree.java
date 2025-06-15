package Medium_Program_Questions;
	// Class for each node in the tree
		class Node {
		    int data;
		    Node left, right;

		    Node(int value) {
		        data = value;
		        left = null;
		        right = null;
		    }
		}

		public class BinarySearchTree {
		    Node root;

		    // Method to insert a value
		    Node insert(Node root, int value) {
		        if (root == null) {
		            root = new Node(value);
		            return root;
		        }
		        	if (value < root.data) {
		            root.left = insert(root.left, value);
		        } else if (value > root.data) {
		            root.right = insert(root.right, value);    }
		        		return root;          }
		    		// Method to print the tree (inorder)
		    void inorder(Node root) {
		        if (root != null) {
		            inorder(root.left);
		            System.out.print(root.data + " ");
		            inorder(root.right);    } }
		        
		    		// Main method
		    public static void main(String[] args) {
		        BinarySearchTree tree = new BinarySearchTree();
		        // Insert values
		        tree.root = tree.insert(tree.root, 50);
		        tree.root = tree.insert(tree.root, 30);
		        tree.root = tree.insert(tree.root, 70);
		        tree.root = tree.insert(tree.root, 20);
		        tree.root = tree.insert(tree.root, 40);
		        	// Print sorted values
		        System.out.print("Inorder: ");
		        tree.inorder(tree.root);  }
		    }
		
