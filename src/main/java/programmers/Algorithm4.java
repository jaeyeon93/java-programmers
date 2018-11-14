package programmers;

import java.util.Scanner;

//https://programmers.co.kr/learn/courses/30/lessons/12931?language=java
public class Algorithm4 {
    public static Integer solution(int num) {
        int sum = 0;
        for (int i = 9; i >= 0; i--) {
            int a = (int)(num/Math.pow(10,i));
            sum += a;
            num = (int)(num%Math.pow(10,i));
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer num = sc.nextInt();
        System.out.println(solution(num));
    }
}
