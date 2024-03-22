package NewWindowOpening;
import javax.swing.*;
import java.awt.*;

public class NewWindow {
    JFrame frame;
    NewWindow(){
        JLabel label =new JLabel("you opened a new window :) !");
        label.setVerticalTextPosition(JLabel.CENTER);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setFont(new Font("MV Boli",Font.BOLD,16));
        label.setForeground(Color.BLUE);
        label.setBounds(250,250,200,200);
        label.setBackground(Color.YELLOW);
        label.setLayout(new BorderLayout(10,10));
        frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.cyan);
        frame.setVisible(true);
        frame.add(label);
    }
}
