package part4.ch4;

import part4.ch2.model.Animal;
import part4.ch2.model.Cat;
import part4.ch2.model.Dog;

public class PolyArrayTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        // Dog와 Cat을 저장할 배열 생성 (다형성 배열)
        Animal[] animals = new Animal[2];
        animals[0] = d;
        animals[1] = c;

        display(animals);
    }

    private static void display(Animal[] animals) {
        for (Animal animal: animals) {
            animal.eat();
            if (animal instanceof Cat) { // animal이 Cat 타입인 경우에만 night() 실행 가능
                ((Cat) animal).night();
            }
        }
    }
}
