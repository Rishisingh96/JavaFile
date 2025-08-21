package com.interviewQuestion_DSA_Java.Graph_38;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_TraversalMethod2 {
    static class Edge {
        int src; //source (3
        int dest; // destination(5 = (3,5)

        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
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

        graph[3].add(new Edge(4,2));
        graph[3].add(new Edge(4,4));
        graph[3].add(new Edge(4,6));

        graph[3].add(new Edge(6,5));
    }

    public static void bfs(ArrayList<Edge>[] graph, int V, boolean[] vis,int start){
        Queue<Integer> q = new LinkedList<>();
//        boolean vis[] = new boolean[V];
        q.add(start);

        while (!q.isEmpty()){
            int curr = q.remove();
            if(vis[curr] == false){
                System.out.print(curr + " ");
                vis[curr] = true;

                for (int i=0; i<graph[curr].size(); i++){
                    Edge edge = graph[curr].get(i);
                    q.add(edge.dest);
                }
            }
        }
    }

    public static void main(String[] args) {
    int v = 7;
    /*

    */
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);

        boolean vis[] = new boolean[v];
       for (int i=0; i<v; i++){
           if(vis[i] == false){
               bfs(graph, v, vis, i);
           }
       }
        System.out.println();
    }
}
