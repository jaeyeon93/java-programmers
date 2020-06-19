package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjoon11004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        List<Integer> input = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            input.add(Integer.parseInt(st.nextToken()));
        List<Integer> sorted = quickSort(input);
        bw.write(sorted.get(k-1) + "\n");
        bw.flush();
        bw.close();
    }

    private static List<Integer> quickSort(List<Integer> list) {
        if (list.size() < 2)
            return list;

        int pivot = list.get(0);
        List<Integer> lower = new ArrayList<>();
        List<Integer> higher = new ArrayList<>();

        for (int i = 1; i < list.size(); i++)
            if (list.get(i) > pivot)
                higher.add(list.get(i));
            else
                lower.add(list.get(i));
        List<Integer> sorted = quickSort(lower);
        sorted.add(pivot);
        sorted.addAll(quickSort(higher));
        return sorted;
    }
}
