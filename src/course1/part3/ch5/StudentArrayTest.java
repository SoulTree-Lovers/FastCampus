package course1.part3.ch5;

import course1.part3.ch5.model.Student;

public class StudentArrayTest {
    public static void main(String[] args) {
        // Q. 객체 배열을 이용하여 4명의 학생 데이터를 저장 후 출력
        Student[] students = new Student[4];

        students[0] = new Student("강승민", "컴공1", 25, "rkd@naver.com", 20240101, "010-1234-1234");
        students[1] = new Student("김승민", "컴공2", 24, "rkd@naver.com", 20240101, "010-1234-1234");
        students[2] = new Student("박승민", "컴공3", 23, "rkd@naver.com", 20240101, "010-1234-1234");
        students[3] = new Student("이승민", "컴공4", 22, "rkd@naver.com", 20240101, "010-1234-1234");


        for (int i=0; i< students.length; i++) {
            System.out.println(students[i]);
        }

        System.out.println();

        for (Student student: students) {
            System.out.println(student);
        }
    }
}
