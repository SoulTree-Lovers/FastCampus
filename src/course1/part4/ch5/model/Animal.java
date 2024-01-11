package part4.ch5.model;

public abstract class Animal { // 추상 클래스
    public abstract void eat(); // 추상 메소드: 메소드의 바디 부분이 없다.

    public void move() { // 구현 메소드: 추상 클래스는 바디가 있는 메소드도 작성이 가능하다.
        System.out.println("무리를 지어서 이동한다.");
    }
}
