package adapterPattern.demo;

public class adapterPatternTest {

    public static void main(String[] args) {
        AudioPlayer a=new AudioPlayer();

        a.play("mp3","huawei");
        a.play("vlc","vlc");
        a.play("mp4","mp4");
        a.play("mp5","mp5");
    }
}
