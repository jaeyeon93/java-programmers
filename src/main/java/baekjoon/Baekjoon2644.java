package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon2644 {
    private static ArrayList<Integer>[] arr;
    private static boolean [] visit;
    private static int [][] sum;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new ArrayList[n+1];
        visit = new boolean[n+1];
        sum = new int[n+1][n+1];
        for (int i = 1; i <= n; i++)
            arr[i] = new ArrayList<>();

        int from = sc.nextInt();
        int to = sc.nextInt();

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[x].add(y);
            arr[y].add(x);
        }

        for (int i = 1; i <= n; i++) {
            dfs(i,i);
            Arrays.fill(visit, false);
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++)
                System.out.print(sum[i][j] + " ");
            System.out.println();
        }

        if (sum[from][to] == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum[from][to]);
        }
    }

    public static void dfs(int from, int start) {
        visit[from] = true;

        for (int v : arr[from]) {
            if (!visit[v]) {
                sum[from][v] = 1;
                sum[v][from] = 1;
                sum[start][v] = sum[from][v] + sum[start][from];
                sum[v][start] = sum[from][v] + sum[start][from];
                dfs(v, start);
            }
        }
    }
}
