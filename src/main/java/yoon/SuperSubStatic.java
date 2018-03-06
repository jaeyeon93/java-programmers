package yoon;

public class SuperSubStatic {
    public static void main(String [] args){
        SuperCLS obj1 = new SuperCLS(); // count 값 1증가
        SuperCLS obj2 = new SuperCLS(); // count 값 1증가

        SubCLS obj3 = new SubCLS();
        obj3.showCount();
    }
}
