package com.interviewQuestion_DSA_Java.Binary_Search_Tree_17;

public class Validate_BST {
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
        System.out.print(root.data +" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean isValidBST(Node root, Node min, Node max){
        if(root == null){
            return true;
        }
        if(min != null && root.data <= min.data){
            return false;
        }
        else if(max != null && root.data >= max.data){
            return false;
        }
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
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

        /*
        The tree is not a valid BST
                8
              /   \
             5     10
            / \      \
           3   9     11
        */

        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
//        root.left.right = new Node(6); //This will make the tree invalid
        root.left.right = new Node(9); //This will make the tree not Valid
        root.right = new Node(10);
        root.right.right = new Node(11);

        System.out.println("Preorder.........");
        preorder(root);
        System.out.println("\nInorder...........");
        inorder(root);

        if(isValidBST(root, null, null)){
            System.out.println("\nThe tree is a valid BST");
        }
        else{
            System.out.println("\nThe tree is not a valid BST");
        }
    }
}
