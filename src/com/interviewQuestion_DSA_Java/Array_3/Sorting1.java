class Sorting1 {

    // Selection Sort Algorithm
    public static void selectionSort(int[] arr) {
        // Loop through the entire array, one element at a time
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i; // Assume the current element is the minimum

            // Find the smallest element in the unsorted part of the array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) { // If current element is smaller than assumed minimum
                    min = j; // Update the index of the smallest element
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    // Bubble Sort Algorithm
    public static void bubbleSort(int[] arr) {
        // Outer loop to pass over the entire array multiple times
        for (int i = 0; i < arr.length - 1; i++) {
            // Inner loop to compare adjacent elements and push the largest to the end
            for (int j = 0; j < arr.length - i - 1; j++) { // The -i ensures we don't check the last sorted elements
                if (arr[j] > arr[j + 1]) { // If the current element is greater than the next
                    // Swap the two elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Insertion Sort Algorithm
    public static void insertionSort(int[] arr) {
        // Loop over the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i]; // The current element to be inserted into the sorted part
            int j = i - 1;

            // Shift elements in the sorted part to the right to make space for the key
            while (j >= 0 && arr[j] > key) { // Compare key with elements to its left
                arr[j + 1] = arr[j]; // Move the element to the right
                j--;
            }

            // Insert the key at the correct position
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        // Initialize an array of integers
        int[] arr = {18, 4, 23, 10, 55, 2}; // Array before sorting

        // Print the array before sorting
        System.out.print("Before Sorting: ");
        for (int arrprint : arr) {
            System.out.print(arrprint + " ");
        }
        System.out.println(); // Line break

        // Uncomment one of the following lines to apply a specific sorting algorithm
        // selectionSort(arr); // Selection Sort
        // bubbleSort(arr);    // Bubble Sort
        insertionSort(arr);   // Insertion Sort

        // Print the array after sorting
        System.out.print("After Sorting: ");
        for (int arrprint : arr) {
            System.out.print(arrprint + " ");
        }
    }
}

/*Explanation of Changes:
Selection Sort:
Commented on the purpose of each loop and the process of finding the smallest element and swapping.
Bubble Sort:
Detailed comments explain the comparison and swapping of adjacent elements to "bubble" the largest element to the end.
Insertion Sort:
Commented on how the current element (key) is inserted into the correct position by shifting elements to the right.*/