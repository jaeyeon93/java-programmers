package baekjoon;

import java.util.Scanner;

public class Baekjoon6359 {
    // 짝수번에 잠고, 홀수번에 연대.
    public static Integer solution(int n) {
        boolean [] arr = new boolean[n+1];
        arr[0] = false;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                for (int j = 1; i*j <= n; j++)
                    if (arr[i*j])
                        arr[i*j] = false;
                    else
                        arr[i*j] = true;
            } else {
                for (int j = 1; i*j <= n; j++)
                    if (arr[i*j])
                        arr[i*j] = false;
                    else
                        arr[i*j] = true;
            }
        }
        int count = 0;
        for (Boolean i : arr)
            if (i)
                count++;
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++)
            System.out.println(solution(sc.nextInt()));
    }
}
