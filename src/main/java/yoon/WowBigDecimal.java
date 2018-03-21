package yoon;

public class WowBigDecimal {
    public static void main(String [] args) {
        WowBigDecimal d1 = new WowBigDecimal("1.6");
        WowBigDecimal d2 = new WowBigDecimal("0.1");
        System.out.println("덧셈 결과 : " + d1.add(d2));
    }
}
