package programmers;

public class SameNumber {
    public static int[] solution(int []arr) {
        int[] answer = {};
        for (int i = 0; i < arr.length-1; i++)
            if (arr[i] == arr[i+1])
                answer[i] = arr[i];
        return answer;
    }

    public static void main(String[] args) {
        int [] arr = {1,1,3,3,0,1,1};
        solution(arr);
    }
}
