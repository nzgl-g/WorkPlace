package JSlider;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderDemo implements ChangeListener {
    JFrame frame;
    JLabel label;
    JPanel panel;
    JSlider slider;
    SliderDemo(){
        panel=new JPanel();
        frame=new JFrame();
        label=new JLabel();
        slider=new JSlider(0,100,0/*starting point*/);
        slider.setPreferredSize(new Dimension(100,300));
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(10);
        slider.setPaintLabels(true);
        slider.setPaintTrack(true);
        slider.setFont(new Font("Comic Sans MS",Font.PLAIN,16));
        slider.setOrientation(JSlider.VERTICAL);
        //slider.setOrientation(SwingConstants.VERTICAL);
        slider.addChangeListener(this);
        label.setFont(new Font("Comic Sans MS",Font.PLAIN,16));
        label.setText("°C = "+slider.getValue());
        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();

    }
    @Override
    public void stateChanged(ChangeEvent e) {
    if (e.getSource()==slider){
        label.setText("°C = "+slider.getValue());
    }
    }
}
