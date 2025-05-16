package com.interviewQuestion_DSA_Java.Heap_18;

public class HeapSortAlgo {

    // Heapify function to maintain the max heap property
    public static void heapify(int arr[], int i, int size) {
        int left = 2 * i + 1;  // left child index
        int right = 2 * i + 2; // right child index
        int maxIndex = i;

        // If left child is larger than root
        if (left < size && arr[left] > arr[maxIndex]) {
            maxIndex = left;
        }

        // If right child is larger than the largest so far
        if (right < size && arr[right] > arr[maxIndex]) {
            maxIndex = right;
        }

        // If largest is not root
        if (maxIndex != i) {
            // Swap
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;

            // Recursively heapify the affected sub-tree
            heapify(arr, maxIndex, size);
        }
    }

    // Main function to perform heap sort
    public static void heapSort(int arr[]) {
        int n = arr.length;

        // Step 1: Build a max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, i, n);
        }

        // Step 2: Extract elements from heap one by one
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call heapify on the reduced heap
            heapify(arr, 0, i);
        }
    }

    // Utility function to print the array
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Main driver code
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 3};
        System.out.println("Original Array:");
        printArray(arr);

        heapSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
/*Great, Rishi! Let’s dry run the Heap Sort deeply, step by step, with tree diagrams, visual explanation, and array state at each stage.

🧠 Input Array
java
Copy
Edit
int arr[] = {1, 2, 4, 5, 3};
🧱 Phase 1: Build Max Heap
➤ Step 1.1: Visualize as a Binary Tree (Before heapify)
We represent the array as a binary tree:

makefile
Copy
Edit
Index:   0   1   2   3   4
Array:   1   2   4   5   3

          1
        /   \
       2     4
      / \
     5   3
We start heapifying from the last non-leaf node: n/2 - 1 = 1.

🔁 Step 1.2: Heapify at index 1 (value = 2)
markdown
Copy
Edit
        2
       / \
      5   3
Left child (5) > 2 → swap 2 and 5

➡️ After swap:

markdown
Copy
Edit
        5
       / \
      2   3
Array: {1, 5, 4, 2, 3}

Go down recursively to index 3 → no children → stop.

🔁 Step 1.3: Heapify at index 0 (value = 1)
Now we work on this subtree:

markdown
Copy
Edit
          1
        /   \
       5     4
      / \
     2   3
Left child (5) > 1 → swap(1, 5)

➡️ After swap:

markdown
Copy
Edit
          5
        /   \
       1     4
      / \
     2   3
Now heapify index 1 (value = 1):

markdown
Copy
Edit
        1
       / \
      2   3
Right child (3) > 1 → swap(1, 3)

➡️ After swap:

markdown
Copy
Edit
        3
       / \
      2   1
Final max heap:

markdown
Copy
Edit
          5
        /   \
       3     4
      / \
     2   1
Array: {5, 3, 4, 2, 1}

✅ Phase 2: Heap Sort (Extract max and heapify reduced heap)
🧩 Step 2.1: Swap root with last element
Swap 5 (root) with 1 (last)
→ {1, 3, 4, 2, 5}

Now heapify index 0 in size = 4:

markdown
Copy
Edit
        1
       / \
      3   4
     /
    2
Right child (4) > 1 → swap(1, 4)

markdown
Copy
Edit
        4
       / \
      3   1
     /
    2
Array: {4, 3, 1, 2, 5}

🧩 Step 2.2: Swap root with 2nd last
Swap 4 with 2
→ {2, 3, 1, 4, 5}

Heapify index 0, size = 3

markdown
Copy
Edit
        2
       / \
      3   1
Left child (3) > 2 → swap(2, 3)

markdown
Copy
Edit
        3
       / \
      2   1
Array: {3, 2, 1, 4, 5}

🧩 Step 2.3: Swap root with 3rd last
Swap 3 with 1
→ {1, 2, 3, 4, 5}

Heapify index 0, size = 2

markdown
Copy
Edit
      1
     /
    2
Left child (2) > 1 → swap(1, 2)

markdown
Copy
Edit
      2
     /
    1
Array: {2, 1, 3, 4, 5}

🧩 Step 2.4: Swap root with index 1
Swap 2 with 1 → {1, 2, 3, 4, 5}

No heapify needed for size = 1.

✅ Final Sorted Array
java
Copy
Edit
{1, 2, 3, 4, 5}
🔚 Summary
Each step involved:

Maintaining a max-heap structure.

Extracting the maximum element (root) to the end.

Rebuilding the heap from the reduced portion.

Would you like me to create visual heap diagrams as images for each step? This can make your understanding even more solid.*/