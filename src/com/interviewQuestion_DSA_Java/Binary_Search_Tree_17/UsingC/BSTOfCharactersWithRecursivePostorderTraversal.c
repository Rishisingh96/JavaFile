#include <stdio.h>
#include <stdlib.h>

// ✅ Define structure for a BST node
struct Node {
    char data;
    struct Node* left;
    struct Node* right;
};

// ✅ Create a new node with given character
struct Node* createNode(char value) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    if (!newNode) {
        printf("Memory allocation failed!\n");
        exit(1);
    }
    newNode->data = value;
    newNode->left = newNode->right = NULL;
    return newNode;
}

// ✅ Insert character into the BST
struct Node* insert(struct Node* root, char value) {
    if (root == NULL) {
        return createNode(value);
    }

    // 🔹 Insert to left if value is smaller
    if (value < root->data)
        root->left = insert(root->left, value);

    // 🔹 Insert to right if value is greater
    else if (value > root->data)
        root->right = insert(root->right, value);

    // 🔸 If equal, we skip duplicates (optional based on use-case)

    return root;
}

// ✅ Postorder Traversal (Left → Right → Root)
void postOrderTraversal(struct Node* root) {
    if (root == NULL)
        return;

    postOrderTraversal(root->left);    // Visit left subtree
    postOrderTraversal(root->right);   // Visit right subtree
    printf("%c ", root->data);         // Visit current node
}

// ✅ Free the entire BST (memory cleanup)
void freeTree(struct Node* root) {
    if (root == NULL) return;
    freeTree(root->left);
    freeTree(root->right);
    free(root);
}

// ✅ Main function to drive the program
int main() {
    struct Node* root = NULL;
    int n;
    char ch;

    printf("Enter the number of characters to insert in BST: ");
    scanf("%d", &n);

    if (n <= 0) {
        printf("Invalid number of nodes.\n");
        return 1;
    }

    printf("Enter %d characters (no spaces, one by one):\n", n);
    for (int i = 0; i < n; i++) {
        scanf(" %c", &ch);  // NOTE: space before %c skips whitespaces
        root = insert(root, ch);
    }

    printf("\nPostorder Traversal of BST: ");
    postOrderTraversal(root);
    printf("\n");

    // Clean up memory
    freeTree(root);

    return 0;
}
/*
Enter the number of characters to insert in BST: 5
Enter 5 characters (no spaces, one by one):
D B A E C

Postorder Traversal of BST: A C B E D
*/