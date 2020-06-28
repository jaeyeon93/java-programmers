package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon13458 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        long result = 0;

        for (long student : arr) {
            result++;
            student -= b;

            if (student > 0) {
                if (student % c == 0)
                    result += student/c;
                else
                    result += student/c+1;
            }
        }

        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }

}
