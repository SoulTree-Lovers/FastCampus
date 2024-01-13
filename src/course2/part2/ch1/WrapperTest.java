package course2.part2.ch1;

public class WrapperTest {
    public static void main(String[] args) {
        // 정수형 변수에 10을 저장
        int a = 10; // primitive type (기본 자료형)

        // Integer b = new Integer(10) --> 원래 객체 사용 방법: boxing
        Integer b = 10; // Wrapper class (객체 자료형): auto boxing

        int c = b.intValue(); // unboxing: 객체 자료형 -> 기본 자료형
        int d = b; // auto unboxing

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
