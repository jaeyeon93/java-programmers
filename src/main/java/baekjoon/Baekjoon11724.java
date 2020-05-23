package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Baekjoon11724 {
    private static ArrayList<Integer> [] arr;
    private static boolean [] visit;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextByte();
        arr = new ArrayList[n+1];

        for (int i = 0; i <= n; i++)
            arr[i] = new ArrayList<>();

        visit = new boolean[n+1];

        for (int i = 0; i < m; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            arr[from].add(to);
            arr[to].add(from);
        }

        int count = 0;
        for (int i = 1; i <= n; i++)
            if (!visit[i]) {
                dfs(i);
                count++;
            }
        System.out.println(count);
    }

    private static void dfs(int u) {
        visit[u] = true;
        for (int v : arr[u])
            if (visit[v] == false) dfs(v);
    }

}
