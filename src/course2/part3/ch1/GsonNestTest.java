package course2.part3.ch1;

import com.google.gson.Gson;
import course2.part3.ch1.model.Address;
import course2.part3.ch1.model.Person;

public class GsonNestTest {
    public static void main(String[] args) {
        Address address = new Address("서울", "대한민국");
        Person p1 = new Person("강승민", 25, "abc@naver.com", address);

        // Person -> Json
        Gson gson = new Gson();
        String json = gson.toJson(p1);
        System.out.println("json = " + json);

        // Json -> Person
        Person p2 = gson.fromJson(json, Person.class);
        System.out.println("p2 = " + p2);
    }
}
