package part3.ch2;

import java.util.Scanner;
import part3.ch2.model.CarDTO;

public class CarTest {
    public static void main(String[] args) {
        // Q. 자동차의 정보를 키보드로부터 입력받아 다른 메소드로 이동해야하는 경우
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

//        carInfoPrint(carSn, carName, carPrice, carOwner, carYear, carType);
        CarDTO car1 = new CarDTO();
        car1.carSn = carSn;
        car1.carName = carName;
        car1.carPrice = carPrice;
        car1.carOwner = carOwner;
        car1.carYear = carYear;
        car1.carType = carType;

        carInfoPrint(car1);
    }

    // Q. 매개변수로 자동차의 정보를 받아서 출력하는 메소드
    public static void carInfoPrint(CarDTO car) {
        System.out.println(car.carSn);
        System.out.println(car.carName);
        System.out.println(car.carPrice);
        System.out.println(car.carOwner);
        System.out.println(car.carYear);
        System.out.println(car.carType);
    }
}
