package com.interviewQuestion_DSA_Java.Graph_38;

import java.util.ArrayList;

public class CycleDetectionInDirectedGraph {
    static class Edge{
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1,0));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 0));
//        graph[3].add(new Edge(3, 0)); false show
    }
    // Function to detect cycle in an undirected graph
    public static boolean isCycleDirected(ArrayList<Edge> graph[],  boolean visited[], int curr,  boolean rec[]) {
        visited[curr] = true;
        rec[curr] = true;

       for(int i=0; i<graph[curr].size(); i++){
           Edge e = graph[curr].get(i);
           if(rec[e.dest]){
               return true; // Cycle detected
           }else if(!visited[e.dest]) {
               if(isCycleDirected(graph, visited, e.dest, rec)) {
                   return true; // Cycle detected in the recursive call
               }
           }
       }
        rec[curr] = false; // Backtrack
        return false; // No cycle detected
    }
    public static void main(String[] args) {
        int V = 4; // Number of vertices

        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        boolean visited[] = new boolean[V];
        boolean rec[] = new boolean[V];

        boolean cycleFound = false;
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (isCycleDirected(graph, visited, i, rec)) {
                    cycleFound = true;
                    break;
                }
            }
        }

        System.out.println(cycleFound); // Will print true or false correctly now
    }
}
