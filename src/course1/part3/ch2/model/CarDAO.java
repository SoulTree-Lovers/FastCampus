package course1.part3.ch2.model;

public class CarDAO {
    // CRUD
    public void carInsert(CarDTO car) {
        // DB 연결, insert SQL
        System.out.println("car 정보가 DB에 저장되었습니다.");
    }

    public void carSelect() {
        // DB 연결, select SQL
        System.out.println("car 정보가 출력되었습니다.");
    }
}
