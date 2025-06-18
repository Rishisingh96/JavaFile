#include <stdio.h>
#include <stdlib.h>
/*✅ Question 1.1 — Singly Linked List Operations
  Write a C program that uses functions to perform the following:

  a) Create a singly linked list of integers.

  b) Delete a given integer from the above linked list.

  c) Display the contents of the above list after deletion.

  🔸👉 Complete C Program
  */
// Node structure
struct Node {
    int data;
    struct Node* next;
};

// Function to create a new node
struct Node* createNode(int value) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = value;
    newNode->next = NULL;
    return newNode;
}

// Function to insert node at end
struct Node* insertEnd(struct Node* head, int value) {
    struct Node* newNode = createNode(value);
    if (head == NULL) {
        return newNode;
    }
    struct Node* temp = head;
    while (temp->next != NULL)
        temp = temp->next;
    temp->next = newNode;
    return head;
}

// Function to delete a node by value
struct Node* deleteNode(struct Node* head, int value) {
    if (head == NULL) {
        printf("List is empty.\n");
        return NULL;
    }

    struct Node* temp = head;
    struct Node* prev = NULL;

    // If head needs to be deleted
    if (temp != NULL && temp->data == value) {
        head = temp->next;
        free(temp);
        return head;
    }

    // Search for the node
    while (temp != NULL && temp->data != value) {
        prev = temp;
        temp = temp->next;
    }

    // If value not found
    if (temp == NULL) {
        printf("Value %d not found in the list.\n", value);
        return head;
    }

    prev->next = temp->next;
    free(temp);
    return head;
}

// Function to display the list
void displayList(struct Node* head) {
    if (head == NULL) {
        printf("List is empty.\n");
        return;
    }
    struct Node* temp = head;
    printf("Linked List: ");
    while (temp != NULL) {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");
}

// Main function
int main() {
    struct Node* head = NULL;
    int n, value, delValue;

    printf("Enter number of elements to insert: ");
    scanf("%d", &n);

    for (int i = 0; i < n; i++) {
        printf("Enter value %d: ", i + 1);
        scanf("%d", &value);
        head = insertEnd(head, value);
    }

    printf("\nBefore Deletion:\n");
    displayList(head);

    printf("\nEnter value to delete: ");
    scanf("%d", &delValue);
    head = deleteNode(head, delValue);

    printf("\nAfter Deletion:\n");
    displayList(head);

    return 0;
}

/* Sample Input / Output:
  yaml
  Copy
  Edit
  Enter number of elements to insert: 5
  Enter value 1: 10
  Enter value 2: 20
  Enter value 3: 30
  Enter value 4: 40
  Enter value 5: 50

  Before Deletion:
  Linked List: 10 -> 20 -> 30 -> 40 -> 50 ->

  Enter value to delete: 30

  After Deletion:
  Linked List: 10 -> 20 -> 40 -> 50 ->
*/