package AdapterPattern;

public class Mp4 implements AdvanceMediaPlayer{
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing with Mp4 :"+ fileName);

    }
}
