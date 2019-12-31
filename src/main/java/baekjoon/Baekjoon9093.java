package baekjoon;

import java.util.Scanner;

public class Baekjoon9093 {
    public static String solution(String input) {
        StringBuilder sb = new StringBuilder();
        String [] arr = input.split(" ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i].length()-1; j >= 0; j--)
                sb.append(arr[i].charAt(j));
            sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++)
            System.out.println(solution(sc.nextLine()));
    }
}
