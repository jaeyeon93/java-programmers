package baekjoon;

import java.lang.reflect.Method;
import java.util.*;

public class Baekjoon1158 {

    public static void main(String[] args) throws NoSuchMethodException {
        Scanner sc = new Scanner(System.in);
        String [] input = sc.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++)
            q.offer(i);
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while (!q.isEmpty()) {

            for (int i = 1; i <= k; i++) {
                if (i != k) {
                    q.offer(q.poll());
                } else {
                    sb.append(q.poll());
                    sb.append(", ");
                }
            }
        }
        String temp = sb.substring(0, sb.length()-2);
        sb = new StringBuilder(temp);
        sb.append(">");
        System.out.println(sb.toString());
        Method leng = String.class.getMethod("length");
    }
}
