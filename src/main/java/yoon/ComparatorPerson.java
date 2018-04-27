//package yoon;
//
//import java.util.Comparator;
//import java.util.TreeSet;
//
//class PersonComparator implements Comparator<Person> {
//    public int compare(Person p1, Person p2) {
//        return p2.age - p1.age;
//    }
//}
//
//public class ComparatorPerson {
//    public static void main(String[] args) {
//        TreeSet<Person> tree = new TreeSet<>(new PersonComparator());
//        tree.add(new Person("YOON", 37));
//        tree.add(new Person("HONG", 53));
//        tree.add(new Person("PARK", 22));
//
//        for(Person p : tree)
//            System.out.println(p);
//    }
//}
