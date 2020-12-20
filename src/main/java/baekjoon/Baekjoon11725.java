package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjoon11725 {
    private static List<Integer> [] list;
    private static boolean [] check;
    private static int [] parent;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        list = new List[n+1];
        parent = new int[n+1];
        check = new boolean[n+1];
        for (int i = 1; i <= n; i++)
            list[i] = new ArrayList<>();
        StringTokenizer st;
        for (int i = 0; i < n-1; i++) {
            st = new StringTokenizer(br.readLine());
            int prev = Integer.parseInt(st.nextToken());
            int next = Integer.parseInt(st.nextToken());
            list[prev].add(next);
            list[next].add(prev);
        }

        for (int i = 1; i <= n; i++)
            if (!check[i]) dfs(i);

        for (int i = 2; i <= n; i++)
            System.out.println(parent[i]);
    }

    private static void dfs(int v) {
        if (check[v]) return;
        check[v] = true;
        for (int num : list[v]) {
            if (!check[num]) {
                parent[num] = v;
                dfs(num);
            }
        }
    }
}
