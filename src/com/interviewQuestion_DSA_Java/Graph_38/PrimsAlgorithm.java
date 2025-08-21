package com.interviewQuestion_DSA_Java.Graph_38;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrimsAlgorithm {

    /*
     * Prim's Algorithm
     * ----------------
     * - Finds the Minimum Spanning Tree (MST) of a weighted graph.
     * - Works only with connected, undirected, weighted graphs.
     * - Uses Greedy approach + PriorityQueue (min-heap).
     * - Time Complexity: O(E log V)
     */

    // Step 1: Define Edge structure
    static class Edge {
        int src;
        int dest;
        int weight;

        Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    // Step 2: Create Graph
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Undirected weighted graph (bidirectional edges)
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }

    // Step 3: Pair class for PriorityQueue
    public static class Pair implements Comparable<Pair> {
        int node; // vertex
        int cost; // edge cost to reach this node

        public Pair(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost; // min-heap (ascending by cost)
        }
    }

    // Step 4: Prim’s Algorithm
    public static void primsAlgo(ArrayList<Edge>[] graph, int V) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(); // Min-heap
        boolean[] visited = new boolean[V]; // Track included vertices
        int mstCost = 0; // Final MST cost

        // Step 4.1: Start from vertex 0 with cost 0
        pq.add(new Pair(0, 0));

        // Step 4.2: Process until all vertices are visited
        while (!pq.isEmpty()) {
            Pair curr = pq.remove();

            // Skip if already visited
            if (!visited[curr.node]) {
                visited[curr.node] = true;       // Mark as included in MST
                mstCost += curr.cost;            // Add edge weight to MST cost

                // Step 4.3: Explore neighbors
                for (Edge e : graph[curr.node]) {
                    if (!visited[e.dest]) {
                        pq.add(new Pair(e.dest, e.weight));
                    }
                }
            }
        }

        // Step 4.4: Print MST cost
        System.out.println("Minimum Spanning Tree Cost: " + mstCost);
    }

    // Step 5: Driver Code
    public static void main(String[] args) {
        int V = 4; // Number of vertices
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);
        primsAlgo(graph, V);
    }
}
