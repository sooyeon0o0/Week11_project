package animal.Animals.cat;

import animal.Animals.Animal;
import animal.move.Walking;

public class Cat extends Animal {

    public String color;
    public int type;

    public Walking walking = new Walking();

    public void grooming() {
        System.out.println("그루밍합니다.");
    }

    void grooming(int type) {
        System.out.println("그루밍합니다.");
    }
    // 스위치 사용 -> 그루밍의 케이스  설정 ==> 오버로딩
    // 오버로딩 -> 메서드의 매개변수 개수 또는 타입이 달라야 함.

    public void eat() {
        System.out.println("이 동물의 이름은 " + name);
        System.out.println("이 동물의 색상은 " + color);
        System.out.println("사료를 허겁지겁 먹습니다.");
    }
    // 오버라이딩 -> 상속받은 메서드를 자식 클래스에서 재정의하는 것.

}
