package yoon;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCollection {
    public static void main(String [] args) {
        List<String> list = new LinkedList<>();
        list.add("Toy");
        list.add("Box");
        list.add("Robot");

        for (String s: list)
            System.out.print(s + "\t");
        System.out.println();

        list.remove(0);

        for (String s: list)
            System.out.print(s + "\t");
        System.out.println();
    }
}
