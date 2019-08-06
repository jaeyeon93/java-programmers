package baekjoon;

import java.util.Scanner;

public class Baekjoon2903 {
    public static void main(String[] args) {
        int [] arr = new int[17];
        arr[1] = 4;
        for (int i = 2; i < arr.length; i++) {
            int width = (int)Math.pow(2, (i-2));
            arr[i] = arr[i-1]*4 - 3 - (4 * (width));
        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(arr[n+1]);
    }
}
