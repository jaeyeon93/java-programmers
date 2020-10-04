package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon4796 {
    public static String solution(int l, int p, int v, int index) {
        StringBuilder sb = new StringBuilder("Case ").append(index).append(": ");
        int result = 0;
        while (true) {
            if (v / p == 0) {
                if (v > l) {
                    result += l;
                    break;
                } else {
                    result += v;
                    break;
                }
            } else {
                result += (l * (v/p));
                v %= p;
            }
        }
        sb.append(result);
        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int index = 1;
        while (true) {
            int l = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            if (l == 0 && p == 0 && v == 0) break;
            System.out.println(solution(l, p, v, index));
            st = new StringTokenizer(br.readLine());
            index++;
        }
    }
}
