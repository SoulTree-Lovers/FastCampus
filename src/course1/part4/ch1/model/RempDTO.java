package course1.part4.ch1.model;

public class RempDTO extends Employee {
    public RempDTO() {
        super(); // 없어도 됨. (생략되어 있음)
    }

    public RempDTO(String name, int age, String phone, String empDate, String dept, boolean marriage) {
        super(name, age, phone, empDate, dept, marriage);
    }
}
