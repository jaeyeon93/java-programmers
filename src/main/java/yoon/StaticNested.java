package yoon;

class Outer {
    private static int num = 0;
    static class Nested1 { // static 네스티드 클래스
        void add(int n) { num += n; }
    }
    static class Nested2 { // Static 네스티드 클래스
        int get() {return num;}
    }
}

public class StaticNested {
    public static void main(String[] args) {
        Outer.Nested1 nst1 = new Outer.Nested1();
        nst1.add(5);
        Outer.Nested2 nst2 = new Outer.Nested2();
        System.out.println(nst2.get());
    }
}
