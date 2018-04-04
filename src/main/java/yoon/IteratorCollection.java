package yoon;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorCollection {
    public static void main(String [] args) {
        List<String> list = new LinkedList<>();
        list.add("Toy");
        list.add("Box");
        list.add("Robot");
        list.add("Box");

        Iterator<String> itr = list.iterator(); // 반복자 획득

        while (itr.hasNext())
            System.out.print(itr.next() + "\t");
        System.out.println();

        itr = list.iterator(); // 반복자 다시 획득

        String str;
        while (itr.hasNext()) {
            str = itr.next();
            if(str.equals("Box"))
                itr.remove();
        }

        itr = list.iterator();

        while (itr.hasNext())
            System.out.print(itr.next() + "\t");
        System.out.println();
    }
}
