package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjoon1167 {
    private static List<Edge> [] map;
    private static boolean [] visit;
    private static int result = Integer.MIN_VALUE;
    private static Edge maxEdge;
    private static class Edge {
        int to;
        int cost;
        public Edge(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Edge{" +
                    "to=" + to +
                    ", cost=" + cost +
                    '}';
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        map = new List[n+1];
        visit = new boolean[n+1];

        // 인접리스트 초기화
        for (int i = 1; i <= n; i++)
            map[i] = new ArrayList<>();
        StringTokenizer st;
        // Edge, cost 입력받기
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            int edge = Integer.parseInt(st.nextToken());
            while (true) {
                int to = Integer.parseInt(st.nextToken());
                if (to == -1) break;
                int cost = Integer.parseInt(st.nextToken());
                map[edge].add(new Edge(to, cost));
            }
        }
        maxEdge = dfs(map[1].get(0), 0);
        visit = new boolean[n+1];
        dfs(maxEdge, 0);
        System.out.println(result);
    }

    public static Edge dfs(Edge node, int price) {
        visit[node.to] = true;
        for (Edge edge : map[node.to]) {
            if (!visit[edge.to]) {
                dfs(edge, price+edge.cost);
            }
        }
        if (price > result) {
            result = price;
            maxEdge = node;
        }
        return maxEdge;
    }
}
