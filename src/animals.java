public class animals {
    public static void main(String[] args) {
        Animal animal = new Animal();

        Cat cat = new Cat();
        cat.color = "grey";
        cat.name = "고양이";
        cat.speed(48,1);
        cat.eat();
        cat.grooming();
        cat.type = 1;

        switch (cat.type) {
            case 1:
                System.out.println("점박이 고양이 입니다.");
                break;
            case 2:
                System.out.println("삼색털 고양이 입니다.");
                break;
            case 3:
                System.out.println("노란 줄무늬 고양이 입니다.");
                break;
            // 케이스로 오버로딩 설정
        }
        cat.walking.pet();

        Dog dog = new Dog();
        dog.color = "black";
        dog.name = "강아지";
        dog.speed(30,1);
        dog.eat();
        dog.digging();
        dog.walking.pet();

        Pig pig = new Pig();
        pig.color = "pink";
        pig.name = "돼지";
        pig.speed(73,1);
        pig.eat();
        pig.wallow();
        pig.walking.pet();
    }
}

class Animal {
    String color;
    String name;

    Walking walking = new Walking();
    void eat() {
        System.out.println("이 동물의 이름은 " + name);
        System.out.println("이 동물의 색상은 " + color);
        System.out.println("사료를 먹습니다.");
    }

    double speed(double distance, double time) {
        double speed = distance / time;
        System.out.println("이 동물의 달리기 속도는 " + speed + "km/h");
        return speed;
    }
}

class Cat extends Animal {

    int type;

    Walking walking = new Walking();
    void grooming() {
        System.out.println("그루밍합니다.");
    }
    void grooming(int type) {
        System.out.println("그루밍합니다.");
    }
    // 스위치 사용 -> 그루밍의 케이스  설정 ==> 오버로딩
    // 오버로딩 -> 메서드의 매개변수 개수 또는 타입이 달라야 함.

    void eat() {
        System.out.println("이 동물의 이름은 " + name);
        System.out.println("이 동물의 색상은 " + color);
        System.out.println("사료를 허겁지겁 먹습니다.");
    }
    // 오버라이딩 -> 상속받은 메서드를 자식 클래스에서 재정의하는 것.

}

class Dog extends Animal {

    Walking walking = new Walking();
    void digging() {
        System.out.println("땅을 파기 시작합니다.");
    }
}

class Pig extends Animal {

    Walking walking = new Walking();
    void wallow() {
        System.out.println("진흙탕에서 뒹굽니다.");

    }
}

class Walking {
    void pet() {
        System.out.println("반려동물이 됐습니다.");
    }
}