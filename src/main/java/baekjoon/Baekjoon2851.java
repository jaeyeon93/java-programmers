package baekjoon;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2851
public class Baekjoon2851 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[10];
        int [] sum = new int[10];
        for (int i = 0; i < 10; i++)
            arr[i] = sc.nextInt();
        sum[0] = arr[0];
        for (int i = 1; i < 10; i++)
            sum[i] = sum[i-1] + arr[i];

        for (int i = 0; i < sum.length; i++) {
//            System.out.println("sum i is " + sum[i]);
            if (sum[i] == 100) {
                System.out.println(sum[i]);
                break;
            } else if (sum[i] > 100) {
                int small = sum[i-1];
                int big = sum[i];
                if (small == big) {
                    System.out.println(big);
                    break;
                } else {
                    int smallSub = Math.abs(100-small);
                    int bigSub = Math.abs(big-100);

                    if (smallSub < bigSub) {
                        System.out.println(small);
                        break;
                    } else {
                        System.out.println(big);
                        break;
                    }
                }

            }
        }

        if (sum[9] < 100)
            System.out.println(sum[9]);

    }
}
