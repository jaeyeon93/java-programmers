package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon15651 {
    private static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String [] input = br.readLine().split(" ");
        List<Integer> list = new ArrayList<>();
        solution(Integer.parseInt(input[0]), list,Integer.parseInt(input[1]), bw);
    }

    private static void print(List<Integer> list, BufferedWriter bw) throws IOException {
        for (int i : list)
            bw.write(i + " ");
        bw.write("\n");
        bw.flush();
    }

    private static void solution(int n, List<Integer> list, int toPick, BufferedWriter bw) throws IOException {
        if (toPick == 0) {
            print(list, bw);
            return;
        }

        for (int next = 1; next <= n; next++) {
            list.add(next);
            solution(n, list, toPick-1, bw);
            list.remove(list.size()-1);
        }
    }
}

