package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon2805 {
    private static int [] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        arr = new int[n];

        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        int left = 0;
        int right = arr[n-1];
        while (left <= right) {
            int h = (left+right)/2;
            int sum = 0;
            for (int i : arr)
                sum += (i - h < 0) ? 0 : i-h;

            if (sum < m)
                right = h-1;

            if (sum >= m)
                left = h+1;
        }
        System.out.println(right);
    }
}

// 4 7
// 10 15 17 20 0 0 0 3
