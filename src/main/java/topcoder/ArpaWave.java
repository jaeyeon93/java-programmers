package topcoder;

import java.util.Scanner;

public class ArpaWave {
    public static Integer solution(int n, int k, int t) {
        int period = n+k;
        if (t > period)
            t %= period;
        if (t < k && t >= 0)
            return t;


        if (k <= t && t <= n)
            return k;
        return k-(t%n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.nextInt(), sc.nextInt(), sc.nextInt()));
    }
}
