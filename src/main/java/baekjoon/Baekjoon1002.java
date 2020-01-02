package baekjoon;

import java.util.Scanner;

public class Baekjoon1002 {
    private static class Point {
        int x;
        int y;
        int r;

        Point(int x, int y, int r) {
            this.x = x;
            this.y = y;
            this.r = r;
        }

        private double distance(Point other) {
            double temp = Math.pow((this.x - other.x), 2) + Math.pow((this.y - other.y), 2);
            return Math.pow(temp, 0.5);
        }
    }

    public static Integer solution(Point p1, Point p2) {
        double distance = p1.distance(p2);
        int rSum = Math.abs((p1.r + p2.r));
        int rSub = Math.abs(p1.r - p2.r);

        if (rSub < distance && rSum > distance)
            return 2;
        else if (distance != 0 && distance == rSub)
            return 1;
        else if (distance == rSum)
            return 1;
        else if (distance < rSub)
            return 0;
        else if (distance > rSum)
            return 0;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            String [] arr = sc.nextLine().split(" ");
            Point p1 = new Point(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
            Point p2 = new Point(Integer.parseInt(arr[3]), Integer.parseInt(arr[4]), Integer.parseInt(arr[5]));
            System.out.println(solution(p1, p2));
        }
    }
}
