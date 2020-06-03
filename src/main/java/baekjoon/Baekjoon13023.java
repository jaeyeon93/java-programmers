package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon13023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] first = sc.nextLine().split(" ");
        int n = Integer.parseInt(first[0]);
        int m = Integer.parseInt(first[1]);
        boolean [][] check = new boolean[n][n];
        List<Pair> pairs = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String [] input = sc.nextLine().split(" ");
            pairs.add(new Pair(Integer.parseInt(input[0]), Integer.parseInt(input[1])));
        }

        for (int i = 0; i < pairs.size(); i++) {
            Pair pair = pairs.get(i);
            int from = pair.from;
            int to = pair.to;
            check[from][to] = true;
            check[to][from] = true;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(check[i][j] + " ");
            System.out.println();
        }

    }

    static class Pair {
        int from;
        int to;

        Pair(int from, int to) {
            this.from = from;
            this.to = to;
        }
    }
}
