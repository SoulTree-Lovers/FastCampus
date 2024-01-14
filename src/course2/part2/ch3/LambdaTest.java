package course2.part2.ch3;

import course2.part2.ch3.model.MathOperation;

public class LambdaTest {
    public static void main(String[] args) {
        // 익명 클래스 구현 방식
        MathOperation add = new MathOperation() {
            @Override
            public int operation(int x, int y) {
                return x + y;
            }
        };

        System.out.println(add.operation(10, 20));

        // 람다식으로 구현하는 방식 1
        MathOperation add2 = (int x, int y) -> {return x + y;};

        System.out.println(add2.operation(10, 20));

        // 람다식으로 구현하는 방식 2 (축약 버전)
        MathOperation add3 = (x, y) -> x + y;

        System.out.println(add3.operation(10, 20));

    }
}
