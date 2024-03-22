package JLabels;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ImageIcon icon =new ImageIcon("C:\\Users\\YOUNES\\Pictures\\tiktok vidoes\\Lacoste-Embleme-removebg-preview.png");
        JFrame frame = new JFrame();
        Border border=BorderFactory.createLineBorder(Color.GREEN,4);
        frame.getContentPane().setBackground(Color.CYAN);
       //frame.setSize(1000,1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JLabel label = new JLabel();//create a label
        label.setText("Welcom to JLabel");//set text of label
        label.setForeground(Color.RED);//set color of the text
        label.setFont(new Font("MV Boli",Font.BOLD,100));//set font of text
        label.setIconTextGap(25);//set gap of text image //how far the text from the image icon
        label.setBackground(Color.black);//set the background coller of the label
        label.setOpaque(true);//make the background visible
        label.setHorizontalAlignment(JLabel.CENTER);//mae the entire label position
        label.setVerticalAlignment(JLabel.CENTER);
        label.setBorder(border);//set borders to the label
        //label.setBounds(500,0,600,425);//set the dimensions and dimensions
        label.setIcon(icon);
        label.setHorizontalTextPosition(JLabel.CENTER);//set text position left,right ,center of image icon
        label.setVerticalTextPosition(JLabel.TOP);//set text position top,center or button of image icon
        //frame.setLayout(null);
        frame.add(label);
        frame.pack();//make sure you use the pack methode before you use pack method

    }
}
