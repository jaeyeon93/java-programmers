package baekjoon;

import java.io.*;

public class Baekjoon11441 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n+1];
        int [] sum = new int[n+1];
        String [] input = br.readLine().split(" ");
        for (int i = 1; i <= n; i++)
            arr[i] = Integer.parseInt(input[i-1]);
        sum[1] = arr[1];
        for (int i = 2; i <= n; i++)
            sum[i] = arr[i] + sum[i-1];
        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            input = br.readLine().split(" ");
            int start = Integer.parseInt(input[0]);
            int end = Integer.parseInt(input[1]);
            bw.write(sum[end]-sum[start-1]+"\n");
        }
        bw.flush();
    }
}
