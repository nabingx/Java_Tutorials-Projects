import java.awt.*;
import javax.swing.*;

public class TwoDAnimationFrame extends JFrame{

	TwoDAniPanel panel;
	
	public TwoDAnimationFrame() {
		
		panel = new TwoDAniPanel();
		
		this.setTitle("Space Intruder");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}
	
}
