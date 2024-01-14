package course2.part2.ch3.model;

import course2.part1.ch1.model.PersonNew;

@FunctionalInterface
public interface PersonFactory {
    public PersonNew create(String name, int age);
}
