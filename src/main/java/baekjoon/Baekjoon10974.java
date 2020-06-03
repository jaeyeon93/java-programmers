package baekjoon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon10974 {
    private static int n;
    private static boolean [] visit;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        visit = new boolean[n+1];
        List<Integer> list = new ArrayList<>();
        dfs(0, "");
    }

    private static void dfs(int cnt, String s) {
        if (cnt == n) {
            System.out.println(s);
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                dfs(cnt+1, s + i + " ");
                visit[i] = false;

            }
        }
    }
}
