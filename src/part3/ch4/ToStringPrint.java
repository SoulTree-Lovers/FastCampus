package part3.ch4;

import part3.ch4.model.PersonDTO;

public class ToStringPrint {
    public static void main(String[] args) {
        PersonDTO p1 = new PersonDTO("강승민", 25, "010-1234-1234");

        System.out.println(p1.toString());
        System.out.println(p1); // toString()을 생략해도 됨. !!! (객체 자체 출력 시 자동으로 toString 호출)
    }
}
