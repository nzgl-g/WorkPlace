package JFrame;
import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args) {
/*        JFrame frame=new JFrame();//create a frame
        ImageIcon icon =new ImageIcon("C:\\Users\\YOUNES\\Pictures\\tiktok vidoes\\Lacoste-Embleme-removebg-preview.png");//set the image icon
        frame.setTitle("lacosteshittposting ");//set the frame window title
        frame.setSize(500,500);//sets the x-dimension and y-dimension of frame
        frame.setIconImage(icon.getImage());//set the icon in frame (top left)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//by default when close the JFrame did not actuali closing(hide) so this methode used to close whe press the X button
        frame.setResizable(false);//lock frame for being resized
        frame.setBackground(Color.BLUE);
        frame.getContentPane().setBackground(Color.CYAN);//set the background color
        frame.getContentPane().setBackground(new Color(255,128,128));//mount custom color using hexadecimal setting or rgb setting
        frame.getContentPane().setBackground(new Color(0x00012d0d));
        frame.setVisible(true);//make frame visible*/
        new MyFrame();
    }
}
