package com.interviewQuestion_DSA_Java.Tree_16.Binay_Tree;

import java.util.Scanner;

// Node class for BST
        class CharNode {
            char data;
            CharNode left, right;

            CharNode(char data) {
                this.data = data;
                left = right = null;
            }
        }

        public class RecursivePostorderTraversal {
            CharNode root = null;

            // Insert character into BST
            public CharNode insert(CharNode node, char value) {
                if (node == null) {
                    return new CharNode(value);
                }

                if (value < node.data) {
                    node.left = insert(node.left, value);
                } else if (value > node.data) {
                    node.right = insert(node.right, value);
                }

                return node;
            }

            // Postorder traversal (Left → Right → Root)
            public void postorderTraversal(CharNode node) {
                if (node != null) {
                    postorderTraversal(node.left);
                    postorderTraversal(node.right);
                    System.out.print(node.data + " ");
                }
            }

            // Main function
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                RecursivePostorderTraversal bst = new RecursivePostorderTraversal();

                System.out.print("Enter number of characters to insert in BST: ");
                int n = sc.nextInt();

                System.out.println("Enter characters one by one:");
                for (int i = 0; i < n; i++) {
                    char ch = sc.next().charAt(0);
                    bst.root = bst.insert(bst.root, ch);
                }

                System.out.print("\nPostorder Traversal: ");
                bst.postorderTraversal(bst.root);
                System.out.println();

                sc.close();
            }
        }
//🔸 Sample Output
//
//        Enter number of characters to insert in BST: 5
//        Enter characters one by one:
//        D B A E C
//
//        Postorder Traversal: A C B E D
//✅ This program builds the Binary Search Tree in order and performs a recursive postorder traversal (Left → Right → Root).
