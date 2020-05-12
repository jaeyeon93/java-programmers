package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1182 {
    private static int n;
    private static int m;
    private static int count;
    private static int [] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] =(Integer.parseInt(st.nextToken()));
        count = 0;
        solution(0, 0);

        if (m == 0) count--; // 아무것도 선택하지 않는 경우가 있다.
        System.out.println(count);
    }

    public static void solution(int i, int sum) {
        if (i == n) {
            if (sum == m) {
                count++;
            }
            return;
        }
        solution(i+1, sum+arr[i]);
        solution(i+1, sum);
    }
}
