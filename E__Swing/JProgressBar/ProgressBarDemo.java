package JProgressBar;

import javax.swing.*;
import java.awt.*;

public class ProgressBarDemo {
    JFrame frame;
    JProgressBar progressBar=new JProgressBar(0,500);
    ProgressBarDemo() throws InterruptedException {
        progressBar.setValue(0);
        progressBar.setBounds(20,20,360,50);
        progressBar.setStringPainted(true);//view the percentage
        progressBar.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
        progressBar.setForeground(Color.DARK_GRAY);
        progressBar.setBackground(Color.BLACK);
        frame=new JFrame();
        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.add(progressBar);
        frame.setVisible(true);
        fill();
    }
    public void fill() throws InterruptedException {
        int counter=500;
        while (counter>1){
            progressBar.setValue(counter);
            Thread.sleep(50);
            counter=counter-1;//counter-=1
        }
        progressBar.setString("the progress is done");
    }

}
