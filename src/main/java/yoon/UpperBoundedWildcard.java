package yoon;

public class UpperBoundedWildcard {
    public static void main(String [] args) {
        Box2<Integer> iBox = new Box2<>();
        iBox.set(1234);

        Box2<Double> dBox = new Box2<>();
        dBox.set(10.009);

        Unboxer.peekBox(iBox);
        Unboxer.peekBox(dBox);
    }
}
