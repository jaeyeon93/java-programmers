package yoon;

public class BoxingUnboxing {
    public static void main(String [] args) {
        Integer iObj = new Integer(10);
        Double dObj = new Double(3.4);
        System.out.println(iObj);
        System.out.println(dObj);
        System.out.println();

        int num1 = iObj.intValue();
        double num2 = dObj.doubleValue();
        System.out.println(iObj);
        System.out.println(dObj);
        System.out.println();

        // 래퍼 인스턴스 값의 증가
        iObj = new Integer(iObj.intValue() + 10);
        dObj = new Double(dObj.doubleValue() + 1.2);
        System.out.println(iObj);
        System.out.println(dObj);
    }
}
