package yoon;

interface Eatable {
    public String eat();
}

class Apple2 implements Eatable {
    @Override
    public String toString() {
        return "I am an apple.";
    }

    @Override
    public String eat() {
        return "It's tastes so good";
    }
}

class Box3<T extends Eatable> {
    T ob;

    public void set(T o) {
        ob = o;
    }

    public T get() {
        System.out.println(ob.eat()); // Eatable로 제한해서 eat호출 가능
        return ob;
    }
}



public class BoundedInterfaceBox {
    public static void main(String [] args) {
        Box3<Apple2> box = new Box3<>();
        box.set(new Apple2()); // 사과 저장

        Apple2 ap = box.get(); // 사과 꺼내기
        System.out.println(ap);
    }
}
