package coder;

public class ThirteenFind {
    //https://www.oncoder.com/ground/HJok8E6RX
    public static Integer solution(int a) {
        int count = 0;
        if (a < 13)
            return 0;

        for (int i = 13; i <= a; i++)
            if (String.valueOf(i).contains("13"))
                count++;
        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(13));
        System.out.println(solution(200));
    }
}
