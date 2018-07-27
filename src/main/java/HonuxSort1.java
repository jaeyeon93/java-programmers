import java.util.*;

public class HonuxSort1 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(15,5,7,1,9);
        System.out.println("Before arr : " + arr);
        Collections.sort(arr);
        System.out.println("After arr : " + arr);

        List<String> arr2= Arrays.asList("a", "z", "y", "b", "e","j");
        System.out.println("Before arr : " + arr2);
        Collections.sort(arr2);
        System.out.println("After arr : " + arr2);

        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 15);
        map.put("z", 5);
        map.put("b", 7);
        map.put("e", 1);
        map.put("j", 9);
        System.out.println("map : " + map);
    }
}
