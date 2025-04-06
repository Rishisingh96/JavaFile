package com.interviewQuestion_DSA_Java.Tree_16.BinayTree;

import java.util.LinkedList;
import java.util.Queue;

public class BuildTreePreorder {
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

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public static void inorder(Node root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");  // Changed to print for inline output
            inorder(root.right);
        }

        public static void postorder(Node root) {
            if(root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " "); // Changed to print for inline output
        }
        //Tree Traversal
        //Level Order Traversal
        public static void levelOrder(Node root) {
            if(root == null) {
                return;
            }
            Queue<Node> queue = new LinkedList<Node>();
            queue.add(root);
            queue.add(null);

            while(!queue.isEmpty()) {
                Node currNode = queue.remove();
                if(currNode == null) {
                    System.out.println();
                    if(queue.isEmpty()) {
                        break;
                    } else {
                        queue.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if(currNode.left != null) {
                        queue.add(currNode.left);
                    }
                    if(currNode.right != null) {
                        queue.add(currNode.right);
                    }
                }
            }

        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1,-1, 5, -1, -1, 3, -1, 6, -1,-1};

        Node root = BinaryTree.buildTree(nodes); // ✅ Build the tree

        System.out.println("Inorder Traversal of the tree is: ");
//        BinaryTree.inorder(root); // ✅ Correctly pass root to inorder()
        //BinaryTree.postorder(root); //
        BinaryTree.levelOrder(root); //



    }
}

/*Absolutely, Rishi! Let’s dry run your code step by step for:

java
int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
This array represents a binary tree in preorder format, where:

Each value is a node,

-1 represents a null node (no child).

✅ Dry Run Step-by-Step:
🔰 Starting main():
java
Copy
Edit
BinaryTree tree = new BinaryTree();
Node root = tree.buildTree(nodes);
📌 Step into buildTree():
idx = -1 initially.
🧭 1st call: buildTree(nodes)
idx = 0, nodes[0] = 1

Create Node(1)

Call buildTree(nodes) for left

🧭 2nd call: buildTree(nodes)
idx = 1, nodes[1] = 2

Create Node(2)

Call buildTree(nodes) for left

🧭 3rd call:
idx = 2, nodes[2] = 4

Create Node(4)

Call buildTree(nodes) for left

🧭 4th call:
idx = 3, nodes[3] = -1

Return null (left of 4)

🧭 5th call:
idx = 4, nodes[4] = -1

Return null (right of 4)

🔙 Now Node(4) is built → return to Node(2)

🧭 6th call: (right of Node(2))
idx = 5, nodes[5] = 5

Create Node(5)

Call buildTree(nodes) for left

🧭 7th call:
idx = 6, nodes[6] = -1

Return null (left of 5)

🧭 8th call:
idx = 7, nodes[7] = -1

Return null (right of 5)

🔙 Now Node(5) is built → return to Node(2)

✅ Now Node(2) has:

left = Node(4)

right = Node(5)

Return to Node(1)

🧭 9th call: (right of Node(1))
idx = 8, nodes[8] = 3

Create Node(3)

Call buildTree(nodes) for left

🧭 10th call:
idx = 9, nodes[9] = -1

Return null (left of 3)

🧭 11th call:
idx = 10, nodes[10] = 6

Create Node(6)

Call buildTree(nodes) for left

🧭 12th call:
idx = 11, nodes[11] = -1

Return null (left of 6)

🧭 13th call:
idx = 12, nodes[12] = -1

Return null (right of 6)

✅ Node(6) is built → return to Node(3)

✅ Node(3) has:

left = null

right = Node(6)

Return to Node(1)

✅ Final Tree Structure:
markdown
Copy
Edit
        1
       / \
      2   3
     / \    \
    4   5    6
🔚 Now in main():
java
Copy
Edit
System.out.println("Preorder Traversal of the tree is:"+root.data);
🟢 This line only prints root.data, which is 1.

If you want to print full preorder traversal, you should write:

java
Copy
Edit
public static void preorder(Node root) {
    if (root == null) return;
    System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);
}
And call:

java
Copy
Edit
preorder(root);
📦 Final Output if updated:
csharp
Copy
Edit
Preorder Traversal of the tree is: 1 2 4 5 3 6
Let me know if you'd like to dry run inorder or postorder as well. I can also help you visualize this tree with ASCII diagrams or generate a full GUI-based representation if needed 😊🌳*/