package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// https://www.acmicpc.net/problem/10828
public class Baekjoon10828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String command = sc.nextLine();
            String [] arr = command.split(" ");
            String cmd = arr[0];
            if (cmd.equals("push"))
                list.add(Integer.parseInt(arr[1]));
            else if (cmd.equals("top")) {
                if (list.isEmpty())
                    System.out.println(-1);
                if (!list.isEmpty())
                    System.out.println(list.get(list.size() - 1));
            } else if (cmd.equals("size"))
                System.out.println(list.size());
            else if (cmd.equals("empty")) {
                if (list.isEmpty())
                    System.out.println(1);
                if (!list.isEmpty())
                    System.out.println(0);
            } else if (cmd.equals("pop")) {
                if (list.isEmpty())
                    System.out.println(-1);
                if (!list.isEmpty()) {
                    int last = list.remove(list.size() - 1);
                    System.out.println(last);
                }
            }
        }
    }
}
