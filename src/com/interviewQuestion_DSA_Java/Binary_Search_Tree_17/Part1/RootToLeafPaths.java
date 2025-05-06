package com.interviewQuestion_DSA_Java.Binary_Search_Tree_17.Part1;

import java.util.ArrayList;

public class RootToLeafPaths {

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

    // =========================
    // Function to insert a value into the BST
    // =========================
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val); // If tree is empty, create new node
        }
        if (val < root.data) {
            root.left = insert(root.left, val); // Insert into left subtree
        } else {
            root.right = insert(root.right, val); // Insert into right subtree
        }
        return root;
    }

    // =========================
    // In-order traversal (Left, Root, Right)
    // Prints the BST in sorted order
    // =========================
    public static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // =========================
    // Print nodes within a given range [k1, k2]
    // (NOT USED in main, but useful for practicing range search in BST)
    // =========================
    public static void printRange(Node root, int k1, int k2) {
        if (root == null) return;

        if (root.data >= k1 && root.data <= k2) {
            printRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printRange(root.right, k1, k2);
        } else if (root.data < k1) {
            printRange(root.right, k1, k2);
        } else {
            printRange(root.left, k1, k2);
        }
    }

    // =========================
    // Helper function to print a single root-to-leaf path
    // =========================
    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println("null");
    }

    // =========================
    // Recursively find and print all root-to-leaf paths
    // path: keeps track of current path during traversal
    // =========================
    public static void printRootToLeafPaths(Node root, ArrayList<Integer> path) {
        if (root == null) return;

        path.add(root.data); // Add current node to path

        if (root.left == null && root.right == null) {
            // Reached a leaf node, print the current path
            printPath(path);
        } else {
            // Traverse left and right subtrees
            printRootToLeafPaths(root.left, path);
            printRootToLeafPaths(root.right, path);
        }

        // Backtrack: remove current node to explore other paths
        path.remove(path.size() - 1);
    }

    // =========================
    // Main method - builds BST and tests functions
    // =========================
    public static void main(String[] args) {
        /*
            Construct the following BST:
                    10
                   /  \
                  5    15
                 / \   / \
                3   7 12 18
        */
        Node root = null;
        root = insert(root, 10);
        root = insert(root, 5);
        root = insert(root, 15);
        root = insert(root, 3);
        root = insert(root, 7);
        root = insert(root, 12);
        root = insert(root, 18);

        // In-order traversal to verify the structure
        System.out.println("In-order traversal of the BST:");
        inorder(root);
        System.out.println();

        // Optional: Print nodes in range
        // int k1 = 5, k2 = 15;
        // System.out.println("Nodes in the range [" + k1 + ", " + k2 + "]:");
        // printRange(root, k1, k2);
        // System.out.println();

        // Print all root-to-leaf paths
        System.out.println("Root to Leaf Paths:");
        printRootToLeafPaths(root, new ArrayList<>());
    }
}
/*Let's deeply dry run your Java program step-by-step to understand the logic flow and execution.

🧠 Goal of the program:
Build a Binary Search Tree (BST) using the insert() method.

Perform an in-order traversal (to print BST in sorted order).

Print all root-to-leaf paths using recursion.

✅ STEP-BY-STEP DRY RUN
🔷 Step 1: Main Method Begins
java
Copy code
Node root = null;
Initially, root is null.

🔷 Step 2: Insert Elements
🧩 Insert 10
Tree is empty, so:

java
Copy code
root = new Node(10)
markdown
Copy code
    10
🧩 Insert 5
5 < 10 → go left

Left is null → insert 5

markdown
Copy code
    10
   /
  5
🧩 Insert 15
15 > 10 → go right

Right is null → insert 15

markdown
Copy code
    10
   /  \
  5    15
🧩 Insert 3
3 < 10 → go left

3 < 5 → go left

Insert 3

markdown
Copy code
      10
     /  \
    5    15
   /
  3
🧩 Insert 7
7 < 10 → left

7 > 5 → right

Insert 7

markdown
Copy code
      10
     /  \
    5    15
   / \
  3   7
🧩 Insert 12
12 > 10 → right

12 < 15 → left

Insert 12

markdown
Copy code
      10
     /  \
    5    15
   / \   /
  3   7 12
🧩 Insert 18
18 > 10 → right

18 > 15 → right

Insert 18

markdown
Copy code
      10
     /  \
    5    15
   / \   / \
  3   7 12 18
🔷 Step 3: In-Order Traversal
Left → Root → Right

text
Copy code
inorder(root) prints: 3 5 7 10 12 15 18
Traversal trace:

Left of 10: 5 → 3 → null → print 3 → back → print 5 → right → 7 → print 7

Back to root: print 10

Right of 10: 15 → 12 → print 12 → back → print 15 → right → 18 → print 18

🔷 Step 4: Root to Leaf Path Printing
Initial call:

java
Copy code
printRootToLeafPaths(root, new ArrayList<>());
▶ Traversal Path Tracing:
Let’s track recursion and backtracking:

🟨 Path 1: 10 → 5 → 3
Add 10 to path

Go left to 5 → Add 5

Go left to 3 → Add 3

Leaf node → print: 10->5->3->null

Backtrack → remove 3

🟨 Path 2: 10 → 5 → 7
From 5, go right to 7 → Add 7

Leaf node → print: 10->5->7->null

Backtrack → remove 7, then 5

🟨 Path 3: 10 → 15 → 12
From 10, go right to 15 → Add 15

Go left to 12 → Add 12

Leaf node → print: 10->15->12->null

Backtrack → remove 12

🟨 Path 4: 10 → 15 → 18
From 15, go right to 18 → Add 18

Leaf node → print: 10->15->18->null

Backtrack → remove 18, then 15, then 10

✅ Final Output:
text
Copy code
In-order traversal of the BST:
3 5 7 10 12 15 18

Root to Leaf Paths:
10->5->3->null
10->5->7->null
10->15->12->null
10->15->18->null
🧠 Key Takeaways:
In-order traversal ensures values are printed in ascending order for BST.

Root-to-leaf path logic uses DFS + backtracking via recursion.

Each path is collected using an ArrayList<Integer> passed by reference.

Backtracking step is crucial: path.remove(path.size() - 1) removes the last visited node after recursive calls.

Would you like a diagrammatic visualization of the recursion tree or the root-to-leaf path tracing?*/