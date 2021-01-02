package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Baekjoon1269 {
    private static Set<Integer> aSet = new HashSet<>();
    private static Set<Integer> bSet = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) aSet.add(Integer.parseInt(st.nextToken())); // input a
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) bSet.add(Integer.parseInt(st.nextToken()));
        Set<Integer> tmpB = new HashSet<>(bSet);
        Set<Integer> tmpA = new HashSet<>(aSet);

        aSet.removeAll(tmpB);
        bSet.removeAll(tmpA);
        System.out.println(Math.abs(aSet.size()+bSet.size()));
    }

    public static void otherSolution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int aCount = Integer.parseInt(st.nextToken());
        int bCount = Integer.parseInt(st.nextToken());
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < aCount; i++)
            a.add(Integer.parseInt(st.nextToken()));
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < bCount; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (a.contains(num)) {
                a.remove(num);
            } else {
                b.add(num);
            }
        }
        System.out.println(a.size()+b.size());
    }
}
