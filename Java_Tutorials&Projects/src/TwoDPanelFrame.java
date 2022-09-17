import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class TwoDPanelFrame extends JPanel{

	Image image;
	
	public TwoDPanelFrame() {
		
		image = new ImageIcon("cloud.jpg").getImage();//.getScaledInstance(400, 400, java.awt.Image.SCALE_SMOOTH);
		this.setPreferredSize(new Dimension(1000, 850));
		
	}
	
	public void paint(Graphics g) { // mấy thằng (public) void này tự động khởi tạo/chạy khi gọi class TwoDGraphicsFrame trong class Main 
		
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.drawImage(image, 0, 0, null);
		
		g2D.setPaint(Color.BLUE);
		//g2D.setStroke(new BasicStroke(5)); // độ dày của cái Line đc kẻ ra
		//g2D.drawLine(0, 0, 500, 500);
		
		//g2D.drawRect(0, 0, 100, 200);
		//g2D.setPaint(Color.PINK);
		//g2D.fillRect(0, 0, 100, 200);
		
		//g2D.setPaint(Color.ORANGE);
		//g2D.drawOval(0, 0, 100, 100);
		//g2D.fillOval(0, 0, 100, 100);
		
		g2D.setPaint(Color.RED);
		//g2D.drawArc(0, 0, 100, 100, 0, 180);
		g2D.fillArc(0, 0, 100, 100, 0, 180);
		g2D.setPaint(Color.WHITE);
		g2D.fillArc(0, 0, 100, 100, 180, 180);
		
		int[] xPoints = {150, 250, 350};
		int[] yPoints = {300, 150, 300};
		g2D.setPaint(Color.YELLOW);
		//g2D.drawPolygon(xPoints, yPoints, 3);
		g2D.fillPolygon(xPoints, yPoints, 3);
		
		//g2D.setPaint(Color.MAGENTA);
		//g2D.setFont(new Font("Ink Free", Font.BOLD, 50));
		//g2D.drawString("U R A WINNER! :D", 50, 50);
		
		
		
	}
	
}
