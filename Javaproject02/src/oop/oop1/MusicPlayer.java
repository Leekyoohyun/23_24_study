package oop.oop1;

public class MusicPlayer {

    int volume = 0;
    boolean isOn = false;

    void on(){
        isOn = true;
        System.out.println("플레이어 ON");
    }

    void off(){
        isOn = false;
        System.out.println("OFF 종료합니다.");
    }

    void volumeUp(){
        volume++;
        System.out.println("볼륨: "+volume);
    }

    void volumeDown(){
        volume--;
        System.out.println("볼륨: "+volume);
    }

    void showStatus(){
        System.out.println("플레이어 상태 확인");
        if(isOn){
            System.out.println("플레이어 ON"+volume);
        }else {
            System.out.println("OFF");
        }
    }
}
