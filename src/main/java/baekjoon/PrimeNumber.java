package baekjoon;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
    public static boolean check(int number) {
        for (int i = 2; i < number; i++)
            if (number % i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i < 101; i++)
            if (check(i))
                list.add(i);
        System.out.println(list);
    }
}
