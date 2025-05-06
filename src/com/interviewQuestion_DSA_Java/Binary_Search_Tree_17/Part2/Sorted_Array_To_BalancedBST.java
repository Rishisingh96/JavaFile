package com.interviewQuestion_DSA_Java.Binary_Search_Tree_17.Part2;

import com.interviewQuestion_DSA_Java.Binary_Search_Tree_17.Part1.Mirror_BST;

public class Sorted_Array_To_BalancedBST {

    // Node class to represent each node in the Binary Search Tree (BST)
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Preorder traversal of the BST: Root -> Left -> Right
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Function to convert a sorted array into a height-balanced BST
    public static Node createBST(int arr[], int st, int end) {
        // Base case: if the start index exceeds the end, return null
        if (st > end) {
            return null;
        }

        // Find the middle index to maintain balance
        int mid = (st + end) / 2;

        // Make the middle element the root
        Node root = new Node(arr[mid]);

        // Recursively build the left subtree from the left half
        root.left = createBST(arr, st, mid - 1);

        // Recursively build the right subtree from the right half
        root.right = createBST(arr, mid + 1, end);

        return root;
    }

    public static void main(String[] args) {
        // Sorted array input to be converted to a balanced BST
        int arr[] = {3, 5, 6, 8, 10, 11, 12};

        // Create the BST and store the root node
        Node root = createBST(arr, 0, arr.length - 1);

        // Print the BST in preorder to verify structure
        preorder(root); //
        /*✅ Sorted Array:
            [3, 5, 6, 8, 10, 11, 12]
            ✅ Balanced BST:
            markdown
                8
              /   \
             5     11
            / \    / \
           3   6  10 12
   */
    }
}
/*Bilkul bhai! Chalo step-by-step dry run karte hain createBST() function ka using array {3, 5, 6, 8, 10, 11, 12}.

📌 Input Array:
java
Copy
Edit
int arr[] = {3, 5, 6, 8, 10, 11, 12};
We call:

java
Copy
Edit
createBST(arr, 0, 6)
🔁 Step-by-Step Dry Run:
✅ 1st Call: createBST(arr, 0, 6)
mid = (0 + 6) / 2 = 3 → arr[3] = 8

root = new Node(8)

Left Subtree → createBST(arr, 0, 2)

Right Subtree → createBST(arr, 4, 6)

✅ 2nd Call (Left of 8): createBST(arr, 0, 2)
mid = (0 + 2) / 2 = 1 → arr[1] = 5

root = new Node(5)

Left Subtree → createBST(arr, 0, 0)

Right Subtree → createBST(arr, 2, 2)

✅ 3rd Call (Left of 5): createBST(arr, 0, 0)
mid = 0 → arr[0] = 3

root = new Node(3)

Left Subtree → createBST(arr, 0, -1) → returns null

Right Subtree → createBST(arr, 1, 0) → returns null

🔙 returns Node(3)

✅ 4th Call (Right of 5): createBST(arr, 2, 2)
mid = 2 → arr[2] = 6

root = new Node(6)

Left Subtree → createBST(arr, 2, 1) → returns null

Right Subtree → createBST(arr, 3, 2) → returns null

🔙 returns Node(6)

🔙 Now Node(5) has:

left = Node(3)

right = Node(6)

✅ 5th Call (Right of 8): createBST(arr, 4, 6)
mid = 5 → arr[5] = 11

root = new Node(11)

Left Subtree → createBST(arr, 4, 4)

Right Subtree → createBST(arr, 6, 6)

✅ 6th Call (Left of 11): createBST(arr, 4, 4)
mid = 4 → arr[4] = 10

root = new Node(10)

Left → createBST(arr, 4, 3) → returns null

Right → createBST(arr, 5, 4) → returns null

🔙 returns Node(10)

✅ 7th Call (Right of 11): createBST(arr, 6, 6)
mid = 6 → arr[6] = 12

root = new Node(12)

Left → createBST(arr, 6, 5) → returns null

Right → createBST(arr, 7, 6) → returns null

🔙 returns Node(12)

🔙 Now Node(11) has:

left = Node(10)

right = Node(12)

✅ Final Tree Structure:
markdown
Copy
Edit
        8
      /   \
     5     11
    / \    / \
   3   6  10 12
Let me know if you want a visual/graphical diagram too!*/