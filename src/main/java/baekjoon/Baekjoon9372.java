package baekjoon;

import java.io.*;
import java.util.*;

public class Baekjoon9372 {
    private static List<Integer>[] arr;
    private static boolean [] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            arr = new ArrayList[n+1];
            visited = new boolean[n+1];

            int [] count = new int[n+1];
            // 리스트 초기화

            for (int s = 1; s <= n; s++)
                arr[s] = new ArrayList<>();

            // 양방향 그래프 만들기
            for (int j = 0; j < m; j++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                arr[a].add(b);
                arr[b].add(a);
            }

            for (int from = 1; from <= n; from++) {
                dfs(from, from, count);
                System.out.println("==========");
                Arrays.fill(visited, false);
            }
            int min = Integer.MAX_VALUE;
            for (int num : count)
                if (num < min && num != 0)
                    min = num;
            System.out.println(min);
        }
    }

    public static void dfs(int current, int start, int [] count) {
        visited[current] = true;

        for (int v : arr[current]) {
            if (!visited[v]) {
                System.out.println("current: " + current + " next : " + v);
                count[start]++;
                dfs(v, start, count);
            }
        }

    }
}

/*
5 6
2 1
1 4
2 3
4 3
4 5
3 5
 */