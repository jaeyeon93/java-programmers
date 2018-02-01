package javaLang;

public class WrapperExam {

    public static void main(String [] args){
        int i = 5;
        Integer i2 = new Integer(5);

        Integer i3 = 5;
        // Integer i3 = new Integer(5);
        // 자동으로 형변환이 된다. 이것을 auto-boxing이라고한다.

        int i4 = i3.intValue();
        int i5 = i3;
        // i4, i5는 같다.
        // 오토언박싱 : 객체 타입의 데이터를 기본형 타입의 데이터로 자동 형변환
    }
}
