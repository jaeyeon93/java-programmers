package hacker;

import java.io.*;
import java.util.*;

//https://www.hackerrank.com/challenges/string-construction/problem
public class Hackerrank9 {
    static int stringConstruction(String s) {
        int result = 0;
        Set<String> mySet = new HashSet<>(Arrays.asList(s.split("")));
        result = mySet.size();
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = stringConstruction(s);
            System.out.println(result);
        }
        in.close();
    }
}
