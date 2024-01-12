package course2.part1.ch3;

public class StringSplitTest {
    public static void main(String[] args) {
        String str = "Hello,World,Java";
        String[] strings = str.split(",");

        for (String s: strings) {
            System.out.println(s);
        }

        String str2 = "Hello World  Java";
        String[] strings2 = str2.split("\\s+"); // 정규 표현식으로 하나 이상의 공백을 기준으로 구분

        for (String s: strings2) {
            System.out.println(s);
        }
    }
}
