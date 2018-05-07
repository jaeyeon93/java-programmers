package algorithm;

public class Programmers7 {
    public static void main(String[] args) {
        Collatz c = new Collatz();
        int ex = 6;
        System.out.println(c.collatz(ex));
    }
}

class Collatz {
    public int collatz(int num) {
        int answer = 0;
//        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
                System.out.println("Change num is " + num);
                answer++;
            }
            num = (num * 3) + 1;
            System.out.println("Change num is " + num);
            answer++;
            if (num == 1)
                return answer;
//        }
        System.out.println("Answer is " + answer);
        return answer;
    }
}