import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ColorChooserFrame extends JFrame implements ActionListener{

	JButton button;
	JLabel label;
	
	public ColorChooserFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Pick a color");
		button.addActionListener(this);
		button.setFocusable(false);
		
		label = new JLabel();
		label.setBackground(Color.WHITE);
		label.setText("This is some text :D");
		label.setFont(new Font("MV Boli", Font.PLAIN, 100));
		label.setOpaque(true); // display the background color
		
		this.add(button);
		this.add(label);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == button) {
			JColorChooser colorChooser = new JColorChooser();
			
			Color color = JColorChooser.showDialog(null, "Pick a color ... I guess", Color.BLACK);
			
			//label.setForeground(color);
			label.setBackground(color);
		}
		
	}

}
