package com.interviewQuestion_DSA_Java.Tree_16.Part3;

import java.util.LinkedList;
import java.util.Queue;

public class Kth_Level {

    // 🔷 Node class represents a single node in the binary tree
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // 🔷 display() method: Prints the tree level-by-level (Level Order Traversal / BFS)
    public static void display(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size(); // Number of nodes at the current level

            for (int i = 0; i < levelSize; i++) {
                Node currentNode = queue.poll();
                System.out.print(currentNode.data + " ");

                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }

                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }

            // Print newline after each level
            System.out.println();
        }
    }

    // 🔷 KLevel() method: Prints all nodes at the K-th level using recursion
    public static void KLevel(Node root, int level, int k) {
        if (root == null) {
            return;
        }

        if (level == k) {
            // We've reached the k-th level
            System.out.print(root.data + " ");
            return;
        }

        // Recur for left and right subtrees with level + 1
        KLevel(root.left, level + 1, k);
        KLevel(root.right, level + 1, k);
    }

    // 🔷 Main method to demonstrate both display() and KLevel() functions
    public static void main(String[] args) {

        /*
         🌳 Tree Structure:
                     1
                   /   \
                  2     3
                 / \   / \
                4   5 6   7

         K = 3 => Nodes at 3rd level: 4, 5, 6, 7
        */

        // Tree creation
        Node root = new Node(1);     // Level 1
        root.left = new Node(2);     // Level 2
        root.right = new Node(3);    // Level 2

        root.left.left = new Node(4);   // Level 3
        root.left.right = new Node(5);  // Level 3
        root.right.left = new Node(6);  // Level 3
        root.right.right = new Node(7); // Level 3

        // 🟢 Display the tree level-wise
        System.out.println("Level-wise Tree:");
        display(root);

        // 🟢 Print nodes at K-th level
        int k = 3;
        System.out.println("Nodes at " + k + "rd level:");
        KLevel(root, 1, k);
    }
}
/*🔍 Explanation of Key Concepts
🔹 display(Node root)
This method uses a Queue for Breadth-First Search (BFS).

It prints each level on a new line.

Helpful for visualizing the entire tree.

🔹 KLevel(Node root, int level, int k)
This is a recursive method.

level starts from 1 (root is at level 1).

When level == k, it prints the node’s value.

Calls itself recursively for left and right child, increasing level by 1.

🌲 Tree Level Example
Let's say this is our tree:

lua
Copy
Edit
           1         <-- level 1
         /   \
       2       3     <-- level 2
      / \     / \
     4   5   6   7   <-- level 3
If you call KLevel(root, 1, 3);, the output will be:

Copy
Edit
4 5 6 7
*/

/*Absolutely, Rishi! Let's dry run the KLevel(Node root, int level, int k) method step by step with your sample tree and k = 3. We’ll follow each function call recursively and track the values of root.data, level, and k.

📌 Tree Structure:
pgsql
Copy
Edit
        1         → level 1
       / \
      2   3       → level 2
     / \ / \
    4  5 6  7     → level 3
🧠 Goal:
Print all nodes at level k = 3.

Initial call from main:

java
Copy
Edit
KLevel(node, 1, 3);
🔍 Dry Run:
Step 1:
java
Copy
Edit
KLevel(node = 1, level = 1, k = 3)
level != k → go left and right

Recursive call: KLevel(2, 2, 3)

Step 2:
java
Copy
Edit
KLevel(node = 2, level = 2, k = 3)
level != k → go left and right

Recursive call: KLevel(4, 3, 3)

Step 3:
java
Copy
Edit
KLevel(node = 4, level = 3, k = 3)
level == k ✅ → System.out.print(4 + " ") → prints 4

Return to previous (node 2), now right child:

java
Copy
Edit
KLevel(node = 5, level = 3, k = 3)
Step 4:
java
Copy
Edit
KLevel(node = 5, level = 3, k = 3)
level == k ✅ → System.out.print(5 + " ") → prints 5

Return to (node 1), now right child:

java
Copy
Edit
KLevel(node = 3, level = 2, k = 3)
Step 5:
java
Copy
Edit
KLevel(node = 3, level = 2, k = 3)
level != k → go left and right

Recursive call: KLevel(6, 3, 3)

Step 6:
java
Copy
Edit
KLevel(node = 6, level = 3, k = 3)
level == k ✅ → System.out.print(6 + " ") → prints 6

Return to (node 3), now right child:

java
Copy
Edit
KLevel(node = 7, level = 3, k = 3)
Step 7:
java
Copy
Edit
KLevel(node = 7, level = 3, k = 3)
level == k ✅ → System.out.print(7 + " ") → prints 7

✅ Final Output:
vbnet
Copy
Edit
The 3th level of the binary tree is:
4 5 6 7
🔁 Call Stack Summary:
arduino
Copy
Edit
1
├── 2
│   ├── 4 → print 4
│   └── 5 → print 5
└── 3
    ├── 6 → print 6
    └── 7 → print 7
📝 Summary of Logic:
At each recursive step, you check if the current level equals k.

If yes → print node’s data.

If not → go deeper (left and right) by incrementing the level (level + 1).

Base condition: if the node is null, return.*/