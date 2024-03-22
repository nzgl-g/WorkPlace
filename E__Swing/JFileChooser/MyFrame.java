package JFileChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener {
    JButton button=new JButton();
    MyFrame(){
        button.setFocusable(false);
        button.setText("choose a file ");
        button.setSize(300,30);
        button.setVerticalAlignment(JButton.EAST);
        button.setHorizontalAlignment(JButton.CENTER);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.CENTER);
        button.addActionListener(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420,420);
        this.setLayout(new FlowLayout());
        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            JFileChooser fileChooser=new JFileChooser();
            fileChooser.setCurrentDirectory(new File("."));//set the directory the filechooser open in // the "." is a shortcut to set the project folder
            //int response=fileChooser.showOpenDialog(null);//select a file to open
            int response=fileChooser.showSaveDialog(null);//select a file to save
            if (response==JFileChooser.APPROVE_OPTION)/*response == 0(the 0 is we choosed a file)*/{
                File file =new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file.getAbsolutePath());
            }
        }
    }
}
