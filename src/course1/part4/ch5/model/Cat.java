package course1.part4.ch5.model;

public class Cat extends Animal {
    @Override
    public void eat() { // Animal 추상 클래스의 추상 메소드인 eat()를 반드시 구현해야 한다.
        System.out.println("고양이처럼 먹다.");
    }

    public void night() {
        System.out.println("밤에 눈에서 빛이 난다.");
    }
}
