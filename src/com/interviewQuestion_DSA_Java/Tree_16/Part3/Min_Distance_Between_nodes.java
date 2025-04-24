package com.interviewQuestion_DSA_Java.Tree_16.Part3;

public class Min_Distance_Between_nodes {

    // 🔹 Inner static class to define structure of a binary tree node
    static class Node {
        int val;
        Node left, right;

        Node(int data) {
            this.val = data;
            this.left = null;
            this.right = null;
        }
    }

    // 🔸 Method to find Lowest Common Ancestor (LCA) of two nodes in binary tree
    public static Node findlca2(Node root, int n1, int n2) {
        if (root == null) return null;

        // If current node matches either n1 or n2, return root (potential LCA)
        if (root.val == n1 || root.val == n2) return root;

        // Recur on left and right subtrees
        Node leftLCA = findlca2(root.left, n1, n2);
        Node rightLCA = findlca2(root.right, n1, n2);

        // If both calls return non-null, this node is the LCA
        if (leftLCA != null && rightLCA != null) return root;

        // Return whichever side is non-null
        return (leftLCA != null) ? leftLCA : rightLCA;
    }

    // 🔸 Function to find distance from root node to target node `n`
    public static int findDistance(Node root, int n) {
        if (root == null) return -1;

        // If current node is target node, return 0
        if (root.val == n) return 0;

        // Search left subtree
        int leftDistance = findDistance(root.left, n);

        // If found in left, return left + 1
        if (leftDistance != -1) return leftDistance + 1;

        // Else search right subtree and return right + 1 if found
        int rightDistance = findDistance(root.right, n);
        if (rightDistance != -1) return rightDistance + 1;

        // Node not found
        return -1;
    }

    // 🔸 Main method to return minimum distance between two nodes
    public static int minDist(Node root, int n1, int n2) {
        // Step 1: Find LCA of n1 and n2
        Node lca = findlca2(root, n1, n2);

        // Step 2: Find distance from LCA to n1 and n2
        int distance1 = findDistance(lca, n1);
        int distance2 = findDistance(lca, n2);

        // Step 3: Return sum of both distances
        return distance1 + distance2;
    }

    public static void main(String[] args) {
        // ✅ Sample binary tree construction:
        //            1
        //          /   \
        //         2     3
        //        / \   / \
        //       4   5 6   7

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 1, n2 = 4;
        int distance = minDist(root, n1, n2);  // Expected: 4 → 2 → 1 → 3 → 6 = distance 4
        System.out.println("Distance between " + n1 + " and " + n2 + " is: " + distance);
    }
}
/*Great! Let's deeply dry run this Java code line by line, especially the main logic for finding the minimum distance between two nodes in a binary tree. We’ll focus on the test case where n1 = 4 and n2 = 6.

🟩 Step-by-step Dry Run
✅ 1. Tree Construction in main():
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
Tree looks like:

markdown
Copy
Edit
        1
      /   \
     2     3
    / \   / \
   4   5 6   7
Values:

n1 = 4

n2 = 6

Now we call:

java
Copy
Edit
int distance = minDist(root, 4, 6);
✅ 2. minDist(root, 4, 6)
a) Call findlca2(root, 4, 6)
This function finds the Lowest Common Ancestor (LCA).

▸ At root node (1):
root.val = 1

1 != 4 && 1 != 6, so recur on both left and right subtrees.

▸ Left: findlca2(2, 4, 6)
2 != 4 && 2 != 6

Recur on left and right of node 2

➡️ findlca2(4, 4, 6) returns 4 (match found)
➡️ findlca2(5, 4, 6) returns null (no match)

So leftLCA = 4, rightLCA = null
⇒ Return 4

▸ Right: findlca2(3, 4, 6)
3 != 4 && 3 != 6

Recur on left and right of node 3

➡️ findlca2(6, 4, 6) returns 6 (match found)
➡️ findlca2(7, 4, 6) returns null

So leftLCA = 6, rightLCA = null
⇒ Return 6

Back to findlca2(1, 4, 6):
leftLCA = 4

rightLCA = 6

✅ Both are non-null → So 1 is the Lowest Common Ancestor

java
Copy
Edit
Node lca = findlca2(...) → lca = Node(1)
✅ 3. findDistance(lca, 4) i.e. findDistance(1, 4)
We now find the distance from node 1 to 4.

At node 1: Not match → Go left to node 2

At node 2: Not match → Go left to node 4

At node 4: Match → return 0

Back to node 2: leftDistance = 0 → return 1

Back to node 1: leftDistance = 1 → return 2

✅ Distance from 1 → 4 = 2

✅ 4. findDistance(lca, 6) i.e. findDistance(1, 6)
Now find the distance from node 1 to 6.

At node 1: Not match → Go right to node 3

At node 3: Not match → Go left to node 6

At node 6: Match → return 0

Back to node 3: leftDistance = 0 → return 1

Back to node 1: rightDistance = 1 → return 2

✅ Distance from 1 → 6 = 2

✅ 5. Return Total Distance
java
Copy
Edit
return distance1 + distance2 → 2 + 2 = 4
Final Output:

pgsql
Copy
Edit
Distance between 4 and 6 is: 4
🟨 Summary of What Happens Internally

Step	Result
findlca2(1, 4, 6)	returns node 1 (LCA)
findDistance(1, 4)	returns 2
findDistance(1, 6)	returns 2
Total Distance	2 + 2 = 4
🟦 Code is CORRECT ✅
findlca2() efficiently finds the lowest common ancestor.

findDistance() correctly finds distance from LCA to each node.

Logic is clean, recursive, and efficient.

Final result is accurate for any two nodes in a binary tree.

Would you like me to explain this visually (using a diagram), or run for another test case (e.g., 5 and 6)?*/