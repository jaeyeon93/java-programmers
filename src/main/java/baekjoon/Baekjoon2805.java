package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int [] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        int minHeight = 0;
        int maxHeight = arr[n-1];
        int middle = 0;

        while (minHeight <= maxHeight) {
            long sum = 0;
            middle = (minHeight + maxHeight) / 2;

            for (int i : arr)
                sum += (i - middle > 0) ? (i-middle) : 0;
            if (sum >= m)
                minHeight = middle+1;
            else
                maxHeight = middle-1;
        }
        bw.write(maxHeight + "\n");
        bw.close();
    }
}
