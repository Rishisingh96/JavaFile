#include <stdio.h>
#include <stdlib.h>

/*  4.2 BST with Integer Data (Non-Recursive Inorder)
    Write a C program that uses functions to perform the following:
    a) Create a binary search tree of integers.
    b) Traverse the above binary search tree non-recursively in inorder.*/
// Node structure for BST
struct Node {
    int data;
    struct Node* left;
    struct Node* right;
};
// Stack structure for non-recursive traversal
#define MAX 100
struct Node* stack[MAX];
int top = -1;
// Stack operations
void push(struct Node* node) {
    if (top >= MAX - 1) {
        printf("Stack Overflow\n");
        return;
    }
    stack[++top] = node;
}
struct Node* pop() {
    if (top == -1) {
        return NULL;
    }
    return stack[top--];
}
int isEmpty() {
    return top == -1;
}
// Create a new node
struct Node* createNode(int data) {
    struct Node* newNode = (struct Node*) malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->left = newNode->right = NULL;
    return newNode;
}
// Insert node into BST
struct Node* insert(struct Node* root, int data) {
    if (root == NULL)
        return createNode(data);
    if (data < root->data)
        root->left = insert(root->left, data);
    else if (data > root->data)
        root->right = insert(root->right, data);
    // Do not insert duplicates
    return root;
}
// Non-recursive inorder traversal
void inorderNonRecursive(struct Node* root) {
    struct Node* current = root;
while (current != NULL || !isEmpty()) {
        while (current != NULL) {
            push(current);
            current = current->left;
        }
        current = pop();
        printf("%d ", current->data);
        current = current->right;
    }
}
// Main function
int main() {
    struct Node* root = NULL;
    int elements[] = {50, 30, 70, 20, 40, 60, 80};
    int n = sizeof(elements) / sizeof(elements[0]);
// Inserting elements into BST
    for (int i = 0; i < n; i++) {
        root = insert(root, elements[i]);
    }
// Performing non-recursive inorder traversal
    printf("Non-Recursive Inorder Traversal of BST:\n");
    inorderNonRecursive(root);
return 0;
}
