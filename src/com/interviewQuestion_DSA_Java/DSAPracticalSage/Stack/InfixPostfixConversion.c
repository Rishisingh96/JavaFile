#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>   // for isalnum()
#include <string.h>  // for strlen()
/*✅ Question 2 — Infix to Postfix Conversion Using Stack (Array Implementation)
  Write a C program that:

  Converts a given infix expression into its postfix equivalent

  Uses stack operations implemented using array
  */
#define MAX 100

// Stack implementation using array
char stack[MAX];
int top = -1;

// Function to push an element to the stack
void push(char c) {
    if (top == MAX - 1) {
        printf("Stack Overflow\n");
        return;
    }
    stack[++top] = c;
}

// Function to pop an element from the stack
char pop() {
    if (top == -1) {
        return '\0'; // Stack Underflow
    }
    return stack[top--];
}

// Function to get the top of the stack
char peek() {
    if (top == -1)
        return '\0';
    return stack[top];
}

// Function to return precedence of operators
int precedence(char op) {
    if (op == '^')
        return 3;
    else if (op == '*' || op == '/')
        return 2;
    else if (op == '+' || op == '-')
        return 1;
    else
        return 0;
}

// Function to check if character is operator
int isOperator(char c) {
    return (c == '+' || c == '-' || c == '*' || c == '/' || c == '^');
}

// Function to convert infix to postfix
void infixToPostfix(char* infix, char* postfix) {
    int i, j = 0;
    char c;

    for (i = 0; i < strlen(infix); i++) {
        c = infix[i];

        if (isalnum(c)) {
            // Operand directly to output
            postfix[j++] = c;
        } else if (c == '(') {
            push(c);
        } else if (c == ')') {
            // Pop until '(' is found
            while (peek() != '(' && top != -1) {
                postfix[j++] = pop();
            }
            pop(); // Remove '('
        } else if (isOperator(c)) {
            // Pop while precedence is higher or same and not '('
            while (top != -1 && precedence(peek()) >= precedence(c)) {
                postfix[j++] = pop();
            }
            push(c);
        }
    }

    // Pop any remaining operators
    while (top != -1) {
        postfix[j++] = pop();
    }

    postfix[j] = '\0'; // End postfix string
}

int main() {
    char infix[MAX], postfix[MAX];

    printf("Enter an infix expression (e.g., A+B*C): ");
    scanf("%s", infix);

    infixToPostfix(infix, postfix);

    printf("Postfix expression: %s\n", postfix);

    return 0;
}
/*🔸 Sample Output:
  Copy code
  Enter an infix expression (e.g., A+B*C): A+B*C
  Postfix expression: ABC*+
  ✅ Supports:
  Operands like A, B, C, etc.

  Operators: +, -, *, /, ^

  Parentheses ( )

*/