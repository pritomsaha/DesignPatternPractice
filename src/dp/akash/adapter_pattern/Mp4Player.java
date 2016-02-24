package dp.akash.adapter_pattern;

/**
 * Created by Akash on 24-Feb-16.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
