package animal.Animals.pig;

import animal.Animals.Animal;
import animal.move.Walking;

public class Pig extends Animal {

    public Walking walking = new Walking();

    public void wallow() {
        System.out.println("진흙탕에서 뒹굽니다.");

    }
}
