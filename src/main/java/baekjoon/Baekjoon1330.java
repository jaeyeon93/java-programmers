package baekjoon;

import java.util.Scanner;

public class Baekjoon1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String [] arr = input.split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        if (n < m)
            System.out.println("<");
        else if (n == m)
            System.out.println("==");
        else
            System.out.println(">");
    }
}
