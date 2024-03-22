package JColorChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button=new JButton();
    JLabel label=new JLabel();
    MyFrame(){
        button.setFocusable(false);
        button.setText("pick a color ");
        button.setSize(300,30);
        button.setVerticalAlignment(JButton.EAST);
        button.setHorizontalAlignment(JButton.CENTER);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.CENTER);
        button.addActionListener(this);
        label.setText("color look like this");
        label.setBackground(Color.WHITE);
        label.setOpaque(true);//display the background
        label.setSize(300,300);
        label.setFont(new Font("MV Boli",Font.PLAIN,100));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        this.add(button);
        this.add(label);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420,420);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            //JColorChooser colorChooser=new JColorChooser();
            Color color=JColorChooser.showDialog(null,"pick a coler....i guess",Color.BLACK);
            label.setForeground(color);

        }
    }
}
