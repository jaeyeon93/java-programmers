package graph;

import java.util.*;

// https://www.acmicpc.net/problem/1260
public class Baekjoon1206DFS {
    static ArrayList<Integer>[] a;
    static boolean[] check;

    public static void dfs(int x) {
        if (check[x])
            return;
        check[x] = true;
        System.out.print(x + " ");
        for (int y : a[x])
            if (check[y] == false)
                dfs(y);
    }

    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        check[start] = true;
        while (!q.isEmpty()) {
            int x = q.remove();
            System.out.print(x + " ");
            for (int y : a[x])
                if (check[y] == false) {
                    check[y] = true;
                    q.add(y);
                }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int start = sc.nextInt();
        a = (ArrayList<Integer>[]) new ArrayList[n+1];
        for (int i=1; i<=n; i++) {
            a[i] = new ArrayList<Integer>();
        }
        for (int i=0; i<m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            a[u].add(v);
            a[v].add(u);
        }
        for (int i=1; i<=n; i++) {
            Collections.sort(a[i]);
        }
        check = new boolean[n+1];
        dfs(start);
        System.out.println();
        check = new boolean[n+1];
        bfs(start);
        System.out.println();
    }
}
