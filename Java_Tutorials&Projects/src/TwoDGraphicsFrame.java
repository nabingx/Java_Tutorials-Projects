import javax.swing.*;
import java.awt.*;

public class TwoDGraphicsFrame extends JFrame{
	
	TwoDPanelFrame panel;
	
	public TwoDGraphicsFrame() {
		
		panel = new TwoDPanelFrame();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	
	
}
