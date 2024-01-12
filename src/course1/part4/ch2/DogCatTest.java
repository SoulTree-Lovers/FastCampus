package course1.part4.ch2;


import course1.part4.ch2.model.Cat;
import course1.part4.ch2.model.Dog;

public class DogCatTest {
    public static void main(String[] args) {
        // Q. Dog 객체 생성 후 eat() 메소드 실행
        Dog d = new Dog();

        d.eat(); // 중복

        // Q. Cat 객체 생성 후 eat(), night() 메소드 실행
        Cat c = new Cat();

        c.eat(); // 중복
        c.night();
    }
}
