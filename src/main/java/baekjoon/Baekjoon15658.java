package baekjoon;

import java.util.Scanner;

public class Baekjoon15658 {
    private static int [] arr;
    private static int [] oper;
    private static int max = Integer.MIN_VALUE;
    private static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        oper = new int[4];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (int i = 0; i < 4; i++)
            oper[i] = sc.nextInt();

        solve(1, arr[0], oper[0], oper[1], oper[2], oper[3]);

        System.out.println(max);
        System.out.println(min);
    }

    public static void solve(int index, int result, int plus, int minus, int mul, int div) {
        if (index == arr.length) {
            max = Math.max(max, result);
            min = Math.min(min, result);
            return;
        }

        if (plus > 0)
            solve(index+1, result+arr[index], plus-1, minus, mul, div);
        if (minus > 0)
            solve(index+1, result-arr[index], plus, minus-1, mul, div);
        if (mul > 0)
            solve(index+1, result*arr[index], plus, minus, mul-1, div);
        if (div > 0)
            solve(index+1, result/arr[index], plus, minus, mul, div-1);
    }
}
