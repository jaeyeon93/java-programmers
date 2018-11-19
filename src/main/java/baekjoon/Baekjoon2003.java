package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon2003 {
    public static Integer solution(int [] arr, int match) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        for (int i = 1; i < arr.length+1; i++)
            list.add(arr[i-1] + list.get(i-1));
        int count = 0;
        if (list.contains(match))
            ++count;
        for (int i = 1; i < list.size()-1; i++)
            for (int j = 1; j < list.size(); j++)
                if (list.get(j) - list.get(i) == match)
                    ++count;
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int match = sc.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        System.out.println(solution(arr, match));
    }
}
