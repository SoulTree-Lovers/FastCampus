package course2.part2.ch1;

public class IntegerStringTest {
    public static void main(String[] args) {
        // String -> Integer 변환
        String str1 = "123";
        String str2 = "456";

        System.out.println(str1 + str2); // "123" + "456" = "123456"

        Integer int1 = Integer.parseInt(str1);
        Integer int2 = Integer.parseInt(str2);

        System.out.println(int1 + int2); // 123 + 456 = 579

        // Integer -> String 변환
        Integer int3 = 111;
        Integer int4 = 222;

        System.out.println(int3 + int4); // 111 + 222 = 333

        String str3 = String.valueOf(int3);
        String str4 = String.valueOf(int4);

        System.out.println(str3 + str4); // "111" + "222" = "111222"
    }
}
