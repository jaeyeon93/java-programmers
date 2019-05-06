package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Baekjoon11656 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++)
            list.add(str.substring(i, str.length()));

        Collections.sort(list);
        for (String s : list)
            System.out.println(s);
    }
}
