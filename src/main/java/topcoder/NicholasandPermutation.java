package topcoder;

import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NicholasandPermutation {
    public static Integer solution(List<Integer> list) {
        if (list.indexOf(1) == 0 || list.indexOf(1) == list.size()-1)
            return list.size()-1;

        if (list.indexOf(list.size()) == 0 || list.indexOf(list.size()) == list.size()-1)
            return list.size()-1;

        List<Integer> temp = new ArrayList<>();
        temp.add(list.size()-list.indexOf(1));
        temp.add(list.indexOf(1)-1); //
        temp.add(list.size()-list.indexOf(list.size()));
        temp.add(list.indexOf(list.size())-1);
        System.out.println(temp);
        return Collections.max(temp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++)
            list.add(sc.nextInt());
        System.out.println(solution(list));
    }
}
