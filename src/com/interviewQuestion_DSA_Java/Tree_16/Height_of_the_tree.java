package com.interviewQuestion_DSA_Java.Tree_16;

public class Height_of_the_tree {

    // Node class representing each node in the binary tree
    static class Node {
        int data;
        Node left, right;

        // Constructor to initialize node value
        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    // Function to calculate the height of a binary tree
    public static int height(Node root) {
        // Base case: if the tree is empty, return -1 (or return 0 if you consider height of leaf as 0)
        if (root == null) {
            return -1;
        }

        // Recursively calculate height of left and right subtrees
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        // Height of current node is max of left/right subtree + 1
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        /*
            Constructed Binary Tree:

                  1
                /   \
               2     3
              / \   / \
             4  5  6   7

            Expected Height: 2 (if root is level 0)
        */

        // Create tree nodes and connect them
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Print the height of the tree
        System.out.println("Height of the tree is: " + height(root));
    }
}
