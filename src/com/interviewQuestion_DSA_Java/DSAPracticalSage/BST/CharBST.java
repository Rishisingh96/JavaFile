package com.interviewQuestion_DSA_Java.DSAPracticalSage.BST;

// Binary Search Tree with Character Data - Recursive Postorder Traversal
class CharBST {
    static class Node {
        char data;
        Node left, right;

        Node(char data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    Node root;

    // Insert character into BST
    Node insert(Node root, char data) {
        if (root == null) {
            root = new Node(data);
        } else if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    // Recursive Postorder Traversal
    void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        CharBST tree = new CharBST();
        char[] values = {'F', 'D', 'J', 'B', 'E', 'G', 'K'};
        for (char val : values) {
            tree.root = tree.insert(tree.root, val);
        }

        System.out.println("Recursive Postorder Traversal of Character BST:");
        tree.postorder(tree.root);
    }
}

