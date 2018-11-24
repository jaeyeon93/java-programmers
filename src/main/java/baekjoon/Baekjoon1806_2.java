package baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1806_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int arr [] = new int[n];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        int left = 0, right = 0;
        int size = n;
        int sum = arr[left];
        int min = n+1;
        int length = right-left+1;

        while (left <= right && right < size) {
            // match보다 클때
            if (sum >= m) {
               length = right-left+1;
               if (min > length)
                   min = length;
               if (left+1 < size)
                   sum -= arr[left];
               left++;
               continue;
            }

            // match보다 작을때
            if (sum < m) {
                if (right+1 < size)
                    sum += arr[right+1];
                right++;
                continue;
            }
        }
        if (min == n+1)
            min = 0;
        System.out.println(min);
    }
}
