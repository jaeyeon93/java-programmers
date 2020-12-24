package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjoon1967 {
    private static List<Edge> [] map;
    private static boolean [] visit;
    private static int result = Integer.MIN_VALUE;
    private static Edge maxNode;

    private static class Edge {
        int to;
        int cost;

        public Edge(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }

    private static Edge dfs(Edge current, int cost) {
        visit[current.to] = true;
        for (Edge edge : map[current.to]) {
            if (!visit[edge.to]) {
                dfs(edge, cost+edge.cost);
            }
        }
        if (cost >= result) {
            result = cost;
            maxNode = current;
        }
        return current;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n == 1) {
            System.out.println(0);
            return;
        }
        map = new List[n+1];
        visit = new boolean[n+1];
        for (int i = 1; i <= n; i++)
            map[i] = new ArrayList<>();

        StringTokenizer st;
        for (int i = 0; i < n-1; i++) {
            st = new StringTokenizer(br.readLine());
            int parent = Integer.parseInt(st.nextToken());
            int edge = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            map[parent].add(new Edge(edge, cost));
            map[edge].add(new Edge(parent, cost));
        }
        visit[1] = true;
        for (Edge edge : map[1]) {
            dfs(edge, edge.cost);
        }
        visit = new boolean[n+1];
        dfs(maxNode, 0);
        System.out.println(result);
    }
}
