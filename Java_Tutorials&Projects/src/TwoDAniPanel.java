import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TwoDAniPanel extends JPanel implements ActionListener{
	
	final int PANEL_WIDTH = 500;
	final int PANEL_HEIGHT = 500;
	Image enemy, enemy2;
	Image backgroundImage;
	Timer timer;
	int xVelocity = 4;
	int yVelocity = 1;
	int x = 0;
	int y = 0;
	
	public TwoDAniPanel() {
		this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
		this.setBackground(Color.black);
		enemy = new ImageIcon("enemy.png").getImage();//.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		enemy2 = enemy.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		backgroundImage = new ImageIcon("space.jpg").getImage().getScaledInstance(500, 500, java.awt.Image.SCALE_SMOOTH);
		timer = new Timer(10, this);
		timer.start();
	}
	
	public void paint(Graphics g) {
		
		super.paint(g); // paint background
		
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.drawImage(backgroundImage, 0, 0, null);
		g2D.drawImage(enemy2, x, y, null);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(x >= PANEL_WIDTH - enemy2.getWidth(null) || x < 0) {
			xVelocity = xVelocity * -1;
		}
		x = x + xVelocity;
		if(y >= PANEL_HEIGHT - enemy2.getHeight(null) || y < 0) {
			yVelocity = yVelocity * -1;
		}
		y = y + yVelocity;
		repaint(); // phải có lệnh này vì khi x thay đổi nhưng chưa được vẽ lại
		
	}
	
}
