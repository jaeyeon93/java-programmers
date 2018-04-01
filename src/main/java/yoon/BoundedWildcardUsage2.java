package yoon;

public class BoundedWildcardUsage2 {
    public static void main(String [] args) {
        Box2<Toy> box = new Box2<>();
        BoxHandler.inBox(box, new Toy());
        BoxHandler.outBox(box);
    }
}
