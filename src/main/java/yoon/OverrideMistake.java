package yoon;

class ParentAdder {
    public int add(int a, int b){
        return a + b;
    }
}

class ChildAdder extends ParentAdder {
    @Override
    public double add(double a, double b) {
        System.out.println("덧셈을 진행합니다.");
        return a + b;
    }
}

public class OverrideMistake {
    public static void main(String [] args){
        ParentAdder adder = new ChildAdder();
        System.out.println(adder.add(3, 4));
    }
}
