package part4.ch5;

import part4.ch5.model.Animal;
import part4.ch5.model.Cat;
import part4.ch5.model.Dog;

public class NotOverride {
    public static void main(String[] args) {
        // Animal a = new Animal(); --> 추상 클래스는 객체 생성 불가능 !!

        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.eat();
        a2.eat();

    }
}
