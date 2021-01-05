package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon7785 {
    private static Set<String> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String name;
        String status;
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            name = st.nextToken();
            status = st.nextToken();
            if (status.equals("enter")) set.add(name);
            else set.remove(name);
        }
        String [] result = set.toArray(new String[set.size()]);
        Arrays.sort(result, Collections.reverseOrder());
        for (String str : result)
            System.out.println(str);
    }
}
