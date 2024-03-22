package DragAndDrop;

import javax.swing.*;

public class MyFrame extends JFrame {
    DragPanel dragPanel=new DragPanel();
    MyFrame(){
        this.add(dragPanel);
        this.setTitle("Drag & Drop Demo");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);

    }
}
