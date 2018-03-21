package yoon;

import java.math.BigInteger;

public class SoBigInteger {
    public static void main(String [] args) {
        // long형으로 표현 가능한 값의 크기 출력
        System.out.println("최대 정수 : " + Long.MAX_VALUE);
        System.out.println("최소 정수 : " + Long.MIN_VALUE);
        System.out.println();

        // 매우 큰 수를 BigInteger인스턴스로 표현
        BigInteger big1 = new BigInteger("100000000000");
        BigInteger big2 = new BigInteger("999999999999");

        //BigInteger기반 덧셈
        BigInteger r1 = big1.add(big2);
        System.out.println("덧셈 결과 : " + r1);

        //BigInteger곱셈
        BigInteger r2 = big1.multiply(big1);
        System.out.println("곱셈 결과 : " + r2);
        System.out.println();

        // 인스턴스에 저장된 값을 int형 정수로 변환
        int num = r1.intValueExact();
        System.out.println("From BigInteger : " + num);
    }
}
