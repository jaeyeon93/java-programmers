package baekjoon;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Baekjoon11723 {
    private static int num;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String [] inputs = br.readLine().split(" ");
            String command = inputs[0];
            if (inputs.length != 1)
                num = Integer.parseInt(inputs[1]);

            if (command.equals("add")) set.add(num);
            if (command.equals("remove")) set.remove(num);
            if (command.equals("toggle")) {
                if (set.contains(num)) set.remove(num);
                else set.add(num);
            }
            if (command.equals("empty")) set = new HashSet<>();
            if (command.equals("all")) {
                for (int j = 1; j <= 20; j++) set.add(j);
            }

            if (command.equals("check"))
                if (set.contains(num))
                    bw.write(1 + "\n");
                else
                    bw.write(0 + "\n");
        }
        bw.flush();
    }
}
