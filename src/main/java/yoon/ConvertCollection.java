package yoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ConvertCollection {
    public static void main(String[] args) {
        List<String> lst = Arrays.asList("Box", "Toy", "Box", "Toy");
        ArrayList<String> list = new ArrayList<>(lst);

        for(String s : list)
            System.out.print(s.toString() + "\t");
        System.out.println();

        // 중복된 인스턴스 필터하기
        HashSet<String> set = new HashSet<>(list);

        // 원래대로 ArrayList<String> 인스턴스로 옮긴다.
        list = new ArrayList<>(set);

        for(String s : list)
            System.out.print(s.toString() + "\t");
        System.out.println();
    }
}
