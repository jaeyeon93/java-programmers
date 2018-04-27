package yoon;

enum Animal {
    DOG, CAT
}

enum Person {
    MAN, WOMAN
}

public class SafeEnum {
    public static void main(String[] args) {
        who(Person.MAN);
    }

    public static void who(Person man) {
        switch (man) {
            case MAN:
                System.out.println("남성입니다.");
                break;
            case WOMAN:
                System.out.println("여성입니다.");
                break;
        }
    }
}
