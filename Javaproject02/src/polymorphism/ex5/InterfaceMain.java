package polymorphism.ex5;

public class InterfaceMain {
    public static void main(String[] args) {

        //인터페이스 생성 불가
        //InterfaceAnimal interfaceMain1 = new InterfaceAnimal();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Caw caw = new Caw();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(caw);
    }

    private static void soundAnimal(InterfaceAnimal animal){
        System.out.println("시작");
        animal.sound();
        System.out.println("종료");
    }
}
