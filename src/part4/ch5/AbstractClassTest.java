package part4.ch5;

import part4.ch5.model.Animal;
import part4.ch5.model.Cat;
import part4.ch5.model.Dog;

public class AbstractClassTest {
    public static void main(String[] args) {
        // 추상 클래스는 단독으로 객체를 생성할 수 없다.
        // Animal animal = new Animal();
        Animal a1 = new Dog(); // 업 캐스팅은 가능하다.
        a1.eat();
        a1.move();

        Dog a2 = new Dog(); // 원래 타입으로도 생성이 가능하다.
        a2.eat();
        a2.move();

        Cat a3 = new Cat();
        a3.night();
    }
}
