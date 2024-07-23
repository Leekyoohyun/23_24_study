package static2;

public class DecoData {

    private int instanceValue; // 인스턴스변수
    private static int staticValue; // 정적변수 = 클래스변수

    public static void staticCall(){
        //instanceValue++; 인스턴스 변수 접근 --> 에러
        //instanceMethod(); 인스턴스 메소드 접근 --> 에러
        staticValue++;
        staticMethod();
    }

    public void instanceCall(){
        instanceValue++;
        instanceMethod();

        staticValue++;
        staticMethod();
    }

    private void instanceMethod(){
        System.out.println("instanceValue ="+instanceValue);
    }
    private static void staticMethod(){
        System.out.println("staticMethod ="+staticValue);
    }
}
