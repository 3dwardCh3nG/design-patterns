package sydney.ch3ng.design_pattern.adapter;

public class WAVPlayer implements AdvancedPlayer {
    @Override
    public void playMP4(String file) {
        //do nothing 
    }

    @Override
    public void playWav(String file) {
        System.out.println("WAV File " + file + " Playing….");
        ;
    }
}
