package yoon;

enum Person3 {
    MAN, WOMAN;

    @Override
    public String toString() {
        return "I am dog person";
    }
}

public class EnumConst {
    public static void main(String[] args) {
        System.out.println(Person.MAN); // toString 메소드의 반환 값 출력
        System.out.println(Person.WoMAN);
    }
}
