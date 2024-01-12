package course1.part4.ch2;

import course1.part4.ch2.model.Animal;
import course1.part4.ch2.model.Cat;
import course1.part4.ch2.model.Dog;

public class DogCatUpcastingTest {
    public static void main(String[] args) {
        Animal a1 = new Dog(); // 업캐스팅 (부모가 자식을 가리킴)
        Animal a2 = new Cat();

        a1.eat(); // 개처럼 먹다. | Animal ---> (동적 바인딩) ---> Dog
        a2.eat(); // 고양이처럼 먹다. | Animal ---> (동적 바인딩) ---> Cat
    }
}
