package part3.ch4.model;

public class PersonDTO {
    private String name;
    private int age;
    private String phone;

    public PersonDTO() {
        this.name = "강승민";
        this.age = 25;
        this.phone = "010-1111-1111";
    }

    // 생성자 오버로딩
    public PersonDTO(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
