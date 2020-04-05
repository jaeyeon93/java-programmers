package baekjoon;

import java.io.*;
import java.util.*;

public class Baekjoon2751 {
//    public static List<Integer> sort(List<Integer> list) {
//        if (list.size() < 2)
//            return list;
//
//        int pivot = list.get(0);
//        List<Integer> lower = new ArrayList<>();
//        List<Integer> higher = new ArrayList<>();
//        for (int i = 1; i < list.size(); i++) {
//            if (list.get(i) < pivot) {
//                lower.add(list.get(i));
//            } else {
//                higher.add(list.get(i));
//            }
//        }
//        List<Integer> sorted = sort(lower);
//        sorted.add(pivot);
//        sorted.addAll(sort(higher));
//        return sorted;
//    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < count; i++)
            list.add(Integer.parseInt(br.readLine()));

        Collections.sort(list);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (Integer i : list)
            bw.write(i + "\n");
        bw.flush();
        bw.close();
    }
}
