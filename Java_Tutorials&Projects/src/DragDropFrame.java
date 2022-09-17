import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DragDropFrame extends JFrame{
	
	DragPanel dragPanel = new DragPanel();
	//JPanel panel;
	
	public DragDropFrame() {
		
		//panel = new JPanel();
		//panel.setBackground(Color.GREEN);
		//panel.setBounds(0, 250, 500, 250);
		//panel.setLayout(null);
		//panel.setOpaque(true);
		
		this.setTitle("Drag & Drop demo");
		this.setSize(600, 600);
		//-this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//-this.getContentPane().setBackground(Color.BLACK);
		//this.add(panel);
		this.add(dragPanel);
		//panel.setVisible(true);
		this.setLocationRelativeTo(null); // cửa sổ hiện ra giữa màn hình
		this.setVisible(true);
		
	}
	
}
