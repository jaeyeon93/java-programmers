package yoon;

class SteelBox<T> extends Box2<T> {
    public SteelBox(T o) {
        ob = o;
    }
}

public class GenericInheritance {
    public static void main(String [] args) {
        Box2<Integer> iBox = new SteelBox<>(7959);
        Box2<String> sBox = new SteelBox<>("Simple");
        System.out.println(iBox.get());
        System.out.println(sBox.get());
    }
}
