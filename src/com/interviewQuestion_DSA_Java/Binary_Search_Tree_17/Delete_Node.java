package com.interviewQuestion_DSA_Java.Binary_Search_Tree_17;

public class Delete_Node {

    // Node class to represent each node of the BST
    static class Node {
        int data;      // Data stored in the node
        Node left;     // Pointer to left child
        Node right;    // Pointer to right child

        Node(int data){
            this.data = data;
            left = right = null; // Initialize left and right children to null
        }
    }

    // Function to insert a value into the BST
    public static Node insert(Node root, int val){
        if (root == null) {
            // If the tree is empty, create a new node
            return new Node(val);
        }
        if (val < root.data) {
            // If value is smaller, insert into left subtree
            root.left = insert(root.left, val);
        } else {
            // If value is greater or equal, insert into right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }

    // Function to perform in-order traversal (Left -> Root -> Right)
    public static void inorder(Node root){
        if (root == null) {
            return;
        }
        inorder(root.left);                  // Traverse left subtree
        System.out.print(root.data + " ");    // Print root node
        inorder(root.right);                 // Traverse right subtree
    }

    // Function to delete a node from BST
    public static Node delete(Node root, int val){
        if (root == null) {
            return null; // Base case: if tree is empty
        }

        if (val < root.data) {
            // Value is smaller: search in left subtree
            root.left = delete(root.left, val);
        } else if (val > root.data) {
            // Value is greater: search in right subtree
            root.right = delete(root.right, val);
        } else {
            // Node to be deleted found

            // Case 1: Node is a leaf node (no child)
            if (root.left == null && root.right == null) {
                return null; // Delete the node
            }
            // Case 2: Node has only one child
            if (root.left == null) {
                return root.right; // Replace node with its right child
            } else if (root.right == null) {
                return root.left; // Replace node with its left child
            }
            // Case 3: Node has two children
            // Find the inorder successor (smallest value in right subtree)
            Node temp = findInorderSuccessor(root.right);

            // Replace root's data with inorder successor's data
            root.data = temp.data;

            // Delete the inorder successor node
            root.right = delete(root.right, temp.data);
        }
        return root;
    }

    // Function to find inorder successor (smallest node in right subtree)
    public static Node findInorderSuccessor(Node root){
        while (root.left != null) {
            root = root.left; // Move to leftmost node
        }
        return root;
    }

    // Main method
    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14}; // Elements to insert
        Node root = null;

        // Insert all elements into BST
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        // Display the BST using inorder traversal
        System.out.println("Original Tree (Inorder Traversal):");
        inorder(root);
        System.out.println();

        // Delete node with value 8
        root = delete(root, 8);

        // Display BST after deletion
        System.out.println("Tree after deleting 8 (Inorder Traversal):");
        inorder(root);
        System.out.println();
    }
}

/*
    ------------------------------
    Initial BST (after insertion):

              8
            /   \
           5     10
          / \      \
         3   6      11
        / \           \
       1   4           14

    Step-by-step insertion:
    1. 8 inserted as root
    2. 5 < 8 → goes to left
    3. 3 < 8, 3 < 5 → goes to left of 5
    4. 1 < 8, 1 < 5, 1 < 3 → left of 3
    5. 4 < 8, 4 < 5, 4 > 3 → right of 3
    6. 6 < 8, 6 > 5 → right of 5
    7. 10 > 8 → right of 8
    8. 11 > 8, 11 > 10 → right of 10
    9. 14 > 8, 14 > 10, 14 > 11 → right of 11

    ------------------------------

    Deleting 8:
    - Node 8 has two children.
    - Find inorder successor (smallest in right subtree) → 10
    - Replace 8 with 10
    - Now delete 10 node from right subtree.

    ------------------------------

    BST After Deletion:

              10
            /    \
           5      11
          / \       \
         3   6       14
        / \
       1   4

    In-order Traversal after Deletion:
    => 1 3 4 5 6 10 11 14
*/
/*Let's dry-run your code step-by-step — meaning we will carefully walk through every step and see what exactly happens in memory.

I'll break this down in an easy-to-understand way, showing how the tree builds and changes.

🛠 Step 1: Insert elements one by one into the BST
Input array:

ini
Copy
Edit
values = {8, 5, 3, 1, 4, 6, 10, 11, 14}
Let's insert:

Insert 8
Tree is empty → create root node with 8.

Copy
Edit
8
Insert 5
5 < 8 → Go left.

Left child of 8 is null → insert 5 there.

markdown
Copy
Edit
    8
   /
  5
Insert 3
3 < 8 → Go left.

3 < 5 → Go left of 5.

Insert 3 as left child of 5.

markdown
Copy
Edit
    8
   /
  5
 /
3
Insert 1
1 < 8 → left

1 < 5 → left

1 < 3 → left

Insert 1 as left child of 3.

markdown
Copy
Edit
      8
     /
    5
   /
  3
 /
1
Insert 4
4 < 8 → left

4 < 5 → left

4 > 3 → right

Insert 4 as right child of 3.

markdown
Copy
Edit
      8
     /
    5
   /
  3
 / \
1   4
Insert 6
6 < 8 → left

6 > 5 → right

Insert 6 as right child of 5.

markdown
Copy
Edit
      8
     /
    5
   / \
  3   6
 / \
1   4
Insert 10
10 > 8 → right

Insert 10 as right child of 8.

markdown
Copy
Edit
      8
     / \
    5   10
   / \
  3   6
 / \
1   4
Insert 11
11 > 8 → right

11 > 10 → right

Insert 11 as right child of 10.

markdown
Copy
Edit
      8
     / \
    5   10
   / \    \
  3   6    11
 / \
1   4
Insert 14
14 > 8 → right

14 > 10 → right

14 > 11 → right

Insert 14 as right child of 11.

markdown
Copy
Edit
      8
     / \
    5   10
   / \    \
  3   6    11
 / \         \
1   4         14
✅ Done inserting all values.

🖨 Step 2: Inorder Traversal (Left → Root → Right)
Traversal order:

mathematica
Copy
Edit
Left Subtree of 8 → 5
Left Subtree of 5 → 3
Left Subtree of 3 → 1
Print 1
Back to 3 → print 3
Right Subtree of 3 → 4
Print 4
Back to 5 → print 5
Right Subtree of 5 → 6
Print 6
Back to 8 → print 8
Right Subtree of 8 → 10
Right Subtree of 10 → 11
Right Subtree of 11 → 14
Print 10 → 11 → 14
Thus, output:

Copy
Edit
1 3 4 5 6 8 10 11 14
❌ Step 3: Delete node 8
Now you delete node 8:

8 has two children (left 5, right 10).

So, we find its inorder successor (smallest node in right subtree).

Find inorder successor:
Go right (10), check left (no left child).

So inorder successor is 10.

✅ Inorder successor = 10.

Replace:
Replace 8 with 10.

Now delete the duplicate 10:
Go to 10's position (right child of root), delete node 10.

10 has right child 11 → replace 10 with 11.

New Tree:

markdown
Copy
Edit
      10
     /   \
    5     11
   / \      \
  3   6      14
 / \
1   4
🖨 Step 4: Inorder Traversal after Deletion
Follow the same pattern (Left → Root → Right):

mathematica
Copy
Edit
Left Subtree of 10 → 5
Left Subtree of 5 → 3
Left Subtree of 3 → 1 → print 1
Back to 3 → print 3
Right Subtree of 3 → 4 → print 4
Back to 5 → print 5
Right Subtree of 5 → 6 → print 6
Back to 10 → print 10
Right Subtree of 10 → 11
Right Subtree of 11 → 14
Print 11 → 14
Thus, output:

Copy
Edit
1 3 4 5 6 10 11 14
📋 Final Outputs printed:
mathematica
Copy
Edit
Original Tree (Inorder Traversal):
1 3 4 5 6 8 10 11 14

Tree after deleting 8 (Inorder Traversal):
1 3 4 5 6 10 11 14
🧠 Summary
Inserted all values correctly.

Inorder traversal sorted the BST.

Deleted root (8) properly using inorder successor (10).

Final tree is balanced.*/