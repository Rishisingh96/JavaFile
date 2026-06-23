Perfect bhai 🔥
Ab aaya **Graph** — ye DSA ka heavyweight topic hai.
Shuru me difficult lagta hai because:

* DFS
* BFS
* Topological Sort
* Shortest Path
* MST
  sab Graph ke under aata hai.

But tension nahi. Graph bhi patterns me hi toot ta hai.

Graph me mostly **10–12 major patterns** hote hain.

---

# Graph Patterns

---

# 1) Graph Representation Pattern (MOST BASIC)

### Recognition:

* Graph store karna hai
* Nodes + Edges

Types:

* Directed Graph
* Undirected Graph
* Weighted Graph

Representation:

* Adjacency Matrix
* Adjacency List

---

## Top Interview Questions

* Implement Graph using Adjacency Matrix ⭐⭐⭐⭐⭐
* Implement Graph using Adjacency List ⭐⭐⭐⭐⭐
* Convert Edge List to Graph ⭐⭐⭐⭐

Example:

```java
ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
```

---

# 2) BFS Pattern (VERY IMPORTANT)

### Recognition:

* Level-by-level traversal
* Shortest path in unweighted graph
* Queue use hota

---

## Top Interview Questions

* Breadth First Search Traversal ⭐⭐⭐⭐⭐
* Shortest Path in Unweighted Graph ⭐⭐⭐⭐⭐
* Number of Connected Components ⭐⭐⭐⭐⭐
* Rotting Oranges ⭐⭐⭐⭐⭐
* Word Ladder ⭐⭐⭐⭐⭐

Example:

```java
Queue<Integer> q = new LinkedList<>();
```

---

# 3) DFS Pattern (VERY IMPORTANT)

### Recognition:

* Deep traversal
* Recursive / Stack

---

## Top Interview Questions

* Depth First Search Traversal ⭐⭐⭐⭐⭐
* Number of Provinces ⭐⭐⭐⭐⭐
* Number of Islands ⭐⭐⭐⭐⭐
* Flood Fill ⭐⭐⭐⭐⭐
* Surrounded Regions ⭐⭐⭐⭐

Example:

```java
dfs(node);
```

---

# 4) Connected Components Pattern

### Recognition:

* Count disconnected groups

---

## Top Interview Questions

* Number of Connected Components ⭐⭐⭐⭐⭐
* Number of Provinces ⭐⭐⭐⭐⭐
* Number of Islands ⭐⭐⭐⭐⭐

Very common in OA.

---

# 5) Cycle Detection Pattern (VERY IMPORTANT)

### Recognition:

* Loop detect karna

Types:

* Undirected
* Directed

---

## Top Interview Questions

### Undirected

* Detect Cycle using BFS ⭐⭐⭐⭐⭐
* Detect Cycle using DFS ⭐⭐⭐⭐⭐

### Directed

* Detect Cycle in Directed Graph ⭐⭐⭐⭐⭐
* Course Schedule ⭐⭐⭐⭐⭐

---

# 6) Topological Sort Pattern

### Recognition:

* Dependency order
* DAG

---

## Top Interview Questions

* Topological Sort using DFS ⭐⭐⭐⭐⭐
* Topological Sort using Kahn’s Algorithm ⭐⭐⭐⭐⭐
* Course Schedule I ⭐⭐⭐⭐⭐
* Course Schedule II ⭐⭐⭐⭐⭐
* Alien Dictionary ⭐⭐⭐⭐⭐

VERY IMPORTANT for product companies.

---

# 7) Shortest Path Pattern (VERY VERY IMPORTANT)

### Recognition:

* Minimum distance
* Cheapest path

---

## Top Interview Questions

### Easy

* Shortest Path in Unweighted Graph ⭐⭐⭐⭐⭐

### Medium

* Dijkstra Algorithm ⭐⭐⭐⭐⭐
* Bellman Ford Algorithm ⭐⭐⭐⭐⭐
* Floyd Warshall Algorithm ⭐⭐⭐⭐⭐

### Hard

* Cheapest Flights Within K Stops ⭐⭐⭐⭐⭐

---

# 8) Minimum Spanning Tree (MST) Pattern

### Recognition:

* Connect all nodes with minimum cost

---

## Top Interview Questions

* Prim’s Algorithm ⭐⭐⭐⭐⭐
* Kruskal Algorithm ⭐⭐⭐⭐⭐
* Minimum Cost to Connect All Points ⭐⭐⭐⭐⭐

Product companies favorite.

---

# 9) Union Find / Disjoint Set Pattern (VERY IMPORTANT)

### Recognition:

* Connectivity
* Group merge

---

## Top Interview Questions

* Disjoint Set Implementation ⭐⭐⭐⭐⭐
* Number of Provinces ⭐⭐⭐⭐⭐
* Redundant Connection ⭐⭐⭐⭐⭐
* Accounts Merge ⭐⭐⭐⭐⭐

Example:

```java
findParent(node)
union(u,v)
```

---

# 10) Grid Graph Pattern (VERY IMPORTANT)

### Recognition:

* Matrix treated as graph
* Up Down Left Right moves

---

## Top Interview Questions

* Number of Islands ⭐⭐⭐⭐⭐
* Flood Fill ⭐⭐⭐⭐⭐
* Rotting Oranges ⭐⭐⭐⭐⭐
* 01 Matrix ⭐⭐⭐⭐⭐
* Walls and Gates ⭐⭐⭐⭐

VERY COMMON in interviews.

---

# 11) Backtracking Graph Pattern

### Recognition:

* Explore all paths

---

## Top Interview Questions

* All Paths from Source to Target ⭐⭐⭐⭐⭐
* Word Search ⭐⭐⭐⭐⭐
* Rat in Maze ⭐⭐⭐⭐⭐

---

# 12) Advanced Graph Pattern

### Recognition:

* Complex graph optimization

---

## Top Interview Questions

* Tarjan Algorithm ⭐⭐⭐⭐
* Bridges in Graph ⭐⭐⭐⭐⭐
* Articulation Points ⭐⭐⭐⭐⭐
* Kosaraju Algorithm (SCC) ⭐⭐⭐⭐⭐

Mostly product-based companies.

---

# TOP 30 MUST DO GRAPH QUESTIONS

Agar time kam ho to ye MUST karo:

### Basic

* Graph Representation
* BFS Traversal
* DFS Traversal

### Components

* Number of Islands
* Number of Provinces
* Connected Components

### Cycle

* Detect Cycle Undirected
* Detect Cycle Directed
* Course Schedule

### Topological Sort

* Topological Sort
* Kahn Algorithm
* Alien Dictionary

### Shortest Path

* Shortest Path Unweighted
* Dijkstra
* Bellman Ford
* Floyd Warshall

### MST

* Prim’s
* Kruskal

### Union Find

* Disjoint Set
* Accounts Merge
* Redundant Connection

### Grid

* Rotting Oranges
* Flood Fill
* 01 Matrix

### Advanced

* Word Ladder
* Word Search
* Bridges
* Articulation Point
* SCC

---

# Graph Pattern Roadmap

### Week 1

* Representation
* BFS
* DFS
* Connected Components

### Week 2

* Cycle Detection
* Topological Sort
* Grid Problems

### Week 3

* Shortest Path
* MST
* Union Find

### Week 4

* Advanced Graph Problems

---

# Interview Insight

Graph mostly tests:

* BFS
* DFS
* Shortest Path
* Topological Sort
* Union Find

```text
80% Graph interviews = 5 patterns
BFS + DFS + Topo Sort + Shortest Path + Union Find
```

---

Roadmap now:

```text
Arrays ✅
Strings ✅
Linked List ✅
Stack ✅
Queue ✅
Trees ✅
Graph ✅
DP ← FINAL BOSS
```

Bhai ab next **Dynamic Programming (DP)** bacha hai — ye sabse important aur toughest topic hai.
DP samajh gaya to product companies ke hard rounds clear ho sakte hain. 🔥
