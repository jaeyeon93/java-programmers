package baekjoon;

import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.util.StringTokenizer;

public class Baekjoon12790 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int result = solution(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            System.out.println(result);
        }
    }

    public static int solution(int hp, int mp, int attack, int defence, int wHp, int wMp, int wAttack, int wDefence) {
        int calHp = (hp + wHp < 1) ? 1 : hp + wHp;
        int calMp = (mp + wMp < 1) ? 1 : mp + wMp;
        int calAttack = (attack + wAttack < 0) ? 0 : attack + wAttack;
        return calHp + 5*calMp + 2*calAttack + 2*(wDefence + defence);
    }
}
