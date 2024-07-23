package polymorphism.ex3;

public class AbstractMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        cat.sound();
        cat.move();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    public static void soundAnimal(AbstractAnimal animal){
        System.out.println("시작");
        animal.sound();
        System.out.println("종료");
    }
}
