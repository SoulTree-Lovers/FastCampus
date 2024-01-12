package course2.part1.ch3;

public class StringTest {
    public static void main(String[] args) {
        String str1 = new String("HelloWorld"); // Heap 메모리에 저장
        System.out.println(str1.toString());

        String str2 = "HelloWorld"; // Literal Pool 메모리에 저장
        System.out.println(str2.toString());

    }
}
