package com.interviewQuestion_DSA_Java.Tree_16.Part3;

public class KthAncestorOfNode {

    // Node class to represent each node in the binary tree
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    /**
     * Function to find the Kth ancestor of a given node.
     * It returns the distance from the current node to the target node.
     * If distance becomes equal to K, it prints the ancestor.
     *
     * @param root The root of the binary tree
     * @param target The target node whose ancestor is to be found
     * @param k The Kth level to find
     * @return Distance from the current node to target node, or -1 if not found
     */
    public static int findKthAncestor(Node root, int target, int k) {
        // Base case: tree is empty
        if (root == null) {
            return -1;
        }

        // Base case: target node is found
        if (root.data == target) {
            return 0;
        }

        // Search left and right subtrees
        int leftDist = findKthAncestor(root.left, target, k);
        int rightDist = findKthAncestor(root.right, target, k);

        // If target not found in either subtree
        if (leftDist == -1 && rightDist == -1) {
            return -1;
        }

        // If found in left or right subtree, increase distance
        int currentDist = Math.max(leftDist, rightDist) + 1;

        // When current distance equals k, print current node as the ancestor
        if (currentDist == k) {
            System.out.println("Kth Ancestor of node " + target + " is: " + root.data);
        }

        return currentDist;
    }

    public static void main(String[] args) {
        /*
        ✅ Sample Binary Tree:
                  1
                /   \
               2     3
              / \   / \
             4   5 6   7
        */

        // Construct the binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Find 2nd ancestor of node 5 (expected: 1)
        int targetNode = 5;
        int k = 1;

        findKthAncestor(root, targetNode, k);
    }
}
