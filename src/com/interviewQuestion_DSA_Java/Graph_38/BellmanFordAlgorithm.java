package com.interviewQuestion_DSA_Java.Graph_38;

import java.util.ArrayList;

public class BellmanFordAlgorithm {

    /*
     * Bellman-Ford Algorithm
     * ----------------------
     * - Used to find shortest path from a single source to all other vertices.
     * - Works with negative weights also.
     * - Detects negative weight cycles (unlike Dijkstra).
     * - Time Complexity: O(V * E) where V = vertices, E = edges.
     */

    // Step 1: Create Edge structure
    static class Edge {
        int source;
        int destination;
        int weight;

        Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    // Step 2: Create Graph with weighted edges
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Adding edges (source, destination, weight)
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));
    }

    // Step 3: Bellman-Ford Algorithm
    public static void bellmanFord(ArrayList<Edge>[] graph, int source, int V) {
        int[] distance = new int[V];

        // Step 3.1: Initialize distances to infinity
        for (int i = 0; i < V; i++) {
            distance[i] = Integer.MAX_VALUE;
        }
        distance[source] = 0; // Distance from source to itself is 0

        // Step 3.2: Relax all edges V-1 times
        // Each relaxation tries to improve the distance
        for (int k = 0; k < V - 1; k++) {
            for (int i = 0; i < V; i++) {
                for (Edge edge : graph[i]) {
                    int u = edge.source;
                    int v = edge.destination;
                    int w = edge.weight;

                    if (distance[u] != Integer.MAX_VALUE && distance[u] + w < distance[v]) {
                        distance[v] = distance[u] + w; // Relaxation step
                    }
                }
            }
        }

        // Step 3.3: Check for Negative Weight Cycles
        for (int i = 0; i < V; i++) {
            for (Edge edge : graph[i]) {
                int u = edge.source;
                int v = edge.destination;
                int w = edge.weight;

                if (distance[u] != Integer.MAX_VALUE && distance[u] + w < distance[v]) {
                    System.out.println("Graph contains a Negative Weight Cycle!");
                    return;
                }
            }
        }

        // Step 3.4: Print Final Shortest Distances
        System.out.println("Vertex\tDistance from Source (" + source + ")");
        for (int i = 0; i < V; i++) {
            System.out.println(i + "\t\t" + distance[i]);
        }
    }

    // Step 4: Driver Function
    public static void main(String[] args) {
        int V = 5; // Number of vertices
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);
        bellmanFord(graph, 0, V);
    }
}
/*Great—let’s dry run your Bellman–Ford exactly as written (directed graph, V = 5, source = 0).

Graph (from createGraph)

Edges in traversal order (because you iterate i = 0..4 and then each list):

0 → 1 ( +2 )

0 → 2 ( +4 )

1 → 2 ( −4 )

2 → 3 ( +2 )

3 → 4 ( +4 )

4 → 1 ( −1 )

Initialization
distance = [0, ∞, ∞, ∞, ∞]   // set by loop; then distance[source]=0

Pass 1 of (V−1) = 4 relaxation passes (k = 0)

Start: [0, ∞, ∞, ∞, ∞]

0→1(+2):

0 + 2 < ∞ → update distance[1] = 2

[0, 2, ∞, ∞, ∞]

0→2(+4):

0 + 4 < ∞ → update distance[2] = 4

[0, 2, 4, ∞, ∞]

1→2(−4):

2 − 4 = −2 < 4 → update distance[2] = −2

[0, 2, −2, ∞, ∞]

2→3(+2):

−2 + 2 = 0 < ∞ → update distance[3] = 0

[0, 2, −2, 0, ∞]

3→4(+4):

0 + 4 = 4 < ∞ → update distance[4] = 4

[0, 2, −2, 0, 4]

4→1(−1):

4 − 1 = 3 < 2 → no update

End of pass 1:
[0, 2, −2, 0, 4]

Pass 2 (k = 1)

Start: [0, 2, −2, 0, 4]

0→1(+2): 0+2 = 2 < 2 → no

0→2(+4): 0+4 = 4 < −2 → no

1→2(−4): 2−4 = −2 < −2 → no

2→3(+2): −2+2 = 0 < 0 → no

3→4(+4): 0+4 = 4 < 4 → no

4→1(−1): 4−1 = 3 < 2 → no

No changes.

End of pass 2:
[0, 2, −2, 0, 4]

Pass 3 (k = 2)

Exact same checks; no updates.

End of pass 3:
[0, 2, −2, 0, 4]

Pass 4 (k = 3)

Exact same checks; no updates.

End of pass 4 (final distances before cycle check):
[0, 2, −2, 0, 4]

Negative-weight cycle check (one more scan of all edges)

With distance = [0, 2, −2, 0, 4]:

0→1: 0+2 = 2 < 2 → no

0→2: 0+4 = 4 < −2 → no

1→2: 2−4 = −2 < −2 → no

2→3: −2+2 = 0 < 0 → no

3→4: 0+4 = 4 < 4 → no

4→1: 4−1 = 3 < 2 → no

No improving edge → no negative cycle.

What the program prints
Vertex  Distance from Source (0)
0       0
1       2
2       -2
3       0
4       4

Intuition for the shortest distances

To 1: 0→1 = 2

To 2: 0→1→2 = 2 + (−4) = −2 (better than direct 4)

To 3: 0→1→2→3 = 2 − 4 + 2 = 0

To 4: 0→1→2→3→4 = 2 − 4 + 2 + 4 = 4

Note: The cycle 1→2→3→4→1 has total weight −4 + 2 + 4 − 1 = +1 (positive), so it doesn’t cause a negative cycle.

If you want, I can add a parent[] array to reconstruct and print the actual shortest path to each vertex along with these distances.*/