package course1.part3.ch2;

import course1.part3.ch2.model.CarDTO;
import course1.part3.ch2.model.CarUtility;

public class CarUtilityTest {
    public static void main(String[] args) {
        // Q. car 정보를 출력하는 동작을 가진 Utility 클래스 설계
        int carSn = 1110;
        String carName = "Tesla";
        int carPrice = 100000000;
        String carOwner = "강승민";
        int carYear = 2020;
        String carType = "G";

        CarDTO car1 = new CarDTO();
        car1.carSn = carSn;
        car1.carName = carName;
        car1.carPrice = carPrice;
        car1.carOwner = carOwner;
        car1.carYear = carYear;
        car1.carType = carType;

        CarUtility carUtility = new CarUtility();
        carUtility.carInfoPrint(car1);
    }
}
