package baekjoon;

import java.util.*;

public class Baekjoon2606 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> [] arr = new ArrayList[n+1];
        boolean [] visit = new boolean[n+1];
        int l = sc.nextInt();

        for (int i = 0; i <= n; i++)
            arr[i] = new ArrayList<>();

        for (int i = 0; i < l; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            arr[from].add(to);
            arr[to].add(from);
        }

        dfs(1, arr, visit);

        // result
        int ans = 0;
        for (boolean f : visit)
            if (f == true) ans++;
        System.out.println(ans-1);
    }

    private static void dfs(int u, ArrayList<Integer> [] arr, boolean [] visit) {
        visit[u] = true;
        for (int v : arr[u])
            if (visit[v] == false) dfs(v, arr, visit);
    }
}
