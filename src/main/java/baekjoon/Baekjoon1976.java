package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Baekjoon1976 {
    private static int [] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        parent = new int[n+1];
        for (int i = 1; i <= n; i++)
            parent[i] = i;
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (num == 1)
                    union(i, j);
            }
        }
        // last commend
        int [] path = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i+1 < path.length; i++)
            if (parent[path[i]] != parent[path[i+1]]) {
                System.out.println("NO");
                return;
            }
        System.out.println("YES");
    }

    private static void union(int a, int b) {
        int x = find(a);
        int y = find(b);
        if (x == y) return;

        if (x < y)
            parent[y] = x;
        else
            parent[x] = y;
    }

    private static int find(int x) {
        if (parent[x] == x)
            return x;
        return parent[x] = find(parent[x]);
    }
}
