package inflearn;

public class Recursion11_BinarySearch {
    public static int binarySearch(String [] items, String target, int begin, int end) {
        // 보통 begin은 0, end는 data.length - 1로 한다.
        if (begin == end)
            return -1;
        int middle = (begin + end) / 2;
        int compResult = target.compareTo(items[middle]);
        if (compResult == 0)
            return middle;
        else if (compResult < 0)
            return binarySearch(items, target, begin, middle - 1);
        return binarySearch(items, target, middle + 1, end);
    }
}
