import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListenerFrame extends JFrame implements KeyListener{

	JLabel label;
	ImageIcon icon;
	
	public KeyListenerFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(null);
		this.addKeyListener(this);
		
		icon = new ImageIcon("rocket icon.jpg");
		Image imageResized1 = icon.getImage(); // transform it 
		Image newimg1 = imageResized1.getScaledInstance(75, 75,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		icon = new ImageIcon(newimg1);  // transform it back
		
		label = new JLabel();
		label.setBounds(0, 0, 100, 100);
		label.setIcon(icon);
		//label.setBackground(Color.RED);
		//label.setOpaque(true); // display the background
		
		this.getContentPane().setBackground(Color.BLACK); // nếu this là frame thì phải dùng getContentPane() trước
														  // 1 frame có nhiều layer, hiểu làm thế này giống như đè 1 layer lên
		this.add(label);
		this.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		//keyTyped = Invoked when a key is typed. Uses KeyChar, char output
		switch (e.getKeyChar()) {
			// chiều dương của trục Y trong lập trình ngược với trong toán
			case 'a': label.setLocation(label.getX() - 10, label.getY());
				break;
			case 'w': label.setLocation(label.getX(), label.getY() - 10);
				break;
			case 's': label.setLocation(label.getX(), label.getY() + 10);
				break;
			case 'd': label.setLocation(label.getX() + 10, label.getY());
				break;
		}
		/*char c = e.getKeyChar();
		if(c == 'a') label.setLocation(label.getX() - 1, label.getY());
		else if(c == 'w') label.setLocation(label.getX(), label.getY() - 1);
		else if(c == 's') label.setLocation(label.getX(), label.getY() + 1);
		else if(c == 'd') label.setLocation(label.getX() + 1, label.getY());
		else if(c == 's' && c == 'a') label.setLocation(label.getX() - 1, label.getY() + 1);
		else if(c == 's' && c == 'd') label.setLocation(label.getX() + 1, label.getY() + 1);
		else if(c == 'w' && c == 'a') label.setLocation(label.getX() - 1, label.getY() - 1);
		else if(c == 'w' && c == 'd') label.setLocation(label.getX() + 1, label.getY() - 1);*/
	}

	@Override
	public void keyPressed(KeyEvent e) {
		//keyPressed = Invoked when a physical key is pressed down. Uses KeyCode, int output
		switch (e.getKeyCode()) {
		// chiều dương của trục Y trong lập trình ngược với trong toán
		case 37: label.setLocation(label.getX() - 10, label.getY());
			break;
		case 38: label.setLocation(label.getX(), label.getY() - 10);
			break;
		case 40: label.setLocation(label.getX(), label.getY() + 10);
			break;
		case 39: label.setLocation(label.getX() + 10, label.getY());
			break;
	}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		//keyReleased = called whenever a button is released
		//System.out.println("You released key char: " + e.getKeyChar());
		System.out.println("You released key code: " + e.getKeyCode());
	}
	
}
