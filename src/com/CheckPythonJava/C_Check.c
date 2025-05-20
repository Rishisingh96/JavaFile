#include <stdio.h>
#include <time.h>

int main() {
    // Record the start time
    clock_t start = clock();

    // Variable to store the sum
    long long sum = 0;

    // Loop to calculate the sum from 1 to 100,000,000
    for (long long i = 1; i <= 100000000; i++) {
        sum += i;
    }

    // Print the sum
    printf("Sum: %lld\n", sum);

    // Record the end time
    clock_t end = clock();

    // Calculate the time taken in milliseconds
    double time_taken = ((double)(end - start)) / CLOCKS_PER_SEC * 1000;

    // Print the execution time
    printf("Execution Time in Milliseconds: %.2f ms\n", time_taken);

    return 0;
}
