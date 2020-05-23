package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Baekjoon1992 {
    private static StringBuilder sb;
    private static int [][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        sb = new StringBuilder();

        // input
        for (int i = 0; i < n; i++) {
            String [] line = br.readLine().split("");
            for (int j = 0; j < line.length; j++)
                arr[i][j] = Integer.parseInt(line[j]);
        }
        QuadTree( 0, 0, n);
        System.out.println(sb.toString());
    }

    public static void QuadTree(int row, int col, int size) {
        if (isAble(row, col, size)) {
            sb.append(arr[row][col]);
        } else {
            sb.append("(");
            int half = size / 2;
            QuadTree(row, col, half);
            QuadTree(row,col+half, half);
            QuadTree(row+half, col, half);
            QuadTree(row+half,col+half, half);
            sb.append(")");
        }
    }

    public static boolean isAble(int row, int col, int size) {
        int t = arr[row][col];
        for (int i = row; i < row+size; i++)
            for (int j = col; j < col+size; j++)
                if (t != arr[i][j]) return false;
        return true;
    }
}
