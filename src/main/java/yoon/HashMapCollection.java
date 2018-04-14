package yoon;

import java.util.HashMap;

public class HashMapCollection {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(45, "Brown");
        map.put(37, "James");
        map.put(23, "Matrin");

        System.out.println("23 번 : " + map.get(23));
        System.out.println("37 번 : " + map.get(37));
        System.out.println("45 번 : " + map.get(45));
        System.out.println();

        // delete data
        map.remove(37);

        // 데이터 삭제 확인
        System.out.println(map.get(37));
    }
}
