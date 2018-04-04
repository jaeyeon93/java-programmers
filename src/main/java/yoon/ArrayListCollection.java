package yoon;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCollection {
    public static void main(String [] args) {
        List<String> list = new ArrayList<>();
        // 컬렉션 인스턴스 생성

        // 컬렉션 인스턴스에 문자열 인스턴스 저장
        list.add("Toy");
        list.add("Boy");
        list.add("Robot");

        // 인스턴스 참조
        for (String s: list)
            System.out.print(s + "\t");
        System.out.println();

        list.remove(0); // 첫번째 인스턴스 삭제
        for (String s: list)
            System.out.print(s + "\t");
        System.out.println();
    }
}
