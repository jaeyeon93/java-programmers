package topcoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//https://codeforces.com/group/DEuKcKDfls/contest/240622/problem/A
public class Decoding {
    public static Integer solution(List<String> list, String found) {
        int temp = list.indexOf(found);
        if (temp == -1)
            return -1;
        return temp+1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        int c = sc.nextInt();
        double temp = a/b;

        String number = String.format("%03f", temp);
        List<String> list = new ArrayList<>();
        for (int i = number.indexOf(".")+1; i < number.indexOf(".")+6; i++)
            list.add(String.valueOf(number.charAt(i)));
        System.out.println(solution(list, String.valueOf(c)));
    }
}
