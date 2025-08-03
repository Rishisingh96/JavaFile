#include <stdio.h>
#include <stdlib.h>
// Define the structure of a Tree Node
struct Node {
  int data;                 // Holds the data (value) of the node
    struct Node* left;        // Pointer to the left child
    struct Node* right;       // Pointer to the right child
};

// Function to create a new node with given value
struct Node* createNode(int value) {
    // Allocate memory for a new node
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    
    // Assign value to the node
    newNode->data = value;
    
    // Initialize left and right child as NULL
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}

// Inorder Traversal: Left -> Root -> Right
void inorder(struct Node* root) {
    if (root != NULL) {
        inorder(root->left);               // Visit left subtree
        printf("%d ", root->data);         // Visit root
        inorder(root->right);              // Visit right subtree
    }
}

// Preorder Traversal: Root -> Left -> Right
void preorder(struct Node* root) {
    if (root != NULL) {
        printf("%d ", root->data);         // Visit root
        preorder(root->left);              // Visit left subtree
        preorder(root->right);             // Visit right subtree
    }
}

// Postorder Traversal: Left -> Right -> Root
void postorder(struct Node* root) {
    if (root != NULL) {
        postorder(root->left);             // Visit left subtree
        postorder(root->right);            // Visit right subtree
        printf("%d ", root->data);         // Visit root
    }
}

// Function to delete (free) the tree to avoid memory leak
void deleteTree(struct Node* root) {
    if (root == NULL)
        return;
    
    // First delete both subtrees
    deleteTree(root->left);
    deleteTree(root->right);
    // Then delete the current node
    free(root);
}

// Main function
int main() {
    // Create root node
    struct Node* root = createNode(10);

    // Manually adding children to the tree
    root->left = createNode(5);
    root->right = createNode(15);
    root->left->left = createNode(3);
    root->left->right = createNode(7);
    root->right->left = createNode(12);
    root->right->right = createNode(18);

    // Print all tree traversals
    printf("Inorder Traversal: ");
    inorder(root);
    printf("\n");
    printf("Preorder Traversal: ");
    preorder(root);
    printf("\n");
    printf("Postorder Traversal: ");
    postorder(root);
    printf("\n");
    // Free all allocated memory
    deleteTree(root);
    return 0;
}
