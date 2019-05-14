package baekjoon;

import java.io.*;

public class Baekjoon2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int h = Integer.parseInt(arr[2]);
        int day = 0;
        h -=a ;
        if (h % (a-b) == 0)
            day += (h/(a-b));
        else
            day += (h/(a-b))+1;
        day++;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(day));
        bw.flush();
        bw.close();
    }
}
