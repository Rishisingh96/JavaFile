package com.interviewQuestion_DSA_Java.Linked_List_10;

import com.interviewQuestion_DSA_Java.Linked_List_10.FindAndRemoveNthNode.Node;
import static com.interviewQuestion_DSA_Java.Linked_List_10.FindAndRemoveNthNode.head;

public class LoopCycle {

    // Method to check if a cycle exists in the linked list
    public static boolean isCycle() {
        Node slow = head;  // Slow pointer starts at head
        Node fast = head;  // Fast pointer starts at head

        // Traverse the list with two pointers
        while (fast != null && fast.next != null) {
            slow = slow.next;         // Slow pointer moves one step
            fast = fast.next.next;    // Fast pointer moves two steps

            if (slow == fast) {
                // If slow and fast pointers meet, cycle exists
                return true;
            }
        }

        // If fast pointer reaches null, no cycle exists
        return false;
    }

    // Method to remove a cycle from the linked list if it exists
    public static void removeCycle() {
        Node slow = head;  // Slow pointer starts at head
        Node fast = head;  // Fast pointer starts at head
        boolean cycle = false;  // Flag to track if a cycle exists

        // First step: Detect cycle using two pointers
        while (fast != null && fast.next != null) {
            slow = slow.next;         // Slow pointer moves one step
            fast = fast.next.next;    // Fast pointer moves two steps

            if (fast == slow) {
                // If slow and fast pointers meet, cycle exists
                cycle = true;
                break;  // Break the loop after detecting cycle
            }
        }

        // If no cycle is detected, return early
        if (!cycle) {
            return;
        }

        // Second step: Find the meeting point where the cycle starts
        slow = head;  // Reset slow pointer to head
        Node prev = null;  // To keep track of the previous node (needed to break the cycle)

        // Move both slow and fast pointers one step at a time
        // The meeting point will be the start of the cycle
        while (slow != fast) {
            prev = fast;      // Keep track of the previous node
            slow = slow.next; // Move slow pointer one step
            fast = fast.next; // Move fast pointer one step
        }

        // Third step: Break the cycle
        // Set the next of the last node (pointed by prev) to null, removing the cycle
        prev.next = null;
    }

    public static void main(String[] args) {
        // Example 1: No cycle case (commented out)
        /*
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;  // Creates a cycle: 1 -> 2 -> 3 -> 1 (cycle)
        System.out.println(isCycle());  // Output: true
        */

        // Example 2: Cycle case
        head = new Node(1);  // Create head node
        Node temp = new Node(2);  // Create a temporary node 2
        head.next = temp;  // Link head to node 2
        head.next.next = new Node(3);  // Link node 2 to node 3
        head.next.next.next = temp;  // Create cycle: node 3 points back to node 2

        // The list is: 1 -> 2 -> 3 -> 2 (cycle starts again at node 2)
        System.out.println(isCycle());  // Output: true (cycle exists)

        // Removing the cycle
        removeCycle();

        // After removing the cycle, check again
        System.out.println(isCycle());  // Output: false (cycle removed)
    }
}
/*Dry run Seprate seprate function isCycle , removeCycle
ChatGPT said:
ChatGPT
Let's do a separate dry run for each function, starting with isCycle() and then moving on to removeCycle().

Dry Run of isCycle():
Initial state:

head = Node(1)
head.next = Node(2)
head.next.next = Node(3)
head.next.next.next = Node(2) (cycle created: 1 → 2 → 3 → 2)
Execution of isCycle() function:

Initialization:

slow = head (Node 1)
fast = head (Node 1)
1st iteration:

Move slow to slow.next → slow = Node(2)
Move fast to fast.next.next → fast = Node(3)
slow != fast → continue to the next iteration.
2nd iteration:

Move slow to slow.next → slow = Node(3)
Move fast to fast.next.next → fast = Node(2) (cycle brings fast back to Node 2)
slow != fast → continue to the next iteration.
3rd iteration:

Move slow to slow.next → slow = Node(2) (cycle brings slow back to Node 2)
Move fast to fast.next.next → fast = Node(2)
Now, slow == fast → cycle is detected, return true.
Output of isCycle(): true (cycle exists).

Dry Run of removeCycle():
Initial state:

The linked list has a cycle: 1 → 2 → 3 → 2
Execution of removeCycle() function:

Initialization:

slow = head (Node 1)
fast = head (Node 1)
cycle = false (flag to indicate cycle existence)
Cycle detection (same process as isCycle()):

1st iteration:
slow = Node(2), fast = Node(3)
slow != fast → continue.
2nd iteration:
slow = Node(3), fast = Node(2)
slow != fast → continue.
3rd iteration:
slow = Node(2), fast = Node(2)
slow == fast → cycle detected, set cycle = true, break the loop.
Cycle detected, reset slow:

Reset slow to head (Node 1)
fast remains at Node 2 (meeting point)
prev = null (to keep track of the previous node)
Find the meeting point (start of the cycle):

1st iteration:
Move slow = Node(2)
Move fast = Node(2)
Now, slow == fast at Node 2 → this is the start of the cycle.
Break the cycle:

prev = Node(3) (the node before fast)
Set prev.next = null → breaks the cycle by pointing Node 3’s next to null.
The linked list after removing the cycle:

1 → 2 → 3 → null (cycle removed).
Dry Run of isCycle() again after removing the cycle:
Initialization:

slow = head (Node 1)
fast = head (Node 1)
1st iteration:

Move slow to slow.next → slow = Node(2)
Move fast to fast.next.next → fast = Node(3)
slow != fast → continue.
2nd iteration:

Move slow to slow.next → slow = Node(3)
Move fast to fast.next.next → fast = null
Fast pointer reaches null, indicating the end of the list, and no cycle is found.
Output of isCycle() after removing the cycle: false (cycle removed successfully).

Summary:
First isCycle() call: true (cycle detected).
After calling removeCycle(), second isCycle() call: false (cycle successfully removed).*/