package course1.part3.ch6;

public class StaticTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result = sum(a, b);
        System.out.println(result);
    }
    // Q. 매개변수로 2개의 정수를 입력받아서 총합을 구하여 리턴하는 메소드를 정의
    public static int sum(int a, int b) {
        int result = a+b;
        return result;
    }
}
