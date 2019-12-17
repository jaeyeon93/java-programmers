package baekjoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// https://www.acmicpc.net/problem/10816
public class Baekjoon10816 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int key = sc.nextInt();
            if (map.containsKey(key)) {
                int count = map.get(key);
                map.put(key, ++count);
            } else {
                map.put(key, 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
             int key = sc.nextInt();
             if (!map.containsKey(key))
                 sb.append(0 + " ");
             else
                 sb.append(map.get(key) + " ");
        }
        System.out.println(sb.toString());
    }
}
