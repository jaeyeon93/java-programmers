package baekjoon;

import java.util.Scanner;

public class Baejoon14490 {
    public static Integer gcd(int a, int b) {
        int temp;
        while (a != 0) {
            if (a < b) {
                temp = a;
                a = b;
                b = temp;
            }
            a %= b;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] arr = sc.next().split(":");
        int first = Integer.parseInt(arr[0]);
        int second = Integer.parseInt(arr[1]);
        int gcd = gcd(first, second);
        StringBuilder sb = new StringBuilder();
        sb.append(first/gcd);
        sb.append(":");
        sb.append(second/gcd);
        System.out.println(sb.toString());
    }
}
