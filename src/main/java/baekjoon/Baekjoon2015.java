package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon2015 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int [] arr = new int[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());


        int count = 0;
        int left = 0, right = 0;
        int sum = arr[left];

        while (left <= right && right < n) {
            if (sum < k) {
                if (right+1 < n)
                    sum += arr[right+1];
                right++;
                continue;
            }

            if (sum > k) {
                if (left+1 < n)
                    sum -= arr[left];
                left++;
                continue;
            }

            if (sum == k)
                count++;
        }
        bw.write(count+"\n");
        bw.flush();
    }
}
