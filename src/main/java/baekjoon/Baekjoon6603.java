package baekjoon;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon6603 {
    private static List<Integer> lotto = new LinkedList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            int n = Integer.parseInt(st.nextToken());
            if (n == 0)
                break;
            int [] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = Integer.parseInt(st.nextToken());
            solve(a, 0, 0);
            System.out.println();
        }
    }

    public static void solve(int [] a, int index, int cnt) {
        if (cnt == 6) {
            for (int num : lotto)
                System.out.print(num + " ");
            System.out.println();
            return;
        }

        int n = a.length;
        if (n == index) return;

        lotto.add(a[index]);
        solve(a, index+1, cnt+1);

        lotto.remove(lotto.size()-1);
        solve(a, index+1, cnt);
    }
}
