package polymorphism.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Hamster hamster = new Hamster();
        Animal[] animalArr = {dog, cat, caw,hamster};

        //변하지 않는 부분
        for(Animal animal : animalArr){
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("시작");
        animal.sound();
        System.out.println("종료");
    }
}
