package baekjoon;

import java.util.Scanner;

public class Baekjoon2960 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        boolean [] arr = new boolean[n+1];
        for (int i = 2; i < arr.length; i++)
            arr[i] = false;

        for (int i = 2; i < arr.length; i++) {
            if (check(i)) {
                for (int j = 2; j < arr.length; j++)
                    if (j % i == 0 && arr[j] == false) {
                        arr[j] = true;
                        count++;
                        if (count == k) {
                            System.out.println(j);
                            break;
                        }
                    }
            }
        }

    }

    public static boolean check(int n) {
        for (int i = 2; i*i <= n; i++)
            if (n % i == 0)
                return false;
        return true;
    }
}
