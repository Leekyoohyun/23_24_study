package polymorphism.examples.example02;

public class DefaultPay implements Pay{
    @Override
    public boolean pay(int amount){
        System.out.println("결제 수단 X");
        return false;
    }
}
