import java.util.Arrays;
import java.util.List;

public class BinarySearch {
    public static boolean binarySearch(List<Integer> list, Integer value) {
        if (list == null || list.isEmpty())
            return false;

        int comparision = list.get(list.size() / 2);
        if (value.equals(comparision))
            return true;

        if (value < comparision) {
            return binarySearch(list.subList(0, list.size()/2), value);
        } else {
            return binarySearch(list.subList(list.size()/2 + 1, list.size()), value);
        }
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        System.out.println(binarySearch(list, 10));
    }
}
