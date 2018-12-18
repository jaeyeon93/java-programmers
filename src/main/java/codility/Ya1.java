package codility;

import java.util.HashMap;
import java.util.Iterator;

public class Ya1 {
    public static void solution(int N) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(2, "Codility");
        map.put(3, "Test");
        map.put(5, "Coders");

        for (int i = 1; i <= N; i++) {
            System.out.println(check(i, map));
        }
    }

    public static String check(int N, HashMap<Integer, String> map) {
        StringBuilder sb = new StringBuilder();
        if (N % 2 == 0)
            sb.append(map.get(2));
        if (N % 3 == 0)
            sb.append(map.get(3));
        if (N % 5 == 0)
            sb.append(map.get(5));
        if (N % 5 != 0 && N % 3 != 0 && N % 2 != 0)
            return String.valueOf(N);

        return sb.toString();
    }

    public static void main(String[] args) {
        solution(24);
    }
}
