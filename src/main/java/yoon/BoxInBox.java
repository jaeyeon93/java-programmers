package yoon;

public class BoxInBox {
    public static void main(String [] args) {
        Box2<String> sBox = new Box2<>();
        sBox.set("I am so happy.");

        Box2<Box2<String>> wBox = new Box2();
        wBox.set(sBox);

        Box2<Box2<Box2<String>>> zBox = new Box2();
        zBox.set(wBox);

        System.out.println(zBox.get().get().get());
    }
}
