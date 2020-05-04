package baekjoon;

import java.util.Scanner;

// https://www.acmicpc.net/problem/10539
public class Baekjoon10539 {
    public static int [] solution(int n , int [] b) {
        int [] a = new int[101];
        if (b.length == 1) {
            a[1] = b[1];
            return a;
        }
        for (int i = n; i-1 >= 0; i--)
            a[i] = b[i]*i - b[i-1]*(i-1);
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String [] inputs = sc.nextLine().split(" ");

        int [] b = new int[101];
        for (int i = 0; i < inputs.length; i++) {
            b[i+1] = Integer.parseInt(inputs[i]);
        }

        int [] result = solution(n, b);

        for (int i = 1; i <= n; i++)
            System.out.print(result[i] + " ");
    }
}
