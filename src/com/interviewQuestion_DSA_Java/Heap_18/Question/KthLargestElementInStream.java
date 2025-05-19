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
