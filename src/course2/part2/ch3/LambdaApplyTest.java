package course2.part2.ch3;

import course2.part2.ch3.model.StringOperation;

public class LambdaApplyTest {
    public static void main(String[] args) {
        StringOperation toUpperCase = s -> s.toUpperCase();
        StringOperation toLowerCase = s -> s.toLowerCase();

        String input = "Lambda Expressions";

        System.out.println(processString(input, toUpperCase));
        System.out.println(processString(input, toLowerCase));

    }

    public static String processString(String input, StringOperation operation) { // 람다식을 인자로 넘기기
        return operation.apply(input);
    }
}

