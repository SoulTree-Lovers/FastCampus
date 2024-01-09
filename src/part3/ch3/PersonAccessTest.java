package part3.ch3;

import part3.ch1.Person;

public class PersonAccessTest {
    public static void main(String[] args) {
        // Q. Person 클래스에 이름, 나이, 전화번호를 저장하고 출력
        Person p1 = new Person();
        p1.name = "강승민";
        p1.age = 1000; // 접근 문제 발생
        p1.phone = "010-1234-1234";

        System.out.println(p1.name + "\t" + p1.age + "\t" + p1.phone);
    }
}
