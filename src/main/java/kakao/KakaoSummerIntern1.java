package kakao;

import java.util.Arrays;
import java.util.List;

public class KakaoSummerIntern1 {
    public static String solution(int [] numbers, String hand) {
        int left = 3;
        int right = 3;
        String leftHand = "L";
        String rightHand = "R";
        List<Integer> leftKey = Arrays.asList(1,4,7);
        List<Integer> midKey = Arrays.asList(2,5,8,0);
        List<Integer> rightKey = Arrays.asList(3,6,9);
        StringBuilder sb = new StringBuilder();

        for (int number : numbers) {
            if (leftKey.contains(number)) {
                leftHand = "L";
                left = leftKey.indexOf(number);
                sb.append("L");
            } else if (rightKey.contains(number)) {
                rightHand = "R";
                right = rightKey.indexOf(number);
                sb.append("R");
            } else { // Other numbers. {2,5,8,0}
                String putMid = "";
                int midIndex = midKey.indexOf(number);
                int leftDist = Math.abs(midIndex-left);
                int rightDist = Math.abs(midIndex-right);
                leftDist = leftHand.equals("M") ? leftDist-1 : leftDist;
                rightDist = rightHand.equals("M") ? rightDist-1 : rightDist;
                // 가운데 손가락 어디에 둘지 결정
               if (leftDist < rightDist)
                    putMid = "L";
                else if (rightDist < leftDist)
                    putMid = "R";
                else // 거리가 같을때 왼손잡이 오른손잡이
                    putMid = hand.equals("right") ? "R" : "L";
                if (putMid.equals("L")) {
                    leftHand = "M";
                    left = midKey.indexOf(number);
                    sb.append("L");
                } else {
                    rightHand = "M";
                    right = midKey.indexOf(number);
                    sb.append("R");
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
//        System.out.println(solution(new int[]{1,3,4,5,8,2,1,4,5,9,5}, "right"));
//        System.out.println("==================");
        System.out.println(solution(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left"));
//        System.out.println("==================");
//        System.out.println(solution(new int[]{1,2,3,4,5,6,7,8,9,0}, "right"));

    }
}
