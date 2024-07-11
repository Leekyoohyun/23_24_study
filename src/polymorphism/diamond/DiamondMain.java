package polymorphism.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        InterfaceA a = new Child();
        a.methodA();
        a.methodCommon();

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();

        InterfaceA a2 = new Child();
        a2.methodA();
        a2.methodCommon();

        System.out.println(a);
        System.out.println(b);
        System.out.println(a2);
    }
}
