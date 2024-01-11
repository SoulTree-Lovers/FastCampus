package part3.ch4;

import part3.ch4.model.PersonDTO;

public class PersonInfoHideTest {
    public static void main(String[] args) {
        PersonDTO p1 = new PersonDTO();
        p1.setName("강승민");
        p1.setAge(25);
        p1.setPhone("010-1234-1234");

        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getPhone());
    }
}
