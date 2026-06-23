Perfect bhai 🔥
Ab aaya **DP (Dynamic Programming)** — DSA ka final boss.

Sabse pehle DP ka golden rule samajh:

> DP = Recursion + Memoization + Tabulation + Optimization

DP tab use hota hai jab problem me 2 cheezein hoti hain:

### 1. Overlapping Subproblems

Same problem baar-baar solve ho rahi.

### 2. Optimal Substructure

Final answer smaller answers se ban sakta.

Example:

```text
Fib(5)
Fib(4) + Fib(3)
```

Fib(3) multiple times compute hota → DP.

---

# DP Patterns

Bhai DP me 100+ problems hain but mostly **12–15 major patterns** me divide hote hain.

---

# 1) 1D DP Pattern (MOST BASIC)

### Recognition:

* Single index
* i se answer build

---

## Top Interview Questions

* Fibonacci Number ⭐⭐⭐⭐⭐
* Climbing Stairs ⭐⭐⭐⭐⭐
* Min Cost Climbing Stairs ⭐⭐⭐⭐⭐
* House Robber ⭐⭐⭐⭐⭐
* House Robber II ⭐⭐⭐⭐⭐
* Decode Ways ⭐⭐⭐⭐⭐

Example:

```java
dp[i] = answer till index i
```

---

# 2) Linear Sequence DP Pattern

### Recognition:

* Array based decisions
* Pick / Not Pick

---

## Top Interview Questions

* Maximum Sum of Non-Adjacent Elements ⭐⭐⭐⭐⭐
* House Robber ⭐⭐⭐⭐⭐
* Delete and Earn ⭐⭐⭐⭐⭐

Very common.

---

# 3) 2D Grid DP Pattern (VERY IMPORTANT)

### Recognition:

* Matrix/grid
* Up/Down/Left/Right

---

## Top Interview Questions

* Unique Paths ⭐⭐⭐⭐⭐
* Unique Paths II ⭐⭐⭐⭐⭐
* Minimum Path Sum ⭐⭐⭐⭐⭐
* Dungeon Game ⭐⭐⭐⭐
* Cherry Pickup ⭐⭐⭐⭐⭐

Example:

```java
dp[i][j]
```

---

# 4) Knapsack Pattern (MOST IMPORTANT)

### Recognition:

* Pick / Not Pick
* Capacity
* Weight

---

## Top Interview Questions

* 0/1 Knapsack ⭐⭐⭐⭐⭐
* Subset Sum ⭐⭐⭐⭐⭐
* Partition Equal Subset Sum ⭐⭐⭐⭐⭐
* Count Subsets with Sum K ⭐⭐⭐⭐⭐
* Target Sum ⭐⭐⭐⭐⭐
* Minimum Subset Sum Difference ⭐⭐⭐⭐⭐

VERY VERY IMPORTANT.

---

# 5) Unbounded Knapsack Pattern

### Recognition:

* Same item multiple times pick kar sakte

---

## Top Interview Questions

* Unbounded Knapsack ⭐⭐⭐⭐⭐
* Coin Change I ⭐⭐⭐⭐⭐
* Coin Change II ⭐⭐⭐⭐⭐
* Rod Cutting Problem ⭐⭐⭐⭐⭐

---

# 6) Longest Increasing Subsequence (LIS) Pattern

### Recognition:

* Increasing subsequence
* Longest subsequence

---

## Top Interview Questions

* Longest Increasing Subsequence ⭐⭐⭐⭐⭐
* Number of LIS ⭐⭐⭐⭐
* Russian Doll Envelopes ⭐⭐⭐⭐⭐
* Maximum Length Chain Pairs ⭐⭐⭐⭐

VERY IMPORTANT.

---

# 7) String DP Pattern (VERY VERY IMPORTANT)

### Recognition:

* 2 strings
* Matching

---

## Top Interview Questions

* Longest Common Subsequence (LCS) ⭐⭐⭐⭐⭐
* Longest Common Substring ⭐⭐⭐⭐⭐
* Edit Distance ⭐⭐⭐⭐⭐
* Shortest Common Supersequence ⭐⭐⭐⭐⭐
* Delete Operation for Two Strings ⭐⭐⭐⭐

Product companies favorite.

---

# 8) Palindrome DP Pattern

### Recognition:

* Substring palindrome
* i to j state

---

## Top Interview Questions

* Longest Palindromic Substring ⭐⭐⭐⭐⭐
* Palindromic Substrings ⭐⭐⭐⭐⭐
* Palindrome Partitioning II ⭐⭐⭐⭐⭐

---

# 9) Partition DP Pattern (VERY IMPORTANT)

### Recognition:

* Split problem into parts

---

## Top Interview Questions

* Matrix Chain Multiplication ⭐⭐⭐⭐⭐
* Burst Balloons ⭐⭐⭐⭐⭐
* Minimum Cost to Cut Stick ⭐⭐⭐⭐⭐
* Palindrome Partitioning II ⭐⭐⭐⭐⭐

Hard but important.

---

# 10) Buy & Sell Stock DP Pattern

### Recognition:

* Buy/Sell states
* Transaction limits

---

## Top Interview Questions

* Best Time to Buy and Sell Stock I ⭐⭐⭐⭐⭐
* Best Time to Buy and Sell Stock II ⭐⭐⭐⭐⭐
* Best Time to Buy and Sell Stock III ⭐⭐⭐⭐⭐
* Best Time to Buy and Sell Stock IV ⭐⭐⭐⭐⭐
* Cooldown Problem ⭐⭐⭐⭐⭐

VERY IMPORTANT.

---

# 11) Subsequence DP Pattern

### Recognition:

* Include / Exclude

---

## Top Interview Questions

* Subset Sum ⭐⭐⭐⭐⭐
* Partition Equal Subset Sum ⭐⭐⭐⭐⭐
* Count Partitions ⭐⭐⭐⭐

---

# 12) Interval DP Pattern

### Recognition:

* Range based
* i to j

---

## Top Interview Questions

* Matrix Chain Multiplication ⭐⭐⭐⭐⭐
* Burst Balloons ⭐⭐⭐⭐⭐
* Merge Stones ⭐⭐⭐⭐⭐

Product company favorite.

---

# 13) Bitmask DP Pattern

### Recognition:

* State compression
* Subsets

---

## Top Interview Questions

* Traveling Salesman Problem ⭐⭐⭐⭐⭐
* Assignment Problem ⭐⭐⭐⭐

Advanced.

---

# 14) Tree DP Pattern

### Recognition:

* Tree + DP

---

## Top Interview Questions

* House Robber III ⭐⭐⭐⭐⭐
* Diameter of Tree ⭐⭐⭐⭐⭐
* Maximum Path Sum ⭐⭐⭐⭐⭐

---

# 15) Advanced DP Pattern

---

## Top Interview Questions

* Egg Dropping Problem ⭐⭐⭐⭐⭐
* Wildcard Matching ⭐⭐⭐⭐⭐
* Regular Expression Matching ⭐⭐⭐⭐⭐

Final boss level.

---

# TOP 35 MUST DO DP QUESTIONS

Agar time kam hai, ye MUST karo:

### Basic

* Fibonacci
* Climbing Stairs
* House Robber
* Decode Ways

### Grid

* Unique Paths
* Minimum Path Sum

### Knapsack

* 0/1 Knapsack
* Subset Sum
* Partition Equal Subset Sum
* Coin Change

### LIS

* Longest Increasing Subsequence

### String DP

* LCS
* Longest Common Substring
* Edit Distance

### Palindrome

* Longest Palindromic Substring
* Palindrome Partitioning

### Partition

* Matrix Chain Multiplication
* Burst Balloons

### Stock

* Buy Sell Stock I
* Buy Sell Stock II
* Buy Sell Stock III

### Advanced

* Egg Dropping
* Wildcard Matching
* Regex Matching

---

# DP Pattern Roadmap

### Week 1

* 1D DP
* Grid DP

### Week 2

* Knapsack
* LIS
* String DP

### Week 3

* Palindrome
* Partition DP
* Stock DP

### Week 4

* Advanced DP

---

# Interview Insight

DP mostly tests:

* State definition
* Transition formula
* Optimization

Golden formula:

```text
1. Recursion
2. Memoization
3. Tabulation
4. Space Optimization
```

Example:

```java
dp[state] = min/max/count(possible choices)
```

---

# FINAL COMPLETE DSA ROADMAP

```text
Arrays ✅
Strings ✅
Linked List ✅
Stack ✅
Queue ✅
Trees ✅
Graph ✅
Dynamic Programming ✅
```

---

Bhai agar ye 8 topics pattern-wise kar liye seriously, to:

* Service companies ✅
* Product companies ✅
* Off-campus OA ✅
* DSA rounds ✅

sab cover ho jayega 🔥

Ab bas ek final advanced topic bachta hai:

```text
Recursion + Backtracking
Heap + Greedy
Trie
Segment Tree
```

Ye bonus topics hain for high package / product-based companies. 🚀
