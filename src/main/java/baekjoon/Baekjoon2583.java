package baekjoon;

import java.util.*;

public class Baekjoon2583 {
    private static int m,n,k;
    private static int [][] map;
    private static boolean [][] visit;
    private static final int [][] DIRECTIONS = {{1,0}, {0,1}, {-1,0}, {0,-1}};
    private static final int ROW = 0, COL = 1;
    private static List<Integer> area = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] first = sc.nextLine().split(" ");
        m = Integer.parseInt(first[0]);
        n = Integer.parseInt(first[1]);
        k = Integer.parseInt(first[2]);
        map = new int[m][n];
        visit = new boolean[m][n];
        for (int i = 0; i < k; i++)
            paint(sc.nextLine());

        // 탐색
        bsf();

        // 출력
        Collections.sort(area);
        System.out.println(area.size());
        for (int i : area)
            System.out.print(i + " ");
    }

    public static void paint(String input) {
        String [] line = input.split(" ");
        int sx = Integer.parseInt(line[0]);
        int sy = Integer.parseInt(line[1]);
        int ex = Integer.parseInt(line[2]);
        int ey = Integer.parseInt(line[3]);

        for (int y = sy; y < ey; y++)
            for (int x = sx; x < ex; x++)
                map[y][x] = 1;
    }

    private static class Point {
        int y;
        int x;

        public Point(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }

    public static void bsf() {
        for (int y = 0; y < m; y++) {
            for (int x = 0; x < n; x++) {
                if (map[y][x] == 0 && visit[y][x] == false) {
                    Queue<Point> q = new LinkedList<>();
                    q.offer(new Point(y,x));
                    int count = 1;
                    while (!q.isEmpty()) {
                        Point current = q.poll();
                        visit[current.y][current.x] = true;

                        for (int [] DIRECTION : DIRECTIONS) {
                            int ny = current.y + DIRECTION[ROW];
                            int nx = current.x + DIRECTION[COL];
                            if (ny < 0 || ny >= m || nx < 0 || nx >= n) continue;
                            if (!visit[ny][nx] && map[ny][nx] == 0) {
                                visit[ny][nx] = true;
                                count++;
                                q.offer(new Point(ny, nx));
                            }
                        }
                    }
                    area.add(count);
                }
            }
        }
    }
}
