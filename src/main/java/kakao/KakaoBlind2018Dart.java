package kakao;

public class KakaoBlind2018Dart {
    private static int solution(String dartResult) {
        char [] darts = dartResult.toCharArray();
        int [] score = new int[3];
        int cnt = -1;
        for (int i = 0; i < darts.length; i++) {
            // score
            if (darts[i] >= '0' && darts[i] <= '9') {
                cnt++;
                // 10점일때.
                if (darts[i] == '1' && darts[i+1] == '0') {
                    score[cnt] = 10;
                    i++;
                } else
                    score[cnt] = Integer.parseInt(String.valueOf(darts[i]));
            } else if (darts[i] == 'S') {
                score[cnt] = (int)Math.pow(score[cnt], 1);
            } else if (darts[i] == 'D') {
                score[cnt] = (int)Math.pow(score[cnt], 2);
            } else if (darts[i] == 'T') {
                score[cnt] = (int)Math.pow(score[cnt], 3);
            } else if (darts[i] == '*') {
                if (cnt >0)
                    score[cnt-1] *= 2;
                score[cnt] *= 2;
            } else if (darts[i] == '#')
                score[cnt] *= -1;

        }
        return score[0] + score[1] + score[2];
    }
    public static void main(String[] args) {
        System.out.println(solution("1S2D*3T"));
        System.out.println("========");
        System.out.println(solution("1D2S#10S"));
        System.out.println("========");
        System.out.println(solution("1D2S0T"));
        System.out.println("========");
        System.out.println(solution("1S*2T*3S"));

    }
}
