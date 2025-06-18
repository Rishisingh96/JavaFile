package com.interviewQuestion_DSA_Java.DSAPracticalSage.Stack;

import java.util.Scanner;

public class InfixToPostfixConversion {

    // Stack implementation using array
    static class Stack {
        char[] stack;
        int top;

        Stack(int size) {
            stack = new char[size];
            top = -1;
        }

        boolean isEmpty() {
            return top == -1;
        }

        void push(char c) {
            stack[++top] = c;
        }

        char pop() {
            if (!isEmpty())
                return stack[top--];
            return '\0'; // Return null character if empty
        }

        char peek() {
            if (!isEmpty())
                return stack[top];
            return '\0';
        }
    }

    // Method to define precedence of operators
    static int precedence(char op) {
        switch (op) {
            case '^': return 3;
            case '*':
            case '/': return 2;
            case '+':
            case '-': return 1;
            default: return -1;
        }
    }

    // Method to check if character is operand
    static boolean isOperand(char c) {
        return Character.isLetterOrDigit(c);
    }

    // Main method to convert infix to postfix
    static String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack stack = new Stack(infix.length());

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            if (isOperand(c)) {
                postfix.append(c); // Append operand to output
            } else if (c == '(') {
                stack.push(c); // Push opening bracket
            } else if (c == ')') {
                // Pop till '(' is found
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop(); // Remove '('
            } else {
                // Operator: pop higher or equal precedence
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
        }

        // Pop remaining operators
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter infix expression: ");
        String infix = sc.nextLine();

        String postfix = infixToPostfix(infix);
        System.out.println("Postfix expression: " + postfix);

        sc.close();
    }
}

/*✅ Sample Input/Output
mathematica
Copy code
Enter infix expression: A+B*C
Postfix expression: ABC*+
mathematica
Copy code
Enter infix expression: (A+B)*(C-D)
Postfix expression: AB+CD-*
Let me know if you want:

🔄 Postfix to Infix

✅ Evaluation of Postfix Expression

📄 PDF or notes of all Java programs

➕ Next C program on DEQueue (Array/DLL)*/