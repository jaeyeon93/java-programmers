package baekjoon;

import java.util.*;

public class Baekjoon1316 {
    public static Integer check(String str) {
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) != str.charAt(i+1)) {
                for (int j = i+2; j < str.length(); j++)
                    if (str.charAt(i) == str.charAt(j))
                        return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count = 0;
        for (int i = 0; i < t; i++)
            count += check(sc.next());
        System.out.println(count);
    }
}
