package baekjoon;

import sun.jvm.hotspot.asm.sparc.SPARCArgument;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1717 {
    private static int [] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        // 1~n까지 부모 초기화
        parent = new int[n+1];
        for (int i = 1; i <= n; i++)
            parent[i] = i;

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int oper = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (oper == 1) {
                // a,b가 같은 집합에 포함되어있는지 출력. root가 같다.
                if (find(a) == find(b))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            } else
                union(a, b);
        }
    }

    public static void union(int a, int b) {
        int x = find(a);
        int y = find(b);
        // 같은 부모를 가지지 않을때.
        if (x == y) return;

        parent[x] = y;
    }

    public static boolean sameParent(int a, int b) {
        int x = find(a);
        int y = find(b);
        if (x == y)
            return true;
        return false;
    }

    public static int find(int x) {
        // 만약에 x와 parent[x]가 같다면 root
        if (x == parent[x])
            return x;
        return parent[x] = find(parent[x]);
    }
}
