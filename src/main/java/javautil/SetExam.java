package javautil;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {
    public static void main(String [] args){
        Set<String> set1 = new HashSet<>();
        boolean flag1 = set1.add("hello");
        boolean flag2 = set1.add("world");
        boolean flag3 = set1.add("hello");

        System.out.println(set1.size());

        System.out.println(flag1);
        // true
        System.out.println(flag2);
        // true
        System.out.println(flag3);
        // false

        Iterator<String> iter = set1.iterator();

        while (iter.hasNext()){
            // 꺼낼 것이 있다면 true를 리턴
            String str = iter.next();
            // next()메소드는 하나를 꺼낸다.
            System.out.println(str);
        }
    }
}
