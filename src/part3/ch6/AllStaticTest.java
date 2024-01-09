package part3.ch6;

import part3.ch6.model.AllStatic;

public class AllStaticTest {
    public static void main(String[] args) {
//        AllStatic allStatic = new AllStatic(); -> 이렇게 하는 것을 막도록 private 생성자 선언
//        System.out.println(allStatic.sum(10, 20)); // 30
//        System.out.println(allStatic.max(10, 20)); // 20
//        System.out.println(allStatic.min(10, 20)); // 10

        // 아래와 같이 사용하는 것이 바람직함.
        System.out.println(AllStatic.sum(10, 20));
        System.out.println(AllStatic.max(10, 20));
        System.out.println(AllStatic.min(10, 20));
    }
}
