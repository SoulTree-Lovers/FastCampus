package course2.part2.ch3;

import course1.part3.ch1.Person;
import course2.part1.ch1.model.PersonNew;
import course2.part2.ch3.model.PersonFactory;

public class PersonFactoryTest {
    public static void main(String[] args) {
        PersonFactory personFactory = PersonNew::new;

        PersonFactory personFactory1 = new PersonFactory() {
            @Override
            public PersonNew create(String name, int age) {
                return new PersonNew(name, age);
            }
        };

        PersonNew p1 = personFactory.create("강승민", 25);
        PersonNew p2 = personFactory1.create("강승환", 31);

        System.out.println(p1);
        System.out.println(p2);
    }
}
