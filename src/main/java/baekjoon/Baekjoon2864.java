package baekjoon;

import java.util.Scanner;

public class Baekjoon2864 {
    public static Integer max(int n) {
        String [] arr = String.valueOf(n).split("");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++)
            if (arr[i].equals("5"))
                sb.append("6");
            else
                sb.append(arr[i]);
        return Integer.parseInt(sb.toString());
    }

    public static Integer min(int n) {
        String [] arr = String.valueOf(n).split("");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++)
            if (arr[i].equals("6"))
                sb.append("5");
            else
                sb.append(arr[i]);
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((min(a)+min(b)) + " " + (max(a) + max(b)));
    }
}
