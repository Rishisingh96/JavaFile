package com.interviewQuestion_DSA_Java.Tree_16;
import com.interviewQuestion_DSA_Java.Tree_16.Height_of_the_tree.*;

public class Count_nodes {
    public static int count(Node root) {
        // Base case: if the tree is empty, return 0
        if (root == null) {
            return 0;
        }
        int leftCount = count(root.left);
        int rightCount = count(root.right);
        // If the node is a leaf node, return 1
        return leftCount + rightCount + 1;
    }
    public static void main(String[] args) {
        Height_of_the_tree.Node root = new Height_of_the_tree.Node(1);
        root.left = new Height_of_the_tree.Node(2);
        root.right = new Height_of_the_tree.Node(3);
        root.left.left = new Height_of_the_tree.Node(4);
        root.left.right = new Height_of_the_tree.Node(5);
        root.right.left = new Height_of_the_tree.Node(6);
        root.right.right = new Height_of_the_tree.Node(7);

        System.out.println("Count of leaf nodes is: " + count(root));
    }
}
