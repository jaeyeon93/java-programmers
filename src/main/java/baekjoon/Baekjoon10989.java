package baekjoon;

import java.io.*;

public class Baekjoon10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [] arr = new int[10001];
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());
            ++arr[n];
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != 0)
                for (int j = 0; j < arr[i]; j++)
                    bw.write(i + "\n");

        br.close();
        bw.close();
    }
}
