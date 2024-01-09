package part3.ch4;

import part3.ch4.model.PersonDTO;

public class ConstructorOverloading {
    public static void main(String[] args) {
        PersonDTO p1 = new PersonDTO("김철수", 10, "010-1234-5678");

        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getPhone());
    }
}
