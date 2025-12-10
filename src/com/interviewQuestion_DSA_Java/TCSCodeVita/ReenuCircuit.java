package com.interviewQuestion_DSA_Java.TCSCodeVita;

import java.util.*;

public class ReenuCircuit {

    static char[][] circuit;
    static int n;
    static int startRow, startCol, endRow, endCol;
    static final double R_UNIT = 1.0;
    static final double R_JUNC = 0.0;
    static boolean[][] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        circuit = new char[n][n];
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < n; j++) {
                circuit[i][j] = line.charAt(j);
                if (circuit[i][j] == '.') {
                    if (startRow == 0 && startCol == 0) {
                        startRow = i;
                        startCol = j;
                    } else {
                        endRow = i;
                        endCol = j;
                    }
                }
            }
        }

        visited = new boolean[n][n];
        double totalResistance = calculateResistance(startRow, startCol, -1, -1);
        System.out.println((int) Math.round(totalResistance));
    }

    private static double calculateResistance(int r, int c, int prevR, int prevC) {
        if (r == endRow && c == endCol) {
            return 0;
        }

        visited[r][c] = true;

        List<int[]> neighbors = getNeighbors(r, c);
        List<double[]> branches = new ArrayList<>();

        for (int[] neighbor : neighbors) {
            int nr = neighbor[0];
            int nc = neighbor[1];
            if (nr == prevR && nc == prevC) continue;

            if (!visited[nr][nc]) {
                branches.add(new double[]{nr, nc});
            }
        }

        if (branches.isEmpty()) {
            return 0;
        }

        if (branches.size() == 1) {
            int nr = (int) branches.get(0)[0];
            int nc = (int) branches.get(0)[1];
            double resistance = getResistance(r, c, nr, nc);
            return resistance + calculateResistance(nr, nc, r, c);
        } else {
            double parallelSum = 0;
            for (double[] branch : branches) {
                int nr = (int) branch[0];
                int nc = (int) branch[1];
                double resistance = getResistance(r, c, nr, nc);
                parallelSum += 1 / (resistance + calculateResistance(nr, nc, r, c));
            }
            return 1 / parallelSum;
        }
    }

    private static double getResistance(int r1, int c1, int r2, int c2) {
        if (circuit[r1][c1] == '+' || circuit[r2][c2] == '+') {
            return R_JUNC;
        }
        return R_UNIT;
    }

    private static List<int[]> getNeighbors(int r, int c) {
        List<int[]> neighbors = new ArrayList<>();
        char current = circuit[r][c];

        int[] dr = {0, 0, 1, -1};
        int[] dc = {1, -1, 0, 0};

        for (int i = 0; i < 4; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];

            if (nr >= 0 && nr < n && nc >= 0 && nc < n) {
                char neighborChar = circuit[nr][nc];
                if (current == '+') {
                    if (neighborChar != '.') neighbors.add(new int[]{nr, nc});
                } else if (current == '-' && (dr[i] == 0)) {
                    if (neighborChar == '-' || neighborChar == '+' || neighborChar == '.') neighbors.add(new int[]{nr, nc});
                } else if (current == '|' && (dc[i] == 0)) {
                    if (neighborChar == '|' || neighborChar == '+' || neighborChar == '.') neighbors.add(new int[]{nr, nc});
                } else if (current == '.') {
                    if (neighborChar == '+' ||
                            (neighborChar == '-' && dr[i] == 0) ||
                            (neighborChar == '|' && dc[i] == 0)) {
                        neighbors.add(new int[]{nr, nc});
                    }
                }
            }
        }
        return neighbors;
    }
}