package com.Collection.QuestionInterview;

import java.util.HashMap;
/*❓Correct Interview Question:
Q. Given an integer array arr[] and an integer k, write a program to count the total number of subarrays whose sum equals to k.

Example:
Input: arr = {10, 2, -2, -20, 10}, k = -10
Output: 2

*/
/*💡 Used Concepts:
Prefix Sum

HashMap to store frequencies of prefix sums

Subarray sum property:
If sum[j] - sum[i-1] = k ⇒ sum[i-1] = sum[j] - k*/
public class SubArraySumEqualTo_K {  //O(n)
    public static void main(String[] args) {
        int arr[] = {10,2,-2,-20,10};
        int k = -10;

        HashMap<Integer , Integer> map = new HashMap<>();
        // (sum, count)

        int sum = 0;
        int ans = 0;

        for(int j=0; j<arr.length; j++){
            sum += arr[j]; //sum(j)

            if(map.containsKey(sum - k)){
                ans += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        System.out.println(ans);
    }
}
/*✅ Code Summary (क्या कर रहा है ये कोड?)
Given:
An array of integers arr[] and an integer k
Task:
Find the number of subarrays whose sum is equal to k

📝 Dry Run:
Input:
java
Copy
Edit
arr = {10, 2, -2, -20, 10}
k = -10
Variables:
sum = 0

ans = 0

map = {} // HashMap<sum, frequency>

🔄 Loop Iteration:
➤ j = 0, arr[j] = 10
sum = 0 + 10 = 10

Check map.containsKey(10 - (-10)) → map.containsKey(20) → ❌ No

Update map: {10: 1}

ans = 0

➤ j = 1, arr[j] = 2
sum = 10 + 2 = 12

Check map.containsKey(12 - (-10)) → map.containsKey(22) → ❌ No

Update map: {10:1, 12:1}

ans = 0

➤ j = 2, arr[j] = -2
sum = 12 + (-2) = 10

Check map.containsKey(10 - (-10)) → map.containsKey(20) → ❌ No

Update map: {10:2, 12:1}

ans = 0

➤ j = 3, arr[j] = -20
sum = 10 + (-20) = -10

Check map.containsKey(-10 - (-10)) → map.containsKey(0) → ❌ No

Update map: {10:2, 12:1, -10:1}

ans = 0

➤ j = 4, arr[j] = 10
sum = -10 + 10 = 0

Check map.containsKey(0 - (-10)) → map.containsKey(10) → ✅ Yes
→ map.get(10) = 2
→ ans += 2 → ans = 2

Update map: {10:2, 12:1, -10:1, 0:1}

✅ Final Output:
Copy
Edit
2
🔍 Output Explanation:
Total 2 subarrays have sum = -10

Let's find them manually:

arr[0..3] = 10+2+(-2)+(-20) = -10

arr[1..4] = 2+(-2)+(-20)+10 = -10

✅ Matching the output 2

*/