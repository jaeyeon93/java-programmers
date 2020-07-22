package baekjoon;

import java.util.Scanner;

public class Baekjoon1748 {
    public static float solution(int n) {
        float num = 0;
        int [] arr = new int[n+1];
        for (int i = 1; i <= n; i++)
            arr[i] = (int)Math.log10(i)+1;

        for (int i = 1; i <= n; i++)
            num += arr[i];
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}
