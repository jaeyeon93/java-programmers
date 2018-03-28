package yoon;

class BoxFactory {
    public static <T> Box2<T> makeBox(T o) {
        Box2<T> box = new Box2<>();
        box.set(o);
        return box;
    }
}

public class GenericMethodBoxMaker {
    public static void main(String [] args) {
        Box2<String> sBox = BoxFactory.makeBox("Sweet");
        System.out.println(sBox.get());

        Box2<Double> dBox = BoxFactory.makeBox(7.59);
        System.out.println(dBox.get());
    }
}
