package keyListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {
    JLabel label;
    ImageIcon icon;
    MyFrame(){
        label=new JLabel();
        label.setBounds(40,40,400,380);
//        label.setBackground(Color.BLACK);
//        label.setOpaque(true);
        icon=new ImageIcon("rocket.png");
        label.setIcon(icon);
        this.add(label);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.getContentPane().setBackground(Color.BLACK);
        this.setLayout(null);
        this.setVisible(true);
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //keyTyped = Invoked when a key is typed. Uses KeyChar, char output
        switch (e.getKeyChar()){
            case 'q':/*move left*/label.setLocation(label.getX()-10,label.getY());
            break;
            case 'd':/*move right*/label.setLocation(label.getX()+10,label.getY());
            break;
            case 'z':/*move up*/label.setLocation(label.getX(),label.getY()-10);
            break;
            case 's':/*move down*/label.setLocation(label.getX(),label.getY()+10);
            break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //keyPressed = Invoked when a physical key is pressed down. Uses KeyCode, int output
        switch (e.getKeyCode()){
            case 37:/*move left*/label.setLocation(label.getX()-1,label.getY());
                break;
            case 39:/*move right*/label.setLocation(label.getX()+1,label.getY());
                break;
            case 38:/*move up*/label.setLocation(label.getX(),label.getY()-1);
                break;
            case 40:/*move down*/label.setLocation(label.getX(),label.getY()+1);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //keyReleased = called whenever a button is released
        System.out.println("you release the key : "+e.getKeyChar());
        System.out.println("you release the key number : "+e.getKeyCode());
    }
}
