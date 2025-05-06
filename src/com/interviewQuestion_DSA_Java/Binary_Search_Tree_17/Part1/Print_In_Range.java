package com.interviewQuestion_DSA_Java.Binary_Search_Tree_17.Part1;

public class Print_In_Range {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    // Function to insert a value into the BST
    public static Node insert(Node root, int val){
        if(root == null){
            // If the tree is empty, create a new node and return it
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            // If value is smaller than root, insert into left subtree
            root.left = insert(root.left, val);
        } else {
            // If value is greater or equal, insert into right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }

    // Function to perform in-order traversal of the BST
    public static void inorder(Node root){
        if(root == null){
            return; // base case: if node is null, do nothing
        }
        inorder(root.left);           // visit left subtree
        System.out.print(root.data + " "); // print current node
        inorder(root.right);          // visit right subtree
    }

    // Function to print nodes in the specified range
    public static void printRange(Node root, int k1, int k2){
        // Base case: if the tree is empty
        if (root == null) {
            return;
        }

        if(root.data >=k1 && root.data <=k2){
            printRange(root.left, k1, k2); // Traverse left subtree
            System.out.print(root.data + " "); // Print current node
            printRange(root.right, k1, k2); // Traverse right subtree
        }
        else if(root.data<k1){
            printRange(root.left, k1, k2); // Traverse left subtree
        }
        else{
            printRange(root.right, k1, k2); // Traverse right subtree
        }

    }

    public static void main(String[] args) {
        /*
          Crete Tree :
                10
               /  \
              5    15
             / \   / \
            3   7 12 18

         */
        Node root = null;
        root = insert(root, 10);
        root = insert(root, 5);
        root = insert(root, 15);
        root = insert(root, 3);
        root = insert(root, 7);
        root = insert(root, 12);
        root = insert(root, 18);

        System.out.println("In-order traversal of the BST:");
        inorder(root); // Print the BST in sorted order
        System.out.println();
        int k1 = 5, k2 = 15; // Define the range

        System.out.println("Nodes in the range [" + k1 + ", " + k2 + "]:");
        printRange(root, k1, k2); // Print nodes in the specified range
        System.out.println();
    }
}
