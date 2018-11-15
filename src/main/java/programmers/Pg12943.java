package programmers;

public class Pg12943 {
    private static int count = 0;

    public Integer solution(int num) {
        if (count > 500)
            return -1;

        if (num == 1)
            return count;

        if (num % 2 == 0) {
            ++count;
            return solution(num / 2);
        }
        ++count;
        num *= 3;
        num += 1;
        return solution(num);
    }

    public Integer solution2(int num) {
        int answer = 0;
        while (num > 1) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = (num * 3) + 1;
            }
            answer++;
            if (answer == 500) {
                answer = -1;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Pg12943 pg = new Pg12943();
        System.out.println(pg.solution2(626332));
    }
}
