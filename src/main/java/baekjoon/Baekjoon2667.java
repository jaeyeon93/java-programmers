package baekjoon;

import java.util.*;

public class Baekjoon2667 {
    private static final int [][] DIRECTIONS = {{1,0}, {-1,0}, {0,1}, {0,-1}};
    private static final int ROW = 0, COL = 1;
    private static int houseNum = 0;
    private static class Point {
        int row;
        int col;

        public Point(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int [][] arr = new int[n][n];
        for (int row = 0; row < n; row++) {
            String [] temp = sc.nextLine().split("");
            for (int col = 0; col < n; col++)
                arr[row][col] = Integer.parseInt(temp[col]);
        }
        List<Integer> result = bsf(arr, n);
        System.out.println(houseNum);
        Collections.sort(result);
        for (Integer i : result)
            System.out.println(i);
    }

    public static List<Integer> bsf(int [][] arr, int n) {
        boolean [][] visit = new boolean[n][n];
        List<Integer> result = new ArrayList<>();
        for (int row = 0; row < n; row++) { // row : y축
            for (int col = 0; col < n; col++) { // col : x축
                if (visit[row][col] || arr[row][col] == 0) continue; // 만약에 방문을 했고, arr[row][col] = 0이면 pass
                visit[row][col] = true;
                Queue<Point> q = new LinkedList<>();
                q.offer(new Point(row, col));
                houseNum++;
                int count = 1;
                while (!q.isEmpty()) {
                    Point current = q.poll();
                    for (final int [] DIRECTION : DIRECTIONS) { // 4방향탐색
                        int nextRow = current.row + DIRECTION[ROW];
                        int nextCol = current.col + DIRECTION[COL];
                        if (nextRow < 0 || nextRow >= n || nextCol < 0 || nextCol >= n) continue; // 4방향 탐색할때,
                        if (visit[nextRow][nextCol]) continue; // 방문을 안했으면 pass
                        if (arr[nextRow][nextCol] == 0) continue;
                        ++count;
                        visit[nextRow][nextCol] = true;
                        q.offer(new Point(nextRow, nextCol));
                    }
                }
                result.add(count);
            }
        }
        return result;
    }
}
