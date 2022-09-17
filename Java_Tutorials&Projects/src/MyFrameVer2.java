import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrameVer2 extends JFrame implements ActionListener{
	
	JButton button;
	JTextField textField;
	
	public MyFrameVer2() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Submit");
		button.setFocusable(false);
		button.addActionListener(this);
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(250, 40));
		textField.setFont(new Font("Consolas", Font.ITALIC, 30));
		textField.setForeground(new Color(0x00FF00));
		textField.setBackground(Color.black);
		textField.setCaretColor(Color.white); // đổi màu con trỏ nhấp nháy lúc input
		textField.setText("username");
		//textField.setEditable(false);
		
		this.add(button);
		this.add(textField);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			System.out.println("Welcome " + textField.getText());
			button.setEnabled(false);
			textField.setEditable(false);
		}
	}

}
