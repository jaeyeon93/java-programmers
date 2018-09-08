package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon10828 {
    public static void stack(String command) {
        String [] arr = command.split(" ");
        String com = arr[0];
        System.out.println("command : " + com);
        List<Integer> list = new ArrayList<>();
        if (com=="push") {
            list.add(Integer.parseInt(arr[1]));
        } else if (com == "size") {
            System.out.println(checkSize(list));
        } else if (com == "empty") {
            System.out.println(checkEmpty(list));
        } else if (com == "top") {
            System.out.println(top(list));
        } else if (com == "pop") {
            int result = list.remove(list.size() -1);
            System.out.println(result);
        }
    }

    public static Integer checkSize(List<Integer> list) {
        return list.size();
    }

    public static Integer checkEmpty(List<Integer> list) {
        if (list.size() == 0)
            return 1;
        return 0;
    }

    public static Integer top(List<Integer> list) {
        if (list.size() == 0)
            return -1;
        return list.get(list.size() -1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++)
            stack(sc.next());
    }
}
