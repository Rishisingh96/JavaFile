package com.interviewQuestion_DSA_Java.Tree_16.Binay_Tree_Part2;

import java.util.*;

public class TopViewOfATree {

    // Node class for Binary Tree
    static class Node {
        int data;
        Node left, right;

        // Constructor to initialize a new node
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Info class to hold node and its horizontal distance from root
    static class Info {
        Node node;
        int hd; // Horizontal Distance from root

        Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    // Method to print the top view of the binary tree
    public static void topView(Node root) {
        if (root == null) return;

        // Queue for BFS
        Queue<Info> q = new LinkedList<>();
        // Map to store the first node at each horizontal distance (top view)
        HashMap<Integer, Node> map = new HashMap<>();

        int minHd = 0; // Minimum horizontal distance (leftmost)
        int maxHd = 0; // Maximum horizontal distance (rightmost)

        // Start with the root at hd = 0
        q.add(new Info(root, 0));

        while (!q.isEmpty()) {
            Info curr = q.poll();

            // Store the node if it's the first one at its horizontal distance
            if (!map.containsKey(curr.hd)) {
                map.put(curr.hd, curr.node);
            }

            // Add left child with hd - 1
            if (curr.node.left != null) {
                q.add(new Info(curr.node.left, curr.hd - 1));
                minHd = Math.min(minHd, curr.hd - 1);
            }

            // Add right child with hd + 1
            if (curr.node.right != null) {
                q.add(new Info(curr.node.right, curr.hd + 1));
                maxHd = Math.max(maxHd, curr.hd + 1);
            }
        }

        // ✅ After BFS is done, print top view from leftmost to rightmost
        for (int i = minHd; i <= maxHd; i++) {
            System.out.print(map.get(i).data + " ");
        }

        System.out.println(); // move to next line
    }

    public static void main(String[] args) {

        // ✅ Creating the binary tree manually:
        /*
                 1
               /   \
              2     3
             / \   / \
            4   5 6   7
        */

        Node root = new Node(1);           // root node
        root.left = new Node(2);           // level 1 left
        root.right = new Node(3);          // level 1 right
        root.left.left = new Node(4);      // level 2 left of 2
        root.left.right = new Node(5);     // level 2 right of 2
        root.right.left = new Node(6);     // level 2 left of 3
        root.right.right = new Node(7);    // level 2 right of 3

        // ✅ Calling the method to print top view
        System.out.println("Top view of the tree:");
        topView(root);
    }
}
/*Absolutely Rishi! Let’s deeply dry run your code line by line to understand what it does and how the Top View of a Binary Tree is computed.

✅ Overview: What is Top View?
In a binary tree, the top view means the nodes visible when we look at the tree from the top. For each horizontal distance (hd) from the root, we show the first node that appears in that vertical line from top to bottom.

✅ Let's Start: Line-by-Line Dry Run
📁 Package and Imports
java
Copy
Edit
package com.interviewQuestion_DSA_Java.Tree_16.Binay_Tree_Part2;
import java.util.*;
Defines the package and imports all utility classes (Queue, HashMap, LinkedList, etc.)

✅ Node Class
java
Copy
Edit
static class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
This is a standard binary tree node.

Has:

int data → stores value.

Node left and right → point to child nodes.

Constructor initializes data, and both children to null.

✅ Info Class
java
Copy
Edit
static class Info {
    Node node;
    int hd;

    Info(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}
Used during BFS traversal.

Each Info object holds:

node → current node.

hd → horizontal distance from root (used for top view logic).

Left child → hd - 1

Right child → hd + 1

✅ Top View Logic
java
Copy
Edit
public static void topView(Node root) {
    if (root == null) return;
Edge case: If the tree is empty, just return.

java
Copy
Edit
    Queue<Info> q = new LinkedList<>();
    HashMap<Integer, Node> map = new HashMap<>();
Queue → used for level order traversal (BFS).

map → stores first node for each horizontal distance.

java
Copy
Edit
    int minHd = 0;
    int maxHd = 0;
Track min and max horizontal distances. Used later to print left to right in order.

java
Copy
Edit
    q.add(new Info(root, 0));
Enqueue root node with horizontal distance 0.

🔁 Start BFS Traversal
java
Copy
Edit
    while (!q.isEmpty()) {
        Info curr = q.poll();
Poll from queue: curr.node is current node, curr.hd is its horizontal distance.

java
Copy
Edit
        if (!map.containsKey(curr.hd)) {
            map.put(curr.hd, curr.node);
        }
Only add to map if it’s the first node at that hd → this ensures only top-most nodes get stored.

java
Copy
Edit
        if (curr.node.left != null) {
            q.add(new Info(curr.node.left, curr.hd - 1));
            minHd = Math.min(minHd, curr.hd - 1);
        }
If left child exists:

Add to queue with hd - 1

Update minHd

java
Copy
Edit
        if (curr.node.right != null) {
            q.add(new Info(curr.node.right, curr.hd + 1));
            maxHd = Math.max(maxHd, curr.hd + 1);
        }
    }
If right child exists:

Add to queue with hd + 1

Update maxHd

🔁 This loop continues until all nodes are visited in level-order.

✅ Print Result
java
Copy
Edit
    for (int i = minHd; i <= maxHd; i++) {
        System.out.print(map.get(i).data + " ");
    }
    System.out.println();
}
Loop from minHd to maxHd

Print node's data from map → this is the top view.

✅ main() Method – Build Tree
java
Copy
Edit
Node root = new Node(1);
root.left = new Node(2);
root.right = new Node(3);
root.left.left = new Node(4);
root.left.right = new Node(5);
root.right.left = new Node(6);
root.right.right = new Node(7);
👇 Tree Looks Like:
markdown
Copy
Edit
         1
       /   \
      2     3
     / \   / \
    4   5 6   7
✅ Step-by-Step Dry Run of This Tree
Start with root 1 at hd = 0

Queue = [1(0)]

Map = {0: 1}

Next: 2(-1), 3(1)

Add 2 → Map: -1: 2

Add 3 → Map: 1: 3

Next: 4(-2), 5(0), 6(0), 7(2)

Add 4 → Map: -2: 4

5 is skipped (already hd=0 in map)

6 is skipped (hd=0 in map)

7 → Map: 2: 7

➡️ Final map:

ini
Copy
Edit
hd = -2 → 4
hd = -1 → 2
hd =  0 → 1
hd =  1 → 3
hd =  2 → 7
✅ Output:
css
Copy
Edit
Top view of the tree:
4 2 1 3 7
✅ Summary of Key Concepts:
Concept	Explanation
Horizontal Distance	Position from root (0): left = -1, right = +1
BFS	Level-order traversal to capture first node at each hd
Map	Stores only the first node encountered for each hd
Top View	Nodes at the topmost level for each vertical slice of tree
Let me know if you want to see bottom view, left view, right view, or visualize this using ASCII Tree or a graphical image 🌳*/