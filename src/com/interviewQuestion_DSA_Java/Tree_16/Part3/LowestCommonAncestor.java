package com.interviewQuestion_DSA_Java.Tree_16.Part3;

import java.util.ArrayList;
/*Here’s your code arranged beautifully with comments, tree structure diagram, and explanation for better DSA interview preparation. We'll go step by step:

🌳 Problem: Lowest Common Ancestor (LCA) in Binary Tree
Binary Tree Structure:

markdown
Copy
Edit
        3
       / \
      5   1
     / \ / \
    6  2 0  8
      / \
     7   4
🔍 Goal:
Find the Lowest Common Ancestor (LCA) of two given nodes.

Example:
If n1 = 7 and n2 = 4, then LCA = 2.*/
public class LowestCommonAncestor {

    // Binary Tree Node Definition
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int x) {
            this.val = x;
        }
    }

    // 🔹 Method 1: Find Path from Root to Node
    // Stores the path from root to node with value 'n' in the path list
    public static boolean getPath(TreeNode root, ArrayList<TreeNode> path, int n) {
        if (root == null) return false;

        // Add current node to path
        path.add(root);

        // If current node is the target
        if (root.val == n) return true;

        // Recurse left and right
        boolean foundInLeft = getPath(root.left, path, n);
        boolean foundInRight = getPath(root.right, path, n);

        if (foundInLeft || foundInRight) return true;

        // Backtrack if not found
        path.remove(path.size() - 1);
        return false;
    }

    // 🔸 Method 1: Using Paths (Brute Force LCA)
    public static TreeNode findlca1(TreeNode root, int n1, int n2) {
        ArrayList<TreeNode> path1 = new ArrayList<>();
        ArrayList<TreeNode> path2 = new ArrayList<>();

        getPath(root, path1, n1);
        getPath(root, path2, n2);

        // Compare both paths to find last common node
        int i = 0;
        while (i < path1.size() && i < path2.size()) {
            if (path1.get(i) != path2.get(i)) break;
            i++;
        }

        // Last common node
        return path1.get(i - 1);
    }

    // 🔸 Method 2: Efficient Recursive Method
    public static TreeNode findlca2(TreeNode root, int n1, int n2) {
        if (root == null) return null;

        // If either n1 or n2 matches current node, return root
        if (root.val == n1 || root.val == n2) return root;

        // Recur on left and right subtrees
        TreeNode leftLCA = findlca2(root.left, n1, n2);
        TreeNode rightLCA = findlca2(root.right, n1, n2);

        // If both sides return non-null, current root is LCA
        if (leftLCA != null && rightLCA != null) return root;

        // Otherwise, return non-null side
        return (leftLCA != null) ? leftLCA : rightLCA;
    }

    // 🔧 Main Method to Test the Code
    public static void main(String[] args) {
        /*
            Sample Tree Used:
        Example usage of the LowestCommonAncestor class
        Create a binary tree and find the lowest common ancestor of two nodes
        The tree structure is as follows:
                    3
                   / \
                  5   1
                 / \ / \
                6  2 0  8
                  / \
                 7   4
         */

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        int n1 = 7, n2 = 4;

        // 🧪 Testing Both Methods
        TreeNode lca1 = findlca1(root, n1, n2); // Using Path Comparison
        TreeNode lca2 = findlca2(root, n1, n2); // Using Recursion

        if (lca1 != null) {
            System.out.println("LCA (Method 1 - Paths) of " + n1 + " and " + n2 + " is: " + lca1.val);
        } else {
            System.out.println("LCA not found (Method 1)");
        }

        if (lca2 != null) {
            System.out.println("LCA (Method 2 - Recursive) of " + n1 + " and " + n2 + " is: " + lca2.val);
        } else {
            System.out.println("LCA not found (Method 2)");
        }
    }
}
/*🔎 Why Two Methods?

Method	Time Complexity	Space Complexity	Suitable For
findlca1 (Path-based)	O(n) + O(n) (to build paths)	O(n) (2 paths)	Easy to understand, great for learning recursion and paths
findlca2 (Recursive)	O(n) (single traversal)	O(h) (height of tree stack space)	More optimal, used in real-time applications
Let me know if you want:

A web visualization of LCA path.

Diagram showing how recursive LCA works.

Practice problems based on this concept (like from LeetCode or GFG).*/


/*Sure Rishi! Let's deeply explain and dry run both Method 1 and Method 2 in your LowestCommonAncestor code.

We'll break it down step-by-step, include visuals for the binary tree, and dry run the inputs n1 = 7 and n2 = 4.

🌳 Tree Structure
Here's the structure of the tree used in the code:

markdown
Copy
Edit
            3
           / \
          5   1
         / \ / \
        6  2 0  8
          / \
         7   4
🧪 Input:
We are finding the Lowest Common Ancestor of nodes 7 and 4.

✅ Method 1: findlca1() — Path Comparison Method
💡 Idea:
Find paths from root to n1 and root to n2.

Compare both paths, and the last common node is the LCA.

🔍 Step-by-step Dry Run for findlca1(root, 7, 4)
🧭 Step 1: getPath(root, path1, 7)
We want to store the path from root to node 7.

Traversal:

3 → 5 → 2 → 7 ✅

Stored path1:

csharp
Copy
Edit
[3, 5, 2, 7]
🧭 Step 2: getPath(root, path2, 4)
We want to store the path from root to node 4.

Traversal:

3 → 5 → 2 → 4 ✅

Stored path2:

csharp
Copy
Edit
[3, 5, 2, 4]
🧭 Step 3: Compare paths to find the last common node
We iterate both paths:

diff
Copy
Edit
Index:   path1        path2
   0       3            3      ✅
   1       5            5      ✅
   2       2            2      ✅
   3       7            4      ❌ Mismatch here
So, the last common node = path1[2] = 2

✅ Output:
pgsql
Copy
Edit
LCA (Method 1 - Paths) of 7 and 4 is: 2
🔁 Time Complexity (Method 1):
getPath() → O(n)

Comparing paths → O(n)

Total = O(n)

✅ Method 2: findlca2() — Efficient Recursive Method
💡 Idea:
If root == n1 or root == n2, return root.

Recursively check left and right.

If both sides return non-null, current root is LCA.

🔍 Step-by-step Dry Run for findlca2(root, 7, 4)
Let’s trace the recursive calls with inputs (root = 3, n1 = 7, n2 = 4).

🔁 findlca2(3, 7, 4)
Root = 3 → not equal to 7 or 4.

Check left: findlca2(5, 7, 4)

Check right: findlca2(1, 7, 4)

🔁 findlca2(5, 7, 4)
Root = 5 → not 7 or 4.

Left → findlca2(6, 7, 4) → ❌ null

Right → findlca2(2, 7, 4)

🔁 findlca2(2, 7, 4)
Left → findlca2(7, 7, 4) → ✅ returns node 7

Right → findlca2(4, 7, 4) → ✅ returns node 4

Both left and right are non-null → LCA is node 2

→ Return node 2 to parent (node 5)

Now back at findlca2(5) → got node 2 from right → return node 2 to node 3.

🔁 findlca2(1, 7, 4)
Left: findlca2(0) → ❌ null

Right: findlca2(8) → ❌ null

→ return null to node 3.

Now at findlca2(3):

Left subtree returned node 2

Right subtree returned null

→ Return node 2

✅ Output:
pgsql
Copy
Edit
LCA (Method 2 - Recursive) of 7 and 4 is: 2
🔁 Time Complexity (Method 2):
Only one pass through the tree: O(n)

✅ Summary of Differences

Feature	Method 1 (Path-Based)	Method 2 (Recursive)
Approach	Store paths, then compare	Recursive single pass
Space Complexity	O(h) + O(h) = O(h)	O(h) recursion stack
Time Complexity	O(n) + O(n) = O(n)	O(n)
Extra Path Lists Required	Yes	No
Faster in Practice	❌ Slightly slower	✅ Efficient
Simpler to Understand	✅ Easier for beginners	❌ Needs recursion logic
Would you like me to draw the recursive call tree diagram or a visual explanation with images too?*/