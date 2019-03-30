package baekjoon;

import java.util.Scanner;

public class Baekjoon1193 {
    public static String solution(int n, int count, int sum, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append((sum-i-1));
        sb.append("/");
        sb.append(i);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 2;
        int count = 0;
        while (count != n) {
            for (int i = 1; i < sum-1; i++) {
                solution(n, count, sum, i);
                count++;
                if (count == n) {
                    System.out.println(solution(n, count, sum, i));
                    break;
                }
            }
            sum++;

        }
    }
}
