package yoon;

class Person {
    String name;

    public Person(String name) {
        name = this.name;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); // finalize를 호출
        System.out.println("destroyed : " + name);
    }
}

public class ObjectFinalize {
    public static void main(String [] args) {
        Person p1 = new Person("Yoon");
        Person p2 = new Person("Park");

        p1 = null; // 참조대상을 가비지컬렌션의 대상으로 만듬
        p2 = null;
        // System.gc
        // System.runFinalization

        System.out.println("end of program");
    }
}
