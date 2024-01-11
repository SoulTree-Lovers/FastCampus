package part4.ch6;

import part4.ch6.model.A;

public class ObjectTest {
    public static void main(String[] args) {
        // A 객체를 업 캐스팅으로 생성
        Object obj = new A();
        ((A) obj).printGo(); // 다운 캐스팅을 통해 자식 메소드 접근
    }
}
