package com.interviewQuestion_DSA_Java.Binary_Search_Tree_17;

public class Build_BST {
    // Define the structure of each Node in the BST
    static class Node {
        int data;      // data stored in the node
        Node left;     // pointer to left child
        Node right;    // pointer to right child

        Node(int data){
            this.data = data;
            left = right = null; // initialize left and right children as null
        }
    }

    // Function to insert a value into the BST
    public static Node insert(Node root, int val){
        if(root == null){
            // If the tree is empty, create a new node and return it
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            // If value is smaller than root, insert into left subtree
            root.left = insert(root.left, val);
        } else {
            // If value is greater or equal, insert into right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }

    // Function to perform in-order traversal of the BST
    public static void inorder(Node root){
        if(root == null){
            return; // base case: if node is null, do nothing
        }
        inorder(root.left);           // visit left subtree
        System.out.print(root.data + " "); // print current node
        inorder(root.right);          // visit right subtree
    }

    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7}; // values to insert into BST
        Node root = null;             // initially BST is empty (root is null)

        // Insert each value into the BST
        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }

        // Perform in-order traversal to print the BST elements in sorted order
        inorder(root);
        System.out.println();
    }
}

/*
    ------------------------------
    Tree structure after insertion:

            5
           / \
          1   7
           \
            3
           / \
          2   4

    Step-by-step how tree built:

    1. Insert 5 → root is 5
    2. Insert 1 → 1 < 5 → goes to left of 5
    3. Insert 3 → 3 < 5 (left) → 3 > 1 → goes to right of 1
    4. Insert 4 → 4 < 5 (left) → 4 > 1 (right) → 4 > 3 → goes to right of 3
    5. Insert 2 → 2 < 5 (left) → 2 > 1 (right) → 2 < 3 (left) → goes to left of 3
    6. Insert 7 → 7 > 5 → goes to right of 5

    ------------------------------

    In-order traversal output:
    => 1 2 3 4 5 7

    (in-order means: Left → Root → Right)
*/
/*Alright! Let's dry run your Build_BST code carefully, step-by-step 👨‍💻🌟.
I'll explain exactly what happens internally when the program runs.

🔥 Step 1: Given array
ini
Copy
Edit
values = {5, 1, 3, 4, 2, 7}
🛠 Step 2: Insert values into BST
Insert 5
Tree is empty (root = null).

Create a new node with 5 → becomes the root.

Copy
Edit
5
Insert 1
1 < 5 → Go left.

Left child of 5 is null, so insert 1 there.

markdown
Copy
Edit
    5
   /
  1
Insert 3
3 < 5 → Go left.

3 > 1 → Go right.

Right child of 1 is null, insert 3 there.

markdown
Copy
Edit
    5
   /
  1
   \
    3
Insert 4
4 < 5 → Go left.

4 > 1 → Go right.

4 > 3 → Go right.

Right child of 3 is null, insert 4 there.

markdown
Copy
Edit
    5
   /
  1
   \
    3
     \
      4
Insert 2
2 < 5 → Go left.

2 > 1 → Go right.

2 < 3 → Go left.

Left child of 3 is null, insert 2 there.

markdown
Copy
Edit
    5
   /
  1
   \
    3
   / \
  2   4
Insert 7
7 > 5 → Go right.

Right child of 5 is null, insert 7 there.

markdown
Copy
Edit
    5
   / \
  1   7
   \
    3
   / \
  2   4
✅ All values inserted.

🖨 Step 3: In-order Traversal (Left → Root → Right)
Follow this:

Go to left of 5 → Node 1

Left of 1 → null (nothing to print)

Print 1

Right of 1 → Node 3

Left of 3 → Node 2

Left of 2 → null → Print 2

Back to 3 → Print 3

Right of 3 → Node 4

Left of 4 → null → Print 4

Back to 5 → Print 5

Right of 5 → Node 7

Left of 7 → null → Print 7

Thus, printing order:

Copy
Edit
1 2 3 4 5 7
🧠 Final Summary
✅ Tree structure built correctly:

markdown
Copy
Edit
        5
       / \
      1   7
       \
        3
       / \
      2   4
✅ In-order Traversal Output:

Copy
Edit
1 2 3 4 5 7
✅ Code runs perfectly.

Would you also like me to draw a step-by-step diagram for each insertion? 📈
(It's very fun and super helpful for interviews!)
Just say "Yes!" if you want! 🚀*/