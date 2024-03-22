package JProgressBar;

import javax.swing.*;
import javax.swing.plaf.basic.BasicProgressBarUI;
import java.awt.*;

public class CustomPB extends BasicProgressBarUI {
	// Define the custom colors for the progress bar
	private Color progressColor = Color.BLUE;
	private Color backgroundColor = Color.LIGHT_GRAY;
	
	// Set the size of the progress bar border
	private int borderSize = 2;
	
	@Override
	protected void paintDeterminate(Graphics g, JComponent c) {
		super.paintDeterminate(g, c);
		
		// Cast the component to a progress bar
		JProgressBar progressBar = (JProgressBar) c;
		
		// Get the progress bar's current value and maximum value
		int value = progressBar.getValue();
		int max = progressBar.getMaximum();
		
		// Calculate the width of the progress bar
		int width = progressBar.getWidth() - 2 * borderSize;
		
		// Calculate the progress bar's filled width
		int filledWidth = (int) Math.round((double) value / max * width);
		
		// Set the custom background color
		g.setColor(backgroundColor);
		g.fillRect(borderSize, borderSize, width, progressBar.getHeight() - 2 * borderSize);
		
		// Set the custom progress color
		g.setColor(progressColor);
		g.fillRect(borderSize, borderSize, filledWidth, progressBar.getHeight() - 2 * borderSize);
	}
	
	@Override
	protected void paintIndeterminate(Graphics g, JComponent c) {
		super.paintIndeterminate(g, c);
		
		// Custom painting code for the indeterminate progress bar
		// Modify this method to customize the appearance of the indeterminate progress bar
		// You can use the "g" Graphics object to paint custom shapes, colors, etc.
	}
}
