package com.interviewQuestion_DSA_Java.Graph_19;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstras_Algorithm {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,3,7));
        graph[1].add(new Edge(1,2,1));

        graph[2].add(new Edge(2,4,3));

        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));
    }

    public static class Pair implements Comparable<Pair>{
        int node;
        int dist;

        public Pair(int node, int dist){
            this.node = node;
            this.dist = dist;
        }

        @Override
        public int compareTo(Pair p2){
            return this.dist - p2.dist; // ascending
            //return p2.dist - this.dist //descending
        }
    }

    //O(E + E longV)
    public static void dijkstra(ArrayList<Edge> graph[], int src,int V){
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int dist[] = new int[V];

        for(int i=0; i<V; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        boolean vis[] = new boolean[V];
        pq.add(new Pair(0,0));

        while (!pq.isEmpty()){
            Pair curr = pq.remove(); // shortest
            if(!vis[curr.node]){
                vis[curr.node] = true;

                for (int i=0; i<graph[curr.node].size();i++){
                    Edge edge = graph[curr.node].get(i);
                    int u = edge.src;
                    int v = edge.dest;
                    if(dist[u] + edge.wt < dist[v]){ //relaxation
                        dist[v] = dist[u] + edge.wt;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }
        for (int i=0; i<V; i++){
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
    int V = 6;

    ArrayList<Edge> graph[] = new ArrayList[V];
    createGraph(graph);

    dijkstra(graph, 0, V);
    }
}
/*🔍 Deep dry run (step-by-step) — graph and initial state
Graph (directed edges as in your code):

0 → 1 (2)

0 → 2 (4)

1 → 3 (7)

1 → 2 (1)

2 → 4 (3)

3 → 5 (1)

4 → 3 (2)

4 → 5 (5)

Notation used below

dist = current distance array (index = node). INF = Integer.MAX_VALUE.

pq = priority queue contents shown as (node, dist) ordered by dist ascending.

vis = visited boolean array (T = true, F = false).

Initial

src = 0

dist = [0, INF, INF, INF, INF, INF]

vis = [F, F, F, F, F, F]

pq = [(0,0)]

Iteration 1 — pop (0,0)
Pop smallest: (0,0). u = 0. Mark vis[0] = T.

Process neighbors of 0:

Edge 0 → 1 (2): compute 0 + 2 = 2. Since 2 < INF, set dist[1] = 2 and pq.add((1,2)).

Edge 0 → 2 (4): compute 0 + 4 = 4. Since 4 < INF, set dist[2] = 4 and pq.add((2,4)).

After Iteration 1

dist = [0, 2, 4, INF, INF, INF]

vis = [T, F, F, F, F, F]

pq = [(1,2), (2,4)]

Iteration 2 — pop (1,2)
Pop (1,2). u = 1. Mark vis[1] = T.

Neighbors of 1:

Edge 1 → 3 (7): 2 + 7 = 9. 9 < INF → dist[3] = 9, pq.add((3,9)).

Edge 1 → 2 (1): 2 + 1 = 3. 3 < dist[2] (4) → update dist[2] = 3, pq.add((2,3)).

After Iteration 2

dist = [0, 2, 3, 9, INF, INF]

vis = [T, T, F, F, F, F]

pq now contains the entries: [(2,3), (2,4), (3,9)]

Note: (2,4) is the old entry; duplicates are expected.

Iteration 3 — pop (2,3)
Pop (2,3). u = 2. Mark vis[2] = T.

Neighbors of 2:

Edge 2 → 4 (3): 3 + 3 = 6. 6 < INF → dist[4] = 6, pq.add((4,6)).

After Iteration 3

dist = [0, 2, 3, 9, 6, INF]

vis = [T, T, T, F, F, F]

pq = [(2,4), (3,9), (4,6)]

Iteration 4 — pop (2,4)
Pop (2,4) — but vis[2] is already true, so we skip this entry.

(This is why we have the if (vis[u]) continue; guard. Old/duplicate PQ entries are ignored.)

State unchanged

dist = [0, 2, 3, 9, 6, INF]

pq = [(4,6), (3,9)]

Iteration 5 — pop (4,6)
Pop (4,6). u = 4. Mark vis[4] = T.

Neighbors of 4:

Edge 4 → 3 (2): 6 + 2 = 8. 8 < dist[3] (9) → update dist[3] = 8, pq.add((3,8)).

Edge 4 → 5 (5): 6 + 5 = 11. 11 < INF → dist[5] = 11, pq.add((5,11)).

After Iteration 5

dist = [0, 2, 3, 8, 6, 11]

vis = [T, T, T, F, T, F]

pq = [(3,8), (3,9), (5,11)]

Iteration 6 — pop (3,8)
Pop (3,8). u = 3. Mark vis[3] = T.

Neighbors of 3:

Edge 3 → 5 (1): 8 + 1 = 9. 9 < dist[5] (11) → update dist[5] = 9, pq.add((5,9)).

After Iteration 6

dist = [0, 2, 3, 8, 6, 9]

vis = [T, T, T, T, T, F]

pq = [(3,9), (5,11), (5,9)]

Iteration 7 — pop (3,9)
Pop (3,9). vis[3] already true → skip.

pq now [(5,9), (5,11)]

Iteration 8 — pop (5,9)
Pop (5,9). u = 5. Mark vis[5] = T.

Node 5 has no outgoing edges (in your graph), so nothing to relax.

After Iteration 8

dist = [0, 2, 3, 8, 6, 9]

vis = [T, T, T, T, T, T]

pq still has (5,11) — pop it and skip because vis[5] is true. Then PQ empty → finish.

✔ Final result (printed by program)
Copy
Edit
0 2 3 8 6 9
This is the shortest distance from node 0 to nodes 0..5 respectively.

📝 Notes & tips
Why duplicates in the PQ? When we find a better distance for a node we push a new (node, newDist). The old tuple stays in the PQ. We handle that by checking if (vis[u]) continue; when popping.

Why check dist[u] != INF before relaxing? To avoid overflow when adding weight to INF.

Complexity: O(E log V) with binary heap (PriorityQueue).

Improvements: If you also want the actual shortest path (not just distances), keep a parent[] array and update parent[v] = u on relaxations.

If you want, I can:

produce a version that prints the step-by-step trace at runtime (prints pq / dist each step), or

add parent array logic to reconstruct the shortest path from src to any node.

Which one would you like next?









Ask ChatGPT

*/