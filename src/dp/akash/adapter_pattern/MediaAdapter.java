package dp.akash.adapter_pattern;

/**
 * Created by Akash on 24-Feb-16.
 */
public class MediaAdapter implements AdvancedMediaPlayer{
    AdvancedMediaPlayer advancedMediaPlayer;
    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer =new VlcPlayer();
        }
        else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer =new Mp4Player();
        }
    }
    @Override
    public void play(String fileName) {
        advancedMediaPlayer.play(fileName);
    }
}
