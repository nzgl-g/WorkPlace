package MouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {
    ImageIcon emoji1,emoji2,emoji3;


    JLabel label;
    MyFrame(){
        emoji1 =new ImageIcon("emoji1.png");
        emoji2 =new ImageIcon("emoji2.png");
        emoji3 =new ImageIcon("emoji3.png");
        label=new JLabel();
        label.setIcon(emoji1);
        //label.setBounds(40,40,400,380);
//        label.setBackground(Color.YELLOW);
//        label.setOpaque(true);
        label.addMouseListener(this);
        this.add(label);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Invoked when the mouse button has been clicked (pressed and released) on a component
        //System.out.println("you clicked on  the label :D !");
        //label.setBackground(Color.BLUE);
        label.setIcon(emoji2);

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Invoked when a mouse button has been pressed on a component
        //System.out.println("you pressed on  the label :D !");
        //label.setBackground(Color.RED);

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Invoked when a mouse button has been released on a component
        //System.out.println("you released the mouse on  the label :D !");
        //label.setBackground(Color.CYAN);

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Invoked when the mouse enters a component
        System.out.println("you entered the label area :( !");
        label.setBackground(Color.DARK_GRAY);
        label.setIcon(emoji3);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Invoked when the mouse exits a component
        System.out.println("you exited the label area :) !");
        label.setBackground(Color.green);
        label.setIcon(emoji1);
    }
}
