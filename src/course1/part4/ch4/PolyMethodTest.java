package course1.part4.ch4;

import course1.part4.ch2.model.Animal;
import course1.part4.ch2.model.Cat;
import course1.part4.ch2.model.Dog;

public class PolyMethodTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        display(d);
        display(c);
    }

    private static void display(Animal a) { // 다형성 인수: 하나의 타입으로 여러가지 타입을 받을 수 있다.
        a.eat();
        // a.night(); --> 오류 (Dog 클래스에는 night() 메소드가 없기 때문.)
        if (a instanceof Cat) { // Cat 타입인지 확인 후 night() 메소드 실행
            ((Cat) a).night();
        }
    }

//    private static void display(Dog d) {
//        d.eat();
//    }
//
//    private static void display(Cat c) {
//        c.eat();
//    }
}
