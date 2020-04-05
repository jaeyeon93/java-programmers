package baekjoon;

import java.util.*;

public class Baekjoon1764 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] input = sc.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        Set<String> nolisten = new HashSet<>();
        for (int i = 0; i < n; i++)
            nolisten.add(sc.nextLine());
        List<String> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String name = sc.nextLine();
            if (nolisten.contains(name))
                result.add(name);
        }
        Collections.sort(result);
        System.out.println(result.size());
        for (String name : result)
            System.out.println(name);
    }
}
