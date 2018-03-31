package yoon;

class Unboxer2 {
    public static void peekBox(Box2<? super Integer> box) {
        System.out.println(box);
    }
}

public class LowerBoundedWildcard {
    public static void main(String [] args) {
        Box2<Integer> iBox = new Box2<Integer>();
        iBox.set(5577);

        Box2<Number> nBox = new Box2<Number>();
        nBox.set(new Integer(9955));

        Box2<Object> oBox = new Box2<Object>();
        oBox.set("My Simple Instance");

        Unboxer2.peekBox(iBox);
        Unboxer2.peekBox(nBox);
        Unboxer2.peekBox(oBox);
    }
}
