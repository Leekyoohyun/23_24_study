package extends1.overriding;

public class ElectricCar extends Car {

    @Override   // 없어도 되는데 개발자들끼리 알려고 써줌.
    public void move(){
        System.out.println("전기차를 빠르게 이동합니다.");
    }
    public void charge(){
        System.out.println("충전합니다.");
    }
}
