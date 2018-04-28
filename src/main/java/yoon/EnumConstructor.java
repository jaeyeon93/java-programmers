package yoon;

enum Person4 {
    MAN, WOMAN;

    private Person4() {
        System.out.println("Person constructor called");
    }

    @Override
    public String toString() {
        return "I am a dog person";
    }
}

public class EnumConstructor {
    public static void main(String[] args) {
        System.out.println(Person4.MAN);
        System.out.println(Person4.WOMAN);
    }
}
