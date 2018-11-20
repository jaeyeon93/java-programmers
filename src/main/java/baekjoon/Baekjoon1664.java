package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon1664 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        solution(num);
    }

//    private static int solution(int num) {
//        List<Integer> primes = new ArrayList<>();
//        for (int i = 2; i < num; i++)
//            if (isPrime(i))
//                primes.add(i);
//        List<Integer> sums = sums(primes);
//        int count = 0;
//        if (sums.contains(num))
//            ++count;
//
//        if (isPrime(num))
//            ++count;
//
//        for (int i = 1; i < sums.size()-1; i++)
//            for (int j = 1; j < sums.size(); j++)
//                if (sums.get(j) - sums.get(i) == num)
//                    ++count;
//        return count;
//    }
    private static void solution(int num) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= num; i++)
            if (isPrime(i))
                primes.add(i);
        int count = 0;
        int sum = 0;
        int i = 0, j = 0; // i = 시작점, j = 끝점

        while (true) {
           if (sum >= num) {
               sum -= primes.get(j++);
           } else if (i == primes.size()) {
               break;
           } else {
               sum += primes.get(i++);
           }

           if (sum == num)
               count++;
        }
        System.out.println(count);
    }

    private static boolean isPrime(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i*i <= num; i++)
            if (num % i == 0)
                return false;
        return true;
    }

//    private static List<Integer> sums(List<Integer> primes) {
//        List<Integer> sums = new ArrayList<>();
//        sums.add(0);
//        for (int i = 1; i < primes.size()+1; i++)
//            sums.add(sums.get(i-1) + primes.get(i-1));
//        return sums;
//    }
}
