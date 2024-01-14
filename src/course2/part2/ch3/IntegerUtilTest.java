package course2.part2.ch3;

import course2.part2.ch3.model.Converter;
import course2.part2.ch3.model.IntegerUtil;

public class IntegerUtilTest {
    public static void main(String[] args) {
        // 클래스 메소드 참조 방식
        Converter<String, Integer> converter = IntegerUtil::stringToInt;

        Integer result = converter.convert("123");
        System.out.println(result);
    }
}
