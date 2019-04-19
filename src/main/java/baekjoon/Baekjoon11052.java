package baekjoon;

import java.util.*;

public class Baekjoon11052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add((double)sc.nextInt()/(i+1));
        int money = 0;

        while (true) {
            int maxIdx = list.indexOf(Collections.max(list));
            int count = n / (maxIdx+1);
            money += list.get(maxIdx)*(maxIdx+1)*count;
            n %= (maxIdx+1);
            if (n == 0) {
                System.out.println(money);
                return;
            }
            double maxValue = list.get(maxIdx);
            maxValue = 0;
        }
    }
}
