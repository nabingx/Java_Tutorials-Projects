import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class DragPanel extends JPanel{

	ImageIcon image = new ImageIcon("dizzy icon.jpg");
	final int WIDTH = image.getIconWidth();
	final int HEIGHT = image.getIconHeight();
	Point imageCorner;
	Point prevPt;
	boolean dragValid = false;
	
	public DragPanel() {

		/*image = new ImageIcon("smile icon.png");
		Image imageResized1 = image.getImage(); // transform it 
		Image newimg1 = imageResized1.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		image = new ImageIcon(newimg1);  // transform it back*/
		
		imageCorner = new Point(0, 0);
		ClickListener clickListener = new ClickListener();
		DragListener dragListener = new DragListener();
		this.addMouseListener(clickListener);
		this.addMouseMotionListener(dragListener);
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		image.paintIcon(this, g, (int) imageCorner.getX(), (int) imageCorner.getY());
	}
	
	// 2 class cũ khiến ấn vào đâu trong panel cũng có thể drag ảnh
	// 2 class mới giúp chỉ khi ấn vào ảnh mới đc drag
	// Hiện tại code chưa giới hạn miền drag
	
	/*private class ClickListener extends MouseAdapter{
	
		public void mousePressed(MouseEvent e) {
			prevPt = e.getPoint();
		}
		
	}*/
	private class ClickListener extends MouseAdapter{
	    public void mousePressed(MouseEvent e) {  
	            prevPt = e.getPoint(); 
	            dragValid = (e.getPoint().getX() > imageCorner.getX()) && 
	                    (e.getPoint().getX() < (imageCorner.getX() + WIDTH)) &&
	                    (e.getPoint().getY() > imageCorner.getY()) &&
	                    (e.getPoint().getY() < (imageCorner.getY() + HEIGHT));
	    }
	}
	
	/*private class DragListener extends MouseMotionAdapter{
		public void mouseDragged(MouseEvent e) {
			Point currentPt = e.getPoint();
			imageCorner.translate(
					
					(int) (currentPt.getX() - prevPt.getX()),
					(int) (currentPt.getY() - prevPt.getY())
					
					); // Di chuyển ảnh đi (như di chuyển kiểu vector)
			prevPt = currentPt;
			repaint();
		}
	}*/
	private class DragListener extends MouseMotionAdapter{
	    public void mouseDragged(MouseEvent e) { 
	            if(dragValid){
	                Point currentPt = e.getPoint();    
	                imageCorner.translate(
	                        (int)(currentPt.getX() - prevPt.getX()),
	                        (int)(currentPt.getY() - prevPt.getY())
	                );
	                prevPt = currentPt;
	                repaint();
	            }
	    }
	}
	
}
