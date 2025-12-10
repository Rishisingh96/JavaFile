package com.interviewQuestion_DSA_Java.TCSCodeVita;

import java.util.*;

public class CountTheShapes {

    static Map<Point, Integer> pointMap;
    static int[] parent;
    static int[] rank;
    static int pointIdCounter;

    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    public static int find(int i) {
        if (parent[i] == i) {
            return i;
        }
        return parent[i] = find(parent[i]);
    }

    public static boolean union(int i, int j) {
        int rootI = find(i);
        int rootJ = find(j);
        if (rootI != rootJ) {
            if (rank[rootI] > rank[rootJ]) {
                parent[rootJ] = rootI;
            } else if (rank[rootI] < rank[rootJ]) {
                parent[rootI] = rootJ;
            } else {
                parent[rootJ] = rootI;
                rank[rootI]++;
            }
            return false;
        }
        return true;
    }

    public static int getPointId(int x, int y) {
        Point p = new Point(x, y);
        if (!pointMap.containsKey(p)) {
            pointMap.put(p, pointIdCounter);
            pointIdCounter++;
        }
        return pointMap.get(p);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        pointMap = new HashMap<>();
        pointIdCounter = 0;
        int maxPoints = 2 * n + 1;
        parent = new int[maxPoints];
        rank = new int[maxPoints];
        for (int i = 0; i < maxPoints; i++) {
            parent[i] = i;
            rank[i] = 0;
        }

        int cycleCount = 0;

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            int id1 = getPointId(x1, y1);
            int id2 = getPointId(x2, y2);

            if (union(id1, id2)) {
                cycleCount++;
            }
        }
        System.out.println(cycleCount);
        sc.close();
    }
}