package dp.akash.adapter_pattern;

/**
 * Created by Akash on 24-Feb-16.
 */
public class AdapterPatternDemo {

    public static void main(String[] args){
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
