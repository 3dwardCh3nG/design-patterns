package sydney.ch3ng.design_pattern.adapter;

public class MP4Player implements AdvancedPlayer {
    @Override
    public void playMP4(String file) {
        System.out.println("MP4 File " + file + " Playing….");
    }

    @Override
    public void playWav(String file) {
        // do nothing
    }
}
