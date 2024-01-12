package course1.part3.ch3;

// import java.lang.* -> 기본적으로 자바에서 제공하는 패키지

import java.util.Scanner;
import course1.part3.ch2.model.CarDTO;
import course1.part3.ch3.model.MemberDTO;

public class PackageNameTest {
    public static void main(String[] args) {
        // Q. 지금까지 자바에서 제공한 클래스의 이름을 적어보자.
        String str;
        Scanner scanner;
        System.out.println("hello world!");

        // Q. 우리가 직접 만든 클래스 이름을 적어보자.
        CarDTO carDTO = new CarDTO(); // 클래스 이름만 적는 방식
        course1.part3.ch2.model.CarDAO carDAO = new course1.part3.ch2.model.CarDAO(); // 클래스 경로까지 포함하여 적는 방식
        MemberDTO memberDTO = new MemberDTO();

    }
}
