package programmers;

//https://programmers.co.kr/learn/courses/30/lessons/12932/solution_groups?language=java
public class Alogorithm2 {
    public static int[] solution(long n) {
        String [] result = new StringBuilder(String.valueOf(n)).reverse().toString().split("");
        int [] answer = new int[result.length];
        for (int i = 0; i < result.length; i++)
            answer[i] = Integer.parseInt(result[i]);
        return answer;
    }

    public static void main(String[] args) {
        for (int i = 0; i < solution(12345).length; i++)
            System.out.println("result : " + solution(12345)[i]);
    }
}
