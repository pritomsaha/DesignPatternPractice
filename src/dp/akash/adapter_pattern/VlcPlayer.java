package dp.akash.adapter_pattern;

/**
 * Created by Akash on 24-Feb-16.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }
}
