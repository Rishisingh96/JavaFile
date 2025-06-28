#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>   // For isalnum()
#include <string.h>  // For strlen()

#define MAX 100      // Maximum size of stack and expression

// Stack implemented using array
char stack[MAX];
int top = -1;

// 👉 Function to push character onto stack
void push(char c) {
    if (top == MAX - 1) {
        printf("Stack Overflow\n");
        return;
    }
    stack[++top] = c;
}

// 👉 Function to pop character from stack
char pop() {
    if (top == -1) {
        return '\0'; // Stack Underflow
    }
    return stack[top--];
}

// 👉 Function to get top character of stack
char peek() {
    if (top == -1) {
        return '\0';
    }
    return stack[top];
}

// 👉 Function to return precedence of operators
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

// 👉 Function to check if character is an operator
int isOperator(char c) {
    return (c == '+' || c == '-' || c == '*' || c == '/' || c == '^');
}

// 👉 Function to convert infix to postfix
void infixToPostfix(char* infix, char* postfix) {
    int i, j = 0;
    char c;

    for (i = 0; i < strlen(infix); i++) {
        c = infix[i];

        // ✅ If operand (A, B, 1, 2), directly add to output
        if (isalnum(c)) {
            postfix[j++] = c;
        }
        // ✅ If opening parenthesis, push to stack
        else if (c == '(') {
            push(c);
        }
        // ✅ If closing parenthesis, pop till '(' is found
        else if (c == ')') {
            while (peek() != '(' && top != -1) {
                postfix[j++] = pop();
            }
            pop(); // Remove '(' from stack
        }
        // ✅ If operator
        else if (isOperator(c)) {
            // Pop while precedence is higher or same (except for ^ which is right-associative)
            while (top != -1 && (
                    (precedence(peek()) > precedence(c)) ||
                    (precedence(peek()) == precedence(c) && c != '^')
                )) {
                postfix[j++] = pop();
            }
            push(c); // Push current operator
        }
    }

    // ✅ Pop all remaining operators
    while (top != -1) {
        postfix[j++] = pop();
    }

    postfix[j] = '\0'; // End postfix string
}

// 👉 Main function
int main() {
    char infix[MAX], postfix[MAX];

    printf("Enter an infix expression (e.g., A+B*C): ");
    scanf("%s", infix);  // Use fgets if input contains spaces

    infixToPostfix(infix, postfix);

    printf("Postfix expression: %s\n", postfix);

    return 0;
}
/*Enter an infix expression (e.g., A+B*C): A+B*C
  Postfix expression: ABC*+
*/