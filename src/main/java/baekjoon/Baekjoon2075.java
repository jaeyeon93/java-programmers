package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon2075 {
    private static Queue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++)
                priorityQueue.add(Integer.parseInt(st.nextToken()));
        }

        for (int i = 1; i <= n; i++)
            if (i == n)
                System.out.println(priorityQueue.poll());
            else
                priorityQueue.poll();
    }

    public static void solution2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n*n];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++)
                arr[idx] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        System.out.println(arr[n*n - n]);

    }
}
