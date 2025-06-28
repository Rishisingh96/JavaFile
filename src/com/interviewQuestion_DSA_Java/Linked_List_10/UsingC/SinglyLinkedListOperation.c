#include <stdio.h>
#include <stdlib.h>

// Node structure
struct Node {
    int data;
    struct Node* next;
};

// Create new node
struct Node* createNode(int value) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = value;
    newNode->next = NULL;
    return newNode;
}

// Insert at beginning
struct Node* insertAtBeginning(struct Node* head, int value) {
    struct Node* newNode = createNode(value);
    newNode->next = head;
    return newNode;
}

// Insert at end
struct Node* insertAtEnd(struct Node* head, int value) {
    struct Node* newNode = createNode(value);
    if (head == NULL)
        return newNode;

    struct Node* temp = head;
    while (temp->next != NULL)
        temp = temp->next;

    temp->next = newNode;
    return head;
}

// Insert at specific position (1-based)
struct Node* insertAtPosition(struct Node* head, int value, int pos) {
    if (pos <= 0) {
        printf("Invalid position.\n");
        return head;
    }

    if (pos == 1)
        return insertAtBeginning(head, value);

    struct Node* temp = head;
    for (int i = 1; i < pos - 1 && temp != NULL; i++)
        temp = temp->next;

    if (temp == NULL) {
        printf("Position out of range.\n");
        return head;
    }

    struct Node* newNode = createNode(value);
    newNode->next = temp->next;
    temp->next = newNode;
    return head;
}

// Delete a node by value
struct Node* deleteNode(struct Node* head, int value) {
    if (head == NULL) {
        printf("List is empty.\n");
        return NULL;
    }

    struct Node* temp = head;
    struct Node* prev = NULL;

    // If head is to be deleted
    if (temp->data == value) {
        head = head->next;
        free(temp);
        return head;
    }

    while (temp != NULL && temp->data != value) {
        prev = temp;
        temp = temp->next;
    }

    if (temp == NULL) {
        printf("Value %d not found.\n", value);
        return head;
    }

    prev->next = temp->next;
    free(temp);
    return head;
}

// Count number of nodes
int countNodes(struct Node* head) {
    int count = 0;
    while (head != NULL) {
        count++;
        head = head->next;
    }
    return count;
}

// Search for a value
int search(struct Node* head, int key) {
    int pos = 1;
    while (head != NULL) {
        if (head->data == key)
            return pos;
        head = head->next;
        pos++;
    }
    return -1;
}

// Reverse the list
struct Node* reverse(struct Node* head) {
    struct Node* prev = NULL;
    struct Node* current = head;
    struct Node* next = NULL;

    while (current != NULL) {
        next = current->next;
        current->next = prev;
        prev = current;
        current = next;
    }

    return prev;
}

// Display the list
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
    int n, value, delVal, searchVal;

    printf("Enter number of elements to insert at end: ");
    scanf("%d", &n);

    for (int i = 0; i < n; i++) {
        printf("Enter value %d: ", i + 1);
        scanf("%d", &value);
        head = insertAtEnd(head, value);
    }

    printf("\nInitial List:\n");
    displayList(head);

    // Insert at beginning
    head = insertAtBeginning(head, 99);
    printf("\nAfter inserting 99 at beginning:\n");
    displayList(head);

    // Insert at position
    head = insertAtPosition(head, 77, 3);
    printf("\nAfter inserting 77 at position 3:\n");
    displayList(head);

    // Delete a value
    printf("\nEnter value to delete: ");
    scanf("%d", &delVal);
    head = deleteNode(head, delVal);
    printf("\nAfter deletion:\n");
    displayList(head);

    // Search
    printf("\nEnter value to search: ");
    scanf("%d", &searchVal);
    int foundAt = search(head, searchVal);
    if (foundAt != -1)
        printf("Value %d found at position %d.\n", searchVal, foundAt);
    else
        printf("Value %d not found in the list.\n", searchVal);

    // Count nodes
    printf("\nTotal nodes in list: %d\n", countNodes(head));

    // Reverse list
    head = reverse(head);
    printf("\nList after reversing:\n");
    displayList(head);

    return 0;
}

/*
Enter number of elements to insert at end: 3
Enter value 1: 10
Enter value 2: 20
Enter value 3: 30

Initial List:
Linked List: 10 -> 20 -> 30 -> NULL

After inserting 99 at beginning:
Linked List: 99 -> 10 -> 20 -> 30 -> NULL

After inserting 77 at position 3:
Linked List: 99 -> 10 -> 77 -> 20 -> 30 -> NULL

Enter value to delete: 77
After deletion:
Linked List: 99 -> 10 -> 20 -> 30 -> NULL

Enter value to search: 30
Value 30 found at position 4.

Total nodes in list: 4

List after reversing:
Linked List: 30 -> 20 -> 10 -> 99 -> NULL
*/