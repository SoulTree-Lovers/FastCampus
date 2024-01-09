package part3.ch6;

public class NonStaticTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        NonStaticTest nonStaticTest = new NonStaticTest(); // 객체를 생성해서 할당을 받아야 sum()을 사용할 수 있다.
        int result = nonStaticTest.sum(a, b);

        System.out.println(result);
    }

    public int sum(int a, int b) {
        int result = a+b;
        return result;
    }
}
