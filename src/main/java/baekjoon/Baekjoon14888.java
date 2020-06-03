package baekjoon;

import java.util.Scanner;

public class Baekjoon14888 {
    private static int [] arr;
    private static int [] operator;
    private static int maxed = Integer.MIN_VALUE;
    private static int mined = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        operator = new int[4];
        for (int i = 0; i < n; i++) arr[i] =  sc.nextInt();
        for (int i = 0; i < 4; i++) operator[i] = sc.nextInt();

        solve(1, arr[0], operator[0], operator[1], operator[2], operator[3]);
        System.out.println(maxed);
        System.out.println(mined);
    }

    public static void solve(int index, int result, int plus, int minus, int mul, int div) {
        if (index == arr.length) {
            mined = Math.min(result, mined);
            maxed = Math.max(result, maxed);
            return;
        }
        if (plus > 0)
            solve(index+1, result + arr[index], plus-1, minus, mul, div);
        if (minus > 0)
            solve(index+1, result - arr[index], plus, minus-1, mul, div);
        if (mul > 0)
            solve(index+1, result * arr[index], plus, minus, mul-1, div);
        if (div > 0)
            solve(index+1, result / arr[index], plus, minus, mul, div-1);
    }
}
