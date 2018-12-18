package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// https://www.acmicpc.net/problem/1065
public class Baekjoon1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++)
            if (check(i))
                list.add(i);
        int result = list.size();
        System.out.println(result);
    }

    public static boolean check(int n) {
        if (n > 0 && n < 100)
            return true;

        if (n == 1000)
            return false;

        int [] arr = new int[3];
        int k = 0;
        while (n > 0) {
            arr[k] = n % 10;
            n /= 10;
            k++;
        }
        if (arr[0] - arr[1] ==arr[1] - arr[2])
            return true;
        return false;
    }
}
