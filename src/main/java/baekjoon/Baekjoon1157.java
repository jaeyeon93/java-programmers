package baekjoon;

import java.util.*;

// https://www.acmicpc.net/problem/1157
public class Baekjoon1157 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next().toUpperCase();
        int [] arr = new int[26]; // a-z;

        for (int i = 0; i < input.length(); i++)
            arr[input.charAt(i)-65]++;

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        StringBuilder sb = new StringBuilder();
        int check = -1;

        for (int i = 0; i < 26; i++) {
            if (arr[i] == max) {
                if (check != -1) {
                    sb.append("?");
                    System.out.println(sb.toString());
                    return;
                }
                check = i;
            }

        }
        sb.append((char)(check+65));
        System.out.println(sb.toString());
    }
}
