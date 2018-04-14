package yoon;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

class AgeComparator implements Comparator<Integer> {
    public int compare(Integer n1, Integer n2) {
        return n2.intValue() - n1.intValue();
    }
}

public class ComparatorTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>(new AgeComparator());
        map.put(45, "Brown");
        map.put(37, "James");
        map.put(23, "Martin");

        // Key만 담고 있는 컬렉션 인스턴스
        Set<Integer> ks = map.keySet();

        // print whole key(based for-each)
        for (Integer n : ks)
            System.out.print(n.toString() + "\t");
        System.out.println();

        // print whole value
        for (Integer n : ks)
            System.out.print(map.get(n).toString() + "\t");
        System.out.println();

        // print whole value(based Iterator)
        for (Iterator<Integer> itr = ks.iterator(); itr.hasNext(); )
            System.out.print(map.get(itr.next()) + "\t");
        System.out.println();
    }
}
