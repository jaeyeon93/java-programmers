package baekjoon;

import java.util.Scanner;

public class Baekjoon2845 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int p = sc.nextInt();
        int real = l*p;
        for (int i = 0; i < 5; i++)
            System.out.print(sc.nextInt() - real + " ");
    }
}
