package part4.ch4;

import part4.ch2.model.Animal;
import part4.ch2.model.Cat;
import part4.ch2.model.Dog;

public class PolyTest {
    public static void main(String[] args) {
        // Upcasting으로 객체 생성
        // 조건 --> 상속관계, 메소드가 재정의 되어있어야 함 --> (동적 바인딩)
        // 다형성: 상위 클래스가 동일한 메시지로 하위 클래스를 서로 다르게 동작시키는 객체지향 원리
        // 이 프로젝트에서는 eat()라는 동일한 메소드로 서로 다른 결과물을 출력
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.eat(); // 개처럼 먹다.
        a2.eat(); // 고양이처럼 먹다.
    }
}
