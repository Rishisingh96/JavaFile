package com.interviewQuestion_DSA_Java.Tree_16.Binay_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BuildTreeTraversal {

    // Node structure of the binary tree
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    // BinaryTree class with tree operations
    static class BinaryTree {
        static int idx = -1;

        // Build tree from given array using preorder traversal
        public static Node buildTree(int nodes[]) {
            idx++;
            // Base case: if node is -1, it's null
            if (nodes[idx] == -1) {
                return null;
            }

            // Create new node
            Node newNode = new Node(nodes[idx]);
            // Recursively build left and right subtree
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        // Inorder traversal: Left -> Root -> Right
        public static void inorder(Node root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        // Postorder traversal: Left -> Right -> Root
        public static void postorder(Node root) {
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        // Level Order Traversal (BFS)
        public static void levelOrder(Node root) {
            if (root == null) {
                return;
            }

            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            queue.add(null); // marker for end of current level

            while (!queue.isEmpty()) {
                Node currNode = queue.remove();

                if (currNode == null) {
                    System.out.println(); // End of current level
                    if (queue.isEmpty()) {
                        break;
                    } else {
                        queue.add(null); // Add marker for next level
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) queue.add(currNode.left);
                    if (currNode.right != null) queue.add(currNode.right);
                }
            }
        }

        // Preorder traversal: Root -> Left -> Right
        public static void preorder(Node root) {
            if (root == null) return;
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // Main method to execute tree building and traversal
    public static void main(String[] args) {
        // Preorder input with -1 as null
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        // Build the binary tree
        Node root = BinaryTree.buildTree(nodes);

        // Print different tree traversals
        System.out.println("Inorder Traversal of the tree:");
        BinaryTree.inorder(root); // Expected: 4 2 5 1 3 6
        System.out.println();

        System.out.println("Postorder Traversal of the tree:");
        BinaryTree.postorder(root); // Expected: 4 5 2 6 3 1
        System.out.println();

        System.out.println("Preorder Traversal of the tree:");
        BinaryTree.preorder(root); // Expected: 1 2 4 5 3 6
        System.out.println();

        System.out.println("Level Order Traversal of the tree:");
        BinaryTree.levelOrder(root); // Expected:
        // 1
        // 2 3
        // 4 5 6
    }
}
/*Absolutely Rishi! Let's deeply dry run your code step by step, method by method. We'll start from the main() and go through the tree creation and all traversal methods one by one.

✅ STEP 1: main() – Input Array and Tree Construction
java
Copy
Edit
int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
Node root = BinaryTree.buildTree(nodes);
This array represents a preorder traversal with -1 meaning null.

makefile
Copy
Edit
Index: 0  1  2   3   4   5   6   7   8   9  10  11  12
Value: 1  2  4  -1  -1  5  -1  -1   3  -1   6  -1  -1
Preorder = [Root, Left Subtree, Right Subtree]

✅ STEP 2: Tree Building with buildTree()
We trace buildTree() recursively to construct the binary tree:

markdown
Copy
Edit
                1
               / \
              2   3
             / \    \
            4   5    6
Dry Run of Index Progress:

idx = 0: 1 → Create node

idx = 1: 2 → Left child of 1

idx = 2: 4 → Left child of 2

idx = 3: -1 → left of 4 → null

idx = 4: -1 → right of 4 → null → return node 4

idx = 5: 5 → right of 2

idx = 6: -1 → left of 5 → null

idx = 7: -1 → right of 5 → null → return node 5

idx = 8: 3 → right of 1

idx = 9: -1 → left of 3 → null

idx = 10: 6 → right of 3

idx = 11: -1 → left of 6 → null

idx = 12: -1 → right of 6 → null → return node 6

✅ Tree built successfully.

✅ STEP 3: Inorder Traversal – inorder(root)
Inorder = Left → Root → Right

Call Flow:

text
Copy
Edit
inorder(1)
 └── inorder(2)
      └── inorder(4)
           └── null
           → print(4)
           └── null
      → print(2)
      └── inorder(5)
           └── null
           → print(5)
           └── null
 → print(1)
 └── inorder(3)
      └── null
      → print(3)
      └── inorder(6)
           └── null
           → print(6)
           └── null
🔸 Output: 4 2 5 1 3 6

✅ STEP 4: Postorder Traversal – postorder(root)
Postorder = Left → Right → Root

Call Flow:

text
Copy
Edit
postorder(1)
 └── postorder(2)
      └── postorder(4)
           └── null
           └── null
           → print(4)
      └── postorder(5)
           └── null
           └── null
           → print(5)
      → print(2)
 └── postorder(3)
      └── null
      └── postorder(6)
           └── null
           └── null
           → print(6)
      → print(3)
 → print(1)
🔸 Output: 4 5 2 6 3 1

✅ STEP 5: Preorder Traversal – preorder(root)
Preorder = Root → Left → Right

Call Flow:

text
Copy
Edit
preorder(1)
 → print(1)
 └── preorder(2)
      → print(2)
      └── preorder(4)
           → print(4)
           └── null
           └── null
      └── preorder(5)
           → print(5)
           └── null
           └── null
 └── preorder(3)
      → print(3)
      └── null
      └── preorder(6)
           → print(6)
           └── null
           └── null
🔸 Output: 1 2 4 5 3 6

✅ STEP 6: Level Order Traversal – levelOrder(root)
Level Order = BFS (Level-wise from top to bottom)

Using a queue:

yaml
Copy
Edit
Queue: [1, null]
→ 1 → print → add(2,3) → Queue: [2, 3, null]
→ 2 → print → add(4,5) → Queue: [3, null, 4, 5]
→ 3 → print → add(6)   → Queue: [null, 4, 5, 6]
→ null → println()     → add null → Queue: [4, 5, 6, null]
→ 4 → print            → Queue: [5, 6, null]
→ 5 → print            → Queue: [6, null]
→ 6 → print            → Queue: [null]
→ null → println()     → Queue: []
🔸 Output:

Copy
Edit
1
2 3
4 5 6
✅ Summary of Outputs:
text
Copy
Edit
Inorder Traversal:    4 2 5 1 3 6
Postorder Traversal:  4 5 2 6 3 1
Preorder Traversal:   1 2 4 5 3 6
Level Order Traversal:
1
2 3
4 5 6
Would you like me to now add the extra operations like counting nodes, height, etc., into this same file below the traversals?*/