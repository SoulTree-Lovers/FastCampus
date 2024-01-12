package course1.part3.ch2.model;

public class CarUtility {
    public void carInfoPrint(CarDTO car) {
        System.out.println(car.carSn);
        System.out.println(car.carName);
        System.out.println(car.carPrice);
        System.out.println(car.carOwner);
        System.out.println(car.carYear);
        System.out.println(car.carType);
    }
}
