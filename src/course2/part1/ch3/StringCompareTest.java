package course2.part1.ch3;

public class StringCompareTest {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        if (str1.equals(str2)) {
            System.out.println("두 문자열이 같다.");
        } else {
            System.out.println("두 문자열이 같지 않다.");
        }

        String str3 = "apple";
        String str4 = "banana";

        int result = str3.compareTo(str4);
        System.out.println(result);
        if (result == 0) {
            System.out.println("두 문자열이 같다.");
        } else if (result < 0) {
            System.out.println("str3이 str4보다 앞에 있다.");
        } else {
            System.out.println("str4가 str3보다 앞에 있다.");
        }
    }
}
