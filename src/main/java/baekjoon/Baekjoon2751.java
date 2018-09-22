package baekjoon;

import java.util.Scanner;

public class Baekjoon2751 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int [] arr = new int [count];
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
