package part3.ch6.model;

public class AllStatic {
    private AllStatic() {} // 객체를 생성하지 못하도록 설정

    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
