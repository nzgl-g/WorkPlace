package JPanel;
import JFrame.MyFrame;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //JPanel = a GUI component that function as a container to hold other component
        MyFrame frame =new MyFrame();
        ImageIcon icon =new ImageIcon("C:\\Users\\YOUNES\\Pictures\\tiktok vidoes\\Lacoste-Embleme-removebg-preview.png");
/*        JLabel label = new JLabel();
        label.setIcon(icon);
        label.setText("welcom to panels");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setLayout(null);
        label.setBounds(0,0,250,250);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);*/
        JPanel redpanel =new JPanel();
        redpanel.setBounds(0,0,250,250);
        redpanel.setBackground(Color.red);
        frame.add(redpanel);
        JPanel bluepanel =new JPanel();
        bluepanel.setBounds(250,0,250,250);
        bluepanel.setBackground(Color.blue);
        frame.add(bluepanel);
        JPanel greenpanel=new JPanel();
        greenpanel.setBounds(0,250,(bluepanel.getWidth()+redpanel.getWidth()),bluepanel.getHeight());
        greenpanel.setBackground(Color.green);
        //greenpanel.add(label);
        frame.add(greenpanel);
    }
}
