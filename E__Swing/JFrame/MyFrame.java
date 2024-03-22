package JFrame;
import javax.swing.*;
import java.awt.*;
public class MyFrame extends JFrame {
    public MyFrame(){
        ImageIcon icon =new ImageIcon("C:\\Users\\YOUNES\\Pictures\\tiktok vidoes\\Lacoste-Embleme-removebg-preview.png");//set the image icon
        this.setTitle("lacosteshittposting ");//set the frame window title
        this.setSize(600,600);//sets the x-dimension and y-dimension of frame
        this.setIconImage(icon.getImage());//set the icon in frame (top left)
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//by default when close the JFrame did not actuali closing(hide) so this methode used to close whe press the X button
        this.setResizable(true);//lock frame for being resized
        this.setBackground(Color.BLUE);
        this.getContentPane().setBackground(Color.CYAN);//set the background color
        this.getContentPane().setBackground(new Color(123,123,123));//mount custom color using hexadecimal setting or rgb setting
        this.setLayout(null);
        this.setVisible(true);//make frame visible
    }}
