package animal.Animals.dog;

import animal.Animals.Animal;
import animal.move.Walking;

public class Dog extends Animal {

    public Walking walking = new Walking();

    public void digging() {
        System.out.println("땅을 파기 시작합니다.");
    }
}
