package com.interviewQuestion_DSA_Java.Array_3.Medium;

public class ProductOfArrayExceptSelf {

    // -------------------- BRUTE FORCE --------------------
    // Time: O(n^2), Space: O(1)
    public int[] productExceptSelfBrute(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    ans[i] *= nums[j];
                }
            }
        }
        return ans;
    }

    // -------------------- OPTIMAL 1 --------------------
    // Time: O(n), Space: O(n)
    public int[] productESOptimal1(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        prefix[0] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        suffix[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < n; i++) {
            ans[i] = prefix[i] * suffix[i];
        }

        return ans;
    }

    // -------------------- OPTIMAL 2 (BEST) --------------------
    // Time: O(n), Space: O(1) [excluding output array]
    public int[] productESOptimal2(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        // Prefix product stored directly in ans[]
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        // Suffix product using single variable
        int suffix = 1;
        for (int i = n - 2; i >= 0; i--) {
            suffix *= nums[i + 1];
            ans[i] *= suffix;
        }

        return ans;
    }

    // -------------------- MAIN --------------------
    public static void main(String[] args) {

        ProductOfArrayExceptSelf obj = new ProductOfArrayExceptSelf();

        int[] nums = {1, 2, 3, 4};

//        int[] ans = obj.productExceptSelfBrute(nums);
//        int[] ans = obj.productESOptimal1(nums);
        int[] ans = obj.productESOptimal2(nums);

        for (int x : ans) {
            System.out.print(x + " ");
        }
        // Output: 24 12 8 6
    }
}
/*🏆 Interview Line (yaad rakhna)

“I solved Product of Array Except Self using prefix and suffix products in O(n) time and optimized space by reusing the output array.”*/


/*exam + interview dono ke liye perfect.

Input hum same rakhenge 👇

nums = {1, 2, 3, 4}
n = 4

🔴 1️⃣ BRUTE FORCE – Dry Run (O(n²))
Code logic

Har index i ke liye:

ans[i] = product of all nums[j] where j != i

Initial
ans = [0, 0, 0, 0]

i = 0
ans[0] = 1
j=0 → skip
j=1 → ans[0] = 1 * 2 = 2
j=2 → ans[0] = 2 * 3 = 6
j=3 → ans[0] = 6 * 4 = 24

ans = [24, 0, 0, 0]

i = 1
ans[1] = 1
j=0 → ans[1] = 1 * 1 = 1
j=1 → skip
j=2 → ans[1] = 1 * 3 = 3
j=3 → ans[1] = 3 * 4 = 12

ans = [24, 12, 0, 0]

i = 2
ans[2] = 1
j=0 → 1 * 1 = 1
j=1 → 1 * 2 = 2
j=2 → skip
j=3 → 2 * 4 = 8

ans = [24, 12, 8, 0]

i = 3
ans[3] = 1
j=0 → 1
j=1 → 2
j=2 → 6
j=3 → skip

ans = [24, 12, 8, 6]


✅ Final Output

24 12 8 6


⛔ Problem: O(n²) → slow for large input

🟡 2️⃣ OPTIMAL-1 (Prefix + Suffix Arrays) – Dry Run
Step-1: Prefix Array

Rule:

prefix[i] = product of elements before i

prefix[0] = 1

i	calculation	prefix
1	1 * nums[0]=1	[1,1,,]
2	1 * nums[1]=2	[1,1,2,_]
3	2 * nums[2]=6	[1,1,2,6]
Step-2: Suffix Array

Rule:

suffix[i] = product of elements after i

suffix[3] = 1

i	calculation	suffix
2	1 * nums[3]=4	[,,4,1]
1	4 * nums[2]=12	[_,12,4,1]
0	12 * nums[1]=24	[24,12,4,1]
Step-3: ans[i] = prefix[i] * suffix[i]
i	prefix	suffix	ans
0	1	24	24
1	1	12	12
2	2	4	8
3	6	1	6

✅ Final Output

24 12 8 6


✔ Time: O(n)
❌ Space: O(n) (extra arrays)

🟢 3️⃣ OPTIMAL-2 (BEST – O(1) Space) – Deep Dry Run
Idea

Prefix directly ans[] me store

Suffix ke liye single variable

Step-1: Prefix in ans[]
ans[0] = 1

i	calculation	ans
1	1 * nums[0]=1	[1,1,0,0]
2	1 * nums[1]=2	[1,1,2,0]
3	2 * nums[2]=6	[1,1,2,6]
Step-2: Suffix multiplication
suffix = 1

i	suffix update	ans[i]
2	1 * nums[3]=4	2 * 4 = 8
1	4 * nums[2]=12	1 * 12 = 12
0	12 * nums[1]=24	1 * 24 = 24
Final ans[]
[24, 12, 8, 6]


✅ Final Output

24 12 8 6

🏆 Final Comparison (Interview Ready)
Approach	Time	Space
Brute Force	O(n²)	O(1)
Optimal-1	O(n)	O(n)
Optimal-2 ⭐	O(n)	O(1)
💬 Interview One-Liner

“I optimized the Product of Array Except Self problem by storing prefix products in the output array and calculating suffix products using a single variable, achieving O(n) time and O(1) extra space.”

Agar bole array me zero ho to?
next message me uska special dry run + logic bhi kara deta hoon 🔥*/