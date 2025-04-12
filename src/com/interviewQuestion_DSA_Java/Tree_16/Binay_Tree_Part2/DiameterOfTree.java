package com.interviewQuestion_DSA_Java.Tree_16.Binay_Tree_Part2;

public class DiameterOfTree {

    // Node class for binary tree
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Function to calculate height of a tree
    public static int height(Node root) {
        if (root == null) {
            return 0; // You can use -1 if you define height of leaf as 0
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    // Diameter Approach 1 (Time Complexity: O(n^2))
    public static int DiameterM1(Node root) {
        if (root == null) {
            return 0;
        }

        // Diameter of left subtree
        int leftDiameter = DiameterM1(root.left);

        // Diameter of right subtree
        int rightDiameter = DiameterM1(root.right);

        // Height of left and right subtrees
        int leftHt = height(root.left);
        int rightHt = height(root.right);

        // Diameter passing through the root
        int selfDiameter = leftHt + rightHt + 1;

        // Return max of all three
        return Math.max(selfDiameter, Math.max(leftDiameter, rightDiameter));
    }

    // Diameter Approach 2 (Time Complexity: O(n))
    static class Info{
        int diameter;
        int height;

        Info(int diameter, int height) {
            this.diameter = diameter;
            this.height = height;
        }
    }
    public static Info diameterMO(Node root) { // O(n)
        if (root == null) {
            return new Info(0, 0);
        }

        // Get left and right subtree info
        Info leftInfo = diameterMO(root.left);
        Info rightInfo = diameterMO(root.right);

        int diameter = Math.max(Math.max(leftInfo.diameter, rightInfo.diameter),leftInfo.height + rightInfo.height + 1);
        int height = Math.max(leftInfo.height, rightInfo.height) + 1;
        return new Info(diameter, height);
    }

    public static void main(String[] args) {
        /*
              Constructed Binary Tree:

                    1
                  /   \
                 2     3
                / \   / \
               4   5 6   7

            Expected Diameter: 5 (Longest path is 4 → 2 → 1 → 3 → 7)
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Height of the tree is: " + height(root));
        System.out.println("Diameter of the tree (Approach 1): " + DiameterM1(root));
        System.out.println("Diameter of the tree (Approach 2): " + diameterMO(root).diameter);
        System.out.println("Diameter of the tree (Approach 2): " + diameterMO(root).height);
    }
}
/*Sure Rishi! Let’s deeply dry run and explain line-by-line your DiameterOfTree Java code. This program is designed to compute the diameter of a binary tree using two approaches:

✅ Step-by-Step Walkthrough:
🔹 Package Declaration
java
Copy
Edit
package com.interviewQuestion_DSA_Java.Tree_16.Binay_Tree_Part2;
Declares the package your class belongs to. Helps in organizing the code.

🔹 Class Definition
java
Copy
Edit
public class DiameterOfTree {
Starts the main class named DiameterOfTree.

🔹 Inner Node Class
java
Copy
Edit
static class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
A binary tree node with:

data – holds the value.

left, right – references to left and right children.

Constructor initializes data and sets children to null.

🔹 Height Function
java
Copy
Edit
public static int height(Node root) {
    if (root == null) {
        return 0; // or -1 if using leaf height as 0
    }
    int leftHeight = height(root.left);
    int rightHeight = height(root.right);
    return Math.max(leftHeight, rightHeight) + 1;
}
🔸 Purpose: Returns height of the tree rooted at root.

🔸 How it works:

Base case: If root is null, height = 0.

Recursively calculate left and right subtree heights.

Height of current node = 1 + max(left, right).

✅ Diameter Approach 1 – Brute Force (O(n²))
java
Copy
Edit
public static int DiameterM1(Node root) {
    if (root == null) return 0;
Base case: null tree → diameter is 0.

java
Copy
Edit
    int leftDiameter = DiameterM1(root.left);
    int rightDiameter = DiameterM1(root.right);
Recursively get diameter of left and right subtrees.

java
Copy
Edit
    int leftHt = height(root.left);
    int rightHt = height(root.right);
Get height of left and right subtrees again (which is costly here!).

java
Copy
Edit
    int selfDiameter = leftHt + rightHt + 1;
Diameter passing through the current root node (number of nodes).

java
Copy
Edit
    return Math.max(selfDiameter, Math.max(leftDiameter, rightDiameter));
}
Returns the max among:

Through current node.

Entirely in left or right subtree.

⏱️ Time Complexity: O(n²)
Because each height() call is O(n), and it's called for each node.

✅ Diameter Approach 2 – Optimized (O(n))
java
Copy
Edit
static class Info {
    int diameter;
    int height;

    Info(int diameter, int height) {
        this.diameter = diameter;
        this.height = height;
    }
}
A helper class to store both:

diameter

height

So we don’t compute height multiple times unnecessarily.

java
Copy
Edit
public static Info diameterMO(Node root) {
    if (root == null) return new Info(0, 0);
Base case: return diameter = 0, height = 0 for null node.

java
Copy
Edit
    Info leftInfo = diameterMO(root.left);
    Info rightInfo = diameterMO(root.right);
Recursively calculate left and right subtree diameter + height.

java
Copy
Edit
    int diameter = Math.max(Math.max(leftInfo.diameter, rightInfo.diameter), leftInfo.height + rightInfo.height + 1);
Current diameter = max of:

Left subtree diameter.

Right subtree diameter.

Diameter through root (leftHeight + rightHeight + 1).

java
Copy
Edit
    int height = Math.max(leftInfo.height, rightInfo.height) + 1;
    return new Info(diameter, height);
}
Calculate height of current node.

Return both diameter and height to the parent node.

✅ Main Method – Tree Construction & Output
java
Copy
Edit
public static void main(String[] args) {
java
Copy
Edit
    /*
          Constructed Binary Tree:
                1
              /   \
             2     3
            / \   / \
           4   5 6   7

        Expected Diameter: 5 (Longest path is 4 → 2 → 1 → 3 → 7)
    */
/*You’ve constructed a full binary tree with 7 nodes.

Expected diameter: 5 (Nodes in path: 4-2-1-3-7)

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
Manually builds the tree structure.

        java
        Copy
Edit
    System.out.println("Height of the tree is: " + height(root));
Calls height() function → Returns 3.

java
        Copy
Edit
    System.out.println("Diameter of the tree (Approach 1): " + DiameterM1(root));
Brute-force O(n²) diameter calculation → Output: 5.

java
        Copy
Edit
    System.out.println("Diameter of the tree (Approach 2): " + diameterMO(root).diameter);
Efficient O(n) solution → Output: 5.

java
        Copy
Edit
    System.out.println("Diameter of the tree (Approach 2): " + diameterMO(root).height);
Just printing height from the same function → Output: 3.

        ✅ Final Output of this Program:
java
        Copy
Edit
Height of the tree is: 3
Diameter of the tree (Approach 1): 5
Diameter of the tree (Approach 2): 5
Diameter of the tree (Approach 2): 3
        ✅ Summary of Concepts
Concept	Description
Height	Max depth from root to a leaf node.
Diameter	Number of nodes on the longest path between any two nodes.
Brute Force Approach	Calls height repeatedly → O(n²).
Optimized Approach	Combines height & diameter in one pass → O(n).
Diameter Includes	Count of nodes, not edges.
Want me to rewrite this as short notes for revision or diagrams for visualization?*/