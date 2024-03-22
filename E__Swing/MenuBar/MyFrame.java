package MenuBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JMenu helpMenu;
    JMenu editMenu;
    JMenu fileMenu;JMenuItem Load,Save,Exit;
    ImageIcon loadIcon =new ImageIcon("download-file.png");
    ImageIcon saveIcon =new ImageIcon("diskette.png");
    ImageIcon exitIcon =new ImageIcon("logout.png");
    MyFrame(){
        fileMenu =new JMenu("File");
        Load=new JMenuItem("Load");
        Load.setIcon(loadIcon);
        Save=new JMenuItem("Save");
        Save.setIcon(saveIcon);
        Exit=new JMenuItem("Exit");
        Exit.setIcon(exitIcon);
        fileMenu.setMnemonic(KeyEvent.VK_F);//ALT+f to open
//        editMenu.setMnemonic(KeyEvent.VK_E);
//        helpMenu.setMnemonic(KeyEvent.VK_H);
        Load.setMnemonic(KeyEvent.VK_L);//set a shortcut //L to open
        Save.setMnemonic(KeyEvent.VK_S);
        Exit.setMnemonic(KeyEvent.VK_E);
        Load.addActionListener(this);
        Save.addActionListener(this);
        Exit.addActionListener(this);
        fileMenu.add(Load);
        fileMenu.add(Save);
        fileMenu.add(Exit);
        editMenu =new JMenu("Edit");
        helpMenu =new JMenu("Help");
        menuBar=new JMenuBar();
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.setJMenuBar(menuBar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== Load){
            System.out.println("you clicked in Load");
        } else if (e.getSource()==Save) {
            System.out.println("you clicked in Save");
        } else if (e.getSource()==Exit) {
            System.out.println("you clicked in Exit");
            System.exit(0);
        }
    }
}
