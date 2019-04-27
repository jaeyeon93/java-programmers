package baekjoon;

import java.util.Scanner;

public class Baekjoon1292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int [] arr = new int[1001];
        arr[1] = 1;
        int value = 1;
        int count = 2;
        while (count < 1000) {
            value++;

            for (int i = 0; i < value; i++) {
                arr[count] = value;
                if (count == 1000)
                    break;
                count++;
            }
        }
        int sum = 0;
        for (int i = a; i <= b; i++)
            sum += arr[i];
        System.out.println(sum);
    }
}
