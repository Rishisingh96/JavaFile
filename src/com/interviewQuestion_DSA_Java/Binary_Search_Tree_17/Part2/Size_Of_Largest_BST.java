package com.interviewQuestion_DSA_Java.Binary_Search_Tree_17.Part2;

public class Size_Of_Largest_BST {

    // Node structure of binary tree
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    // Info class to store details during traversal
    static class Info {
        boolean isBST; // Is current subtree a BST?
        int size;      // Size of current subtree
        int min;       // Min value in subtree
        int max;       // Max value in subtree

        public Info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    public static int maxBST = 0; // To track the size of largest BST found

    // Recursive function to find size of largest BST
    public static Info largestBST(Node root) {
        // Base case: Null node is a BST of size 0
        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        // Recursively get info from left and right subtrees
        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);

        // Calculate size of current subtree
        int size = leftInfo.size + rightInfo.size + 1;

        // Get min and max for the current subtree
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

        // If current node violates BST property
        if (root.data <= leftInfo.max || root.data >= rightInfo.min) {
            return new Info(false, size, min, max);
        }

        // If both left and right subtrees are BSTs and current node satisfies BST property
        if (leftInfo.isBST && rightInfo.isBST) {
            maxBST = Math.max(maxBST, size); // Update global max
            return new Info(true, size, min, max); // ✅ RETURN here
        }

        // If not a BST, return false with current size, min, max
        return new Info(false, size, min, max);
    }

    // Main method
    public static void main(String[] args) {
        /*
        Constructing the following binary tree:
                50
               /  \
             30    60
            / \   / \
           5  20 45 70
                  /   \
                 65    80

        Largest BST in this tree:
                 60
                /  \
              45    70
                   / \
                 65  80

        Answer = 5 (Size of above subtree)
        */

        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        largestBST(root);
        System.out.println("Size of the largest BST is: " + maxBST);
    }
}
