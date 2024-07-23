package testAnything;

public class Test01 { // 메소드 호출 확인해보기
    public static void main(String[] args) {
        int a =10;
        System.out.println("메소드 호출 전:"+a);
        changeValue(a);
        System.out.println("메소드 호출 후:"+a);
        int b = changeValue(a);
        System.out.println("변수 바꾸기 위해 메소드 사용: "+b);
    }

    static int changeValue(int c){
        c = 20;
        return c;
    }
}
