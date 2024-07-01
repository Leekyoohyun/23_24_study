package oop.oop1;

// 메소드 추출

public class MusicPlayerMain3_usingMethod {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();
        // 음악 플레이어 켜기
        on(data);
        // 볼륨증가&감소
        volumeUp(data);
        volumeUp(data);
        volumeDown(data);
        // 플레이어 상태
        showStatus(data);
        // 종료
        off(data);
    }

    static void on(MusicPlayerData data){
        data.isOn = true;
        System.out.println("음악 플레이어 시작");
    }
    static void off(MusicPlayerData data){
        data.isOn=false;
        System.out.println("종료");
    }
    static void volumeUp(MusicPlayerData data){
        data.volume++;
        System.out.println("볼륨: "+data.volume);
    }
    static void volumeDown(MusicPlayerData data){
        data.volume--;
        System.out.println("볼륨: "+data.volume);
    }

    static void showStatus(MusicPlayerData data){
        System.out.println("-- 상태확인 --");
        if(data.isOn){
            System.out.println("ON, 볼륨: "+data.volume);
        }else {
            System.out.println("OFF");
        }
    }
}
