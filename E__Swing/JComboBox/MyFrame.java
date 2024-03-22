package JComboBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JComboBox comboBox;
    MyFrame(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        String[] cars= {"tesla","toyota","audi","lamborgini","fiat"};
        comboBox=new JComboBox(cars);
        comboBox.addActionListener(this);
        comboBox.setEditable(true);
        comboBox.getItemCount();//number of the items
        comboBox.addItem("ferrari");
        comboBox.insertItemAt("porche",0);
        comboBox.setSelectedIndex(0);
        comboBox.setSelectedItem("select a car");
        comboBox.removeItem("porche");
        comboBox.removeItemAt(5);
        comboBox.removeAllItems();
        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==comboBox){
            System.out.println("you selected a "+comboBox.getSelectedItem()+" car");
            System.out.println("you selected the car number  "+(comboBox.getSelectedIndex()+1));
        }
    }
}
