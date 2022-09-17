import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBarFrame extends JFrame implements ActionListener{

	JMenuBar menuBar;
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	ImageIcon loadIcon;
	ImageIcon saveIcon;
	ImageIcon exitIcon;
	
	public MenuBarFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(new FlowLayout());
		
		loadIcon = new ImageIcon("load icon.jpg");
		Image imageResized1 = loadIcon.getImage(); // transform it 
		Image newimg1 = imageResized1.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		loadIcon = new ImageIcon(newimg1);  // transform it back
		
		saveIcon = new ImageIcon("save icon.png");
		Image imageResized2 = saveIcon.getImage(); // transform it 
		Image newimg2 = imageResized2.getScaledInstance(75, 50,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		saveIcon = new ImageIcon(newimg2);  // transform it back
		
		exitIcon = new ImageIcon("exit icon.jpg");
		Image imageResized3 = exitIcon.getImage(); // transform it 
		Image newimg3 = imageResized3.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		exitIcon = new ImageIcon(newimg3);  // transform it back
		
		menuBar = new JMenuBar();
		
		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");
		JMenu helpMenu = new JMenu("Help");
		
		loadItem = new JMenuItem("Load");
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		loadItem.setIcon(loadIcon);
		saveItem.setIcon(saveIcon);
		exitItem.setIcon(exitIcon);
		
		fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + F for File
		editMenu.setMnemonic(KeyEvent.VK_E); // Alt + E for Edit
		helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + H for Help
		loadItem.setMnemonic(KeyEvent.VK_L); // L for load
		saveItem.setMnemonic(KeyEvent.VK_S); // S for save
		exitItem.setMnemonic(KeyEvent.VK_E); // E for exit
											 // Tạo phím tắt
		
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		
		this.setJMenuBar(menuBar);
		
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == loadItem) {
			System.out.println("* beep boop * You loaded a file");
		}
		if(e.getSource() == saveItem) {
			System.out.println("* beep boop * You saved a file");
		}
		if(e.getSource() == exitItem) {
			System.exit(0);
		}
	}

}
