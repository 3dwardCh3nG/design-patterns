package sydney.ch3ng.design_pattern.adapter;

public class MediaAdapter implements MediaPlayer {
    AdvancedPlayer advancedPlayer;

    public MediaAdapter(String format) {
        if (format.equalsIgnoreCase("mp4")) {
            advancedPlayer = new MP4Player();
        } else if (format.equalsIgnoreCase("wav")) {
            advancedPlayer = new WAVPlayer();
        }
    }

    @Override
    public void play(String format, String file) {
        if (format.equalsIgnoreCase("mp4")) {
            advancedPlayer.playMP4(file);
        } else if (format.equalsIgnoreCase("wav")) {
            advancedPlayer.playWav(file);
        }
    }
}
