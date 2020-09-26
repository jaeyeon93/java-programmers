package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon1654 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int [] arr = new int[k];
        for (int i = 0; i < k; i++)
            arr[i] = Integer.parseInt(br.readLine());
        Arrays.sort(arr);

        long min = 1;
        long max = arr[k-1];

        while (min <= max) {
            long middle = (min + max) / 2;
            long count = 0;
            for (int i : arr)
                count += (i / middle);

            if (count >= n)
                min = middle+1;
            else
                max = middle-1;
        }
        System.out.println(max);
    }
}
