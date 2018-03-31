package yoon;

class Unboxer {
    public static <T> T openBox(Box2<T> box) {
        return box.get();
    }

    // 상자안의 내용물을 확인하는 기능의 제네릭 메소드
    // ?는 와일드카드 기호이다
    public static <T> void peekBox(Box2<? extends Number> box) {
        System.out.println(box);
    }
}

public class WildcardUnboxer {
    public static void main(String [] args) {
        Box2<Integer> box = new Box2<>();
        box.set(3);
        Unboxer.peekBox(box);
    }
}
