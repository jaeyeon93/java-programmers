package algorithm;

import java.util.*;

//https://www.hackerrank.com/challenges/two-strings/problem
public class Hackerrank8 {
    static String twoStrings(String s1, String s2){
        List<String> arr1 = Arrays.asList(s1.split(""));
        List<String> arr2 = Arrays.asList(s2.split(""));
        Set<String> set1 = new HashSet<>(arr1);
        Set<String> set2 = new HashSet<>(arr2);
        if (Collections.disjoint(set1, set2))
            return "NO";
        return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s1 = in.next();
            String s2 = in.next();
            String result = twoStrings(s1, s2);
            System.out.println(result);
        }
    }
}
