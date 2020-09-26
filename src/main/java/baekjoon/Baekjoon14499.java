package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon14499 {
    private static int [][] map;
    private static final int [][] DIRECTIONS = {{0,0}, {0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    private static int [][] dice = new int[4][3];
    private static int r, c, n, m;
    private static int [] current = new int [2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        current[0] = r;
        current[1] = c;

        int command = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++)
                map[i][j] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < command; i++)
            solution(Integer.parseInt(st.nextToken()));

    }

    private static void solution(int command) {
        int [] direct = DIRECTIONS[command];
        int nr = direct[0] + current[0];
        int nc = direct[1] + current[1];
        if (nr >= 0 || nr < n || nc >= 0 || nc < m) {
            current[0] = nr;
            current[1] = nc;
            if (map[nr][nc] == 0) {
                // 주사위 바닥에 있는 수 복사.
            } else {
                // 면
            }
        }
    }

//    private static int [][] converting_dice(int command) {
//        if (command == 1) {
//            // 동쪽으로 이동
//            int tmp = dice[1][1];
//            dice[1][1] = dice[0][1];
//            dice[1][2] = dice[1][1];
//            dice[0][1] = dice[1][3];
//            dice[1][3] = tmp;
//
//        } else if (command == 2) {
//            // 서쪽으로 이동
//            int tmp = dice[1][1];
//            dice[1][1] = dice[1][2];
//            dice[1][2] = dice[1][3];
//            dice[1][0] = tmp;
//
//        } else if (command == 3) {
//            // 남쪽
//        } else {
//            // 북쪽
//        }
//    }
}
