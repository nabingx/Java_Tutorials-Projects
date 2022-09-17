import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerFrame extends JFrame implements MouseListener{
	
	JLabel label;
	ImageIcon smile;
	ImageIcon dizzy;
	ImageIcon pain;
	ImageIcon nervous;

	public MouseListenerFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(new FlowLayout());
		
		smile = new ImageIcon("smile icon.png");
		Image imageResized1 = smile.getImage(); // transform it 
		Image newimg1 = imageResized1.getScaledInstance(150, 150,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		smile = new ImageIcon(newimg1);  // transform it back
		
		dizzy = new ImageIcon("dizzy icon.jpg");
		Image imageResized2 = dizzy.getImage(); // transform it 
		Image newimg2 = imageResized2.getScaledInstance(150, 150,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		dizzy = new ImageIcon(newimg2);  // transform it back
		
		pain = new ImageIcon("pain icon.png");
		Image imageResized3 = pain.getImage(); // transform it 
		Image newimg3 = imageResized3.getScaledInstance(150, 150,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		pain = new ImageIcon(newimg3);  // transform it back
		
		nervous = new ImageIcon("nervous icon.png");
		Image imageResized4 = nervous.getImage(); // transform it 
		Image newimg4 = imageResized4.getScaledInstance(150, 150,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		nervous = new ImageIcon(newimg4);  // transform it back
		
		label = new JLabel();
		//label.setBounds(0, 0, 100, 100);
		//label.setBackground(Color.RED);
		//label.setOpaque(true);
		label.addMouseListener(this);
		label.setIcon(smile);
		
		this.add(label);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// Invoked when the mouse button has been clicked (pressed and released) on a component
		//System.out.println("You clicked the mouse");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// Invoked when a mouse button has been pressed on a component
		System.out.println("You pressed the mouse");
		//label.setBackground(Color.YELLOW);
		label.setIcon(pain);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// Invoked when a mouse button has been released on a component
		System.out.println("You released the mouse");
		//label.setBackground(Color.GREEN);
		label.setIcon(dizzy);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// Invoked when the mouse enters a component
		System.out.println("You entered the component");
		//label.setBackground(Color.BLUE);
		label.setIcon(nervous);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// Invoked when the mouse exits a component
		System.out.println("You exited the component");
		//label.setBackground(Color.RED);
		label.setIcon(smile);
	}
	
}
