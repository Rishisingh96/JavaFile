package com.interviewQuestion_DSA_Java.Greedy_Algorithms_20;

import java.util.ArrayList;

public class ActivitySelectionAlg {
    public static void main(String[] args) {
        // Start and End times of activities
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        // Variable to store the maximum number of activities
        int maxActivities = 0;

        // ArrayList to store the selected activity indices
        ArrayList<Integer> ans = new ArrayList<>();

        // Selecting the 1st activity by default (as the list is sorted by end time)
        maxActivities = 1;
        ans.add(0); // Adding the first activity
        int lastEnd = end[0]; // End time of the first activity

        // Loop through the remaining activities
        for (int i = 1; i < end.length; i++) {
            // Check if the start time of the current activity is >= the end time of the last selected activity
            if (start[i] >= lastEnd) {
                // Activity selected
                maxActivities++;
                ans.add(i);
                lastEnd = end[i]; // Update lastEnd to the current activity's end time
            }
        }

        // Print the maximum number of selected activities
        System.out.println("Max Activities: " + maxActivities);

        // Print the selected activities
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " "); // A0 A1 A3 A4
        }
        System.out.println();
    }
}
/*
✅ Activity Selection Algorithm — Deep Dry Run Analysis
📚 Problem Statement:
You are given n activities with their start and end times. You need to select the maximum number of activities that can be performed by a single person, assuming that a person can only work on a single activity at a time.

📊 Input:
Start times:

wasm
Copy
Edit
start[] = {1, 3, 0, 5, 8, 5}
End times:

arduino
Copy
Edit
end[] = {2, 4, 6, 7, 9, 9}
📚 Goal:
Select the maximum number of non-overlapping activities.

Print the maximum count and the indices of selected activities.

🔥 Step-by-Step Deep Dry Run
💡 Step 1: Initialization
java
Copy
Edit
int start[] = {1, 3, 0, 5, 8, 5};
int end[] = {2, 4, 6, 7, 9, 9};
We are given 6 activities with their respective start and end times.

💡 Step 2: Variable Declaration
java
Copy
Edit
int maxActivities = 0;
ArrayList<Integer> ans = new ArrayList<>();
maxActivities = 0 → Initially, no activity is selected.

ans → An empty list to store the indices of the selected activities.

💡 Step 3: Select the First Activity by Default
java
Copy
Edit
maxActivities = 1;
ans.add(0);
int lastEnd = end[0]; // lastEnd = 2
✅ The first activity (Activity 0) is selected by default.

maxActivities = 1 → Since Activity 0 is selected.

ans.add(0) → Add the index of Activity 0 to the list.

lastEnd = end[0] = 2 → Set lastEnd to the end time of the first activity.

🔁 Step 4: Start Iterating from the 2nd Activity
🎯 Loop: for (int i = 1; i < end.length; i++)
➡️ Iteration 1: i = 1
Activity 1:

start[1] = 3

end[1] = 4

java
Copy
Edit
if (start[1] >= lastEnd)  // 3 >= 2 -> true
✅ Condition is true. Activity 1 can be selected.

maxActivities++ → 2

ans.add(1) → Add Activity 1 to the list.

lastEnd = end[1] = 4 → Update lastEnd to 4.

✅ Selected Activities so far:
ans = [0, 1]

➡️ Iteration 2: i = 2
Activity 2:

start[2] = 0

end[2] = 6

java
Copy
Edit
if (start[2] >= lastEnd)  // 0 >= 4 -> false
❌ Condition is false. Activity 2 cannot be selected.

Skip this activity.

✅ Selected Activities remain the same:
ans = [0, 1]

➡️ Iteration 3: i = 3
Activity 3:

start[3] = 5

end[3] = 7

java
Copy
Edit
if (start[3] >= lastEnd)  // 5 >= 4 -> true
✅ Condition is true. Activity 3 can be selected.

maxActivities++ → 3

ans.add(3) → Add Activity 3 to the list.

lastEnd = end[3] = 7 → Update lastEnd to 7.

✅ Selected Activities so far:
ans = [0, 1, 3]

➡️ Iteration 4: i = 4
Activity 4:

start[4] = 8

end[4] = 9

java
Copy
Edit
if (start[4] >= lastEnd)  // 8 >= 7 -> true
✅ Condition is true. Activity 4 can be selected.

maxActivities++ → 4

ans.add(4) → Add Activity 4 to the list.

lastEnd = end[4] = 9 → Update lastEnd to 9.

✅ Selected Activities so far:
ans = [0, 1, 3, 4]

➡️ Iteration 5: i = 5
Activity 5:

start[5] = 5

end[5] = 9

java
Copy
Edit
if (start[5] >= lastEnd)  // 5 >= 9 -> false
❌ Condition is false. Activity 5 cannot be selected.

Skip this activity.

✅ Selected Activities remain the same:
ans = [0, 1, 3, 4]

💡 Step 5: Print the Results
java
Copy
Edit
System.out.println("Max Activities: " + maxActivities);
✅ Output:

yaml
Copy
Edit
Max Activities: 4
java
Copy
Edit
for (int i = 0; i < ans.size(); i++) {
    System.out.print("A" + ans.get(i) + " ");
}
✅ Output:

nginx
Copy
Edit
A0 A1 A3 A4
📈 Final Output:
yaml
Copy
Edit
Max Activities: 4
A0 A1 A3 A4
📝 Summary of Selected Activities:
Activity 0: (1, 2)

Activity 1: (3, 4)

Activity 3: (5, 7)

Activity 4: (8, 9)

🧠 Time Complexity Analysis:
Time Complexity:

Since the end times are already sorted, we are iterating through the list once, making the time complexity:

scss
Copy
Edit
O(n)
where n is the number of activities.

💾 Space Complexity Analysis:
Space Complexity:

Space required to store selected activity indices in ans:

scss
Copy
Edit
O(n)
✅ Your algorithm works perfectly and efficiently selects the maximum number of non-overlapping activities. Let me know if you want to modify the algorithm or explore variations like sorting by end time dynamically! 😎*/