package course2.part1.ch2;

import course2.part1.ch2.model.A2;
import course2.part1.ch2.model.B2;
import course2.part1.ch2.model.C2;
import course2.part1.ch2.model.ObjectArray;

public class MyObjectArrayTest {
    public static void main(String[] args) {
        // A, B, C 객체를 배열에 저장하고 출력
        ObjectArray objects = new ObjectArray();

        objects.add(new A2()); // Upcasting
        objects.add(new B2());
        objects.add(new C2());

        A2 a = (A2) objects.get(0);
        B2 b = (B2) objects.get(1);
        C2 c = (C2) objects.get(2);

//        a.display();
//        b.display();
//        c.display();

        for (int i=0; i< objects.size(); i++) {
            if (objects.get(i) instanceof A2) {
                ((A2) objects.get(i)).display();
            } else if (objects.get(i) instanceof B2) {
                ((B2) objects.get(i)).display();
            } else if (objects.get(i) instanceof C2) {
                ((C2) objects.get(i)).display();
            }
        }
    }
}
