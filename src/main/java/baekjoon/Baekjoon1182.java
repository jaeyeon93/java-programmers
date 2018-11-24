package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjoon1182 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(Integer.parseInt(st.nextToken()));
        System.out.println(list);

        int sum = list.get(0);
        int count = 0;
        int i = 0, j = 0;
        while (i <= j && j < list.size()) {
            if (sum < s) {
                sum += list.get(j++);
            } else {
                sum -= list.get(i++);
            }

            if (sum == s)
                count++;
        }
        System.out.println(count);
    }
}
