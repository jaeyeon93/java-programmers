package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjoon1620 {
    private static List<String> arr = new ArrayList<>();
    private static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++)
            arr.add(br.readLine());
        for (int i = 0; i < m; i++)
            solution(br.readLine());
    }

    private static void solution(String input) {
        try {
            int index = Integer.parseInt(input);
            System.out.println(arr.get(index-1));
            return;
        } catch (NumberFormatException e) {
            System.out.println(arr.indexOf(input+1));
            return;
        }
    }
}
