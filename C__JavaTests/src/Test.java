import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    private final Clip clip;

    public Test(String audioPath){
        AudioInputStream audio;
        try {
            audio = AudioSystem.getAudioInputStream(new File(audioPath));
        } catch (UnsupportedAudioFileException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("File Not Found!");
            throw new RuntimeException(e);
        }
        try {
            clip=AudioSystem.getClip();
        } catch (LineUnavailableException e) {
            throw new RuntimeException(e);
        }
        try {
            clip.open(audio);
        } catch (LineUnavailableException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("No Audio Found!");
            throw new RuntimeException(e);
        }
        Scanner scanner = new Scanner(System.in);
        String optionKey = " ";
        while (optionKey.charAt(0)!='Q'){
            System.out.println("Select one of the options:\nP -Play\nS -Pause\nR -Restart \nQ -Quit");
            System.out.print("Option:? ");
            optionKey = scanner.nextLine();
            switch (optionKey.charAt(0)) {
                case 'P' -> play();
                case 'Q' -> quit();
                case 'R' -> restart();
                case 'S' -> pause();
                default -> System.out.println("Enter A valid option");
            }
        }

    }
    public void play(){
        clip.start();
        System.out.println("Audio Started\n");
    }
    public void pause(){
        clip.stop();
        System.out.println("Audio Paused\n");

    }
    public void restart(){
        clip.setFramePosition(0);
        clip.start();
        System.out.println("Audio Restarted\n");

    }
    public void quit(){
        clip.close();
    }
}