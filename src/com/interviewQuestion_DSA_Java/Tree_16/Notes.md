All Most Important Operation of tree write heare

 * ✅ Binary Tree Operations
 * -------------------------
 * 1. Traversals (Inorder, Preorder, Postorder)
 * 2. Count Total Nodes
 * 3. Count Leaf Nodes
 * 4. Height of Tree
 * 5. Diameter
 * 6. Mirror Tree
 * 7. Is Balanced Tree
 * 8. Left View, Right View
 * 9. Lowest Common Ancestor (LCA)

ChatGPT said:
Here’s a list of most important operations on a binary tree, especially useful for interviews and DSA practice — including their Java method names and short explanations.

✅ 1. Build a Binary Tree
Method: buildTree(int[] nodes)

Input: Preorder array with -1 as null

Purpose: Construct tree recursively

✅ 2. Tree Traversals
Inorder (Left → Root → Right)
inorder(Node root)

Preorder (Root → Left → Right)
preorder(Node root)

Postorder (Left → Right → Root)
postorder(Node root)

Level Order (BFS Level-wise)
levelOrder(Node root)

✅ 3. Count Total Nodes
Method: countNodes(Node root)

Returns: Total number of nodes in the tree

✅ 4. Count Leaf Nodes
Method: countLeafNodes(Node root)

Returns: Number of leaf (terminal) nodes

✅ 5. Height of Tree
Method: height(Node root)

Returns: Height (or depth) of tree

✅ 6. Sum of All Nodes
Method: sumOfNodes(Node root)

Returns: Sum of all node values

✅ 7. Search a Node
Method: search(Node root, int key)

Returns: true if key exists in tree

✅ 8. Mirror Tree
Method: mirror(Node root)

Effect: Swaps left & right children of all nodes

✅ 9. Check if Tree is Balanced
Method: isBalanced(Node root)

Returns: true if height difference between subtrees ≤ 1 for all nodes

✅ 10. Diameter of the Tree
Method: diameter(Node root)

Returns: Longest path between any two nodes (can pass through root or not)

✅ 11. Maximum Path Sum
Method: maxPathSum(Node root)

Returns: Max sum of any path (not necessarily root-to-leaf)

✅ 12. Lowest Common Ancestor (LCA)
Method: lca(Node root, int n1, int n2)

Returns: LCA of two nodes

✅ 13. Print Nodes at K Distance
Method: printKLevel(Node root, int level)

Use case: Nodes at distance k from root

✅ 14. Is Subtree
Method: isSubtree(Node main, Node sub)

Returns: true if sub is a subtree of main

✅ 15. Right View of Tree
Method: rightView(Node root)

Returns: Last visible node at each level from right

✅ 16. Left View of Tree
Method: leftView(Node root)

Returns: First visible node at each level from left

Would you like me to write the Java implementation for any of these operations next? You can say something like:
“Yes, show me code for Count Nodes” or “Implement all one by one” 😊


Implement all one by one

ChatGPT said:
Great! Let's implement all important binary tree operations one by one in your existing structure.
I'll start with Count Nodes, then proceed step-by-step. Each method will be added inside the BinaryTree class.

✅ 1. Count Total Nodes
java
Copy
Edit
public static int countNodes(Node root) {
    if (root == null) return 0;
    return 1 + countNodes(root.left) + countNodes(root.right);
}
✅ 2. Count Leaf Nodes
java
Copy
Edit
public static int countLeafNodes(Node root) {
    if (root == null) return 0;
    if (root.left == null && root.right == null) return 1;
    return countLeafNodes(root.left) + countLeafNodes(root.right);
}
✅ 3. Height of the Tree
java
Copy
Edit
public static int height(Node root) {
    if (root == null) return 0;
    return Math.max(height(root.left), height(root.right)) + 1;
}
✅ 4. Sum of All Nodes
java
Copy
Edit
public static int sumOfNodes(Node root) {
    if (root == null) return 0;
    return root.data + sumOfNodes(root.left) + sumOfNodes(root.right);
}
✅ 5. Search a Node
java
Copy
Edit
public static boolean search(Node root, int key) {
    if (root == null) return false;
    if (root.data == key) return true;
    return search(root.left, key) || search(root.right, key);
}
✅ 6. Mirror Tree
java
Copy
Edit
public static void mirror(Node root) {
    if (root == null) return;
    // Swap children
    Node temp = root.left;
    root.left = root.right;
    root.right = temp;

    mirror(root.left);
    mirror(root.right);
}
✅ 7. Check if Tree is Balanced
java
Copy
Edit
public static boolean isBalanced(Node root) {
    return checkHeight(root) != -1;
}

private static int checkHeight(Node root) {
    if (root == null) return 0;

    int left = checkHeight(root.left);
    if (left == -1) return -1;

    int right = checkHeight(root.right);
    if (right == -1) return -1;

    if (Math.abs(left - right) > 1) return -1;

    return Math.max(left, right) + 1;
}
✅ 8. Diameter of the Tree
java
Copy
Edit
static int diameter = 0;

public static int diameter(Node root) {
    diameter = 0;
    diameterUtil(root);
    return diameter;
}

private static int diameterUtil(Node root) {
    if (root == null) return 0;
    int left = diameterUtil(root.left);
    int right = diameterUtil(root.right);

    diameter = Math.max(diameter, left + right + 1);
    return Math.max(left, right) + 1;
}
✅ 9. Maximum Path Sum
java
Copy
Edit
static int maxPathSum = Integer.MIN_VALUE;

public static int maxPathSum(Node root) {
    maxPathSum = Integer.MIN_VALUE;
    maxPathSumUtil(root);
    return maxPathSum;
}

private static int maxPathSumUtil(Node root) {
    if (root == null) return 0;

    int left = Math.max(0, maxPathSumUtil(root.left));
    int right = Math.max(0, maxPathSumUtil(root.right));

    maxPathSum = Math.max(maxPathSum, left + right + root.data);
    return root.data + Math.max(left, right);
}
✅ 10. Lowest Common Ancestor (LCA)
java
Copy
Edit
public static Node lca(Node root, int n1, int n2) {
    if (root == null || root.data == n1 || root.data == n2) return root;

    Node left = lca(root.left, n1, n2);
    Node right = lca(root.right, n1, n2);

    if (left != null && right != null) return root;
    return (left != null) ? left : right;
}
✅ 11. Print Nodes at K Level
java
Copy
Edit
public static void printKLevel(Node root, int k) {
    if (root == null) return;
    if (k == 0) {
        System.out.print(root.data + " ");
        return;
    }
    printKLevel(root.left, k - 1);
    printKLevel(root.right, k - 1);
}
✅ 12. Is Subtree
java
Copy
Edit
public static boolean isSubtree(Node main, Node sub) {
    if (sub == null) return true;
    if (main == null) return false;
    if (isIdentical(main, sub)) return true;

    return isSubtree(main.left, sub) || isSubtree(main.right, sub);
}

private static boolean isIdentical(Node a, Node b) {
    if (a == null && b == null) return true;
    if (a == null || b == null || a.data != b.data) return false;

    return isIdentical(a.left, b.left) && isIdentical(a.right, b.right);
}
✅ 13. Right View of Tree
java
Copy
Edit
public static void rightView(Node root) {
    rightViewUtil(root, 0);
    System.out.println();
}

static int maxLevelRight = -1;

private static void rightViewUtil(Node root, int level) {
    if (root == null) return;

    if (level > maxLevelRight) {
        System.out.print(root.data + " ");
        maxLevelRight = level;
    }

    rightViewUtil(root.right, level + 1);
    rightViewUtil(root.left, level + 1);
}
✅ 14. Left View of Tree
java
Copy
Edit
public static void leftView(Node root) {
    leftViewUtil(root, 0);
    System.out.println();
}

static int maxLevelLeft = -1;

private static void leftViewUtil(Node root, int level) {
    if (root == null) return;

    if (level > maxLevelLeft) {
        System.out.print(root.data + " ");
        maxLevelLeft = level;
    }

    leftViewUtil(root.left, level + 1);
    leftViewUtil(root.right, level + 1);
}
✅ Sample main() Usage:
You can test these in your main:

java
Copy
Edit
System.out.println("Total Nodes: " + BinaryTree.countNodes(root));
System.out.println("Leaf Nodes: " + BinaryTree.countLeafNodes(root));
System.out.println("Height: " + BinaryTree.height(root));
System.out.println("Sum of Nodes: " + BinaryTree.sumOfNodes(root));
System.out.println("Search 5: " + BinaryTree.search(root, 5));

BinaryTree.rightView(root);
BinaryTree.leftView(root);
Want me to give you the updated full code file with all methods inserted, formatted and ready to run?