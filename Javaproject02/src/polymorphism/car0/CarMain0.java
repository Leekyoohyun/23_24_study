package polymorphism.car0;

public class CarMain0 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();
        driver.setK3Car(k3Car);
        driver.drive();

        driver.setK3Car(null);
        Model3Car model3Car = new Model3Car();
        driver.setModel3Car(model3Car);
        driver.drive();
    }
}
