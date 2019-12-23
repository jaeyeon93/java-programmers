package baekjoon;

import java.util.Scanner;
// https://www.acmicpc.net/problem/10798
public class Baekjoon10798 {
    public static String solution(String [][] arr) {
        StringBuilder sb = new StringBuilder();
        for (int col = 0; col < 15; col++) {
            for (int row = 0; row < 5; row++) {
                if (arr[row][col] == null) continue;
                sb.append(arr[row][col]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String [][] arr = new String[5][15];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String input = sc.nextLine();
            String [] temp = input.split("");
            for (int j = 0; j < temp.length; j++)
                arr[i][j] = temp[j];
        }
        System.out.println(solution(arr));
    }
}
