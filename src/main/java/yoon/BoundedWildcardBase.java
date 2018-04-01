package yoon;

class Toy {
    @Override
    public String toString() {
        return "I am a boy";
    }
}

class BoxHandler {
    public static <T> void outBox(Box2<? extends T> box) {
        T t = box.get(); // 상자에 꺼내기
        System.out.println(t);
    }

    public static <T> void inBox(Box2<? super T> box, T n) {
        box.set(n); // 상자에 넣기
    }
}

public class BoundedWildcardBase {
    public static void main(String [] args) {
        Box2<Toy> box = new Box2<>();
        BoxHandler.inBox(box, new Toy());
        BoxHandler.outBox(box);
    }
}
