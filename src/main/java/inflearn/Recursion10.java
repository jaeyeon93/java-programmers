package inflearn;

// 최대값 찾기
public class Recursion10 {
    // begin에서 end사이로 찾기
    public static int findMax(int [] data, int begin, int end) {
        if (begin == end)
            return data[begin];
        return Math.max(data[begin], findMax(data, begin + 1, end));
        // findMax(data, begin + 1, end) : 데이터의 구간이 계속 변한다.
    }

    public static int findMax2(int [] data, int begin, int end) {
        if (begin == end)
            return data[begin];
        int middle = (begin + end) / 2;
        int max1 = findMax(data, begin, middle);
        int max2 = findMax(data, middle + 1, end);
        return Math.max(max1, max2);
    }
}
