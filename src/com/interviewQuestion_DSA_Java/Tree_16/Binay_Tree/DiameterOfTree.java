package com.interviewQuestion_DSA_Java.Tree_16.Binay_Tree;

public class DiameterOfTree {

    // Node class for binary tree
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Function to calculate height of a tree
    public static int height(Node root) {
        if (root == null) {
            return 0; // You can use -1 if you define height of leaf as 0
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    // Diameter Approach 1 (Time Complexity: O(n^2))
    public static int DiameterM1(Node root) {
        if (root == null) {
            return 0;
        }

        // Diameter of left subtree
        int leftDiameter = DiameterM1(root.left);

        // Diameter of right subtree
        int rightDiameter = DiameterM1(root.right);

        // Height of left and right subtrees
        int leftHt = height(root.left);
        int rightHt = height(root.right);

        // Diameter passing through the root
        int selfDiameter = leftHt + rightHt + 1;

        // Return max of all three
        return Math.max(selfDiameter, Math.max(leftDiameter, rightDiameter));
    }

    // Diameter Approach 2 (Time Complexity: O(n))
    static class Info{
        int diameter;
        int height;

        Info(int diameter, int height) {
            this.diameter = diameter;
            this.height = height;
        }
    }
    public static Info diameterMO(Node root) { // O(n)
        if (root == null) {
            return new Info(0, 0);
        }

        // Get left and right subtree info
        Info leftInfo = diameterMO(root.left);
        Info rightInfo = diameterMO(root.right);

        int diameter = Math.max(Math.max(leftInfo.diameter, rightInfo.diameter),leftInfo.height + rightInfo.height + 1);
        int height = Math.max(leftInfo.height, rightInfo.height) + 1;
        return new Info(diameter, height);
    }

    public static void main(String[] args) {
        /*
              Constructed Binary Tree:

                    1
                  /   \
                 2     3
                / \   / \
               4   5 6   7

            Expected Diameter: 5 (Longest path is 4 → 2 → 1 → 3 → 7)
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Height of the tree is: " + height(root));
        System.out.println("Diameter of the tree (Approach 1): " + DiameterM1(root));
        System.out.println("Diameter of the tree (Approach 2): " + diameterMO(root).diameter);
        System.out.println("Diameter of the tree (Approach 2): " + diameterMO(root).height);
    }
}
