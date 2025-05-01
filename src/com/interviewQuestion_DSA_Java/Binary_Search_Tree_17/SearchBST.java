package com.interviewQuestion_DSA_Java.Binary_Search_Tree_17;


public class SearchBST {
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
    public static boolean search(Node root, int key){
        //Base case
        if(root == null){
            return false;
        }
        //case 1
        if(root.data == key){
            return true;
        }
        //case 2
        if(root.data > key){
            return search(root.left, key);
        }
        //case 3
        else {
            return search(root.right, key);
        }
    }
    public static void main(String[] args) {
    int values[] = {5,1,3,4,2,7};
    Node root = null;

    for(int i=0; i<values.length; i++){
        root = insert(root, values[i]);
    }
    inorder(root);
        System.out.println();

        if(search(root,8)){  //Time complexity  O(h)
            System.out.println("Number found");
        }else {
            System.out.println("Number Not found");
        }
    }
}
/*Alright! Let's dry run your SearchBST code step-by-step 🔥 —
I'll break it down clearly for you. 🛠️

🛠 Step 1: Array given
ini
Copy
Edit
values = {5, 1, 3, 4, 2, 7}
🛠 Step 2: Insert elements into BST
(we use the insert function)

Insert 5
Tree is empty → create node with 5 → becomes the root.

Copy
Edit
5
Insert 1
1 < 5 → Go to left child → Left is null.

Insert 1 as left child of 5.

markdown
Copy
Edit
    5
   /
  1
Insert 3
3 < 5 → Go left to 1

3 > 1 → Go right of 1 → Right is null.

Insert 3 as right child of 1.

markdown
Copy
Edit
    5
   /
  1
   \
    3
Insert 4
4 < 5 → Go left to 1

4 > 1 → Go right to 3

4 > 3 → Go right of 3 → Right is null.

Insert 4 as right child of 3.

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
2 < 5 → Go left to 1

2 > 1 → Go right to 3

2 < 3 → Go left of 3 → Left is null.

Insert 2 as left child of 3.

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
7 > 5 → Go right → Right is null.

Insert 7 as right child of 5.

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
✅ BST is built successfully.

🛠 Step 3: Inorder Traversal (Left → Root → Right)
Let's do inorder now:

Left of 5 → 1

Left of 1 → null

Print 1

Right of 1 → 3

Left of 3 → 2

Left of 2 → null

Print 2

Back to 3 → Print 3

Right of 3 → 4

Left of 4 → null

Print 4

Back to 5 → Print 5

Right of 5 → 7

Left of 7 → null

Print 7

So output of inorder:

Copy
Edit
1 2 3 4 5 7
🛠 Step 4: Search for 8
Now, search for 8:

Start at root 5

8 > 5 → Go right → Node 7

8 > 7 → Go right → null

Reached null, not found.

Thus, output will be:

mathematica
Copy
Edit
Number Not found
✅ Final Output
mathematica
Copy
Edit
1 2 3 4 5 7
Number Not found
📋 Dry Run Summary

Step	Action	Tree Change	Notes
1	Insert 5	Root is 5
2	Insert 1	Left of 5 is 1
3	Insert 3	Right of 1 is 3
4	Insert 4	Right of 3 is 4
5	Insert 2	Left of 3 is 2
6	Insert 7	Right of 5 is 7
7	Inorder	Prints 1 2 3 4 5 7
8	Search 8	Not found	Prints "Number Not found"
📈 Time Complexity
Insertion: O(h) (where h = height of tree)

Search: O(h)

(h ≈ log n for balanced BST, but can be up to n in worst case for skewed trees.)*/