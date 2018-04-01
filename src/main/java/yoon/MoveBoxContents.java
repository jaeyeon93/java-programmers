package yoon;

class BoxContentsMover {
    // from에 저장된 내용을 to로 이동
    public static void moveBox(Box2<? super Toy> to, Box2<? extends Toy> from) {
        to.set(from.get());
    }
}

public class MoveBoxContents {
    public static void main(String [] args) {
        Box2<Toy> box1 = new Box2<>();
        box1.set(new Toy());
        Box2<Toy> box2 = new Box2<>();

        // box1에 저장된 내용을 box2로 이동
        BoxContentsMover.moveBox(box2, box1);
        System.out.println(box2.get());
    }
}
