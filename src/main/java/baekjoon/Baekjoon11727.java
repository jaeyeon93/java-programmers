package baekjoon;

import java.util.Scanner;

public class Baekjoon11727 {
    public static Integer solution(int n) {
        int [] arr = new int[1001];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++)
            arr[i] = (arr[i-1] + 2*arr[i-2]) % 10007;
        return arr[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.nextInt()));
    }
}
