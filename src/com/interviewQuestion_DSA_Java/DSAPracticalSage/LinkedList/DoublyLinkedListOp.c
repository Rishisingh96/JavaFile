#include <stdio.h>
#include <stdlib.h>
/*Sure Rishi! Here's a complete and well-commented program in C to implement a Doubly Linked List with the following operations:

  ✅ a) Create a doubly linked list of integers
  ✅ b) Delete a given integer from the list
  ✅ c) Display the list after deletion
  */
// Define node structure for doubly linked list
struct Node {
    int data;
    struct Node* prev;
    struct Node* next;
};

// Head pointer for the list
struct Node* head = NULL;

// Function to create a new node
struct Node* createNode(int data) {
    struct Node* newNode = (struct Node*) malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->prev = NULL;
    newNode->next = NULL;
    return newNode;
}

// Function to insert node at the end
void insertAtEnd(int data) {
    struct Node* newNode = createNode(data);
    if (head == NULL) {
        head = newNode;
        return;
    }

    struct Node* temp = head;
    while (temp->next != NULL)
        temp = temp->next;

    temp->next = newNode;
    newNode->prev = temp;
}

// Function to delete a node with given value
void deleteNode(int key) {
    struct Node* temp = head;

    // Search for node with given key
    while (temp != NULL && temp->data != key)
        temp = temp->next;

    // If key not found
    if (temp == NULL) {
        printf("Element %d not found in the list.\n", key);
        return;
    }

    // If node to be deleted is head
    if (temp == head)
        head = temp->next;

    // Change next of previous node, if exists
    if (temp->prev != NULL)
        temp->prev->next = temp->next;

    // Change prev of next node, if exists
    if (temp->next != NULL)
        temp->next->prev = temp->prev;

    free(temp); // Free memory
    printf("Deleted element: %d\n", key);
}

// Function to display the list
void displayList() {
    struct Node* temp = head;

    printf("Doubly Linked List: ");
    if (temp == NULL) {
        printf("List is empty.\n");
        return;
    }

    while (temp != NULL) {
        printf("%d ", temp->data);
        temp = temp->next;
    }
    printf("\n");
}

// Main function
int main() {
    int n, value, delValue;

    printf("Enter number of elements to insert: ");
    scanf("%d", &n);

    printf("Enter %d elements:\n", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &value);
        insertAtEnd(value);
    }

    displayList();

    printf("Enter value to delete: ");
    scanf("%d", &delValue);

    deleteNode(delValue);
    displayList();

    return 0;
}

/*Enter number of elements to insert: 5
  Enter 5 elements:
  10 20 30 40 50
  Doubly Linked List: 10 20 30 40 50
  Enter value to delete: 30
  Deleted element: 30
  Doubly Linked List: 10 20 40 50
*/