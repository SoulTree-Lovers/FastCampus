package course2.part2.ch3;

import course2.part2.ch3.model.MathOperation;

public class FuntionInterfaceTest3 {
    public static void main(String[] args) {
        MathOperation mathOperation = new MathOperation() { // 익명 클래스(내부 클래스)를 통해 직접 구현하여 사용하는 방식 --> 중요 !!!!!
            @Override
            public int operation(int x, int y) {
                return x + y;
            }
        };

        System.out.println(mathOperation.operation(10, 20));
    }
}
