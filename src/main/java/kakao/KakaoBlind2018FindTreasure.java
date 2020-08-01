package kakao;

public class KakaoBlind2018FindTreasure {

    public static void main(String[] args) {
        solution(5, new int[]{9,20,28,18,11}, new int[]{30,1,21,17,28});
        System.out.println("====");
        solution(6, new int[]{46,33,33,22,31,50}, new int[]{27,56,19,14,14,10});

    }

    public static String [] solution(int n, int [] arr1, int [] arr2) {
        String [] result = new String[n];
        String [] tmp1 = new String[n];
        String [] tmp2 = new String[n];
        for (int i = 0; i < n; i++) {
            tmp1[i] = toBinary(arr1[i], n);
            tmp2[i] = toBinary(arr2[i], n);
        }

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++)
                if (tmp1[i].charAt(j) == '0' && tmp2[i].charAt(j) == '0')
                    sb.append(" ");
                else
                    sb.append("#");


            result[i] = sb.toString();
        }

        for (int i = 0; i < n; i++)
            System.out.println(result[i]);

        return result;
    }

    public static String toBinary(int x, int len) {
        return String.format("%" + len + "s", Integer.toBinaryString(x)).replaceAll(" ", "0");
    }
}
