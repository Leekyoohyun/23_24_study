package extends1.overriding;

public class CarMain {
    public static void main(String[] args) { // move 메소드 비교해보자
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();

        GasCar gasCar = new GasCar();
        gasCar.move();


    }
}
