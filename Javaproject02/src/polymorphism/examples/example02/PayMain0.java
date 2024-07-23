package polymorphism.examples.example02;

public class PayMain0 {
    public static void main(String[] args) {
        PayService payService = new PayService();

        //카카오결제
        String payOption1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOption1, amount1);

        //네이버 결제
        String payOption2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOption2, amount2);

        // 결제수단 잘못 선택
        String payOption3 = "bad";
        int amount3= 15000;
        payService.processPay(payOption3, amount3);
    }
}
