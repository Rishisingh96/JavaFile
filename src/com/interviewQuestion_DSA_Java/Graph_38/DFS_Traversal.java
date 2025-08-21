package com.interviewQuestion_DSA_Java.Graph_38;

public class DFS_Traversal {
    public static void main(String[] args) {
        // Example usage
        int[][] graph = {
            {0, 1, 0, 0, 1},
            {1, 0, 1, 0, 0},
            {0, 1, 0, 1, 0},
            {0, 0, 1, 0, 1},
            {1, 0, 0, 1, 0}
        };
        boolean[] visited = new boolean[graph.length];
        dfs(graph, visited, 0);
    }

    public static void dfs(int[][] graph, boolean[] visited, int node) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int i = 0; i < graph[node].length; i++) {
            if (graph[node][i] == 1 && !visited[i]) {
                dfs(graph, visited, i);
            }
        }
    }
}
