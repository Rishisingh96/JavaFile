package com.interviewQuestion_DSA_Java.Graph_38;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstras_Algorithm {

    /*
     * Dijkstra's Algorithm
     * ----------------------
     * - Finds shortest path from a single source to all other vertices.
     * - Works only with NON-negative edge weights.
     * - Uses Greedy approach + PriorityQueue (min-heap).
     * - Time Complexity: O((V + E) log V)
     */

    // Step 1: Edge class
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    // Step 2: Graph creation
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Adding edges (src, dest, weight)
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    // Step 3: Pair class for PriorityQueue (min-heap)
    public static class Pair implements Comparable<Pair> {
        int node;
        int dist;

        public Pair(int node, int dist) {
            this.node = node;
            this.dist = dist;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.dist - p2.dist; // ascending order (min-heap)
        }
    }

    // Step 4: Dijkstra’s Algorithm
    public static void dijkstra(ArrayList<Edge>[] graph, int src, int V) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(); // min-heap based on distance
        int[] dist = new int[V]; // store shortest distance from src
        boolean[] vis = new boolean[V]; // visited set

        // Step 4.1: Initialize distances
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE; // set all distances to infinity
        }
        dist[src] = 0; // distance from source to itself = 0

        // Step 4.2: Push source to PQ
        pq.add(new Pair(src, 0));

        // Step 4.3: Process PQ
        while (!pq.isEmpty()) {
            Pair curr = pq.remove(); // pick node with smallest distance

            if (!vis[curr.node]) {
                vis[curr.node] = true; // mark visited

                // Step 4.4: Explore neighbors
                for (Edge edge : graph[curr.node]) {
                    int u = edge.src;
                    int v = edge.dest;
                    int w = edge.wt;

                    // Relaxation step
                    if (dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v]) {
                        dist[v] = dist[u] + w;
                        pq.add(new Pair(v, dist[v])); // push updated distance to PQ
                    }
                }
            }
        }

        // Step 4.5: Print final shortest distances
        System.out.println("Vertex\tDistance from Source (" + src + ")");
        for (int i = 0; i < V; i++) {
            System.out.println(i + "\t\t" + dist[i]);
        }
    }

    // Step 5: Driver Code
    public static void main(String[] args) {
        int V = 6; // number of vertices
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);
        dijkstra(graph, 0, V); // run Dijkstra from source 0
    }
}
/*Awesome—let’s dry run your Dijkstra step-by-step on the exact graph and code you posted (directed edges, source = 0, V = 6).

Graph (directed)

0→1(2), 0→2(4)
1→3(7), 1→2(1)
2→4(3)
4→3(2), 4→5(5)
3→5(1)

Initialization

dist = [0, ∞, ∞, ∞, ∞, ∞]

vis = [F, F, F, F, F, F]

pq = [(0, 0)] // (node, distance)

Iteration 1

Pop (0, 0) → smallest distance node = 0

vis[0] = T

Explore neighbors of 0:

Edge 0→1 (2)

Check: dist[0] + 2 < dist[1] → 0 + 2 < ∞ ✅

Update: dist[1] = 2, push (1, 2)

Edge 0→2 (4)

Check: 0 + 4 < ∞ ✅

Update: dist[2] = 4, push (2, 4)

State now

dist = [0, 2, 4, ∞, ∞, ∞]

pq = [(1,2), (2,4)]

Iteration 2

Pop (1, 2)

vis[1] = T

Explore neighbors of 1:

Edge 1→3 (7)

Check: 2 + 7 < ∞ ✅

Update: dist[3] = 9, push (3, 9)

Edge 1→2 (1)

Check: 2 + 1 < 4 → 3 < 4 ✅

Update: dist[2] = 3, push (2, 3)

State now

dist = [0, 2, 3, 9, ∞, ∞]

pq = [(2,3), (2,4), (3,9)]
(Min-heap will pop (2,3) next)

Iteration 3

Pop (2, 3)

vis[2] = T

Explore neighbors of 2:

Edge 2→4 (3)

Check: 3 + 3 < ∞ ✅

Update: dist[4] = 6, push (4, 6)

State now

dist = [0, 2, 3, 9, 6, ∞]

pq = [(2,4), (3,9), (4,6)]

Iteration 4

Pop (2, 4)

Skip (because vis[2] is already T) → this is a stale entry from before dist[2] improved to 3.

State now

dist = [0, 2, 3, 9, 6, ∞]

pq = [(4,6), (3,9)]

Iteration 5

Pop (4, 6)

vis[4] = T

Explore neighbors of 4:

Edge 4→3 (2)

Check: 6 + 2 < 9 → 8 < 9 ✅

Update: dist[3] = 8, push (3, 8)

Edge 4→5 (5)

Check: 6 + 5 < ∞ ✅

Update: dist[5] = 11, push (5, 11)

State now

dist = [0, 2, 3, 8, 6, 11]

pq = [(3,8), (3,9), (5,11)]

Iteration 6

Pop (3, 8)

vis[3] = T

Explore neighbors of 3:

Edge 3→5 (1)

Check: 8 + 1 < 11 → 9 < 11 ✅

Update: dist[5] = 9, push (5, 9)

State now

dist = [0, 2, 3, 8, 6, 9]

pq = [(3,9), (5,11), (5,9)]

Iteration 7

Pop (3, 9)

Skip (stale; vis[3] already T)

State now

pq = [(5,9), (5,11)]

Iteration 8

Pop (5, 9)

vis[5] = T

Node 5 has no outgoing edges → nothing to relax.

State now

pq = [(5,11)]

Iteration 9

Pop (5, 11)

Skip (stale; vis[5] already T)

PQ empty → DONE

Final shortest distances from source 0
Vertex : 0  1  2  3  4  5
Dist   : 0  2  3  8  6  9

Intuition for the shortest paths (not printed by code, but helpful)

To 1: 0→1 (2)

To 2: 0→1→2 (2 + 1 = 3) beats 0→2 (4)

To 4: 0→1→2→4 (2 + 1 + 3 = 6)

To 3: 0→1→2→4→3 (2 + 1 + 3 + 2 = 8) beats 0→1→3 (9)

To 5: 0→1→2→4→3→5 (2 + 1 + 3 + 2 + 1 = 9)

Why did some PQ entries get “skipped”?

When a better distance to a node is found, you push the new pair (node, betterDist) into the PQ; the old, worse pair is still inside. When that old pair later pops, the vis[node] is already true (processed with the best known distance), so the code skips it. This is a normal, correct optimization pattern.

If you want, I can add a small parent[] array to your code so you can also print the actual shortest path to each node along with distances.*/