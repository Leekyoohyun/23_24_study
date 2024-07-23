package refVarChanges;

public class MethodChange1 {
    public static void main(String[] args) {
        int a =10;
        System.out.println("메소드 호출 전: "+a);
        changePrimative(a);
        System.out.println("메소드 호출 후: "+a);
        a=20;
        System.out.println("a 변경: "+a);
    }

    static void changePrimative(int x){
        x = 20;
    }
}
