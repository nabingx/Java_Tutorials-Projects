import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrameVer3 extends JFrame implements ActionListener{
	
	JRadioButton pizzaButton;
	JRadioButton hamburgerButton;
	JRadioButton hotdogButton;
	
	ImageIcon pizzaIcon;
	ImageIcon hamburgerIcon;
	ImageIcon hotdogIcon;
	
	public MyFrameVer3() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		pizzaIcon = new ImageIcon("pizza.png");
		Image imageResized1 = pizzaIcon.getImage(); // transform it 
		Image newimg1 = imageResized1.getScaledInstance(100, 50,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		pizzaIcon = new ImageIcon(newimg1);  // transform it back
		
		hamburgerIcon = new ImageIcon("hamburger.png");
		Image imageResized2 = hamburgerIcon.getImage(); // transform it 
		Image newimg2 = imageResized2.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		hamburgerIcon = new ImageIcon(newimg2);  // transform it back
		
		hotdogIcon = new ImageIcon("hotdog.png");
		Image imageResized3 = hotdogIcon.getImage(); // transform it 
		Image newimg3 = imageResized3.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		hotdogIcon = new ImageIcon(newimg3);  // transform it back
		
		pizzaButton = new JRadioButton("pizza");
		hamburgerButton = new JRadioButton("hamburger");
		hotdogButton = new JRadioButton("hotdog");
		
		ButtonGroup group = new ButtonGroup();  // Dùng cái này để cho chọn đúng 1 cái thôi
		group.add(pizzaButton);					// Tránh việc có thể chọn được nhiều cái
		group.add(hamburgerButton);
		group.add(hotdogButton);
		
		pizzaButton.addActionListener(this);
		hamburgerButton.addActionListener(this);
		hotdogButton.addActionListener(this);
		
		pizzaButton.setIcon(pizzaIcon);
		hamburgerButton.setIcon(hamburgerIcon);
		hotdogButton.setIcon(hotdogIcon);
		
		this.add(pizzaButton);
		this.add(hamburgerButton);
		this.add(hotdogButton);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == pizzaButton) {
			System.out.println("You ordered pizza!");
		}
		else if(e.getSource() == hamburgerButton) {
			System.out.println("You ordered hamburger!");
		}
		else if(e.getSource() == hotdogButton) {
			System.out.println("You ordered hotdog!");
		}
	}

}
