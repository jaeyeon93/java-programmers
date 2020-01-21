package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BTest2 {
    static long maxInversions(List<Integer> prices) {
        long result = 0;
        for (int i = 0; i < prices.size(); i++)
            for (int j = i+1; j < prices.size(); j++)
                for (int k = j+1; k < prices.size(); k++)
                    if (prices.get(i) > prices.get(j) && prices.get(j) > prices.get(k))
                        result++;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        List<Integer> prices = new ArrayList<>();
        for (int i = 0; i < size; i++)
            prices.add(sc.nextInt());
        System.out.println(maxInversions(prices));
    }
}
