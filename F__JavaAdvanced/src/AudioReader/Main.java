package AudioReader;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
    Scanner scan=new Scanner(System.in);
    File file=new File("C:\\Users\\YOUNES\\Desktop\\WorkShop\\JetBrains\\Intellij IDEA\\WorkPlace\\advanced-java\\src\\audio\\[FREE] Fast Aggressive 808 Rap Beat _REVENGE_ _ Dababy x Drake type beat 2021 _ Free Type Beat _.wavs");
    AudioInputStream audio = AudioSystem.getAudioInputStream(file);
    Clip clip =AudioSystem.getClip();
    clip.open(audio);
    String rpns ;
    rpns="";
    while (!rpns.equalsIgnoreCase("Q")){
        System.out.println("choose one of the options:  \n 1- S <to start clip>\n 2- P <to pause the clip>\n3- R <to reset the clip>\n4- Q <to quit the clip>");
        System.out.print("Response:?  ");
        rpns=scan.nextLine();
        if (rpns.equalsIgnoreCase("s")){
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } else if (rpns.equalsIgnoreCase("r")) {
            clip.setFramePosition(0);
        } else if (rpns.equalsIgnoreCase("p")) {
            clip.stop();
        }
    }
}}
