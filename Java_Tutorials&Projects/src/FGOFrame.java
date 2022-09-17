import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class FGOFrame extends JFrame{
	
	FGOFrame(){
		this.setTitle("Fate Grand Order"); // sets title of frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exits out of application
															  //ấn vào nút x thì tắt hẳn, ko chạy ngầm
											// HIDE_ON_CLOSE - tắt nhưng vẫn chạy ngầm
											// DO_NOTHING_ON_CLOSE - ấn vào x nhưng ko tắt
		this.setResizable(false); // prevent the frame from being resized
		this.setSize(420, 420); // sets the x-dimension, y-dimension of the frame in integers
		this.setVisible(true); // make frame visible
		
		ImageIcon image = new ImageIcon("FGO_logo.jpg"); // creates an ImageIcon
		this.setIconImage(image.getImage()); // changes icon of frame
		//frame.getContentPane().setBackground(Color.BLUE); // changes color of background
		//frame.getContentPane().setBackground(new Color(31, 161, 216));
		this.getContentPane().setBackground(new Color(0x1220a3));
	}
	
}
