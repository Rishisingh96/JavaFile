package com.interviewQuestion_DSA_Java.Graph_19;

import javax.xml.transform.stax.StAXResult;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintAllTargetPath {

    // Edge class representing a connection between two nodes
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    // Method to create the graph
    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));

        graph[5].add(new Edge(6,5));
    }

    // BFS Traversal
    public static void bfs(ArrayList<Edge>[] graph, int V, boolean[] vis, int start){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);

        while (!q.isEmpty()){
            int curr = q.remove();
            if(!vis[curr]){
                System.out.print(curr + " ");
                vis[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    // DFS Traversal
    public static void dfs(ArrayList<Edge>[] graph, boolean[] vis, int curr) {
        System.out.print(curr + " ");
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                dfs(graph, vis, e.dest);
            }
        }
    }

    public static void printAllPath(ArrayList<Edge> graph[], boolean vis[], int curr, String path, int tar){
        if(curr == tar){
            System.out.println(path);
            return;
        }

        for(int i=0; i<graph[curr].size(); i++){
            Edge edge = graph[curr].get(i);
            if(!vis[edge.dest]){
                vis[curr] = true;
                printAllPath(graph, vis, edge.dest, path+edge.dest, tar);
                vis[curr] = false;
            }
        }

    }


    public static void main(String[] args) {
        int v = 7;
        /*

             1 —— 3
           /        \
          0          5 —— 6
           \       /
             2—— 4

        */
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);

       int src = 0, tar = 5;

        printAllPath(graph, new boolean[v], src, "0", tar);
    }
}
/*Absolutely, bhai! Let's do a complete in-depth dry run of the printAllPath() method step-by-step for this code.

🧠 Understanding the Code
You have a graph of 7 nodes: 0 to 6.

You are printing all paths from src = 0 to tar = 5.

The function is a recursive DFS-based approach to find and print all possible paths from source to target.

Uses vis[] to avoid cycles.

✅ Graph Structure
Here's the simplified undirected graph structure you created (bi-directional edges):

markdown
Copy
Edit
        1 —— 3 —— 5 —— 6
       /     |     |
      0      4 ————
       \    /
         2
🎯 Goal
Print all paths from 0 to 5.

📘 Function Signature
java
Copy
Edit
public static void printAllPath(
    ArrayList<Edge> graph[],
    boolean vis[],
    int curr,
    String path,
    int tar
)
🔍 DRY RUN: printAllPath(graph, new boolean[v], 0, "0", 5)
➤ Call: printAllPath(graph, vis, 0, "0", 5)
curr = 0

path = "0"

vis[0] = false

Neighbors of 0 → 1 and 2.

➤ First recursive path: go to 1
java
Copy
Edit
printAllPath(graph, vis, 1, "01", 5)
Now: curr = 1
Neighbors = 0, 3

0 is already visited, skip it

Go to 3

➤ Next: printAllPath(graph, vis, 3, "013", 5)
Neighbors = 1, 4, 5

1 visited, skip

Go to 4

➤ Next: printAllPath(graph, vis, 4, "0134", 5)
Neighbors = 2, 3, 5

2 not visited → go to 2

➤ Next: printAllPath(graph, vis, 2, "01342", 5)
Neighbors = 0, 4

0 visited, 4 visited → return

❌ No valid path from here → backtrack

Backtrack to → 4 → Now try next neighbor → 5 ✅
java
Copy
Edit
printAllPath(graph, vis, 5, "01345", 5)
🎉 Target reached! Print 01345

Backtrack again → from 4 to 3 → now try 5 directly:
java
Copy
Edit
printAllPath(graph, vis, 5, "0135", 5)
🎉 Target reached! Print 0135

Backtrack to 1 → back to 0 → Now try next neighbor → 2
java
Copy
Edit
printAllPath(graph, vis, 2, "02", 5)
Neighbors = 0, 4 → 0 visited → go to 4

➤ Now at 4: printAllPath(graph, vis, 4, "024", 5)
Neighbors = 2, 3, 5

Go to 3 → printAllPath(graph, vis, 3, "0243", 5)
Neighbors = 1, 4, 5

1, 4 visited → go to 5

🎉 Target reached → print 02435

Backtrack → now from 4 to 5 directly:
java
Copy
Edit
printAllPath(graph, vis, 5, "0245", 5)
🎉 Target reached → print 0245

✅ Final Printed Paths:
yaml
Copy
Edit
01345
0135
02435
0245
🚨 Correction Needed in Your Code
You have a mistake in edge creation:

java
Copy
Edit
graph[5].add(new Edge(6,5));  // ❌ wrong, this should go in graph[6]
🔧 Fix it:

java
Copy
Edit
graph[6].add(new Edge(6, 5)); // ✅ correct
✅ Summary of Key Points
Step	Description
🔁	DFS used to explore all paths
🧠	vis[] ensures we don't revisit nodes
🎯	Stops exactly at tar and prints
↩️	Backtracks using vis[curr] = false after recursion
💥	Any path reaching target is printed

Let me know if you want:

To collect all paths in a List<List<Integer>>

To print only the shortest path

To count number of paths

I'll help instantly.*/