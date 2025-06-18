#include <stdio.h>
#include <stdlib.h>
/*✅ Stack Using Array in C
  ✔️ Operations Implemented:
  push() – Insert element

  pop() – Remove top element

  peek() – View top element

  isEmpty() – Check if stack is empty

  isFull() – Check if stack is full

  display() – Display all elements*/
#define MAX 100

int stack[MAX];
int top = -1;

// Function to check if stack is full
int isFull() {
    return top == MAX - 1;
}

// Function to check if stack is empty
int isEmpty() {
    return top == -1;
}

// Push operation
void push(int value) {
    if (isFull()) {
        printf("Stack Overflow! Cannot push %d\n", value);
    } else {
        stack[++top] = value;
        printf("%d pushed to stack\n", value);
    }
}

// Pop operation
void pop() {
    if (isEmpty()) {
        printf("Stack Underflow! Cannot pop\n");
    } else {
        printf("Popped element: %d\n", stack[top--]);
    }
}

// Peek operation
void peek() {
    if (isEmpty()) {
        printf("Stack is empty\n");
    } else {
        printf("Top element: %d\n", stack[top]);
    }
}

// Display stack contents
void display() {
    if (isEmpty()) {
        printf("Stack is empty\n");
    } else {
        printf("Stack elements:\n");
        for (int i = top; i >= 0; i--) {
            printf("%d\n", stack[i]);
        }
    }
}

// Main function
int main() {
    int choice, value;

    while (1) {
        printf("\n--- Stack Menu ---\n");
        printf("1. Push\n2. Pop\n3. Peek\n4. Display\n5. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
        case 1:
            printf("Enter value to push: ");
            scanf("%d", &value);
            push(value);
            break;
        case 2:
            pop();
            break;
        case 3:
            peek();
            break;
        case 4:
            display();
            break;
        case 5:
            printf("Exiting program...\n");
            exit(0);
        default:
            printf("Invalid choice. Try again.\n");
        }
    }

    return 0;
}

/*--- Stack Menu ---
  1. Push
  2. Pop
  3. Peek
  4. Display
  5. Exit
  Enter your choice: 1
  Enter value to push: 10
  10 pushed to stack

  Enter your choice: 1
  Enter value to push: 20
  20 pushed to stack

  Enter your choice: 4
  Stack elements:
  20
  10
*/