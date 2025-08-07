package com.interviewQuestion_DSA_Java.Graph_19;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DFS_TraversalMethodByMam {

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
        graph[4].add(new Edge(4,6));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,6));

        graph[6].add(new Edge(6,4));
        graph[6].add(new Edge(6,5));
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

    public static void main(String[] args) {
        int v = 7;
        /*

     1 —— 3
   /      \
  0        5 —— 6
   \      /
     2—— 4


        */
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);

        boolean[] vis = new boolean[v];
        System.out.print("DFS Traversal: ");
        dfs(graph, vis, 0);

        System.out.println();

        // Resetting visited array for BFS
        vis = new boolean[v];
        System.out.print("BFS Traversal: ");
        bfs(graph, v, vis, 0);
    }
}
/*Sure Rishi! Let’s do a complete dry run step-by-step of both DFS and BFS using your graph structure and this code.

🔍 Graph Structure (from your code)
Let’s first draw the graph correctly based on your createGraph() method:

markdown
Copy
Edit
      1 —— 3 —— 5
     /     |     \
    0      4 —— 6
     \     /
       2
🟦 Adjacency List (Undirected Graph):
rust
Copy
Edit
0 -> 1, 2
1 -> 0, 3
2 -> 0, 4
3 -> 1, 4, 5
4 -> 2, 3, 6
5 -> 3, 6
6 -> 4, 5
🔁 Step-by-Step DFS Dry Run (Starting from node 0)
Initial:
vis[] = [false, false, false, false, false, false, false]

dfs(graph, vis, 0)

DFS Stack Recursion Path:
arduino
Copy
Edit
dfs(0)
→ print 0, vis[0] = true
→ edge.dest = 1 → dfs(1)
    → print 1, vis[1] = true
    → edge.dest = 0 (already visited)
    → edge.dest = 3 → dfs(3)
        → print 3, vis[3] = true
        → edge.dest = 1 (visited)
        → edge.dest = 4 → dfs(4)
            → print 4, vis[4] = true
            → edge.dest = 2 → dfs(2)
                → print 2, vis[2] = true
                → edge.dest = 0 (visited)
                → edge.dest = 4 (visited)
            → edge.dest = 3 (visited)
            → edge.dest = 6 → dfs(6)
                → print 6, vis[6] = true
                → edge.dest = 4 (visited)
                → edge.dest = 5 → dfs(5)
                    → print 5, vis[5] = true
                    → edge.dest = 3 (visited)
                    → edge.dest = 6 (visited)
✅ DFS Final Output:
yaml
Copy
Edit
DFS Traversal: 0 1 3 4 2 6 5
🔁 Step-by-Step BFS Dry Run (Starting from node 0)
Initial:
vis[] = [false, false, false, false, false, false, false]

Queue: [0]

BFS Execution:
Queue: [0]
→ curr = 0 → print 0
→ mark vis[0] = true
→ enqueue 1, 2 → Queue: [1, 2]

Queue: [1, 2]
→ curr = 1 → print 1
→ mark vis[1] = true
→ enqueue 3 → Queue: [2, 3]

Queue: [2, 3]
→ curr = 2 → print 2
→ mark vis[2] = true
→ enqueue 4 → Queue: [3, 4]

Queue: [3, 4]
→ curr = 3 → print 3
→ mark vis[3] = true
→ enqueue 5 (4 already enqueued) → Queue: [4, 5]

Queue: [4, 5]
→ curr = 4 → print 4
→ mark vis[4] = true
→ enqueue 6 → Queue: [5, 6]

Queue: [5, 6]
→ curr = 5 → print 5
→ mark vis[5] = true
→ 6 already enqueued → Queue: [6]

Queue: [6]
→ curr = 6 → print 6
→ mark vis[6] = true
→ Queue becomes empty

✅ BFS Final Output:
yaml
Copy
Edit
BFS Traversal: 0 1 2 3 4 5 6
✅ Summary
Traversal	Order
DFS	0 1 3 4 2 6 5
BFS	0 1 2 3 4 5 6

Would you like me to prepare a PDF dry run version with step tables and graph illustration?*/