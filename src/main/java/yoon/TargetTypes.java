package yoon;

class EmptyBoxFactory {
    public static <T> Box2<T> makeBox() {
        Box2<T> box = new Box2<>();
        return box;
    }
}

public class TargetTypes {
    public static void main(String [] args) {
        Box2<Integer> iBox = EmptyBoxFactory.<Integer>makeBox();
        iBox.set(25);
        System.out.println(iBox.get());
    }
}
