package JButton;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
  JButton button;
   ImageIcon icon3=new ImageIcon("C:\\Users\\YOUNES\\Pictures\\tiktok vidoes\\Elon_Musk_Royal_Society.jpg");

   MyFrame(){
      ImageIcon icon  =new ImageIcon("C:\\Users\\YOUNES\\Pictures\\tiktok vidoes\\Lacoste-Embleme-removebg-preview.png");//set the image icon
     this.setTitle("lacosteshittposting ");//set the frame window title
     this.setSize(600,600);//sets the x-dimension and y-dimension of frame
     this.setIconImage(icon.getImage());//set the icon in frame (top left)
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//by default when close the JFrame did not actuali closing(hide) so this methode used to close whe press the X button
     this.setResizable(true);//lock frame for being resized
     this.setBackground(Color.BLUE);
     this.getContentPane().setBackground(Color.CYAN);//set the background color
     this.getContentPane().setBackground(new Color(123,123,123));//mount custom color using hexadecimal setting or rgb setting
     this.setLayout(null);
     this.setVisible(true);//make frame visible
     ImageIcon icon2 = new ImageIcon("point.png");
     Border border=BorderFactory.createLineBorder(Color.BLACK);
     button =new JButton();
     button.setBounds(200,100,300,300);
     //button.addActionListener(e -> System.out.println("you clicked the button"));//lambda way
     button.setText("click here");
     button.setHorizontalTextPosition(JLabel.CENTER);
     button.setVerticalTextPosition(JLabel.TOP);
     button.setIcon(icon2);
     button.setFont(new Font("MV Boli",Font.BOLD,50));
     button.setIconTextGap(-20);
     button.setForeground(Color.GREEN);
     button.setBackground(Color.BLACK);
     button.setBorder(border);
     button.setFocusable(false);//remove the border that serownded by the text
     //button.setEnabled(false);//enable /desable button
     this.add(button);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource()==button){
      System.out.println("you clicked the button");
      button.setEnabled(true);
      button.setIcon(icon3);
    }
  }}

