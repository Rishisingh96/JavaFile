#include <stdio.h>
#include <stdlib.h>

// Node structure
struct Node {
    int data;
    struct Node* prev;
    struct Node* next;
};

struct Node* front = NULL;
struct Node* rear = NULL;

// Insert at front
void insertFront(int value) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = value;
    newNode->prev = NULL;
    newNode->next = front;

    if (front == NULL) {
        front = rear = newNode;
    } else {
        front->prev = newNode;
        front = newNode;
    }
}

// Insert at rear
void insertRear(int value) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = value;
    newNode->next = NULL;
    newNode->prev = rear;

    if (rear == NULL) {
        front = rear = newNode;
    } else {
        rear->next = newNode;
        rear = newNode;
    }
}

// Delete from front
void deleteFront() {
    if (front == NULL) {
        printf("Deque is empty!\n");
        return;
    }

    struct Node* temp = front;
    printf("Deleted from front: %d\n", temp->data);
    front = front->next;

    if (front != NULL)
        front->prev = NULL;
    else
        rear = NULL;

    free(temp);
}

// Delete from rear
void deleteRear() {
    if (rear == NULL) {
        printf("Deque is empty!\n");
        return;
    }

    struct Node* temp = rear;
    printf("Deleted from rear: %d\n", temp->data);
    rear = rear->prev;

    if (rear != NULL)
        rear->next = NULL;
    else
        front = NULL;

    free(temp);
}

// Display deque
void display() {
    struct Node* temp = front;
    if (!temp) {
        printf("Deque is empty!\n");
        return;
    }

    printf("Deque: ");
    while (temp != NULL) {
        printf("%d ", temp->data);
        temp = temp->next;
    }
    printf("\n");
}

int main() {
    insertFront(10);
    insertRear(20);
    insertFront(5);
    insertRear(25);
    display();

    deleteFront();
    deleteRear();
    display();

    return 0;
}


/*
    output
  Deque: 5 10 20 25
  Deleted from front: 5
  Deleted from rear: 25
  Deque: 10 20
*/