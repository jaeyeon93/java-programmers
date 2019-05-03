package baekjoon;

import java.util.Scanner;

public class Baekjoon2506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < size-1; i++) {
            if (arr[i] == 1 && arr[i+1] == 1)
                sum += ++arr[i+1];
            else
                sum += arr[i];
        }

        System.out.println(sum);
    }
}
