package oop.oop1;

public class MusicPlayerMain1 {// 절차지향 음악 플레이어1

    public static void main(String[] args) {
        int volume = 0;
        boolean isOn=false;

        isOn = true;
        System.out.println("음악플레이어 시작");

        //볼륨증가
        volume++;
        System.out.println("음악플레이어 볼륨: "+volume);

        volume++;
        System.out.println("음악플레이어 볼륨: "+volume);

        volume--;
        System.out.println("음악플레이어 볼륨: "+volume);

        //플레이어 상태
        System.out.println("상태:");
        if(isOn){
            System.out.println("음악 플레이어 ON, 볼륨: "+volume);
        }else {
            System.out.println("음악 플레이어 OFF");
        }

        isOn = false;
        System.out.println("음악 플레이어 종료");

    }
}
