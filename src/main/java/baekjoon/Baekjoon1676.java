package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Baekjoon1676 {
    private static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        map.put(2, 0);
        map.put(5, 0);

        for (int i = 1; i <= n; i++)
            cal(i);
        System.out.println(Math.min(map.get(2), map.get(5)));
    }

    private static void cal(int num) {
        while (num % 2 == 0 || num % 5 == 0) {
            if (num % 2 == 0) {
                num /= 2;
                int count = map.get(2);
                count++;
                map.put(2, count);
            } else if (num % 5 == 0) {
                num /= 5;
                int count = map.get(5);
                count++;
                map.put(5, count);
            }
        }
    }
}
