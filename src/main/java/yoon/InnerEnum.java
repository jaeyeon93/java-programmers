package yoon;

class Customer {
    enum Gender { // 클래스 내에 정의된 열거형 Gender
        MALE, FEMALE
    }

    private String name;
    private Gender gen;

    // Customer 클래스의 생성자
    Customer(String n, String g) {
        name = n;

        if(g.equals("man"))
            gen = Gender.MALE;
        else
            gen = Gender.FEMALE;
    }

    @Override
    public String toString() {
        if(gen == Gender.MALE)
            return "Thank you, Mr " + name;
        else
            return "Thank you, Mrs " + name;
    }
}

public class InnerEnum {
    public static void main(String [] args) {
        Customer cus1 = new Customer("Brwon", "man");
        Customer cus2 = new Customer("Susan Hill", "woman");

        System.out.println(cus1);
        System.out.println(cus2);
    }
}
