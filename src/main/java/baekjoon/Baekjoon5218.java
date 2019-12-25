package baekjoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// https://www.acmicpc.net/problem/5218
public class Baekjoon5218 {
    public static String solution(Map<Character, Integer> map, String input) {
        String [] arr = input.split(" ");
        StringBuilder sb = new StringBuilder();
        sb.append("Distances: ");
        for (int i = 0; i < arr[0].length(); i++) {
            int x = map.get(arr[0].charAt(i));
            int y = map.get(arr[1].charAt(i));
            if (y >= x)
                sb.append(y-x).append(" ");
            else
                sb.append(y+26-x).append(" ");
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 65; i < 91; i++)
            map.put((char)i, i);
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++)
            System.out.println(solution(map, sc.nextLine()));
    }
}
