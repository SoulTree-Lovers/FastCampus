package part4.ch2.model;

public class Dog extends Animal {
    public Dog() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("개처럼 먹다.");
    }
}
