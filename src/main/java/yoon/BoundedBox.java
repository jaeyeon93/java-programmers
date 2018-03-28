package yoon;

public class BoundedBox {
    public static void main(String [] args) {
        Box2<Integer> iBox = new Box2<>(); // Integer는 Number를 상속
        iBox.set(24);

        Box2<Double> dBox = new Box2<>(); // Double은 Number를 상속
        dBox.set(5.97);

        System.out.println(iBox.get());
        System.out.println(dBox.get());
    }
}
