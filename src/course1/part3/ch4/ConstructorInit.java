package part3.ch4;

import part3.ch4.model.PersonDTO;

public class ConstructorInit {
    public static void main(String[] args) {
        PersonDTO p1 = new PersonDTO(); // 생성자로 값 초기화

        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getPhone());
    }
}
