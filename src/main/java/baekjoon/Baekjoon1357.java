package baekjoon;

import java.util.Scanner;

public class Baekjoon1357 {
    public static Integer reverse(int n) {
        StringBuilder sb = new StringBuilder();
        String [] arr = String.valueOf(n).split("");
        for (int i = arr.length-1; i >= 0; i--)
            sb.append(arr[i]);
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = reverse(a) + reverse(b);
        System.out.println(reverse(temp));
    }
}
