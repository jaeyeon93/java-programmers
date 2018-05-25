package algorithm;

import java.util.*;

public class Baekjoon1427 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        List<String> arr = Arrays.asList(str.split(""));
        Collections.sort(arr);
        String result = String.join("", arr);
        StringBuffer strBuffer = new StringBuffer(result).reverse();
        System.out.println(Integer.parseInt(strBuffer.toString()));
    }
}
