package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Baekjoon11651 {
    private static class Point implements Comparable<Point> {
        private int x;
        private int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }


        @Override
        public int compareTo(Point p) {
            if (this.y > p.y) {
                return 1;
            } else if (this.y == p.y){
                if (this.x > p.x)
                    return 1;
                return -1;
            }
            return -1;
        }

        @Override
        public String toString() {
            return x + " " + y;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < count; i++)
            points.add(new Point(sc.nextInt(), sc.nextInt()));
        Collections.sort(points);
        for (Point p : points)
            System.out.println(p.toString());

    }
}
