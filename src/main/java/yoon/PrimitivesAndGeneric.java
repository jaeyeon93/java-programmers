package yoon;

public class PrimitivesAndGeneric {
    public static void main(String [] args) {
        Box2<Integer> iBox = new Box2<Integer>();
        iBox.set(125); // 오토박싱 진행
        int num = iBox.get();
        System.out.println(num);
    }
}
