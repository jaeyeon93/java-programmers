package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Baekjoon2004 {
    private static long two = 0;
    private static long five = 0;
    private static Map<Long, Long> map = new HashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        two = getCount(n, 2) - getCount(m, 2) - getCount(n-m, 2);
        five = getCount(n, 5) - getCount(m, 5) - getCount(n-m, 5);

        System.out.println(Math.min(two, five));
    }

    private static long getCount(int n, int a) {
       long cnt = 0;

       while (n >= a) {
           cnt += n/a;
           n /= a;
       }
       return cnt;
    }

    private static void counting(int num, boolean flag) {
        while (num % 5 == 0 || num % 2 == 0) {
            if (num % 5 == 0) {
                long count = map.get(5l);
                count += (num/5);
                num /= 5;
                map.put(5l, count);
            }

            if (num % 2 == 0) {
                long count = map.get(2l);
                count += (num / 2);
                map.put(2l, count);
            }
        }
    }
}
