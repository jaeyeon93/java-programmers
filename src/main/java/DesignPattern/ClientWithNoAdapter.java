package DesignPattern;

class ServiceA {
    void runServerA() {
        System.out.println("ServiceA");
    }
}

class AdapterServiceA {
    ServiceA sa1 = new ServiceA();

    void runserver() {
        sa1.runServerA();
    }
}

class ServiceB {
    void runServerB() {
        System.out.println("ServiceB");
    }
}

class AdapterServiceB {
    ServiceB sb1 = new ServiceB();

    void runserver() {
        sb1.runServerB();
    }
}

public class ClientWithNoAdapter {
    public static void main(String[] args) {
        AdapterServiceA asa1 = new AdapterServiceA();
        AdapterServiceB asb1 = new AdapterServiceB();

        asa1.runserver();
        asb1.runserver();
    }
}
