package NewWindowOpening;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {
    JFrame frame=new JFrame();
    JButton button=new JButton("click here to open new window");
    LaunchPage(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        button.setBounds(100,100,230,50);
        button.setFocusable(false);
        button.addActionListener(this);
        frame.add(button);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            frame.dispose();
            NewWindow newWindow =new NewWindow();
//            button.setVisible(false);
        }
    }
}
