package com.interviewQuestion_DSA_Java.TCSCodeVita;

import java.util.*;

public class MagicStarsIntensity {

    static class Point {
        double x, y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Point point = (Point) obj;
            return Double.compare(point.x, x) == 0 && Double.compare(point.y, y) == 0;
        }
    }

    static class Line {
        double x1, y1, x2, y2;

        public Line(double x1, double y1, double x2, double y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
    }

    private static Point getIntersection(Line l1, Line l2) {
        double a1 = l1.y2 - l1.y1;
        double b1 = l1.x1 - l1.x2;
        double c1 = a1 * l1.x1 + b1 * l1.y1;

        double a2 = l2.y2 - l2.y1;
        double b2 = l2.x1 - l2.x2;
        double c2 = a2 * l2.x1 + b2 * l2.y1;

        double det = a1 * b2 - a2 * b1;
        if (det == 0) return null; // Parallel lines

        double x = (b2 * c1 - b1 * c2) / det;
        double y = (a1 * c2 - a2 * c1) / det;

        // Check if the intersection point lies on both line segments
        if (x < Math.min(l1.x1, l1.x2) - 1e-9 || x > Math.max(l1.x1, l1.x2) + 1e-9 ||
                y < Math.min(l1.y1, l1.y2) - 1e-9 || y > Math.max(l1.y1, l1.y2) + 1e-9 ||
                x < Math.min(l2.x1, l2.x2) - 1e-9 || x > Math.max(l2.x1, l2.x2) + 1e-9 ||
                y < Math.min(l2.y1, l2.y2) - 1e-9 || y > Math.max(l2.y1, l2.y2) + 1e-9) {
            return null;
        }

        // Ensure intersection is at a tile corner
        if (Math.abs(x - Math.round(x)) > 1e-9 || Math.abs(y - Math.round(y)) > 1e-9) {
            return null;
        }

        return new Point(x, y);
    }

    // Calculates the number of cells a line segment touches from a point to an endpoint.
    private static int calculateCells(Point start, Point end) {
        double dx = Math.abs(start.x - end.x);
        double dy = Math.abs(start.y - end.y);

        if (dx == 0) return (int) dy;
        if (dy == 0) return (int) dx;

        return (int) (dx + dy) / 2; // For diagonal lines where dx == dy
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Line[] lines = new Line[n];
        for (int i = 0; i < n; i++) {
            lines[i] = new Line(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        }
        int k = scanner.nextInt();

        Map<Point, List<Line>> intersectionMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                Point intersection = getIntersection(lines[i], lines[j]);
                if (intersection != null) {
                    intersectionMap.computeIfAbsent(intersection, p -> new ArrayList<>()).add(lines[i]);
                    intersectionMap.get(intersection).add(lines[j]);
                }
            }
        }

        long totalIntensity = 0;
        for (Map.Entry<Point, List<Line>> entry : intersectionMap.entrySet()) {
            Point starPoint = entry.getKey();

            // Use a Set to count unique lines intersecting at the point
            Set<Line> uniqueLines = new HashSet<>(entry.getValue());

            if (uniqueLines.size() == k) {
                int minIntensity = Integer.MAX_VALUE;
                for (Line line : uniqueLines) {
                    minIntensity = Math.min(minIntensity, calculateCells(new Point(line.x1, line.y1), starPoint));
                    minIntensity = Math.min(minIntensity, calculateCells(new Point(line.x2, line.y2), starPoint));
                }
                totalIntensity += minIntensity;
            }
        }
        System.out.println(totalIntensity);
        scanner.close();
    }
}