package yoon;

class Apple {
    public String toString() {
        return "I am an apple.";
    }
}

class Orange {
    @Override
    public String toString() {
        return "I am an orange";
    }
}

class Box2<T> {
    private T ob;

    public void set(T o) {
        ob = o;
    }

    public T get() {
        return ob;
    }
}

public class FruitAndBox {
    public static void main(String [] args) {
        Box2<Apple> aBox = new Box2<Apple>(); // T를 Apple로 결정
        Box2<Orange> bBox = new Box2<Orange>();

        aBox.set(new Apple()); // 상자에 사과를 담는다
        bBox.set(new Orange());

        Apple ap = aBox.get(); // 상자에서 사과를 꺼낸다
        Orange og = bBox.get();

        System.out.println(ap);
        System.out.println(og);
    }

}
