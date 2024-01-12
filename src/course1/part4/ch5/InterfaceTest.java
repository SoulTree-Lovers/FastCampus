package course1.part4.ch5;

import course1.part4.ch5.model.Radio;
import course1.part4.ch5.model.RemoCon;
import course1.part4.ch5.model.TV;

public class InterfaceTest {
    public static void main(String[] args) {
        // 리모콘으로 라디오와 티비를 동작시켜보자.
        RemoCon remoCon1 = new Radio();
        RemoCon remoCon2 = new TV();

        remoCon1.chUp();
        remoCon1.chDown();
        remoCon1.volUp();
        remoCon1.volDown();

        remoCon2.chUp();
        remoCon2.chDown();
        remoCon2.volUp();
        remoCon2.volDown();
    }
}
