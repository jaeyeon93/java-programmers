package sort;

import java.util.*;

public class sort1 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 값을 입력하세요.");
        String input = scanner.nextLine();
        List<Integer> list = new ArrayList<Integer>();
        for(String s: input.split(","))
            list.add(Integer.parseInt(s));

        System.out.println("내림차순으로 정렬");
        Descending descending = new Descending();
        Collections.sort(list, descending);
        for(Integer integer : list)
            System.out.print(integer + " ");
        System.out.println();

        System.out.println("오름차순으로 정렬");
        Ascending ascending = new Ascending();
        Collections.sort(list, ascending);
        for(Integer integer : list)
            System.out.print(integer + " ");
        System.out.println();

    }
}

class Descending implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2){
        return o2.compareTo(o1);
    }

}

class Ascending implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2){
        return o1.compareTo(o2);
    }

}
