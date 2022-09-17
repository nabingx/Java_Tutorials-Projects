import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxFrame extends JFrame implements ActionListener{
	
	JButton button;
	JCheckBox checkBox;
	ImageIcon xIcon;
	ImageIcon checkIcon;
	
	public CheckBoxFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		xIcon = new ImageIcon("x icon.png");
		Image imageResized1 = xIcon.getImage(); // transform it 
		Image newimg1 = imageResized1.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		xIcon = new ImageIcon(newimg1);  // transform it back
		
		checkIcon = new ImageIcon("checkmark icon.png");
		Image imageResized2 = checkIcon.getImage(); // transform it 
		Image newimg2 = imageResized2.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		checkIcon = new ImageIcon(newimg2);  // transform it back
		
		button = new JButton();
		button.setText("submit");
		button.addActionListener(this);
		
		checkBox = new JCheckBox();
		checkBox.setText("I'm not a robot");
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("Consolas", Font.PLAIN, 35));
		checkBox.setIcon(xIcon);
		checkBox.setSelectedIcon(checkIcon);
		
		this.add(button);
		this.add(checkBox);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			System.out.println(checkBox.isSelected());
		}
	}

}
