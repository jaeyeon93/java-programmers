package baekjoon;

import java.util.Scanner;

public class Baekjoon2178 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] firstLine = sc.nextLine().split(" ");
        int row = Integer.parseInt(firstLine[0]);
        int col = Integer.parseInt(firstLine[1]);
        int [][] map = new int[row][col];
        for (int i = 0; i < row; i++) {
            String [] line = sc.nextLine().split(" ");
            for (int j = 0; j < line.length; j++)
                map[row][col] = Integer.parseInt(line[j]);
        }
    }
}
