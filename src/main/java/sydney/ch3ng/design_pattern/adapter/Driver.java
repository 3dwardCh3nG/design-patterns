package sydney.ch3ng.design_pattern.adapter;

/**
 * The adapter design pattern comes under the structural design pattern’s category that allows incompatible objects to collaborate. This one acts as a wrapper between two varying objects. The adapter gets a hold on the call for one object and transforms it to be recognized by the second object.
 */
public class Driver {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "music1.mp3");
        audioPlayer.play("wav", "music2.wav");
        audioPlayer.play("mp4", "music3.mp4");
        audioPlayer.play("avi", "music4.avi");
    }
}
