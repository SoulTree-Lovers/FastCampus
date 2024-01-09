package part3;

public class PersonTest {
    public static void main(String[] args) {
        // Q. 한 사람의 데이터를 저장할 객체를 생성
        Person p = new Person();

        p.name = "강승민";
        p.age = 25;
        p.phone = "010-1234-1234";

        System.out.println(p.name + "\t" + p.age + "\t" + p.phone);

        p.play();
        p.eat();
        p.walk();
    }
}
