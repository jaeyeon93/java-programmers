package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Baekjoon10942 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String [] nums = br.readLine().split(" ");
            System.out.println(solution(list, Integer.parseInt(nums[0]), Integer.parseInt(nums[1])));
        }
    }

    public static Integer solution(List<Integer> list, int s, int e) {
        if (s == e)
            return 1;
        for (int i = s-1; i < e; i++)
            if (list.get(i) != list.get(e-i+s-2))
                return 0;
        return 1;
    }
}
