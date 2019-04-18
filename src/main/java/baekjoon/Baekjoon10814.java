package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon10814 {
    static class Person implements Comparable<Person> {
        private Integer age;
        private String name;
        private Integer count;

        Person(Integer age, String name, Integer count) {
            this.age = age;
            this.name = name;
            this.count = count;
        }


        @Override
        public int compareTo(Person o) {
            if (this.age == o.age)
                return this.count.compareTo(o.count);
            return this.age.compareTo(o.age);
        }

        @Override
        public String toString() {
            return this.age + " " + this.name + "\n";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person [] people = new Person[n];
        for (int i = 0; i < n; i++)
            people[i] = new Person(sc.nextInt(), sc.next(), i);

        Arrays.sort(people);
        for (int i = 0; i < n; i++)
            System.out.print(people[i].toString());
    }
}
