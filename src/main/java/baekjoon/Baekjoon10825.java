package baekjoon;

import java.util.*;

public class Baekjoon10825 {
    public static class Student implements Comparable<Student> {
        private String name;
        private Integer korea;
        private Integer eng;
        private Integer math;

        public Student(String name, Integer korea, Integer eng, Integer math) {
            this.name = name;
            this.korea = korea;
            this.eng = eng;
            this.math = math;
        }

    @Override
    public int compareTo(Student o) {
        if (this.korea > o.korea) {
            return -1;
        } else if (this.korea == o.korea) {
            if (this.eng > o.eng) {
                return 1;
            } else if (this.eng == o.eng) {
                if (this.math > o.math) {
                    return -1;

                } else if (this.math == o.math) {
                    return this.name.compareTo(o.name);
                }
                return 1;
            }
            return -1; // 내림차순
        }
        return 1;
    }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++)
            students.add(new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
        Collections.sort(students);
        for (Student s : students)
            System.out.println(s.getName());
    }
}
