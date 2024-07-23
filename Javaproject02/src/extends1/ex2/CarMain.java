package extends1.ex2;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move(); // 부모 Car 클래스 꺼
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move(); // 부모 Car 클래스 꺼
        gasCar.fillUp();

    }
}
