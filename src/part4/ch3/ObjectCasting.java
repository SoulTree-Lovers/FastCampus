package part4.ch3;

import part4.ch2.model.Animal;
import part4.ch2.model.Cat;
import part4.ch2.model.Dog;

public class ObjectCasting {
    public static void main(String[] args) {
        // Animal --> Dog, Cat
        Animal a1 = new Dog(); // Upcasting
        Animal a2 = new Cat(); // Upcasting

        a1.eat();
        a2.eat();

        // a2.night(); --> Animal class에 메소드가 정의되어 있지 않기 때문에 사용 불가.
        Cat a3 = (Cat) a2; // Downcasting
        a3.night(); // 이제 night() 실행 가능 !
        ((Cat) a2).night(); // 이 방법으로 a2도 night() 실행 가능함.

        Animal a4 = new Animal();
        Cat a5 = (Cat) a4;
        a5.night(); // -> 이 방법은 사용 불가능. a4가 Upcasting 된 객체여야 Downcasting을 통해 night() 실행 가능.


    }
}
