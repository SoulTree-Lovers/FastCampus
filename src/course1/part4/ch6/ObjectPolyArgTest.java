package course1.part4.ch6;

import course1.part4.ch6.model.A;
import course1.part4.ch6.model.B;

public class ObjectPolyArgTest {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        display(a);
        display(b);
    }

    private static void display(Object obj) {
        if (obj instanceof A) { // obj가 A 타입이라면, A의 printGo() 실행
            ((A) obj).printGo();
        } else if (obj instanceof B) { // obj가 B 타입이라면, B의 printGo() 실행
            ((B) obj).printGo();
        }
    }
}
