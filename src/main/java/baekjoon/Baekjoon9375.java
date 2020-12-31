package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            Map<String, Set<String>> map = new HashMap<>();
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st;
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                String item = st.nextToken();
                String type = st.nextToken();
                if (!map.containsKey(type)) {
                    map.put(type, new HashSet<>());
                    map.get(type).add(item);
                } else {
                    map.get(type).add(item);
                }
            }
            int result = solution(map);
            System.out.println(result);
        }
    }

    private static int solution(Map<String, Set<String>> map) {
        int result = 1;
        Iterator<String> itr = map.keySet().iterator();
        while (itr.hasNext())
            result *= map.get(itr.next()).size()+1;
        result--;
        return result;
    }
}
