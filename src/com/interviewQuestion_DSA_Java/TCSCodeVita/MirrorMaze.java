package com.interviewQuestion_DSA_Java.TCSCodeVita;

import java.util.*;

public class MirrorMaze {

    private static int M, N;
    private static char[][] grid;
    private static int maxLoop = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();
        sc.nextLine(); // Consume the newline after the grid dimensions

        // Initialize the grid
        grid = new char[M][N];
        for (int i = 0; i < M; i++) {
            String[] row = sc.nextLine().split(" ");
            for (int j = 0; j < N; j++) {
                grid[i][j] = row[j].charAt(0);
            }
        }
        sc.close();

        // Try starting from each non-empty cell and trace the path in all 4 possible directions
        for (int r = 0; r < M; r++) {
            for (int c = 0; c < N; c++) {
                if (grid[r][c] != '0') { // If the cell is not empty
                    for (int dir = 0; dir < 4; dir++) {
                        tracePath(r, c, dir);
                    }
                }
            }
        }

        // Output the maximum loop length found
        System.out.println(maxLoop);
    }

    private static void tracePath(int startR, int startC, int startDir) {
        int r = startR;
        int c = startC;
        int dir = startDir;
        int count = 0;
        Set<String> path = new HashSet<>();

        // Move through the grid until we go out of bounds or hit an empty cell
        while (r >= 0 && r < M && c >= 0 && c < N) {
            String state = r + "," + c + "," + dir;
            if (path.contains(state)) {
                // If we revisit the same state, check if it's the start point and direction
                if (r == startR && c == startC && dir == startDir) {
                    maxLoop = Math.max(maxLoop, count);
                }
                return;
            }
            path.add(state);
            count++;

            // Process the mirror at the current position and change direction
            char mirror = grid[r][c];
            if (mirror == '/') {
                if (dir == 0) dir = 3; // East -> North
                else if (dir == 1) dir = 2; // South -> West
                else if (dir == 2) dir = 1; // West -> South
                else if (dir == 3) dir = 0; // North -> East
            } else if (mirror == '\\') {
                if (dir == 0) dir = 1; // East -> South
                else if (dir == 1) dir = 0; // South -> East
                else if (dir == 2) dir = 3; // West -> North
                else if (dir == 3) dir = 2; // North -> West
            } else {
                return; // Hit an empty cell ('0'), path ends here
            }

            // Move in the current direction
            int[] dr = {0, 1, 0, -1}; // Directions: East, South, West, North
            int[] dc = {1, 0, -1, 0};

            r += dr[dir];
            c += dc[dir];
        }
    }
}
