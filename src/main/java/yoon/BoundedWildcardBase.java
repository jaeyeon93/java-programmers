package yoon;

class Toy {
    @Override
    public String toString() {
        return "I am a boy";
    }
}

class BoxHandler {
    public static void outBox(Box2<Toy> box) {
        Toy t = box.get(); // 상자에 꺼내기
        System.out.println(t);
    }

    public static void inBox(Box2<Toy> box, Toy n) {
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
