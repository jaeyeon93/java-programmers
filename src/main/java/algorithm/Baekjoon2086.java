package algorithm;

import java.util.Scanner;

public class Baekjoon2086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        int [] arr = new int[b+1];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i <= b; i++) {
            arr[i] = arr[i-1] + arr[i-2];
            if (i >= a)
                sum += arr[i];
        }
        System.out.println(sum % 1000000000);
    }
}
