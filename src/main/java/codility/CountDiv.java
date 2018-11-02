package codility;

public class CountDiv {
    public static Integer solution(int A, int B, int K) {
        int count = 0;
        for (int i = A; i <= B; i++)
            if (i % K == 0)
                count++;
        return count;
    }

    public static Integer solution2(int A, int B, int K) {
        // A~B K로 나눈갯수
        return (B/K) - ((A-1)/K);
    }

    public static void main(String[] args) {
        int result1 = solution(6,11,2);
        int result2 = solution(100,123000000,2);
        int result3 = solution(101,123000000,10000);
        System.out.println("result : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);
        System.out.println("============");
        int result4 = solution2(6,11,2);
        int result5 = solution2(100,123000000,2);
        int result6 = solution2(101,123000000,10000);
        System.out.println("result4 : " + result4);
        System.out.println("result5 : " + result5);
        System.out.println("result6 : " + result6);
    }
}
