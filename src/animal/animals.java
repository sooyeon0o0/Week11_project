package animal;

import animal.Animals.Animal;
import animal.Animals.cat.Cat;
import animal.Animals.dog.Dog;
import animal.Animals.pig.Pig;
import animal.move.Walking;

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

