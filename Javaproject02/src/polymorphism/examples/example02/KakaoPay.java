package polymorphism.examples.example02;

public class KakaoPay implements Pay {
    @Override
    public boolean pay(int amount){
        System.out.println("카카오페이 시스템과 연결");
        System.out.println(amount+"원 결제를 시도");
        return true;
    }
}
