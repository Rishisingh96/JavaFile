#include <iostream>
#include <chrono>

using namespace std;
using namespace std::chrono;

int main() {
    // Record the start time using high_resolution_clock
    auto start = high_resolution_clock::now();

    // Variable to store the sum
    long long sum = 0;

    // Loop to calculate the sum from 1 to 100,000,000
    for (long long i = 1; i <= 100000000; i++) {
        sum += i;
    }

    // Print the sum
    cout << "Sum: " << sum << endl;

    // Record the end time
    auto end = high_resolution_clock::now();

    // Calculate duration in milliseconds
    auto duration = duration_cast<milliseconds>(end - start);

    // Print the execution time
    cout << "Execution Time in Milliseconds: " << duration.count() << " ms" << endl;

    return 0;
}
