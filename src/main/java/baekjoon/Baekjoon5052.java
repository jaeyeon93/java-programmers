package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon5052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            String [] arr = new String[n];
            for (int j = 0; j < n; j++)
                arr[j] = br.readLine();
            System.out.println(solution(arr));
        }
    }

    private static String solution(String [] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++)
            if (arr[i+1].startsWith(arr[i])) return "NO";
        return "YES";
    }
}
