package AdapterPattern;

public class Vlc implements AdvanceMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing with Vlc :"+ fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
