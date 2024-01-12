package course2.part1.ch4;

import course2.part1.ch4.model.B;
import course2.part1.ch4.model.C;

public class InterfaceAPITest {
    public static void main(String[] args) {
        // C 인터페이스를 이용하여 B 클래스의 메소드를 동작시킴. (인터페이스 기반 프로그래밍)
        C c = new B();
        c.x(); // B의 x() 실행 --> 동적 바인딩
        c.y();
        c.z();
    }
}
