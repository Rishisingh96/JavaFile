package com.interviewQuestion_DSA_Java.Tree_16.Binay_Tree_Part2;

public class SubtreeOfAnotherTree {

    // Node class representing a binary tree node
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

    // Helper method to check if two trees are identical
    public static boolean isIdentical(Node node, Node subRoot) {
        // If both nodes are null, they are identical
        if (node == null && subRoot == null) {
            return true;
        }

        // If one of them is null or the data doesn't match, not identical
        else if (node == null || subRoot == null || node.data != subRoot.data) {
            return false;
        }
        // Recursively check left and right subtrees
        if(!isIdentical(node.left, subRoot.left)){
            return false;
        }
        if (!isIdentical(node.right, subRoot.right)){
            return false;
        }
//        or
//        return isIdentical(node.left, subRoot.left) && isIdentical(node.right, subRoot.right);
       return true;
    }

    // Main method to check if subRoot is a subtree of root
    public static boolean isSubtree(Node root, Node subRoot) {
        // If the main tree is null, then subRoot cannot be a subtree
        if (root == null) {
            return false;
        }

        // If the current node's data matches subRoot's data,
        // check if both trees from this point are identical
       if(root.data == subRoot.data){
           if (isIdentical(root, subRoot)) {
               return true;
           }
       }
        // Recursively check in left and right subtree
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    // Main driver code to test the logic
    public static void main(String[] args) {
        /*
         Constructing the main binary tree root1:

                    1
                   / \
                  2   3
                 / \
                4   5
        */
        // Constructing the main binary tree
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);

        /*
         Constructing the subtree root2:

                  2
                 / \
                4   5
        */
        // Constructing the subtree
        Node root2 = new Node(2);
        root2.left = new Node(4);
        root2.right = new Node(5); // You can uncomment this to test different cases

        // Check if root2 is a subtree of root1
        System.out.println(isSubtree(root1, root2));  // Output: true or false based on structure
    }
}
/*Absolutely Rishi! Let’s deeply dry run this SubtreeOfAnotherTree Java program line by line, and walk through its logic using the example trees from main().

✅ 1. Class and Inner Class Declaration
java
Copy
Edit
public class SubtreeOfAnotherTree {
This is the outer class that contains all logic.

java
Copy
Edit
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
Node is a static inner class used to create tree nodes.

Each node has:

data → stores an integer value.

left and right → pointers to left and right child nodes.

The constructor initializes data, and sets left and right as null.

✅ 2. Method: isIdentical(Node node, Node subRoot)
Purpose: To check whether two trees (or subtrees) are structurally and value-wise identical.

java
Copy
Edit
    public static boolean isIdentical(Node node, Node subRoot) {
CASE 1: Both null
java
Copy
Edit
        if (node == null && subRoot == null) {
            return true;
        }
If both nodes are null, that means we’ve reached the leaf node of both trees at the same time — this means they are identical at this branch.

CASE 2: One null or value mismatch
java
Copy
Edit
        else if (node == null || subRoot == null || node.data != subRoot.data) {
            return false;
        }
If:

Only one is null, or

Their values don’t match

→ Not identical.

CASE 3: Recurse both sides
java
Copy
Edit
        if(!isIdentical(node.left, subRoot.left)){
            return false;
        }
        if (!isIdentical(node.right, subRoot.right)){
            return false;
        }
        return true;
Recursively check both left and right subtree.

If either side is not identical → return false.

✅ 3. Method: isSubtree(Node root, Node subRoot)
Purpose: To check whether the subRoot is a subtree of root.

java
Copy
Edit
    public static boolean isSubtree(Node root, Node subRoot) {
CASE 1: Main root is null
java
Copy
Edit
        if (root == null) {
            return false;
        }
If root is null, there's nothing to compare, so return false.

CASE 2: Current node match
java
Copy
Edit
       if(root.data == subRoot.data){
           if (isIdentical(root, subRoot)) {
               return true;
           }
       }
If root node’s data matches subRoot’s root:

Check if the entire tree from this node is identical using isIdentical().

CASE 3: Search in left/right
java
Copy
Edit
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
If not identical, check recursively in left or right subtree of root.

✅ 4. Main Driver Code
java
Copy
Edit
    public static void main(String[] args) {
✅ Create root1 (Main Tree)
java
Copy
Edit
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
Structure of root1:

markdown
Copy
Edit
        1
       / \
      2   3
     / \
    4   5
✅ Create root2 (Subtree)
java
Copy
Edit
        Node root2 = new Node(2);
        root2.left = new Node(4);
        root2.right = new Node(5);
Structure of root2:

markdown
Copy
Edit
      2
     / \
    4   5
✅ Dry Run Execution
Let’s now simulate the execution:

java
Copy
Edit
System.out.println(isSubtree(root1, root2));
🔹 isSubtree(root1, root2):

root1.data = 1, root2.data = 2 → not equal.

Recurse left: isSubtree(root1.left, root2)

🔹 isSubtree(root1.left, root2):

root1.left.data = 2, root2.data = 2 → equal.

Call isIdentical(root1.left, root2)

✅ isIdentical(root1.left, root2):
makefile
Copy
Edit
Comparing:
     2             2
    / \           / \
   4   5         4   5
2 == 2 ✅

Check left subtree: 4 == 4 ✅

Their children are null → ✅

Check right subtree: 5 == 5 ✅

Their children are null → ✅

→ Both subtrees match → return true

So:

isSubtree(root1.left, root2) → true

Final Output: ✅ true

✅ Final Output
java
Copy
Edit
true
📌 If You Comment Out root2.right = new Node(5);:
Then root2 becomes:

Copy
Edit
  2
 /
4
It will compare with:

Copy
Edit
  2
 / \
4   5
Left child matches (4), right is null vs 5 → mismatch

isIdentical() → false

isSubtree() will continue to search but won’t find a match → ❌ false

✅ Summary of Logic
Method	Purpose
isIdentical	Checks if two trees are exactly the same
isSubtree	Checks if one tree is a subtree of another
Want me to give a step-by-step table of recursive calls and return values too? Or want me to add custom test cases and dry-run those?







You said:
one more check for comment root2.right = new Node(5); " and false


ChatGPT said:
Perfect Rishi! Let's test what happens when you comment out this line:

java
Copy
Edit
// root2.right = new Node(5);
✅ What Changes?
Original root2:

java
Copy
Edit
      2
     / \
    4   5
After commenting:

java
Copy
Edit
      2
     /
    4
Now root2 is missing the right child (5). But root1.left is still:

java
Copy
Edit
      2
     / \
    4   5
🔍 Dry Run Now
Step 1: Call
java
Copy
Edit
isSubtree(root1, root2)
→ root1.data = 1 ≠ root2.data = 2 → not same

→ Check left and right:

java
Copy
Edit
isSubtree(root1.left, root2) || isSubtree(root1.right, root2)
Step 2: Now check:
java
Copy
Edit
isSubtree(root1.left, root2)
→ root1.left.data = 2, root2.data = 2 → equal

→ Check isIdentical(root1.left, root2)

🔬 Now isIdentical(root1.left, root2)
makefile
Copy
Edit
root1.left:
      2
     / \
    4   5

root2:
      2
     /
    4
2 == 2 ✅

Left: 4 == 4 ✅

Right:

root1.right = 5, subRoot.right = null → ❌ mismatch

java
Copy
Edit
else if (node == null || subRoot == null || node.data != subRoot.data)
→ false
🔁 So isIdentical() → false

Step 3: Continue Search
Try:

java
Copy
Edit
isSubtree(root1.left.left, root2)
root1.left.left.data = 4, root2.data = 2 → not match
↓
Check children (null) → all fail

Same with root1.left.right (5), root1.right (3) — none match 2

✅ Final Output:
java
Copy
Edit
System.out.println(isSubtree(root1, root2)); // false
✅ Final Conclusion
Test Case	Output
root2 = subtree with 4 and 5	true
root2 = subtree with only 4 (no 5)	false
Let me know if you want to test with some other structures or make an interactive diagram out of this!*/