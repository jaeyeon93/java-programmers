package DesignPattern;

public abstract class Animal {
    // 템플릿 메서드
    public void playWithOwner() {
        System.out.println("귀염둥이 이리온...");
        play();
        runSomething();
        System.out.println("잘했어");
    }

    // 추상메서드
    abstract void play();

    // Hook(갈고리)메서드
    void runSomething() {
        System.out.println("꼬리 살랑 살랑~");
    }
}

class Dog extends Animal {
    @Override
    void play() {
        System.out.println("멍! 멍");
    }

    @Override
    void runSomething() {
        System.out.println("멍! 멍! 꼬리 살랑 살랑~");
    }
}

class Cat extends Animal {
    @Override
    void play() {
        System.out.println("야옹~ 야옹");
    }

    @Override
    void runSomething() {
        System.out.println("야옹~ 야옹~ 꼬리 살랑 살랑~");
    }
}

class Driver {
    public static void main(String[] args) {
        Animal bolt = new Dog();
        Animal kitty = new Cat();

        bolt.playWithOwner();

        System.out.println();
        System.out.println();

        kitty.playWithOwner();
    }
}