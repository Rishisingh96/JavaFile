package com.interviewQuestion_DSA_Java.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queues {
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        // Check if both queues are empty, meaning the stack is empty
        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        // Push the data into the non-empty queue (q1 or q2)
        public static void push(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        // Pop the element from the stack
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            int top = -1;

            // Case 1: If q1 is not empty, move elements from q1 to q2 except the last one
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if (q1.isEmpty()) {
                        break;
                    }
                    q2.add(top);  // Move the elements to q2
                }
            } else {
                // Case 2: If q2 is not empty, move elements from q2 to q1 except the last one
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (q2.isEmpty()) {
                        break;
                    }
                    q1.add(top);  // Move the elements to q1
                }
            }
            return top;  // Return the popped element
        }

        // Peek the element from the top of the stack
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            int top = -1;

            // Case 1: If q1 is not empty, move elements to q2 while getting the last one
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);  // Transfer to q2
                }
            } else {
                // Case 2: If q2 is not empty, move elements to q1 while getting the last one
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);  // Transfer to q1
                }
            }
            return top;  // Return the top element
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());  // Print the top element
            s.pop();  // Pop the top element
        }
    }
}
/*Let's go through a step-by-step dry run of your StackUsing2Queues program. We will push three elements (1, 2, 3) onto the stack and then pop them while printing the top element before each pop.

Initial Setup
We have two queues:

q1: initially empty.

q2: initially empty.

Step 1: Push 1
Method Call: s.push(1)

Since q1 is empty, we add 1 to q2.

Queues after operation:

q1: []

q2: [1]

Step 2: Push 2
Method Call: s.push(2)

Since q1 is still empty, we add 2 to q2.

Queues after operation:

q1: []

q2: [1, 2]

Step 3: Push 3
Method Call: s.push(3)

Since q1 is still empty, we add 3 to q2.

Queues after operation:

q1: []

q2: [1, 2, 3]

Step 4: Peek (Print Top Element)
Method Call: s.peek()

Since q1 is empty, we remove elements from q2 and move them to q1 to get the top element.

Remove 1 from q2 and add it to q1: q1: [1], q2: [2, 3]

Remove 2 from q2 and add it to q1: q1: [1, 2], q2: [3]

Remove 3 from q2 (this is the last element, which is the top): q1: [1, 2], q2: []

Return value: 3

Queues after peek:

q1: [1, 2, 3]

q2: []

Output: 3

Step 5: Pop (Remove Top Element)
Method Call: s.pop()

Since q1 is not empty, we remove elements from q1 and move them to q2 to remove the last element (the top element).

Remove 1 from q1 and add it to q2: q1: [2, 3], q2: [1]

Remove 2 from q1 and add it to q2: q1: [3], q2: [1, 2]

Remove 3 from q1 (this is the last element, which is popped): q1: [], q2: [1, 2]

Return value: 3

Queues after pop:

q1: []

q2: [1, 2]

Step 6: Peek (Print Top Element)
Method Call: s.peek()

Since q1 is empty, we remove elements from q2 and move them to q1 to get the top element.

Remove 1 from q2 and add it to q1: q1: [1], q2: [2]

Remove 2 from q2 (this is the last element, which is the top): q1: [1], q2: []

Return value: 2

Queues after peek:

q1: [1, 2]

q2: []

Output: 2

Step 7: Pop (Remove Top Element)
Method Call: s.pop()

Since q1 is not empty, we remove elements from q1 and move them to q2 to remove the last element (the top element).

Remove 1 from q1 and add it to q2: q1: [2], q2: [1]

Remove 2 from q1 (this is the last element, which is popped): q1: [], q2: [1]

Return value: 2

Queues after pop:

q1: []

q2: [1]

Step 8: Peek (Print Top Element)
Method Call: s.peek()

Since q1 is empty, we remove elements from q2 and move them to q1 to get the top element.

Remove 1 from q2 (this is the last element, which is the top): q1: [], q2: []

Return value: 1

Queues after peek:

q1: [1]

q2: []

Output: 1

Step 9: Pop (Remove Top Element)
Method Call: s.pop()

Since q1 is not empty, we remove the last element (the top element).

Remove 1 from q1: q1: [], q2: []

Return value: 1

Queues after pop:

q1: []

q2: []

Step 10: End of Loop
At this point, both q1 and q2 are empty, and the loop terminates as the condition !s.isEmpty() is no longer true.

Final Output
Copy
Edit
3
2
1
This dry run shows that the program correctly simulates a stack using two queues, following the Last In, First Out (LIFO) principle.
*/