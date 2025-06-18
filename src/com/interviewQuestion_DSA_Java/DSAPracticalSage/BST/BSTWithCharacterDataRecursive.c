#include <stdio.h>
#include <stdlib.h>

/*4. Binary Search Tree (BST)
  4.1 BST with Character Data (Recursive Postorder)
  Write a C program that uses functions to perform the following:
  a) Create a binary search tree of characters.
  b) Traverse the above binary search tree recursively in postorder.

  4.2 BST with Integer Data (Non-Recursive Inorder)
  Write a C program that uses functions to perform the following:
  a) Create a binary search tree of integers.
  b) Traverse the above binary search tree non-recursively in inorder.*/
// Structure for a node
struct Node {
    char data;
    struct Node* left;
    struct Node* right;
};
// Function to create a new node
struct Node* createNode(char data) {
    struct Node* newNode = (struct Node*) malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->left = newNode->right = NULL;
    return newNode;
}
// Function to insert a node in BST
struct Node* insert(struct Node* root, char data) {
    if (root == NULL) {
        return createNode(data);
    }
    if (data < root->data)
        root->left = insert(root->left, data);
    else if (data > root->data)
        root->right = insert(root->right, data);
    // if data is equal, do not insert duplicates
    return root;
}
// Function for recursive postorder traversal
void postorderTraversal(struct Node* root) {
    if (root != NULL) {
        postorderTraversal(root->left);
        postorderTraversal(root->right);
        printf("%c ", root->data);
    }
}
// Main function
int main() {
    struct Node* root = NULL;
    char elements[] = {'F', 'D', 'J', 'B', 'E', 'G', 'K', 'A', 'C', 'H'};
    int n = sizeof(elements) / sizeof(elements[0]);
// Creating BST
    for (int i = 0; i < n; i++) {
        root = insert(root, elements[i]);
    }
// Displaying postorder traversal
    printf("Postorder Traversal of BST:\n");
    postorderTraversal(root);
return 0;
}
/*Output (for given input characters)
  Postorder Traversal of BST:
  A C B E D H G K J F

  🔍 Explanation
  	• insert(): Inserts character nodes based on BST rules.
  	• postorderTraversal(): Recursively prints: left → right → root.
  	• Characters like F, D, J, ... are inserted into the BST maintaining order.
  	• Duplicates are ignored.
*/