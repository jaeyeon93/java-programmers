package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon10845 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String commad = sc.nextLine();
            String [] arr = commad.split(" ");
            String cmd = arr[0];
            if (cmd.equals("push"))
                list.add(Integer.parseInt(arr[1]));
            else if (cmd.equals("pop")) {
                if (list.isEmpty())
                    System.out.println(-1);
                if (!list.isEmpty()) {
                    int tmp = list.remove(0);
                    System.out.println(tmp);
                }
            } else if (cmd.equals("size"))
                System.out.println(list.size());
            else if (cmd.equals("empty")) {
                if (list.isEmpty())
                    System.out.println(1);
                if (!list.isEmpty())
                    System.out.println(0);
            } else if (cmd.equals("back")) {
                if (list.isEmpty())
                    System.out.println(-1);
                if (!list.isEmpty())
                    System.out.println(list.get(list.size() -1));
            } else if (cmd.equals("front")) {
                if (list.isEmpty())
                    System.out.println(-1);
                if (!list.isEmpty())
                    System.out.println(list.get(0));
            }
        }
    }
}
