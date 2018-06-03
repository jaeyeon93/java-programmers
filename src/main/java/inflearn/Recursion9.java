package inflearn;

// 순차탐색2
public class Recursion9 {
    public static void main(String[] args) {
        int [] data = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("result : " + search(data, 0, data.length, 6));
    }

    public static int search(int [] data, int begin, int end, int target) {
        // begin == end는 데이터가 1개라는 의, begin > end라면 데이터의 갯수가 0개
        if (begin > end)
            return -1;
        else if (target == data[begin])
            return begin;
        return search(data, begin + 1, end, target);
    }

    public static int search2(int [] data, int begin, int end, int target) {
        if (begin > end)
            return -1;
        int middle = (begin + end) / 2;
        if (data[middle] == target)
            return middle;
        int index = search2(data, begin, middle - 1, target);
        if (index != -1)
            return index;
        return search2(data, middle + 1, end, target);
    }
}
