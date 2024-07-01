package oop.oop1;

public class MusicPlayerMain {

    public static void main(String[] args) {
        MusicPlayer data = new MusicPlayer();

        data.on();
        data.volumeUp();
        data.volumeUp();
        data.volumeDown();
        data.showStatus();
        data.off();
    }

}
