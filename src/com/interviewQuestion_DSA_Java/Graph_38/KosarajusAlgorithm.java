package com.interviewQuestion_DSA_Java.Graph_38;

import java.util.ArrayList;
import java.util.Stack;

public class KosarajusAlgorithm {
    // Step 1: Create Edge class
    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    // Step 2: Create Graph
    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        // Directed graph
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));
    }

    // Step 3: Topological Sort using DFS
    public static void topSort(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> s) {
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge edge = graph[curr].get(i);
            if (!vis[edge.dest]) {
                topSort(graph, edge.dest, vis, s);   // FIXED (was curr before)
            }
        }
        s.push(curr); // store in stack after visiting all neighbours
    }

    // Step 4: Normal DFS
    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]) {
        vis[curr] = true;
        System.out.print(curr + " ");

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge edge = graph[curr].get(i);
            if (!vis[edge.dest]) {
                dfs(graph, edge.dest, vis);
            }
        }
    }

    // Step 5: Kosaraju’s Algorithm
    public static void kosarajuAlgo(ArrayList<Edge> graph[], int V) {
        // 1. Perform Topological Sort
        Stack<Integer> stack = new Stack<>();
        boolean vis[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                topSort(graph, i, vis, stack);
            }
        }

        // 2. Create Transpose graph
        ArrayList<Edge> transpose[] = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            transpose[i] = new ArrayList<Edge>();
        }

        // Reverse all edges for transpose
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                transpose[e.dest].add(new Edge(e.dest, e.src));  // reverse edge
            }
        }

        // 3. Run DFS according to stack order on transpose graph
        vis = new boolean[V]; // reset visited
        while (!stack.isEmpty()) {
            int curr = stack.pop();
            if (!vis[curr]) {
                dfs(transpose, curr, vis);
                System.out.println(); // one SCC printed in a line
            }
        }
    }

    // Step 6: Main method
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        System.out.println("Strongly Connected Components (SCCs):");
        kosarajuAlgo(graph, V);
    }
}
