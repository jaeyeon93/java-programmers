package yoon;

class Robot {
    @Override
    public String toString() {
        return "I am robot";
    }
}


public class BoundedWildcardGenericMethod {
    public static void main(String [] args) {
        Box2<Toy> tBox = new Box2<>();
        BoxHandler.inBox(tBox, new Toy());
        BoxHandler.outBox(tBox);
        Box2<Robot> rBox = new Box2<>();
        BoxHandler.inBox(rBox, new Robot());
        BoxHandler.outBox(rBox);
    }
}
