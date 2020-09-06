package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baekjoon1300 {
    private static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= n; j++)
                list.add(i*j);
        Collections.sort(list);
        System.out.println(list.get(k-1));
    }
}

// 1
// 1 2 2 4 => n=2일때, 2 2 4 추가
// 1 2 2 3 3 4 6 6 9 => n=3일때, 3 3 6 6 9 추가
// 1 2 2 3 3 4 4 6 6 8 8 9 12 12 16 => n=4일때, 4 4 8 8 12 12 16
// 1 2 2 3 3 4 4 4 5 5 6 6 6 8 8 9 10 10 12 12 12 15 15 16 18 20 20 25 => n=5일떄, 5 5 10 10 15 15 20 20 25
