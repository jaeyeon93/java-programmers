package baekjoon;

import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.StringTokenizer;

public class Baekjoon1267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        int mPrice = 0;
        int yPrice = 0;

        for (int i : arr) {
            mPrice += mSolution(i);
            yPrice += ySolution(i);
        }

        if (mPrice == yPrice)
            System.out.println("Y M " + mPrice);
        else if (mPrice < yPrice)
            System.out.println("M " + mPrice);
        else
            System.out.println("Y " + yPrice);
    }

    public static int ySolution(int time) {
        int price = 10 * ((time /30)+1);
        return price;
    }

    public static int mSolution(int time) {
        int price = 15 * ((time/60)+1);
        return price;
    }
}
