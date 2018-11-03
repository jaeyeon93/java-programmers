package codility;

// https://app.codility.com/programmers/lessons/3-time_complexity/
public class FrogJump {
    public static int solution(int X, int Y, int D) {
        int diff = Math.abs(Y-X);
        System.out.println("diff : " + diff);
        if (diff % D == 0)
            return (diff / D);
        return (diff / D) + 1;
    }

    public static void main(String[] args) {
        int result1 = solution(10, 85, 30);
        int result2 = solution(10, 70, 30);
        System.out.println(result1);
        System.out.println(result2);
    }
}
