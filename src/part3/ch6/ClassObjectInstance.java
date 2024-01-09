package part3.ch6;

import part3.ch5.model.Student;

public class ClassObjectInstance {
    public static void main(String[] args) {
        // Student: Class (클래스)
        Student s1; // Object 상태 (객체)
        s1 = new Student("강승민", "컴공", 25, "rkd@naver.com", 2024, "010-1234-1234"); // Instance 상태 (인스턴스)
    }
}
