package refVarChanges;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA; // 이거 참조값을 준거임(즉 주소값!!!)

        System.out.println("dataA 참조값: "+dataA);
        System.out.println("dataB 참조값: "+dataB); // 참조값 주소
        System.out.println("dataA.value = "+dataA.value);
        System.out.println("dataB.value = "+dataB.value);

        // dataA 변경
        dataA.value = 20;
        System.out.println("dataA.value = 20 ");
        System.out.println("dataA.value = "+dataA.value);
        System.out.println("dataB.value = "+dataB.value);

        //dataB변경
        dataB.value = 30;
        System.out.println("dataB.value = 30 ");
        System.out.println("dataA.value = "+dataA.value);
        System.out.println("dataB.value = "+dataB.value);

    }
}
