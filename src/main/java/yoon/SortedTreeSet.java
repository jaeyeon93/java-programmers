package yoon;

import java.util.Iterator;
import java.util.TreeSet;

public class SortedTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(3); tree.add(1);
        tree.add(2); tree.add(4);
        System.out.println("인스턴스의 수 : " + tree.size());

        for(Integer num : tree)
            System.out.print(num.toString() + "\t");
        System.out.println();

        for(Iterator<Integer> itr = tree.iterator(); itr.hasNext(); )
            System.out.print(itr.next().toString() + "\t");
        System.out.println();
    }
}
