package yoon;

public class PrefixOp {
    public static void main(String [] args){
        int num = 7;
        System.out.println(++num);
        System.out.println(++num);
        System.out.println(num);

        int num2 = 5;
        System.out.print((num2++) + " "); // 출력 후에 값이 증가
        System.out.print((num2++) + " "); // 출력 후에 값이 증가
        System.out.print(num2 + "\n");

        System.out.print((num2--) + " "); // 출력 후에 값이 감소
        System.out.print((num2--) + " "); // 출력 후에 값이 감소
        System.out.print(num2 + "\n");
    }
}
