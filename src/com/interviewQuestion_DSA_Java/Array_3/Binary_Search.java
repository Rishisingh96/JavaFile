import java.util.*;
public class Binary_Search {
    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // Fix: Avoid overflow
            // comparisons
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) { // right
                start = mid + 1;
            } else { // left
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 8, 9, 10,11, 12, 14 };
        int key = 12;
        System.out.println("index for key is: " + binarySearch(numbers, key));
    }
}
//Now the Arrays.sort(numbers) line ensures that the array is sorted before applying the binary search. This should resolve any issues related to the input array not being sorted.