package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        //필드에 접근
        System.out.println("volume 필드 직접 접근해서 수정해버림");
        //speaker.volume = 200;
        speaker.showVolume();
        // 넘어가버림 100을 그래서 이런 식의 접근을 막아야함!!
        // 이럴 때 int volume에 private을 붙여버림 접근 못하게
    }
}
