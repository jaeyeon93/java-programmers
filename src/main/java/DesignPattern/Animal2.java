package DesignPattern;

abstract class Animal2 {
    // 추상 팩터리 메서드
    abstract AnimalToy getToy();
}

abstract class AnimalToy {
    abstract void identify();
}

class Dog2 extends Animal2 {
    // 추상 팩터리 메서드 오버라이딩
    @Override
    AnimalToy getToy() {
        return new DogToy();
    }
}

class DogToy extends AnimalToy {
    public void identify() {
        System.out.println("나는 테니스공! 강아지의 친구");
    }
}

class Cat2 extends Animal2 {
    @Override
    AnimalToy getToy() {
        return new CatToy();
    }
}

class CatToy extends AnimalToy {
    @Override
    public void identify() {
        System.out.println("나는 캣타워! 고양이의 친구");
    }
}

class Driver2 {
    public static void main(String[] args) {
        // 팩터리 메서드를 보유한 객체들 생성
        Animal2 bolt = new Dog2();
        Animal2 kitty = new Cat2();

        // 팩터리메서드가 반환하는 객체들
        AnimalToy boltBall = bolt.getToy();
        AnimalToy kittyTower = kitty.getToy();

        // 팩터리메서드가 반환한 객체들 사용
        boltBall.identify();
        kittyTower.identify();
    }
}
