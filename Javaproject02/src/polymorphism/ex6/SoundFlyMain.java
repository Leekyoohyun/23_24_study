package polymorphism.ex6;

public class SoundFlyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        soundAnimal(dog);
        soundAnimal(bird);
        soundAnimal(chicken);

        flyAnimal(bird);
        flyAnimal(chicken);
    }

    private static void soundAnimal(AbstractAnimal animal){
        System.out.println("소리 시작");
        animal.sound();
        System.out.println("소리 종료");
    }

    private static void flyAnimal(Fly fly){
        System.out.println("날기 시작");
        fly.fly();
        System.out.println("날기 종료");
    }

}
