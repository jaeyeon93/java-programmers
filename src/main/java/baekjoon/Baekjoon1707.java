package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baekjoon1707 {
    private static int v;
    private static int e;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int k = Integer.parseInt(br.readLine());

        // 테스트 케이스 경우의 수
        for (int i = 0; i < k; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            v = Integer.parseInt(st.nextToken());
            e = Integer.parseInt(st.nextToken());
            ArrayList<Integer> [] map;
            map = new ArrayList[v+1];
            int [] color = new int[v+1];
            for (int tmp = 1; tmp <= v; tmp++)
                map[tmp] = new ArrayList<>();
            // 데이터 넣기
            for (int j = 0; j < e; j++) {
                st = new StringTokenizer(br.readLine());
                int tmpV = Integer.parseInt(st.nextToken());
                int tmpE = Integer.parseInt(st.nextToken());
                map[tmpV].add(tmpE);
                map[tmpE].add(tmpV);
            }

            // 정답 출력
            bw.write(check(map, color) + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static String check(ArrayList<Integer> [] map, int [] color) {
        for (int i = 1; i <= v; i++)
            if (color[i] == 0)
                dfs(i, color, 1, map);

        boolean ok = true;
        for (int i = 1; i <= v; i++)
            for (int k = 0; k < map[i].size(); k++) {
                int j = map[i].get(k);
                if (color[i] == color[j]) ok = false;
            }
        return ok ? "YES" : "NO";
    }

    private static void dfs(int v, int [] check, int color, ArrayList<Integer> [] map) {
         check[v] = color;
         for (int i = 0; i < map[v].size(); i++) {
             int next = map[v].get(i);
             if (check[next] == 0)
                 dfs(next, check, 3-color, map);
         }
    }
}
