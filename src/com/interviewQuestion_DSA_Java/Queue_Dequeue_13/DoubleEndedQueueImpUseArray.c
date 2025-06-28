#include <stdio.h>
#include <stdlib.h>
#define MAX 10
int deque[MAX];
int front = -1, rear = -1;

// Check if deque is full
int isFull() {
    return ((front == 0 && rear == MAX - 1) || (front == rear + 1));
}

// Check if deque is empty
int isEmpty() {
    return (front == -1);
}

// Insert at front
void insertFront(int value) {
    if (isFull()) {
        printf("Deque is full! Cannot insert.\n");
        return;
    }

    if (isEmpty()) {
        front = rear = 0;
    } else if (front == 0) {
        front = MAX - 1;
    } else {
        front--;
    }
    deque[front] = value;
    printf("Inserted %d at front.\n", value);
}

// Insert at rear
void insertRear(int value) {
    if (isFull()) {
        printf("Deque is full! Cannot insert.\n");
        return;
    }

    if (isEmpty()) {
        front = rear = 0;
    } else if (rear == MAX - 1) {
        rear = 0;
    } else {
        rear++;
    }
    deque[rear] = value;
    printf("Inserted %d at rear.\n", value);
}

// Delete from front
void deleteFront() {
    if (isEmpty()) {
        printf("Deque is empty! Cannot delete.\n");
        return;
    }

    printf("Deleted %d from front.\n", deque[front]);
    if (front == rear) {
        front = rear = -1;
    } else if (front == MAX - 1) {
        front = 0;
    } else {
        front++;
    }
}

// Delete from rear
void deleteRear() {
    if (isEmpty()) {
        printf("Deque is empty! Cannot delete.\n");
        return;
    }

    printf("Deleted %d from rear.\n", deque[rear]);
    if (front == rear) {
        front = rear = -1;
    } else if (rear == 0) {
        rear = MAX - 1;
    } else {
        rear--;
    }
}

// Display deque
void displayDeque() {
    if (isEmpty()) {
        printf("Deque is empty.\n");
        return;
    }

    printf("Deque elements: ");
    int i = front;
    while (1) {
        printf("%d ", deque[i]);
        if (i == rear)
            break;
        i = (i + 1) % MAX;
    }
    printf("\n");
}

// Main menu
int main() {
    int choice, value;
    do {
        printf("\n--- DEQUE MENU ---\n");
        printf("1. Insert at Front\n2. Insert at Rear\n3. Delete from Front\n4. Delete from Rear\n5. Display\n0. Exit\n");
        printf("Enter choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter value to insert at front: ");
                scanf("%d", &value);
                insertFront(value);
                break;
            case 2:
                printf("Enter value to insert at rear: ");
                scanf("%d", &value);
                insertRear(value);
                break;
            case 3:
                deleteFront();
                break;
            case 4:
                deleteRear();
                break;
            case 5:
                displayDeque();
                break;
            case 0:
                printf("Exiting program.\n");
                break;
            default:
                printf("Invalid choice!\n");
        }
    } while (choice != 0);
    return 0;
}
/*Sample Output:
  --- DEQUE MENU ---
  1. Insert at Front
  2. Insert at Rear
  3. Delete from Front
  4. Delete from Rear
  5. Display
  0. Exit
  Enter choice: 2
  Enter value to insert at rear: 10
  Inserted 10 at rear.

  Enter choice: 1
  Enter value to insert at front: 5
  Inserted 5 at front.

  Enter choice: 5
  Deque elements: 5 10

  Enter choice: 4
  Deleted 10 from rear.

  Enter choice: 5
  Deque elements: 5
*/