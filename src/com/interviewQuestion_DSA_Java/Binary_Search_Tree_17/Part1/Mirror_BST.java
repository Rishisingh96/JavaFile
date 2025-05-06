package com.interviewQuestion_DSA_Java.Binary_Search_Tree_17.Part1;

public class Mirror_BST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static Node createMirror(Node root) {
        if (root == null) {
            return null;
        }

        Node leftMirror = createMirror(root.left);
        Node rightMirror = createMirror(root.right);

        root.left = rightMirror;
        root.right = leftMirror;

        return root;
    }
    public static void main(String[] args) {

        /*
        The tree is a valid BST
                8
              /   \
             5     10
            / \      \
           3   6     11
         */

        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);
        System.out.println("Preorder traversal of the original tree:");
        preorder(root);
        System.out.println();

        /*
        The mirrored tree will be:
                8
              /   \
             10    5
            /     / \
           11    6   3
        */
        System.out.println("Preorder traversal of the mirrored tree:");
        Node mirroredRoot = createMirror(root);
        preorder(mirroredRoot);

    }
}
