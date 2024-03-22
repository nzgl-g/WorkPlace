package JRadioButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JRadioButton teslaButton;
    JRadioButton audiButton;
    JRadioButton toyotaButton;
    ButtonGroup buttonGroup;
    JLabel label;
    MyFrame(){
        //label.setText("what is the model of the car?");
//        label.setHorizontalAlignment(JLabel.CENTER);
//        label.setVerticalAlignment(JLabel.TOP);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        teslaButton =new JRadioButton();
        audiButton =new JRadioButton();
        toyotaButton =new JRadioButton();
        buttonGroup=new ButtonGroup();

        teslaButton.setText("Tesla");teslaButton.setFocusable(false);
        teslaButton.addActionListener(this);
        teslaButton.setIcon(null);
        teslaButton.setSize(30,30);

        toyotaButton.setText("toyota");toyotaButton.setFocusable(false);
        toyotaButton.addActionListener(this);
        toyotaButton.setIcon(null);
        toyotaButton.setSize(30,30);

        audiButton.setText("audi");audiButton.setFocusable(false);
        audiButton.addActionListener(this);
        audiButton.setIcon(null);
        audiButton.setSize(30,30);

        buttonGroup.add(toyotaButton);
        buttonGroup.add(teslaButton);
        buttonGroup.add(audiButton);
        //this.add(label);
        this.add(audiButton);
        this.add(toyotaButton);
        this.add(teslaButton);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==teslaButton){
            System.out.println("you car is tesla");
            teslaButton.setSelectedIcon(new ImageIcon("tesla.png"));
        } else if (e.getSource()==toyotaButton) {
            toyotaButton.setSelectedIcon(new ImageIcon("toyota.png"));
            System.out.println("your car is toyota ");
        } else if (e.getSource()==audiButton) {
            System.out.println("your car is audi");
            audiButton.setSelectedIcon(new ImageIcon("audi.png"));
        }
    }
}
