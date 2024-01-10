package part4.ch1;

import part4.ch1.model.RempDTO;

public class EmployeeTest {
    public static void main(String[] args) {
        // Q. 일반사원 한 명의 객체를 생성하고 데이터 저장 후 출력
        RempDTO rempDTO = new RempDTO("강승민", 25, "010-1234-1234", "2024-01-10", "컴공", false);

        System.out.println(rempDTO);

    }
}
