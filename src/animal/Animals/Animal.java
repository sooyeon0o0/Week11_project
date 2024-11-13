package animal.Animals;

import animal.move.Walking;

public class Animal {
    public String color;
    public String name;

    Walking walking = new Walking();

    public void eat() {
        System.out.println("이 동물의 이름은 " + name);
        System.out.println("이 동물의 색상은 " + color);
        System.out.println("사료를 먹습니다.");
    }

    public double speed(double distance, double time) {
        double speed = distance / time;
        System.out.println("이 동물의 달리기 속도는 " + speed + "km/h");
        return speed;
    }
}
