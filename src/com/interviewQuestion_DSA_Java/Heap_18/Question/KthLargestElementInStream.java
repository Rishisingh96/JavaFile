package com.interviewQuestion_DSA_Java.Heap_18.Question;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class KthLargestElementInStream {
    // Kth largest element in a stream
    // We are given a stream of numbers and we have to find the kth largest element in the stream.
    // We can use a min heap of size k to keep track of the kth largest element.
    // If the size of the heap is less than k, we add the element to the heap.
    // If the size of the heap is equal to k, we check if the new element is greater than the root of the heap.
    // If it is, we remove the root and add the new element to the heap.
    // The root of the heap will be the kth largest element in the stream.

    public static List<String> findKthLargest(int[] stream, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        List<String> result = new ArrayList<>();

        for (int num : stream) {
            if (minHeap.size() < k) {
                minHeap.offer(num);
                result.add("_");
            } else {
                if (num > minHeap.peek()) {
                    minHeap.poll();       // remove smallest
                    minHeap.offer(num);   // insert new larger number
                }
                result.add(String.valueOf(minHeap.peek()));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] stream = {10, 20, 11, 70, 50, 40, 100, 5};
        int k = 3;

        List<String> output = findKthLargest(stream, k);
        System.out.println("Output: " + output);
    }

}
/*Let's go through a step-by-step dry run of the program KthLargestInStream, including the min-heap tree diagram at each step, for:

Input stream: {10, 20, 11, 70, 50, 40, 100, 5}

k = 3 → We want to track the 3rd largest element in the stream so far.

We use a min-heap of size k to keep the top k largest elements seen so far. The smallest among them is the k-th largest.

🔧 Initialization
java
Copy
Edit
PriorityQueue<Integer> minHeap = new PriorityQueue<>();
List<String> result = new ArrayList<>();
minHeap = []

result = []

📘 Step-by-step Dry Run with Tree Diagrams
Step 1: num = 10
minHeap.size() < k → add to heap

result.add("_")

Min Heap:

Copy
Edit
 10
Result: ["_"]

Step 2: num = 20
minHeap.size() < k → add to heap

result.add("_")

Min Heap:

Copy
Edit
 10
   \
   20
(Internally, heap maintains order using binary heap structure.)

Result: ["_", "_"]

Step 3: num = 11
minHeap.size() < k → add to heap

result.add("_")

Min Heap (after internal reordering):

Copy
Edit
 10
 /  \
11  20
Result: ["_", "_", "_"]

Step 4: num = 70
num > minHeap.peek() → remove 10, insert 70

minHeap.poll() → 10

minHeap.offer(70)

result.add(String.valueOf(minHeap.peek()))

Min Heap (after reordering):

Copy
Edit
11
 /  \
70  20
(Heap property reorders to keep smallest at root.)

Result: ["_", "_", "_", "11"]

Step 5: num = 50
num > minHeap.peek() → 50 > 11

poll 11, offer 50

Min Heap:

Copy
Edit
20
 /  \
70  50
Result: ["_", "_", "_", "11", "20"]

Step 6: num = 40
num > minHeap.peek() → 40 > 20

poll 20, offer 40

Min Heap:

Copy
Edit
40
 /  \
70  50
(40 is smallest of top 3 largest values)

Result: ["_", "_", "_", "11", "20", "40"]

Step 7: num = 100
num > minHeap.peek() → 100 > 40

poll 40, offer 100

Min Heap:

Copy
Edit
50
 /  \
70  100
Result: ["_", "_", "_", "11", "20", "40", "50"]

Step 8: num = 5
num < minHeap.peek() → no change

result.add("50")

Min Heap (unchanged):

Copy
Edit
50
 /  \
70  100
Result: ["_", "_", "_", "11", "20", "40", "50", "50"]

✅ Final Output:
java
Copy
Edit
Output: ["_", "_", "_", "11", "20", "40", "50", "50"]
📊 Summary Table
Step	Num	Heap After Operation (Min-Heap)	Kth Largest	Result
1	10	[10]	_	_
2	20	[10, 20]	_	_
3	11	[10, 20, 11]	_	_
4	70	[11, 20, 70]	11	11
5	50	[20, 70, 50]	20	20
6	40	[40, 70, 50]	40	40
7	100	[50, 70, 100]	50	50
8	5	[50, 70, 100]	50	50

Would you like me to generate a diagram image of the heap tree transitions step-by-step for visual clarity?








o*/