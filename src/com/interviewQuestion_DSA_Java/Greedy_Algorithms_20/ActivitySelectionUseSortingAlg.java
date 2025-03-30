package com.interviewQuestion_DSA_Java.Greedy_Algorithms_20;

import java.util.ArrayList;
import java.util.Arrays;

public class ActivitySelectionUseSortingAlg {
    public static void main(String[] args) {
        // Start and End times of activities
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        // ✅ Step 1: Create a 2D array to store (index, start, end) of activities
        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;        // Store index of activity
            activities[i][1] = start[i]; // Store start time
            activities[i][2] = end[i];   // Store end time
        }

        // ✅ Step 2: Sort activities based on their end times using lambda expression
        Arrays.sort(activities, (a, b) -> Integer.compare(a[2], b[2]));
        // Equivalent to: Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        // ✅ Step 3: Select the first activity by default after sorting
        int maxActivities = 1;          // Initial selection of 1 activity
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(activities[0][0]);      // Add the first activity's index
        int lastEnd = activities[0][2]; // End time of the first selected activity

        // ✅ Step 4: Iterate through the remaining activities
        for (int i = 1; i < end.length; i++) {
            // Check if the start time of the current activity is >= last selected activity's end time
            if (activities[i][1] >= lastEnd) {
                // ✅ Activity can be selected
                maxActivities++;
                ans.add(activities[i][0]); // Add the selected activity's index
                lastEnd = activities[i][2]; // Update lastEnd to the end time of the current activity
            }
        }

        // ✅ Step 5: Print the maximum number of selected activities
        System.out.println("Max Activities: " + maxActivities);

        // ✅ Step 6: Print the indices of the selected activities
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " "); // A0 A1 A3 A4
        }
        System.out.println();
    }
}
/*✅ Let’s do a Deep Dry Run of the code step by step to understand how the Activity Selection Problem works.

📚 Problem Statement:
Given the start and end times of different activities, select the maximum number of activities that can be performed by a single person, assuming that a person can only work on one activity at a time.

📝 Input:
java
Copy
Edit
int start[] = {1, 3, 0, 5, 8, 5};
int end[] = {2, 4, 6, 7, 9, 9};
🔥 Step 1: Create a 2D Array to Store Activity Info
We create a 2D array activities where:

activities[i][0] → Stores the index of the activity.

activities[i][1] → Stores the start time.

activities[i][2] → Stores the end time.

✅ Initializing the Array:
Index	Start	End
0	1	2
1	3	4
2	0	6
3	5	7
4	8	9
5	5	9
👉 Array after filling:
java
Copy
Edit
activities[0] = {0, 1, 2}
activities[1] = {1, 3, 4}
activities[2] = {2, 0, 6}
activities[3] = {3, 5, 7}
activities[4] = {4, 8, 9}
activities[5] = {5, 5, 9}
🔥 Step 2: Sort Activities Based on End Time
✅ Sorting Logic:
We sort activities by the end time to ensure that we always pick the activity that finishes the earliest. This allows us to maximize the number of activities.

The lambda function is:

java
Copy
Edit
Arrays.sort(activities, (a, b) -> Integer.compare(a[2], b[2]));
👉 Sorted Array:
Index	Start	End
0	1	2
1	3	4
3	5	7
4	8	9
5	5	9
2	0	6
🔥 Step 3: Select the First Activity by Default
We always select the first activity after sorting because it has the earliest end time.

✅ First Activity Selected:

java
Copy
Edit
maxActivities = 1;
ans.add(activities[0][0]);  // ans = [0]
lastEnd = activities[0][2]; // lastEnd = 2
🔥 Step 4: Iterate Through the Remaining Activities
We iterate through the sorted list of activities from index 1 to end.length - 1 to check if an activity can be selected.

✅ Check Conditions:
If activities[i][1] >= lastEnd, we select that activity.

🔁 Iteration 1: i = 1
start = 3 and end = 4

✅ Check: 3 >= 2 → True
👉 Select activity 1

java
Copy
Edit
maxActivities = 2;
ans.add(1);      // ans = [0, 1]
lastEnd = 4;     // Update lastEnd to 4
🔁 Iteration 2: i = 2
start = 5 and end = 7

✅ Check: 5 >= 4 → True
👉 Select activity 3

java
Copy
Edit
maxActivities = 3;
ans.add(3);      // ans = [0, 1, 3]
lastEnd = 7;     // Update lastEnd to 7
🔁 Iteration 3: i = 3
start = 8 and end = 9

✅ Check: 8 >= 7 → True
👉 Select activity 4

java
Copy
Edit
maxActivities = 4;
ans.add(4);      // ans = [0, 1, 3, 4]
lastEnd = 9;     // Update lastEnd to 9
🔁 Iteration 4: i = 4
start = 5 and end = 9

❌ Check: 5 >= 9 → False
❗ Activity 5 is skipped.

🔁 Iteration 5: i = 5
start = 0 and end = 6

❌ Check: 0 >= 9 → False
❗ Activity 2 is skipped.

🔥 Step 5: Print the Maximum Number of Activities
java
Copy
Edit
System.out.println("Max Activities: " + maxActivities);
// Output: Max Activities: 4
🔥 Step 6: Print the Selected Activities
Indices of the selected activities are stored in ans → [0, 1, 3, 4]

java
Copy
Edit
for (int i = 0; i < ans.size(); i++) {
    System.out.print("A" + ans.get(i) + " ");
}
// Output: A0 A1 A3 A4
🎯 Final Output:
yaml
Copy
Edit
Max Activities: 4
A0 A1 A3 A4
💡 Explanation of Output:
Selected Activities:

A0 → (1, 2)

A1 → (3, 4)

A3 → (5, 7)

A4 → (8, 9)

⏱️ Time Complexity Analysis:
Sorting Activities: O(n log n)

Selecting Activities: O(n)

✅ Overall Time Complexity:

O(n log n) + O(n) = O(n log n)
O(n log n) + O(n) = O(n log n)
💾 Space Complexity Analysis:
Space for storing activities: O(n)

Space for result list: O(n)

✅ Overall Space Complexity: O(n)

Let me know if you want to solve more DSA problems like this! 😊*/