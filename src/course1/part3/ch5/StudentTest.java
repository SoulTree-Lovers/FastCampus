package course1.part3.ch5;

import course1.part3.ch5.model.Student;

public class StudentTest {
    public static void main(String[] args) {
        // Q. 정수 6개를 저장할 배열을 생성
        int[] array = new int[6];

        array[0] = 10;
        array[1] = 20;
        array[2] = 40;
        array[3] = 80;
        array[4] = 160;
        array[5] = 320;

        for (int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }

        // Q. 잘 설계된 Student 객체를 설계한 후 데이터를 저장하고 출력
        Student s1 = new Student("강승민", "컴공", 25, "rkd@naver.com", 20240101, "010-1234-1234");

        System.out.println(s1);
    }
}
