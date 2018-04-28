package yoon;

class Person {
    public static final Person MAN = new Person();
    public static final Person WoMAN = new Person();

    @Override
    public String toString() {
        return "I am a dog person";
    }
}

public class InClassInst {
    public static void main(String[] args) {
        System.out.println(Person.MAN);
        System.out.println(Person.WoMAN);
    }
}
