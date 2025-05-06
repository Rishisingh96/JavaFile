package com.interviewQuestion_DSA_Java.Binary_Search_Tree_17.Part2;

import java.util.ArrayList;

public class MergeBST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    public static void getInorder(Node root, ArrayList<Integer> arr){
        if(root == null){
            return;
        }
         getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);
    }

    public static Node createBST(ArrayList<Integer> arr, int st, int end){
        if(st>end){
            return null;
        }
        int mid  = (st+end)/2;
        Node root = new Node(arr.get(mid));
        root.left = createBST(arr,st,mid-1);
        root.right = createBST(arr,mid+1, end);
        return root;
    }

    public static Node mergeBSTs(Node root1, Node root2){
        // Step 1: Get in-order traversal of both BSTs
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1, arr1);

        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2, arr2);

        // Step 2: Merge both sorted arrays
        int i = 0, j = 0;
        ArrayList<Integer> finalArr = new ArrayList<>();
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) <= arr2.get(j)) {
                finalArr.add(arr1.get(i));
                i++;
            } else {
                finalArr.add(arr2.get(j));
                j++;
            }
        }

        // Add remaining elements from arr1
        while (i < arr1.size()) {
            finalArr.add(arr1.get(i));
            i++;
        }

        // Add remaining elements from arr2
        while (j < arr2.size()) {
            finalArr.add(arr2.get(j));
            j++;
        }

        // Step 3: Convert merged sorted array into balanced BST
        return createBST(finalArr, 0, finalArr.size() - 1);
    }

    public static void preorder (Node root){
        if(root ==null){
            return ;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        /*
        Creating Tree
              Tree 1:        Tree 2:
               2              9
              / \            / \
             1   4          3  12

        */
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = mergeBSTs(root1, root2);
        preorder(root);
    }
}
