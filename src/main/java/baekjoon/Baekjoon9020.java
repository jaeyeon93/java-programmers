package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon9020 {

    public static boolean check(int n) {
        for (int i = 2; i*i <= n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

//    public static void solution(int n) {
//        List<Integer> list = new ArrayList<>();
//        for (int i = 2; i <= n; i++)
//            if (check(i))
//                list.add(i);
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < list.size(); i++)
//            for (int j = 0; j < list.size(); j++)
//                if (list.get(i) + list.get(j) == n) {
//                    System.out.println(list.get(i) + " " + list.get(j));
//                    return;
//                }
//
//    }
    public static List<Integer> solution(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= n; i++)
            if (check(i))
                list.add(i);
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution(sc.nextInt());
        for (int i = 0; i < n; i++)
            System.out.println(solution(sc.nextInt()));;
    }
}
