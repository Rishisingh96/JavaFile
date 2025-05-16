package com.interviewQuestion_DSA_Java.Heap_18;

import java.util.ArrayList;

public class HeapCurdOperation {

    // Inner class to define the structure and behavior of the Min-Heap
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        // Adds a new element to the heap and maintains the min-heap property
        public void add(int data) {
            // Step 1: Add the element at the end
            arr.add(data);
            int childIndex = arr.size() - 1; // New element's index
            int parentIndex = (childIndex - 1) / 2;

            // Step 2: Up-heapify (bubble up) to restore min-heap
            while (childIndex > 0 && arr.get(childIndex) < arr.get(parentIndex)) {
                // Swap child and parent
                int temp = arr.get(childIndex);
                arr.set(childIndex, arr.get(parentIndex));
                arr.set(parentIndex, temp);

                // Move up the tree
                childIndex = parentIndex;
                parentIndex = (childIndex - 1) / 2;
            }
        }

        // Returns the minimum element (at the root) without removing it
        public int peek() {
            return arr.get(0);
        }

        // Removes and returns the minimum element, and maintains heap structure
        public int remove() {
            if (arr.isEmpty()) return -1;

            int data = arr.get(0); // Minimum element (root)

            // Step 1: Swap root with the last element
            int lastIndex = arr.size() - 1;
            arr.set(0, arr.get(lastIndex));
            arr.remove(lastIndex); // Remove the last element

            // Step 2: Down-heapify to restore min-heap
            heapify(0);

            return data;
        }

        // Heapify-down method (used after removal)
        private void heapify(int index) {
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            int smallest = index;

            // Compare with left child
            if (left < arr.size() && arr.get(left) < arr.get(smallest)) {
                smallest = left;
            }

            // Compare with right child
            if (right < arr.size() && arr.get(right) < arr.get(smallest)) {
                smallest = right;
            }

            // If the current index is not the smallest, swap and continue heapifying
            if (smallest != index) {
                int temp = arr.get(index);
                arr.set(index, arr.get(smallest));
                arr.set(smallest, temp);

                heapify(smallest); // Recursive call
            }
        }

        // Returns true if the heap is empty
        public boolean isEmpty() {
            return arr.isEmpty();
        }

        // Prints the current state of the heap
        public void printHeap() {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    // Main method to demonstrate usage of heap operations
    public static void main(String[] args) {
        Heap h = new Heap();

        // Inserting elements into the heap
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        // Print the current heap
        System.out.print("Heap after insertions: ");
        h.printHeap();

        // Peek the minimum element
        System.out.println("Top element (peek): " + h.peek());

        // Remove elements one by one
        System.out.println("Removing elements:");
        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }
    }
}
/*Absolutely Rishi! Let’s do a deep dry run of your Min-Heap implementation step-by-step — along with a tree representation at each stage of insertion.

🧠 Min-Heap Concept Recap
A Min-Heap is a complete binary tree where the parent is always smaller than its children. It’s usually implemented as an array, where:

Left child index: 2*i + 1

Right child index: 2*i + 2

Parent index: (i - 1) / 2

🔢 Insertion Order:
You insert elements in the following order:

java
Copy
Edit
h.add(3);
h.add(4);
h.add(1);
h.add(5);
Let’s dry run them one by one 👇

✅ Step 1: Add 3
Heap array: [3]

Tree:

Copy
Edit
  3
No parent to compare with — it's the first element.

✅ Step 2: Add 4
Heap array: [3, 4]

Parent of 4 is 3 (index 0), and 4 > 3, so no swap needed.

Tree:

markdown
Copy
Edit
    3
   /
  4
✅ Step 3: Add 1
Heap array (before bubble-up): [3, 4, 1]

Index of 1 = 2, parent index = (2-1)/2 = 0, value at index 0 = 3

1 < 3 → swap 1 and 3

Heap array (after bubble-up): [1, 4, 3]

Tree:

markdown
Copy
Edit
    1
   / \
  4   3
✅ Step 4: Add 5
Heap array (before bubble-up): [1, 4, 3, 5]

Index of 5 = 3, parent index = (3-1)/2 = 1, value at 1 = 4

5 > 4 → no swap

Tree:

markdown
Copy
Edit
      1
     / \
    4   3
   /
  5
🔍 peek():
Returns 1 — the root of the heap.

🧹 Removing All Elements Step-by-Step
Now let's see what happens during each removal.

🔴 1st Remove: 1
Before:

markdown
Copy
Edit
      1
     / \
    4   3
   /
  5
Swap 1 with last (5) → [5, 4, 3]
Then call heapify(0):

5 has children: 4 (index 1), 3 (index 2)

3 is smallest → swap 5 and 3

After: [3, 4, 5]

Tree:

markdown
Copy
Edit
    3
   / \
  4   5
Removed: 1

🔴 2nd Remove: 3
Before:

markdown
Copy
Edit
    3
   / \
  4   5
Swap 3 with last (5) → [5, 4]
Call heapify(0):

5 has child 4 (index 1)

4 < 5 → swap

After: [4, 5]

Tree:

markdown
Copy
Edit
    4
   /
  5
Removed: 3

🔴 3rd Remove: 4
Swap with 5, then remove → [5]
Only one element left, no heapify needed.

Tree:

Copy
Edit
5
Removed: 4

🔴 4th Remove: 5
Only one element → just remove.

Heap becomes empty

Removed: 5

🖨️ ✅ Final Output Recap:
plaintext
Copy
Edit
Heap after insertions: 1 4 3 5
Top element (peek): 1
Removing elements:
1
3
4
5
Would you like a visual diagram image of the heap tree at each stage? I can generate that too for better understanding.








*/