package yoon;

import java.util.TreeSet;

class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() { return name + " : " + age; }

    @Override
    public int compareTo(Person p) {
        return this.age - p.age;
    }
}

public class ComparablePerson {
    public static void main(String[] args) {
        TreeSet<Person> tree = new TreeSet<>();
        tree.add(new Person("YOON", 37));
        tree.add(new Person("HONG", 53));
        tree.add(new Person("PARK", 22));

        for(Person p : tree)
            System.out.println(p);
    }

}
