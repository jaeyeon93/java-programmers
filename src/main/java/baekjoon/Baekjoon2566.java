package baekjoon;

import java.util.Scanner;

public class Baekjoon2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] numbers = new int[9][9];
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                numbers[i][j] = sc.nextInt();
        int index_i = 0;
        int index_j = 0;
        int max = numbers[index_i][index_j];

        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                if (numbers[i][j] > max) {
                    max = numbers[i][j];
                    index_i = i+1;
                    index_j = j+1;
                }
        System.out.println(max);
        System.out.println(index_i + " " + index_j);
    }
}
