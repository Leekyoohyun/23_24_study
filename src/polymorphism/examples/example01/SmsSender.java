package polymorphism.examples.example01;

public class SmsSender implements Sender{
    String message;
    @Override
    public void sendMessage(String message){
        System.out.println("SMS로 발송합니다: "+message);
        this.message= message;
    }
}
