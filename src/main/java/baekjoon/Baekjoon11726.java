package baekjoon;

import java.util.Scanner;

// https://www.acmicpc.net/problem/11726
public class Baekjoon11726 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 2*n의 직사각형
        int [] d = new int[1001]; // 2*0도 포함
        d[0] = 1; // 2* 0의 경우의수
        d[1] = 1; // 2*1의 경우의수
        // case1 세로블록을 놓는경우 면적 2*(n-1)
        // case2 가로블록을 놓는경우 면적 2*(n-2)
        for (int i = 2; i <= n; i++) {
            d[i] = d[i-1] + d[i-2];
            d[i] %= 10007;
        }
        System.out.println(d[n]);
    }
}
