package baekjoon;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjoon7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            personList.add(new Person(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }
        for (int i = 0; i < n; i++) {
            int current_rank = 1;
            Person current = personList.get(i);
            for (int j = 0; j < n; j++) {
                if (i == n) continue;
                if (current.compareTo(personList.get(j)) == -1) current_rank++;
            }
            current.rank = current_rank;
        }
        for (Person p : personList)
            System.out.print(p.rank + " ");
    }

    private static class Person implements Comparable<Person> {
        int weight;
        int height;
        int rank;

        Person(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }

        @Override
        public int compareTo(Person o) {
            if (this.weight > o.weight && this.height > o.height)
                return 1;
            else if (this.weight < o.weight && this.height < o.height)
                return -1;
            return 0;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "weight=" + weight +
                    ", height=" + height +
                    ", rank=" + rank +
                    '}';
        }
    }
}
