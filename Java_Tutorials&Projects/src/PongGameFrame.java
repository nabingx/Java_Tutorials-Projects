import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class PongGameFrame extends JFrame {
	
	PongGamePanel panel;
	
	PongGameFrame() {
		panel = new PongGamePanel();
		this.add(panel);
		this.setTitle("Pong Game");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
	
}
