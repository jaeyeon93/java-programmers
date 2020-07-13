package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Baekjoon2841 {
    private static int count = 0;
    private static Stack<Integer> [] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        arr = new Stack[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = new Stack<>();
            arr[i].push(0);
        }
        int p = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int line = Integer.parseInt(st.nextToken());
            int fret = Integer.parseInt(st.nextToken());
            Stack<Integer> temp = arr[line];
            while (!temp.isEmpty() && temp.peek() > fret) {
                temp.pop();
                count++;
            }

            if (temp.peek() != fret) {
                temp.push(fret);
                count++;
            }
        }
        System.out.println(count);
    }
}
