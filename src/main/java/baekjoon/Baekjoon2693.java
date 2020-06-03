package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon2693 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int [] arr = new int[10];
            for (int j = 0; j < 10; j++)
                arr[j] = Integer.parseInt(st.nextToken());
            Arrays.sort(arr);
            System.out.println(arr[7]);
        }
    }
}
