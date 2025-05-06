package com.interviewQuestion_DSA_Java.Binary_Search_Tree_17.Part2;

import java.util.ArrayList;

public class ConvertBST_To_BalancedBST {

    // Node class represents each node in the BST
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Preorder traversal: Root -> Left -> Right
    public static void preorder(Node root) {
        if (root == null) return;
        System.out.println(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Store in-order traversal of the BST (sorted order)
    public static void getInorder(Node root, ArrayList<Integer> inorder) {
        if (root == null) return;
        getInorder(root.left, inorder);
        inorder.add(root.data); // add current node's data
        getInorder(root.right, inorder);
    }

    // Convert sorted in-order list to balanced BST
    public static Node createBST(ArrayList<Integer> inorder, int st, int end) {
        if (st > end) return null;
        int mid = (st + end) / 2;
        Node root = new Node(inorder.get(mid)); // middle becomes root
        root.left = createBST(inorder, st, mid - 1); // left subtree
        root.right = createBST(inorder, mid + 1, end); // right subtree
        return root;
    }

    // Main function to convert an unbalanced BST to a balanced one
    public static Node balanceBST(Node root) {
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder); // Get sorted values
        return createBST(inorder, 0, inorder.size() - 1); // Build balanced BST
    }

    public static void main(String[] args) {
        /*
            🔻 Unbalanced BST Given:
                   8
                  / \
                 6   10
                /      \
               5        11
              /           \
             3             12
        */
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        /*
            🔁 Convert to Balanced BST
        */
        root = balanceBST(root);

        /*
            📤 Print balanced BST in preorder
                 8
               /   \
              5     11
             / \    / \
            3   6  10 12
        */
        preorder(root);
    }
}
/*

🌲 Unbalanced Tree (Given):
markdown
Copy
Edit
         8
       /   \
      6     10
     /        \
    5          11
   /             \
  3               12
✅ Inorder Traversal of the Above:
[3, 5, 6, 8, 10, 11, 12] → Sorted, as expected for BST

🌳 Final Balanced BST (Constructed):
markdown
Copy
Edit
         8
       /   \
      5     11
     / \    / \
    3   6  10 12
Let me know if you'd like an image or graphical tree diagram for better visualization!
*/