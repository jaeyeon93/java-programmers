package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon10986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++)
            list.add(Integer.parseInt(st.nextToken()));
        List<Integer> sums = new ArrayList<>();
        List<Integer> mods = new ArrayList<>();
        sums.add(0);
        for (int i = 1; i < list.size()+1; i++) {
            int sum = sums.get(i-1) + list.get(i-1);
            sums.add(sum);
            int mod = sum % M;
            mods.add(mod);
        }
    }
}
