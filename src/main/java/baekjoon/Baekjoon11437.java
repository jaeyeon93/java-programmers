package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjoon11437 {
    private static List<Integer> [] map;
    private static boolean [] visit;
    private static int [] depth;
    private static int [] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        map = new List[n+1];
        visit = new boolean[n+1];
        depth = new int[n+1];
        parent = new int[n+1];

        for (int i = 1; i <= n; i++) map[i] = new ArrayList<>();
        StringTokenizer st;
        for (int i = 0; i < n-1; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            map[from].add(to);
            map[to].add(from);
        }
        calculateDepth(1, 0);
        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            System.out.println(lca(from, to));
        }
    }

    private static int lca(int from, int to) {
        // 부모를 같게 만들어야 한다.
        while (parent[from] != parent[to]) {
            if (depth[from] > depth[to])
                from = parent[from];
            else
                to = parent[to];
        }
        while (from != to) {
            from = parent[from];
            to = parent[to];
        }
        return from;
    }

    private static void calculateDepth(int to, int dep) {
        if (visit[to]) return;
        visit[to] = true;
        depth[to] = dep;
        for (int edge : map[to])
            if (!visit[edge]) {
                parent[edge] = to;
                calculateDepth(edge, dep+1);
            }
    }
}