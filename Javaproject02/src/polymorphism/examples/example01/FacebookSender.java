package polymorphism.examples.example01;

public class FacebookSender implements Sender{
    String message;
    @Override
    public void sendMessage(String message){
        System.out.println("페이스북에 발송합니다: "+message);
        this.message=message;
    }
}
