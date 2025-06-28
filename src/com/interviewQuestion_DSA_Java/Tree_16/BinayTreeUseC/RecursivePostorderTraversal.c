#include <stdio.h>
#include <stdlib.h>

// Define structure for tree node
struct Node {
    char data;
    struct Node* left;
    struct Node* right;
};

// Function to create a new node
struct Node* createNode(char value) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = value;
    newNode->left = newNode->right = NULL;
    return newNode;
}

// Function to insert a character into BST
struct Node* insert(struct Node* root, char value) {
    if (root == NULL) {
        return createNode(value);
    }

    if (value < root->data)
        root->left = insert(root->left, value);
    else if (value > root->data)
        root->right = insert(root->right, value);

    return root;
}

// Recursive postorder traversal (Left → Right → Root)
void postOrder(struct Node* root) {
    if (root != NULL) {
        postOrder(root->left);
        postOrder(root->right);
        printf("%c ", root->data);
    }
}

// Main function
int main() {
    struct Node* root = NULL;
    int n;
    char ch;

    printf("Enter the number of characters to insert in BST: ");
    scanf("%d", &n);

    printf("Enter characters: ");
    for (int i = 0; i < n; i++) {
        scanf(" %c", &ch);  // space before %c is important to skip whitespaces
        root = insert(root, ch);
    }

    printf("\nPostorder Traversal of BST: ");
    postOrder(root);
    printf("\n");

    return 0;
}
/*🔸 Sample Output
Enter the number of characters to insert in BST: 5
Enter characters: D B A E C

Postorder Traversal of BST: A C B E D
✅ BST Logic Recap:
Left Subtree: values < current node

Right Subtree: values > current node

Postorder Traversal: Left → Right → Root*/
