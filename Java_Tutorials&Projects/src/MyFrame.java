import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener{ // MyFrame is the subclass of JFrame
	
	JButton button;
	JLabel label;
	
	MyFrame() {
		
		ImageIcon icon2 = new ImageIcon("suprise_face.jpg");
		Image imageResized3 = icon2.getImage(); // transform it 
		Image newimg2 = imageResized3.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		icon2 = new ImageIcon(newimg2);  // transform it back
		
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(180, 250, 150, 150);
		label.setVisible(false);
		
		ImageIcon icon = new ImageIcon("point.png");
		Image imageResized2 = icon.getImage(); // transform it 
		Image newimg = imageResized2.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		icon = new ImageIcon(newimg);  // transform it back
		
		button = new JButton();
		button.setBounds(120, 100, 250, 100);
		button.addActionListener(this);
		button.setText("I'm a button!");
		button.setFocusable(false); // loại bỏ viền quay text khi bấm vào trong button (viền này cx nằm trong button)
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans", Font.BOLD, 25));
		button.setIconTextGap(-5);
		button.setForeground(Color.red);
		button.setBackground(Color.lightGray);
		button.setBorder(BorderFactory.createEtchedBorder());
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500); // chiều rộng, chiều cao
		this.setVisible(true);
		this.add(button);
		this.add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			System.out.println("poo");
			//button.setEnabled(false); // Ko cho bấm button nx
			label.setVisible(true);
		}
		
	}
}
