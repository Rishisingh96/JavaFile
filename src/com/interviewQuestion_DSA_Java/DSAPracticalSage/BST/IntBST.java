package com.interviewQuestion_DSA_Java.DSAPracticalSage.BST;

// Binary Search Tree with Integer Data - Non-Recursive Inorder Traversal
import java.util.Stack;

class IntBST {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    Node root;

    // Insert integer into BST
    Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        } else if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    // Non-recursive Inorder Traversal using Stack
    void inorderNonRecursive(Node root) {
        Stack<Node> stack = new Stack<>();
        Node current = root;

        while (current != null || !stack.isEmpty()) {
            // Reach the left most Node
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            System.out.print(current.data + " ");
            current = current.right;
        }
    }

    public static void main(String[] args) {
        IntBST tree = new IntBST();
        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int val : values) {
            tree.root = tree.insert(tree.root, val);
        }

        System.out.println("Non-Recursive Inorder Traversal of Integer BST:");
        tree.inorderNonRecursive(tree.root);
    }
}

/*✅ Output Example:
For 4.1 (Char BST Postorder)
If values inserted are: F, D, J, B, E, G, K
Output: B E D G K J F

For 4.2 (Int BST Inorder)
If values inserted are: 50, 30, 70, 20, 40, 60, 80
Output: 20 30 40 50 60 70 80*/