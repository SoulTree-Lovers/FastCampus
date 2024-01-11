package part3.ch2;

import java.util.Scanner;
import part3.ch2.model.CarDAO;
import part3.ch2.model.CarDTO;

public class CarInsertTest {
    public static void main(String[] args) {
        // Q. 자동차 정보를 키보드로부터 입력을 받아서 DB에 저장 (JDBC)
        Scanner scanner = new Scanner(System.in);

        System.out.print("자동차일련번호: ");
        int carSn = scanner.nextInt();

        scanner.nextLine();

        System.out.print("자동차이름: ");
        String carName = scanner.nextLine();

        System.out.print("자동차가격: ");
        int carPrice = scanner.nextInt();

        scanner.nextLine();

        System.out.print("자동차소유자: ");
        String carOwner = scanner.nextLine();

        System.out.print("자동차연식: ");
        int carYear = scanner.nextInt();

        scanner.nextLine();

        System.out.print("자동차타입: "); // G(휘발유), D(경유)
        String carType = scanner.nextLine();

        CarDTO car1 = new CarDTO();
        car1.carSn = carSn;
        car1.carName = carName;
        car1.carPrice = carPrice;
        car1.carOwner = carOwner;
        car1.carYear = carYear;
        car1.carType = carType;

        CarDAO carDAO = new CarDAO();
        carDAO.carInsert(car1);
        carDAO.carSelect();
    }
}
