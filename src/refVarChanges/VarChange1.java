package refVarChanges;

public class VarChange1 {
    //코드 따라가면서 값 예상해보기
    public static void main(String[] args) {
        int a = 10;
        int b =a;
        System.out.println("a= "+a);
        System.out.println("b= "+b);

        a = 20;
        System.out.println("a 변경함");
        System.out.println("a= "+a); //a=20이겠지
        System.out.println("b= "+b);    // b 는 바뀐적없음 10

        b=30;
        System.out.println("b 변경함");
        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }
}
