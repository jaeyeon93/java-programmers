package baekjoon;

import java.util.Scanner;

public class Baekjoon11006 {
    public static String  solution(int n, int m) {
        StringBuilder sb = new StringBuilder();
        int proper = m*2;
        int abnormal = proper - n;
        sb.append(abnormal).append(" ");
        sb.append((m-abnormal));
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            String [] line = sc.nextLine().split(" ");
            System.out.println(solution(Integer.parseInt(line[0]), Integer.parseInt(line[1])));
        }
    }
}
