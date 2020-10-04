package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon2512 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int [] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        long m = Long.parseLong(st.nextToken());

        Arrays.sort(arr);
        int min = 0;
        int max = arr[n-1];

        while (min <= max) {
            long sum = 0;
            for (int price : arr)
                sum += (price >= max) ? max : price;
            if (sum > m)
                --max;
            else
                ++min;
        }
        System.out.println(max);
    }
}
