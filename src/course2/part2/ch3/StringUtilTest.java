package course2.part2.ch3;

import course2.part2.ch3.model.Converter;
import course2.part2.ch3.model.StringUtil;

public class StringUtilTest {
    public static void main(String[] args) {
        // 인스턴스 메소드 참조 방식
        StringUtil stringUtil = new StringUtil();

        Converter<String, String> converter = stringUtil::reverse;
        String result = converter.convert("hello");

        System.out.println(result);
    }

}
