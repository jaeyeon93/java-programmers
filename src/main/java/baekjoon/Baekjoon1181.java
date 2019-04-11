package baekjoon;

import java.util.*;

public class Baekjoon1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < size;i ++)
            set.add(sc.next());
        String [] arr = new String[set.size()];
        set.toArray(arr);

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return Integer.compare(o1.length(), o2.length());
                }
            }
        });

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}
