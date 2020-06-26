package baekjoon;

import java.io.*;
import java.util.*;

public class Baekjoon10867 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            set.add(Integer.parseInt(st.nextToken()));
        List<Integer> result = new ArrayList<>(set);
        Collections.sort(result);
        for (int i : result)
            bw.write(i + " ");
        bw.flush();
        bw.close();
    }
}
