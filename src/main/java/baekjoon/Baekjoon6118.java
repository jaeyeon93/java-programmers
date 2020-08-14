package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon6118 {
    private static List<Integer>[] map;
    private static boolean [] visited;
    private static int [] dist;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        map = new List[n+1];
        visited = new boolean[n+1];
        dist = new int[n+1];
        for (int i = 1; i <= n; i++)
            map[i] = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            map[v].add(e);
            map[e].add(v);
        }

        bfs(1);
        int maxDistance = Integer.MIN_VALUE;
        int minIndex = Integer.MAX_VALUE;
        int count = 0;
        for (int d : dist)
            if (d > maxDistance) maxDistance = d;

        for (int i = 2; i <= n; i++)
            if (dist[i] == maxDistance) {
                if (i < minIndex) minIndex = i;
                count++;
            }

        System.out.printf("%d %d %d", minIndex, maxDistance, count);
    }

    private static void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();
        visited[v] = true;
        q.add(v);
        while (!q.isEmpty()) {
            int current = q.poll();
            for (int next : map[current]) {
                if (!visited[next]) {
                    visited[next] = true;
                    dist[next] = dist[current]+1;
                    q.add(next);
                }
            }
        }
    }
}
