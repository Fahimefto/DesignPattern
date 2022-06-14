package AdapterPattern;

public class Demo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer= new AudioPlayer();
        audioPlayer.play("mp3","neshar bojha.mp3");
        audioPlayer.play("mp4","Quit Smoking");
        audioPlayer.play("vlc","Spider-Man Far from home");
        audioPlayer.play("mkv","Spider-Man Far from home");
    }
}
