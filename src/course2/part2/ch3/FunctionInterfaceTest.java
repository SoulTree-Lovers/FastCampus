package course2.part2.ch3;

import course2.part2.ch3.model.MathOperation;

public class FunctionInterfaceTest implements MathOperation { // 클래스를 상속받아 내부에 직접 구현하는 방식
    public static void main(String[] args) {
        MathOperation mathOperation = new FunctionInterfaceTest();

        System.out.println(mathOperation.operation(10, 20));
    }

    @Override
    public int operation(int x, int y) {
        return x + y;
    }
}
