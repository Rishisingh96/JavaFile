package com.interviewQuestion_DSA_Java.Tree_16.Binay_Tree;
import com.interviewQuestion_DSA_Java.Tree_16.Binay_Tree.Height_of_the_tree.*;

public class Sum_of_Nodes {
    public static int sum(Node root) {
        // Base case: if the tree is empty, return 0
        if (root == null) {
            return 0;
        }
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        // Return the sum of the current node's value and the sums of its left and right subtrees
        return leftSum + rightSum + root.data;
    }
    public static void main(String[] args) {
        Height_of_the_tree.Node root = new Height_of_the_tree.Node(1);
        root.left = new Height_of_the_tree.Node(2);
        root.right = new Height_of_the_tree.Node(3);
        root.left.left = new Height_of_the_tree.Node(4);
        root.left.right = new Height_of_the_tree.Node(5);
        root.right.left = new Height_of_the_tree.Node(6);
        root.right.right = new Height_of_the_tree.Node(7);

        System.out.println("Sum of all nodes is: " + sum(root));
        
    }
}
