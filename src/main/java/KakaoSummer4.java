import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class KakaoSummer4 {
    private static boolean [][] visit;
    private static int [][] map;
    private static final int ROW = 0, COL = 1;
    private static int [][] DIRECTIONS = {{1,0},{0,1},{-1,0},{0,-1}};

    public static int solution(int [][] board) {
        int size = board.length;
        visit = new boolean[size][size];
        map = new int[size][size];
        Queue<Point> q = new LinkedList<>();

        q.offer(new Point(0, 0, 0, -1));
        visit[0][0] = true;

        int answer = Integer.MAX_VALUE;

        while (!q.isEmpty()) {
            Point current = q.poll();
            if (current.row == size-1 && current.col == size-1) {
                answer = Math.min(current.cost, answer);
                continue;
            }

            for (int i = 0; i < 4; i++) {
                int nRow = current.row + DIRECTIONS[i][ROW];
                int nCol = current.col + DIRECTIONS[i][COL];

                if (nRow < 0 || nRow >= size || nCol < 0 || nCol >= size) continue; // 길이 초과패스
                if (board[nRow][nCol] == 1) continue; // 벽돌일때 패스
                int new_cost = 0;

                // 처음시작할때 또는 방향이 같을때.
                if (current.dir == -1 || current.dir == i)
                    new_cost = current.cost + 100;
                else if (current.dir != i) // 방향이 달라질때
                    new_cost = current.cost + 600;

                if (!visit[nRow][nCol]) { // 처음방문할때.
                    map[nRow][nCol] = new_cost;
                    visit[nRow][nCol] = true;
                    q.offer(new Point(nRow, nCol, new_cost, i));
                } else if (visit[nRow][nCol] && map[nRow][nCol] > new_cost) { // 이미 방문했는데, 최소값이 더 작은 경우
                    map[nRow][nCol] = new_cost;
                    q.offer(new Point(nRow, nCol, new_cost, i));
                }
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
                System.out.print(map[i][j] + " ");
            System.out.println();
        }
        System.out.println("=====");
        return answer;
    }
    public static void main(String[] args) {
        int result1 = solution(new int[][]{{0,0,0}, {0,0,0},{0,0,0}});
        int result3 = solution(new int[][]{{0,0,1,0},{0,0,0,0},{0,1,0,1},{1,0,0,0}});
        int result4 = solution(new int[][]{{0,0,0,0,0,0}, {0,1,1,1,1,0}, {0,0,1,0,0,0}, {1,0,0,1,0,1}, {0,1,0,0,0,1}, {0,0,0,0,0,0}});


        int result2 = solution(new int[][]{{0,0,0,0,0,0,0,1},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,1,0,0},
                {0,0,0,0,1,0,0,0},
                {0,0,0,1,0,0,0,1},
                {0,0,1,0,0,0,1,0},
                {0,1,0,0,0,1,0,0},
                {1,0,0,0,0,0,0,0}
        });

        System.out.println("결과");
        System.out.println(result1);

        System.out.println(result2);

        System.out.println(result3);

        System.out.println(result4);
    }

    private static class Point {
        int row;
        int col;
        int cost;
        int dir;

        public Point(int row, int col, int cost, int dir) {
            this.row = row;
            this.col = col;
            this.cost = cost;
            this.dir = dir;
        }
    }
}
