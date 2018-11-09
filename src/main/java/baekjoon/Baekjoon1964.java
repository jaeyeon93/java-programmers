package baekjoon;

import java.util.Scanner;

public class Baekjoon1964 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [] d = new int[num+1];
        d[1] = 5;
        for (int i = 2; i <= num; i++)
            d[i] = (d[i-1] + 3*(i+1) -2) % 45678;
        System.out.println(d[num]);
    }
}
