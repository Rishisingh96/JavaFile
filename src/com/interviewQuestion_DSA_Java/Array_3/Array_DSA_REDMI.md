# Array DSA Interview Preparation - REDMI (Priority Wise)

## 📚 Table of Contents
- [EASY Category](#easy-category)
- [MEDIUM Category](#medium-category)
- [HARD Category](#hard-category)

---

# 🔥 EASY CATEGORY (Priority 1 - Must Know)

## 1. Two Sum Problem ⭐⭐⭐⭐⭐
**Priority:** HIGH | **LeetCode:** 1 | **GFG:** Must Do

### 📝 Problem Statement
Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to target.

### 💡 Solution


#### Approach 1: Brute Force (O(n²))
```java
public int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] + nums[j] == target) {
                return new int[] {i, j};
            }
        }
    }
    return new int[] {};
}
```

Bilkul bhai, is code ka dry run karte hain example ke saath.

### Input

```java
nums = [2, 7, 11, 15]
target = 9
```
#### Approach 1: Brute Force (O(n²))
### Code
```java
public int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] + nums[j] == target) {
                return new int[] {i, j};
            }
        }
    }
    return new int[] {};
}
```

---

## Iteration 1

### Outer Loop

```java
i = 0
nums[i] = 2
```

### Inner Loop

#### j = 1

```java
nums[j] = 7

nums[i] + nums[j]
= 2 + 7
= 9
```

Check:

```java
9 == target(9)
```

✅ True

So execute:

```java
return new int[]{0,1};
```

Function yahin terminate ho jayega.

---

## Output

```java
[0, 1]
```

Kyuki:

```java
nums[0] + nums[1]
= 2 + 7
= 9
```

---

## Thoda bada Dry Run

### Input

```java
nums = [3, 2, 4]
target = 6
```

### Step 1

```java
i = 0
nums[i] = 3
```

#### j = 1

```java
nums[j] = 2

3 + 2 = 5
```

❌ Not equal to 6

#### j = 2

```java
nums[j] = 4

3 + 4 = 7
```

❌ Not equal to 6

---

### Step 2

```java
i = 1
nums[i] = 2
```

#### j = 2

```java
nums[j] = 4

2 + 4 = 6
```

✅ Equal to target

Return:

```java
new int[]{1,2}
```

---

### Time Complexity

Outer loop:

```java
n
```

Inner loop:

```java
n
```

So:

```java
O(n²)
```

### Space Complexity

Sirf return array use ho raha hai.

```java
O(1)
```

Interview me agar poochhe "Can you optimize it?" to HashMap use karke isse **O(n)** time complexity me solve kar sakte ho.


#### Approach 2: HashMap (O(n)) - OPTIMAL
```java
public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement)) {
            return new int[] {map.get(complement), i};
        }
        map.put(nums[i], i);
    }
    return new int[] {};
}
```

### 🔄 Dry Run (HashMap Approach)
**Input:** nums = [2, 7, 11, 15], target = 9

| i | nums[i] | complement | map | Action |
|---|---------|------------|-----|--------|
| 0 | 2 | 7 | {} | 7 not found, add {2:0} |
| 1 | 7 | 2 | {2:0} | 2 found! return [0,1] |

**Output:** [0, 1]

### 📊 Time Complexity
- Brute Force: O(n²) - Two nested loops
- HashMap: O(n) - Single pass with O(1) lookup

### 💾 Space Complexity
- Brute Force: O(1)
- HashMap: O(n) - Storing elements in map

### 🎯 Use Cases
- Finding pairs in financial transactions
- Complement finding in data analysis
- Two-pointer technique foundation

---

## 2. Find Missing Number ⭐⭐⭐⭐⭐
**Priority:** HIGH | **LeetCode:** 268 | **GFG:** Must Do

### 📝 Problem Statement
Given an array containing n distinct numbers in the range [0, n], find the missing number.

### 💡 Solution

#### Approach 1: Sum Formula (O(n)) - BEST
```java
static int missingUsingSum(int[] arr, int n) {
    int expectedSum = n * (n + 1) / 2;
    int actualSum = 0;
    for (int num : arr)
        actualSum += num;
    return expectedSum - actualSum;
}
```

#### Approach 2: XOR Method (O(n)) - INTERVIEW FAVORITE
```java
static int missingUsingXOR(int[] arr, int n) {
    int xorAll = 0;
    for (int i = 1; i <= n; i++)
        xorAll ^= i;
    for (int num : arr)
        xorAll ^= num;
    return xorAll;
}
```

### 🔄 Dry Run (XOR Method)
**Input:** arr = [1, 2, 4, 5], n = 5

| Step | Operation | xorAll |
|------|-----------|--------|
| 1 | 1^2^3^4^5 | 1 |
| 2 | 1^1 | 0 |
| 3 | 0^2 | 2 |
| 4 | 2^4 | 6 |
| 5 | 6^5 | 3 |

**Output:** 3 (missing number)

### 📊 Time Complexity
- Sum Formula: O(n)
- XOR Method: O(n)

### 💾 Space Complexity
- Both: O(1)

### 🎯 Use Cases
- Data validation
- Sequence checking
- Error detection in data transmission

---

## 3. Check Duplicate Element ⭐⭐⭐⭐
**Priority:** HIGH | **LeetCode:** 217 | **GFG:** Important

### 📝 Problem Statement
Given an integer array, return true if any value appears at least twice.

### 💡 Solution

#### Approach 1: HashSet (O(n)) - BEST
```java
static boolean checkDuplicateUsingHashSet(int[] arr) {
    HashSet<Integer> set = new HashSet<>();
    for (int num : arr) {
        if (!set.add(num)) {
            return true; // duplicate found
        }
    }
    return false;
}
```

#### Approach 2: Sorting (O(n log n))
```java
static boolean checkDuplicateUsingSorting(int[] arr) {
    int[] copy = arr.clone();
    Arrays.sort(copy);
    for (int i = 1; i < copy.length; i++) {
        if (copy[i] == copy[i - 1]) {
            return true;
        }
    }
    return false;
}
```

### 🔄 Dry Run (HashSet Approach)
**Input:** arr = [6, 9, 23, 7, 9, 34]

| num | set | Action |
|-----|-----|--------|
| 6 | {6} | added |
| 9 | {6,9} | added |
| 23 | {6,9,23} | added |
| 7 | {6,9,23,7} | added |
| 9 | {6,9,23,7} | duplicate! return true |

**Output:** true

### 📊 Time Complexity
- HashSet: O(n)
- Sorting: O(n log n)

### 💾 Space Complexity
- HashSet: O(n)
- Sorting: O(1) or O(n) depending on sort

### 🎯 Use Cases
- Data validation
- Duplicate detection in databases
- ID uniqueness checking

---

## 4. Find Max/Min Element in Single Function ⭐⭐⭐
**Priority:** MEDIUM | **GFG:** Basic

### 📝 Problem Statement
Find both maximum and minimum elements in an array using a single function.

### 💡 Solution
```java
public static int[] findMaxMin(int[] arr){
    int max = arr[0];
    int min = arr[0];
    for(int i=0; i< arr.length; i++){
        if(arr[i]>max){
            max = arr[i];
        }
        if(arr[i]<min){
            min = arr[i];
        }
    }
    return new int[]{min,max};
}
```

### 🔄 Dry Run
**Input:** arr = [2, 37, 23, 44, 76, 24]

| i | arr[i] | max | min |
|---|--------|-----|-----|
| 0 | 2 | 2 | 2 |
| 1 | 37 | 37 | 2 |
| 2 | 23 | 37 | 2 |
| 3 | 44 | 44 | 2 |
| 4 | 76 | 76 | 2 |
| 5 | 24 | 76 | 2 |

**Output:** [2, 76]

### 📊 Time Complexity: O(n)
### 💾 Space Complexity: O(1)
### 🎯 Use Cases
- Range finding
- Data normalization
- Statistical analysis

---

## 5. Second Largest Element ⭐⭐⭐⭐
**Priority:** HIGH | **GFG:** Must Do | **LeetCode:** Various

### 📝 Problem Statement
Find the second largest distinct element in an array.

### 💡 Solution

#### Approach 1: Single Pass (O(n)) - BEST
```java
public int secondLargestSinglePass(int[] arr) {
    int largest = -1, second = -1;
    for (int x : arr) {
        if (x > largest) {
            second = largest;
            largest = x;
        } else if (x < largest && x > second) {
            second = x;
        }
    }
    return second;
}
```

#### Approach 2: Sorting (O(n log n))
```java
public int secondLargestSorting(int[] arr) {
    Arrays.sort(arr);
    int n = arr.length;
    for (int i = n - 2; i >= 0; i--) {
        if (arr[i] != arr[n - 1]) {
            return arr[i];
        }
    }
    return -1;
}
```

### 🔄 Dry Run (Single Pass)
**Input:** arr = [4, 7, 2, 7, 5, 6, 3, 8, 8, 1]

| x | largest | second | Action |
|---|---------|--------|--------|
| 4 | 4 | -1 | largest=4 |
| 7 | 7 | 4 | largest=7, second=4 |
| 2 | 7 | 4 | no change |
| 7 | 7 | 4 | no change (duplicate) |
| 5 | 7 | 5 | second=5 |
| 6 | 7 | 6 | second=6 |
| 3 | 7 | 6 | no change |
| 8 | 8 | 7 | largest=8, second=7 |
| 8 | 8 | 7 | no change (duplicate) |
| 1 | 8 | 7 | no change |

**Output:** 7

### 📊 Time Complexity
- Single Pass: O(n)
- Sorting: O(n log n)

### 💾 Space Complexity
- Single Pass: O(1)
- Sorting: O(1)

### 🎯 Use Cases
- Ranking systems
- Finding runners-up
- Top-N analysis

---

## 6. Third Largest Element ⭐⭐⭐
**Priority:** MEDIUM | **LeetCode:** 414

### 📝 Problem Statement
Find the third distinct maximum element in an array.

### 💡 Solution

#### Approach 1: Three Variables (O(n)) - BEST
```java
public static int thirdMax1(int[] nums) {
    Integer first = null, second = null, third = null;
    for (int x : nums) {
        if ((first != null && x == first) ||
            (second != null && x == second) ||
            (third != null && x == third)) {
            continue; // Skip duplicates
        }
        if (first == null || x > first) {
            third = second;
            second = first;
            first = x;
        } else if (second == null || x > second) {
            third = second;
            second = x;
        } else if (third == null || x > third) {
            third = x;
        }
    }
    return (third == null) ? first : third;
}
```

### 🔄 Dry Run
**Input:** arr = [1, 14, 2, 16, 10, 20]

| x | first | second | third | Action |
|---|-------|--------|-------|--------|
| 1 | 1 | null | null | first=1 |
| 14 | 14 | 1 | null | first=14, second=1 |
| 2 | 14 | 2 | 1 | second=2, third=1 |
| 16 | 16 | 14 | 2 | first=16, second=14, third=2 |
| 10 | 16 | 14 | 10 | third=10 |
| 20 | 20 | 16 | 14 | first=20, second=16, third=14 |

**Output:** 14

### 📊 Time Complexity: O(n)
### 💾 Space Complexity: O(1)
### 🎯 Use Cases
- Podium positions
- Top-3 rankings
- Award systems

---

## 7. Rotate Array by One ⭐⭐⭐
**Priority:** MEDIUM | **GFG:** Basic

### 📝 Problem Statement
Rotate the array to the right by one position.

### 💡 Solution
```java
static void rotateByOne(int[] arr) {
    if (arr == null || arr.length <= 1) return;
    int n = arr.length;
    int last = arr[n - 1];
    for (int i = n - 2; i >= 0; i--) {
        arr[i + 1] = arr[i];
    }
    arr[0] = last;
}
```

### 🔄 Dry Run
**Input:** arr = [2, 7, 4, 11, 5, 8]

| i | arr[i] | arr[i+1] | Array State |
|---|--------|----------|-------------|
| 4 | 5 | 5 | [2,7,4,11,5,5] |
| 3 | 11 | 11 | [2,7,4,11,11,5] |
| 2 | 4 | 4 | [2,7,4,4,11,5] |
| 1 | 7 | 7 | [2,7,7,4,11,5] |
| 0 | 2 | 2 | [2,2,7,4,11,5] |
| - | last=8 | arr[0]=8 | [8,2,7,4,11,5] |

**Output:** [8, 2, 7, 4, 11, 5]

### 📊 Time Complexity: O(n)
### 💾 Space Complexity: O(1)
### 🎯 Use Cases
- Circular buffers
- Data rotation
- Array manipulation

---

## 8. Check if Array is Sorted ⭐⭐
**Priority:** LOW | **GFG:** Basic

### 📝 Problem Statement
Check if an array is sorted in non-decreasing order.

### 💡 Solution
```java
static boolean isSorted(int arr[]){
    for(int i=1; i<arr.length; i++){
        if(arr[i] < arr[i-1]){
            return false;
        }
    }
    return true;
}
```

### 🔄 Dry Run
**Input:** arr = [1, 2, 4, 5, 3, 7, 8, 9]

| i | arr[i] | arr[i-1] | Condition | Result |
|---|--------|----------|-----------|--------|
| 1 | 2 | 1 | 2 >= 1 ✓ | continue |
| 2 | 4 | 2 | 4 >= 2 ✓ | continue |
| 3 | 5 | 4 | 5 >= 4 ✓ | continue |
| 4 | 3 | 5 | 3 < 5 ✗ | return false |

**Output:** false

### 📊 Time Complexity: O(n)
### 💾 Space Complexity: O(1)
### 🎯 Use Cases
- Data validation
- Pre-condition checking
- Sorting verification

---

## 9. Find Unique Number ⭐⭐⭐⭐
**Priority:** HIGH | **LeetCode:** 136 | **GFG:** Must Do

### 📝 Problem Statement
Find the element that appears exactly once in an array where all other elements appear twice.

### 💡 Solution

#### Approach 1: XOR (O(n)) - BEST
```java
public int singleNumber(int[] nums) {
    int result = 0;
    for (int i = 0; i < nums.length; i++) {
        result = result ^ nums[i];
    }
    return result;
}
```

#### Approach 2: HashMap (O(n))
```java
public int singleNumberHashMap(int[] nums) {
    Map<Integer, Integer> countMap = new HashMap<>();
    for (int num : nums) {
        countMap.put(num, countMap.getOrDefault(num, 0) + 1);
    }
    for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
        if (entry.getValue() == 1) {
            return entry.getKey();
        }
    }
    return -1;
}
```

### 🔄 Dry Run (XOR Approach)
**Input:** arr = [1, 2, 3, 4, 1, 2, 3]

| num | result | Operation |
|-----|--------|-----------|
| 1 | 1 | 0^1=1 |
| 2 | 3 | 1^2=3 |
| 3 | 0 | 3^3=0 |
| 4 | 4 | 0^4=4 |
| 1 | 5 | 4^1=5 |
| 2 | 7 | 5^2=7 |
| 3 | 4 | 7^3=4 |

**Output:** 4

**Why XOR works:** a ^ a = 0 and a ^ 0 = a. All pairs cancel out, leaving the unique element.

### 📊 Time Complexity
- XOR: O(n)
- HashMap: O(n)

### 💾 Space Complexity
- XOR: O(1)
- HashMap: O(n)

### 🎯 Use Cases
- Error detection
- Finding odd occurrences
- Data validation

---



# 🔥 MEDIUM CATEGORY (Priority 1 - Must Know)

## 1. Maximum Subarray (Kadane's Algorithm) ⭐⭐⭐⭐⭐
**Priority:** HIGH | **LeetCode:** 53 | **GFG:** Must Do

### 📝 Problem Statement
Find the contiguous subarray with the largest sum.

### 💡 Solution
```java
public int maxSubArray(int[] nums) {
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    
    for (int val : nums) {
        currSum += val;
        maxSum = Math.max(currSum, maxSum);
        if (currSum < 0) {
            currSum = 0;
        }
    }
    return maxSum;
}
```

### 🔄 Dry Run
**Input:** nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]

| val | currSum | maxSum | Action |
|-----|---------|--------|--------|
| -2 | -2 | -2 | maxSum=-2, currSum=0 |
| 1 | 1 | 1 | maxSum=1 |
| -3 | -2 | 1 | maxSum=1, currSum=0 |
| 4 | 4 | 4 | maxSum=4 |
| -1 | 3 | 4 | maxSum=4 |
| 2 | 5 | 5 | maxSum=5 |
| 1 | 6 | 6 | maxSum=6 |
| -5 | 1 | 6 | maxSum=6 |
| 4 | 5 | 6 | maxSum=6 |

**Output:** 6 (subarray [4, -1, 2, 1])

### 📊 Time Complexity: O(n)
### 💾 Space Complexity: O(1)
### 🎯 Use Cases
- Stock market analysis
- Maximum profit calculation
- Signal processing

---

## 2. Majority Element (Moore's Voting Algorithm) ⭐⭐⭐⭐⭐
**Priority:** HIGH | **LeetCode:** 169 | **GFG:** Must Do

### 📝 Problem Statement
Find the element that appears more than n/2 times.

### 💡 Solution

#### Approach 1: Moore's Voting (O(n)) - BEST
```java
static int majorityElement(int[] arr) {
    int n = arr.length;
    int ans = -1;
    int freq = 0;
    
    // Phase 1: Find candidate
    for (int num : arr) {
        if (freq == 0) {
            ans = num;
        }
        if (num == ans) {
            freq++;
        } else {
            freq--;
        }
    }
    
    // Phase 2: Verify
    freq = 0;
    for (int num : arr) {
        if (num == ans) {
            freq++;
        }
    }
    
    if (freq > n / 2) {
        return ans;
    }
    return -1;
}
```

### 🔄 Dry Run
**Input:** arr = [2, 2, 1, 1, 1, 2, 2]

| num | ans | freq | Action |
|-----|-----|------|--------|
| 2 | 2 | 1 | freq=0, ans=2, freq++ |
| 2 | 2 | 2 | num==ans, freq++ |
| 1 | 2 | 1 | num!=ans, freq-- |
| 1 | 2 | 0 | num!=ans, freq-- |
| 1 | 1 | 1 | freq=0, ans=1, freq++ |
| 2 | 1 | 0 | num!=ans, freq-- |
| 2 | 2 | 1 | freq=0, ans=2, freq++ |

**Verification:** 2 appears 3 times, n/2 = 3.5, 3 > 3.5? No. But wait, let me recount:
2 appears at indices 0, 1, 5, 6 = 4 times. 4 > 3.5 ✓

**Output:** 2

### 📊 Time Complexity: O(n)
### 💾 Space Complexity: O(1)
### 🎯 Use Cases
- Election systems
- Data analysis
- Finding dominant elements

---

## 3. Product of Array Except Self ⭐⭐⭐⭐⭐
**Priority:** HIGH | **LeetCode:** 238 | **GFG:** Must Do

### 📝 Problem Statement
Return an array where each element is the product of all elements except itself.

### 💡 Solution

#### Approach 1: Prefix & Suffix (O(n)) - BEST
```java
public int[] productESOptimal2(int[] nums) {
    int n = nums.length;
    int[] ans = new int[n];
    
    // Prefix product stored in ans[]
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
```

### 🔄 Dry Run
**Input:** nums = [1, 2, 3, 4]

**Step 1: Prefix in ans[]**
| i | calculation | ans |
|---|-------------|-----|
| 0 | ans[0]=1 | [1,0,0,0] |
| 1 | 1*nums[0]=1 | [1,1,0,0] |
| 2 | 1*nums[1]=2 | [1,1,2,0] |
| 3 | 2*nums[2]=6 | [1,1,2,6] |

**Step 2: Suffix multiplication**
| i | suffix update | ans[i] |
|---|---------------|--------|
| 2 | 1*nums[3]=4 | 2*4=8 |
| 1 | 4*nums[2]=12 | 1*12=12 |
| 0 | 12*nums[1]=24 | 1*24=24 |

**Final ans:** [24, 12, 8, 6]

### 📊 Time Complexity: O(n)
### 💾 Space Complexity: O(1) (excluding output)
### 🎯 Use Cases
- Mathematical operations
- Data transformation
- Array manipulation without division

---

## 4. Sliding Window Maximum Sum ⭐⭐⭐⭐
**Priority:** HIGH | **LeetCode:** Various | **GFG:** Important

### 📝 Problem Statement
Find maximum sum of any subarray of size k.

### 💡 Solution
```java
static int maxSumSubarray(int[] arr, int k) {
    int n = arr.length;
    if (arr == null || n < k) return -1;
    
    // Step 1: Sum of first window
    int current = 0;
    for (int i = 0; i < k; i++) {
        current += arr[i];
    }
    int maxx = current;
    
    // Step 2: Slide the window
    for (int i = 1; i <= n - k; i++) {
        current = current - arr[i - 1] + arr[i + k - 1];
        maxx = Math.max(maxx, current);
    }
    return maxx;
}
```

### 🔄 Dry Run
**Input:** arr = [5, 2, -1, 0, 3], k = 3

**Step 1: First window [5,2,-1]**
current = 5 + 2 + (-1) = 6
maxx = 6

**Step 2: Slide window**
| i | window | current | maxx |
|---|--------|---------|------|
| 1 | [2,-1,0] | 6-5+0=1 | 6 |
| 2 | [-1,0,3] | 1-2+3=2 | 6 |

**Output:** 6

### 📊 Time Complexity: O(n)
### 💾 Space Complexity: O(1)
### 🎯 Use Cases
- Time series analysis
- Moving averages
- Data stream processing

---

## 5. Maximum Consecutive Ones After Flipping Zeroes ⭐⭐⭐⭐
**Priority:** MEDIUM | **LeetCode:** 1004 | **GFG:** Important

### 📝 Problem Statement
Find maximum consecutive 1's after flipping at most k zeroes.

### 💡 Solution

#### Approach 1: Sliding Window (O(n)) - OPTIMAL
```java
static int maxOnesOptimal(int[] arr, int k) {
    int res = 0;
    int start = 0;
    int end = 0;
    int cnt = 0; // zeroes count
    
    while (end < arr.length) {
        if (arr[end] == 0) {
            cnt++;
        }
        while (cnt > k) {
            if (arr[start] == 0) {
                cnt--;
            }
            start++;
        }
        res = Math.max(res, end - start + 1);
        end++;
    }
    return res;
}
```

### 🔄 Dry Run
**Input:** arr = [1,0,0,1,1,0,1,0,1,1,1], k = 2

| end | arr[end] | cnt | start | window | res |
|-----|----------|-----|-------|--------|-----|
| 0 | 1 | 0 | 0 | [1] | 1 |
| 1 | 0 | 1 | 0 | [1,0] | 2 |
| 2 | 0 | 2 | 0 | [1,0,0] | 3 |
| 3 | 1 | 2 | 0 | [1,0,0,1] | 4 |
| 4 | 1 | 2 | 0 | [1,0,0,1,1] | 5 |
| 5 | 0 | 3 | 1 | [0,0,1,1,0] | 5 |
| 5 | 0 | 2 | 2 | [0,1,1,0] | 5 |
| 6 | 1 | 2 | 2 | [0,1,1,0,1] | 5 |
| 7 | 0 | 3 | 3 | [1,1,0,1,0] | 5 |
| 7 | 0 | 2 | 4 | [1,0,1,0] | 5 |
| 8 | 1 | 2 | 4 | [1,0,1,0,1] | 5 |
| 9 | 1 | 2 | 4 | [1,0,1,0,1,1] | 6 |
| 10 | 1 | 2 | 4 | [1,0,1,0,1,1,1] | 7 |

**Output:** 7

### 📊 Time Complexity: O(n)
### 💾 Space Complexity: O(1)
### 🎯 Use Cases
- Binary data processing
- Network packet analysis
- Signal processing

---

## 6. Pair Sum (Two Pointer) ⭐⭐⭐⭐
**Priority:** MEDIUM | **LeetCode:** 167 | **GFG:** Important

### 📝 Problem Statement
Find two numbers in a sorted array that sum to target.

### 💡 Solution

#### Approach 1: Two Pointer (O(n)) - OPTIMAL
```java
public ArrayList<String> pairSumOptimal(ArrayList<Integer> arr, int target) {
    ArrayList<String> ans = new ArrayList<>();
    int n = arr.size();
    int i = 0, j = n - 1;
    
    while (i < j) {
        int sum = arr.get(i) + arr.get(j);
        if (sum > target) {
            j--;
        } else if (sum < target) {
            i++;
        } else {
            ans.add("Pair: " + arr.get(i) + ", " + arr.get(j));
            ans.add("Index: " + i + ", " + j);
            return ans;
        }
    }
    return ans;
}
```

### 🔄 Dry Run
**Input:** arr = [2, 7, 11, 15], target = 26

| i | j | arr[i] | arr[j] | sum | Action |
|---|---|--------|--------|-----|--------|
| 0 | 3 | 2 | 15 | 17 | 17 < 26, i++ |
| 1 | 3 | 7 | 15 | 22 | 22 < 26, i++ |
| 2 | 3 | 11 | 15 | 26 | 26 == 26, found! |

**Output:** Pair: 11, 15, Index: 2, 3

### 📊 Time Complexity: O(n)
### 💾 Space Complexity: O(1)
### 🎯 Use Cases
- Sorted array problems
- Two-sum variations
- Target finding

---

# 🔥 HARD CATEGORY (Priority 1 - Must Know)

## 1. Trapping Rainwater ⭐⭐⭐⭐⭐
**Priority:** HIGH | **LeetCode:** 42 | **GFG:** Must Do

### 📝 Problem Statement
Calculate how much water can be trapped after raining given elevation map.

### 💡 Solution

#### Approach 1: Prefix & Suffix Max (O(n)) - OPTIMAL
```java
public static int trappedRainwater(int height[]) {
    int n = height.length;
    
    // Calculate left max boundary
    int leftMax[] = new int[n];
    leftMax[0] = height[0];
    for (int i = 1; i < n; i++) {
        leftMax[i] = Math.max(height[i], leftMax[i - 1]);
    }
    
    // Calculate right max boundary
    int rightMax[] = new int[n];
    rightMax[n - 1] = height[n - 1];
    for (int i = n - 2; i >= 0; i--) {
        rightMax[i] = Math.max(height[i], rightMax[i + 1]);
    }
    
    int trappedWater = 0;
    for (int i = 0; i < n; i++) {
        int waterLevel = Math.min(leftMax[i], rightMax[i]);
        trappedWater += waterLevel - height[i];
    }
    return trappedWater;
}
```

### 🔄 Dry Run
**Input:** height = [4, 2, 0, 6, 3, 2, 5]

**Step 1: Left Max**
| i | height[i] | leftMax[i] |
|---|-----------|------------|
| 0 | 4 | 4 |
| 1 | 2 | max(2,4)=4 |
| 2 | 0 | max(0,4)=4 |
| 3 | 6 | max(6,4)=6 |
| 4 | 3 | max(3,6)=6 |
| 5 | 2 | max(2,6)=6 |
| 6 | 5 | max(5,6)=6 |

leftMax = [4, 4, 4, 6, 6, 6, 6]

**Step 2: Right Max**
| i | height[i] | rightMax[i] |
|---|-----------|-------------|
| 6 | 5 | 5 |
| 5 | 2 | max(2,5)=5 |
| 4 | 3 | max(3,5)=5 |
| 3 | 6 | max(6,5)=6 |
| 2 | 0 | max(0,6)=6 |
| 1 | 2 | max(2,6)=6 |
| 0 | 4 | max(4,6)=6 |

rightMax = [6, 6, 6, 6, 5, 5, 5]

**Step 3: Calculate Water**
| i | leftMax | rightMax | waterLevel | height[i] | trapped |
|---|---------|----------|------------|-----------|---------|
| 0 | 4 | 6 | 4 | 4 | 0 |
| 1 | 4 | 6 | 4 | 2 | 2 |
| 2 | 4 | 6 | 4 | 0 | 4 |
| 3 | 6 | 6 | 6 | 6 | 0 |
| 4 | 6 | 5 | 5 | 3 | 2 |
| 5 | 6 | 5 | 5 | 2 | 3 |
| 6 | 6 | 5 | 5 | 5 | 0 |

**Total:** 0 + 2 + 4 + 0 + 2 + 3 + 0 = 11

**Output:** 11

### 📊 Time Complexity: O(n)
### 💾 Space Complexity: O(n)
### 🎯 Use Cases
- Water management systems
- Terrain analysis
- Volume calculation

---

## 2. Next Greater Element ⭐⭐⭐⭐⭐
**Priority:** HIGH | **LeetCode:** 496 | **GFG:** Must Do

### 📝 Problem Statement
Find the next greater element for each element in the array.

### 💡 Solution

#### Approach 1: Stack (O(n)) - OPTIMAL
```java
public static void nextGreater(int[] arr) {
    Stack<Integer> s = new Stack<>();
    int nxtGreater[] = new int[arr.length];
    
    for (int i = arr.length - 1; i >= 0; i--) {
        while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
            s.pop();
        }
        if (s.isEmpty()) {
            nxtGreater[i] = -1;
        } else {
            nxtGreater[i] = arr[s.peek()];
        }
        s.push(i);
    }
    
    for (int i = 0; i < nxtGreater.length; i++) {
        System.out.print(nxtGreater[i] + " ");
    }
}
```

### 🔄 Dry Run
**Input:** arr = [6, 8, 0, 1, 3]

| i | arr[i] | stack | while pops | nxtGreater[i] |
|---|--------|-------|------------|----------------|
| 4 | 3 | [] | none | -1 |
| 4 | 3 | [4] | - | -1 |
| 3 | 1 | [4] | none (3 > 1) | 3 |
| 3 | 1 | [3,4] | - | 3 |
| 2 | 0 | [3,4] | none (1 > 0) | 1 |
| 2 | 0 | [2,3,4] | - | 1 |
| 1 | 8 | [2,3,4] | pop all (8 > all) | -1 |
| 1 | 8 | [1] | - | -1 |
| 0 | 6 | [1] | none (8 > 6) | 8 |
| 0 | 6 | [0,1] | - | 8 |

**Output:** [8, -1, 1, 3, -1]

### 📊 Time Complexity: O(n)
### 💾 Space Complexity: O(n)
### 🎯 Use Cases
- Stock price prediction
- Finding next higher value
- Temperature analysis

---

## 3. Spiral Matrix ⭐⭐⭐⭐
**Priority:** HIGH | **LeetCode:** 54 | **GFG:** Must Do

### 📝 Problem Statement
Print all elements of a matrix in spiral order.

### 💡 Solution
```java
public static void printSpiral(int[][] matrix) {
    int startRow = 0;
    int startCol = 0;
    int endRow = matrix.length - 1;
    int endCol = matrix[0].length - 1;
    
    while (startRow <= endRow && startCol <= endCol) {
        // Top
        for (int j = startCol; j <= endCol; j++) {
            System.out.print(matrix[startRow][j] + " ");
        }
        
        // Right
        for (int i = startRow + 1; i <= endRow; i++) {
            System.out.print(matrix[i][endCol] + " ");
        }
        
        // Bottom
        for (int j = endCol - 1; j >= startCol; j--) {
            if (startRow == endRow) break;
            System.out.print(matrix[endRow][j] + " ");
        }
        
        // Left
        for (int i = endRow - 1; i >= startRow + 1; i--) {
            if (startCol == endCol) break;
            System.out.print(matrix[i][startCol] + " ");
        }
        
        startCol++;
        startRow++;
        endCol--;
        endRow--;
    }
}
```

### 🔄 Dry Run
**Input:** matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]]

**Iteration 1:** startRow=0, startCol=0, endRow=3, endCol=3
- Top: 1 2 3 4
- Right: 8 12 16
- Bottom: 15 14 13
- Left: 9 5

**Iteration 2:** startRow=1, startCol=1, endRow=2, endCol=2
- Top: 6 7
- Right: 11
- Bottom: 10
- Left: (skip, same row)

**Output:** 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10

### 📊 Time Complexity: O(m × n)
### 💾 Space Complexity: O(1)
### 🎯 Use Cases
- Matrix traversal
- Image processing
- Data serialization

---

## 4. Rotate 2D Array by 90° ⭐⭐⭐⭐⭐
**Priority:** HIGH | **LeetCode:** 48 | **GFG:** Must Do

### 📝 Problem Statement
Rotate a square matrix by 90 degrees clockwise in-place.

### 💡 Solution
```java
public void rotate(int[][] matrix) {
    int l = 0;
    int r = matrix.length - 1;
    
    while (l < r) {
        for (int i = 0; i < r - l; i++) {
            int top = l;
            int bottom = r;
            int topLeft = matrix[top][l + i];
            
            // left → top
            matrix[top][l + i] = matrix[bottom - i][l];
            
            // bottom → left
            matrix[bottom - i][l] = matrix[bottom][r - i];
            
            // right → bottom
            matrix[bottom][r - i] = matrix[top + i][r];
            
            // top → right
            matrix[top + i][r] = topLeft;
        }
        l++;
        r--;
    }
}
```

### 🔄 Dry Run
**Input:** matrix = [[1,2,3],[4,5,6],[7,8,9]]

**Layer 0:** l=0, r=2
- i=0: topLeft=1
  - matrix[0][0] = matrix[2][0] = 7
  - matrix[2][0] = matrix[2][2] = 9
  - matrix[2][2] = matrix[0][2] = 3
  - matrix[0][2] = 1
  - Matrix: [[7,2,1],[4,5,6],[9,8,3]]
- i=1: topLeft=2
  - matrix[0][1] = matrix[1][0] = 4
  - matrix[1][0] = matrix[2][1] = 8
  - matrix[2][1] = matrix[1][2] = 6
  - matrix[1][2] = 2
  - Matrix: [[7,4,1],[8,5,2],[9,6,3]]

**Output:** [[7,4,1],[8,5,2],[9,6,3]]

### 📊 Time Complexity: O(n²)
### 💾 Space Complexity: O(1)
### 🎯 Use Cases
- Image rotation
- Matrix transformation
- Game development

---

## 5. Staircase Search in Sorted 2D Array ⭐⭐⭐⭐
**Priority:** MEDIUM | **LeetCode:** 240 | **GFG:** Important

### 📝 Problem Statement
Search for an element in a 2D matrix where each row and column is sorted.

### 💡 Solution
```java
public static boolean staircaseSearch(int[][] matrix, int key) {
    int row = 0;
    int col = matrix[0].length - 1;
    
    while (row < matrix.length && col >= 0) {
        if (matrix[row][col] == key) {
            System.out.println("found key at (" + row + "," + col + ")");
            return true;
        } else if (key < matrix[row][col]) {
            col--;
        } else {
            row++;
        }
    }
    System.out.println(key + " key not found!");
    return false;
}
```

### 🔄 Dry Run
**Input:** matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]], key = 10

| row | col | matrix[row][col] | Action |
|-----|-----|------------------|--------|
| 0 | 3 | 4 | 10 > 4, row++ |
| 1 | 3 | 8 | 10 > 8, row++ |
| 2 | 3 | 12 | 10 < 12, col-- |
| 2 | 2 | 11 | 10 < 11, col-- |
| 2 | 1 | 10 | 10 == 10, found! |

**Output:** found key at (2,1)

### 📊 Time Complexity: O(m + n)
### 💾 Space Complexity: O(1)
### 🎯 Use Cases
- Database searching
- Sorted data lookup
- Efficient search in 2D

---

# 📋 Summary Table

| Category | Question | Time | Space | Priority |
|----------|----------|------|-------|----------|
| Easy | Two Sum | O(n) | O(n) | ⭐⭐⭐⭐⭐ |
| Easy | Find Missing Number | O(n) | O(1) | ⭐⭐⭐⭐⭐ |
| Easy | Check Duplicate | O(n) | O(n) | ⭐⭐⭐⭐ |
| Easy | Max/Min Element | O(n) | O(1) | ⭐⭐⭐ |
| Easy | Second Largest | O(n) | O(1) | ⭐⭐⭐⭐ |
| Easy | Third Largest | O(n) | O(1) | ⭐⭐⭐ |
| Easy | Rotate Array by One | O(n) | O(1) | ⭐⭐⭐ |
| Easy | Check Sorted | O(n) | O(1) | ⭐⭐ |
| Easy | Find Unique (XOR) | O(n) | O(1) | ⭐⭐⭐⭐⭐ |
| Medium | Max Subarray (Kadane) | O(n) | O(1) | ⭐⭐⭐⭐⭐ |
| Medium | Majority Element | O(n) | O(1) | ⭐⭐⭐⭐⭐ |
| Medium | Product Except Self | O(n) | O(1) | ⭐⭐⭐⭐⭐ |
| Medium | Sliding Window Max | O(n) | O(1) | ⭐⭐⭐⭐ |
| Medium | Max Consecutive Ones | O(n) | O(1) | ⭐⭐⭐⭐ |
| Medium | Pair Sum (Two Pointer) | O(n) | O(1) | ⭐⭐⭐⭐ |
| Hard | Trapping Rainwater | O(n) | O(n) | ⭐⭐⭐⭐⭐ |
| Hard | Next Greater Element | O(n) | O(n) | ⭐⭐⭐⭐⭐ |
| Hard | Spiral Matrix | O(m×n) | O(1) | ⭐⭐⭐⭐ |
| Hard | Rotate 2D Array | O(n²) | O(1) | ⭐⭐⭐⭐⭐ |
| Hard | Staircase Search | O(m+n) | O(1) | ⭐⭐⭐⭐ |

---

# 🎯 Interview Tips

1. **Always start with brute force** - Shows you can solve the problem
2. **Optimize step by step** - Explain each optimization
3. **Dry run your code** - Prove it works with examples
4. **Analyze complexity** - Time and space for every approach
5. **Handle edge cases** - Empty arrays, single elements, etc.
6. **Use meaningful variable names** - Shows clean code practices
7. **Explain your thought process** - Communication is key

---

# 📚 Practice Order (Recommended)

## Week 1: Easy Questions
1. Two Sum
2. Find Missing Number
3. Find Unique Number (XOR)
4. Check Duplicate
5. Max/Min Element

## Week 2: Easy-Medium Transition
1. Second/Third Largest
2. Rotate Array
3. Check Sorted
4. Kadane's Algorithm
5. Majority Element

## Week 3: Medium Questions
1. Product Except Self
2. Sliding Window
3. Max Consecutive Ones
4. Pair Sum
5. Subarray Problems

## Week 4: Hard Questions
1. Trapping Rainwater
2. Next Greater Element
3. Spiral Matrix
4. Rotate 2D Array
5. Staircase Search

---

**Good luck with your interview preparation! 🚀**
