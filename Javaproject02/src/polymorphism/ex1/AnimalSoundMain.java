package polymorphism.ex1;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        System.out.println("시작");
        dog.sound();
        System.out.println("종료");

        System.out.println("시작");
        cat.sound();
        System.out.println("종료");

        System.out.println("시작");
        caw.sound();
        System.out.println("종료");

    }
}
