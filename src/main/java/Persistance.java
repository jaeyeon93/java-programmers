public class Persistance {

    public static Integer solution2(long n, int count) {
        if (n == 4)
            return count;
        count++;
        return solution2(convert(n), count);
    }

    public static long convert(long n) {
        int result = 1;
        while (n > 1) {
            long temp = n % 10;
            result *= temp;
            n /= 10;
        }
        return result;
    }

    public static int solution(long n) {
        int count = 0;
        while (n > 9) {
            n = convert(n);
            ++count;
            if (n < 10)
                break;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(solution(39));
        System.out.println(solution(4));
        System.out.println(solution(25));
        System.out.println(solution(999));
    }
}
