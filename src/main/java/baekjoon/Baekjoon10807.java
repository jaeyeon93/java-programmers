package baekjoon;

import java.util.Scanner;

public class Baekjoon10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        int match = sc.nextInt();
        int count = 0;
        for (Integer i : arr)
            if (i == match)
                count++;
        System.out.println(count);
    }
}
