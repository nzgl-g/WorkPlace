package ColorChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChooserGUI extends JFrame {
    private JPanel colorPanel;
    private JButton chooseColorButton;

    public ColorChooserGUI() {
        setTitle("Custom Color Chooser");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        colorPanel = new JPanel();
        colorPanel.setPreferredSize(new Dimension(200, 200));
        colorPanel.setBackground(Color.WHITE);

        chooseColorButton = new JButton("Choose Color");
        chooseColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color selectedColor = JColorChooser.showDialog(ColorChooserGUI.this, "Choose a Color", colorPanel.getBackground());
                if (selectedColor != null) {
                    colorPanel.setBackground(selectedColor);
                }
            }
        });

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(colorPanel, BorderLayout.CENTER);
        mainPanel.add(chooseColorButton, BorderLayout.SOUTH);

        setContentPane(mainPanel);
        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ColorChooserGUI gui = new ColorChooserGUI();
                gui.setVisible(true);
            }
        });
    }
}
