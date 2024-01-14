package course2.part2.ch3;

import course2.part2.ch3.model.MathOperation;
import course2.part2.ch3.model.MathOperationImplement;

public class FuntionInterfaceTest2 {
    public static void main(String[] args) {
        MathOperation mathOperation = new MathOperationImplement(); // 다른 클래스에 구현하여 가져와서 사용하는 방식

        System.out.println(mathOperation.operation(10, 20));
    }
}
