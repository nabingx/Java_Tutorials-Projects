import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Game {
	
	JFrame frame;
	JLabel label;
	Action upAction;
	Action downAction;
	Action leftAction;
	Action rightAction;
	
	public Game() {
		
		frame = new JFrame("KeyBinding Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		
		label = new JLabel();
		label.setBackground(Color.RED);
		label.setBounds(100, 100, 100, 100);
		label.setOpaque(true);
		
		upAction = new UpAction();
		downAction = new DownAction();
		leftAction = new LeftAction();
		rightAction = new RightAction();
		
		label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction"); // nút mũi tên lên ở trên bàn phím
		label.getInputMap().put(KeyStroke.getKeyStroke('w'), "upAction"); // nút 'W' ở trên bàn phím
		label.getActionMap().put("upAction", upAction);
		label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction"); // nút mũi tên xuống ở trên bàn phím
		label.getInputMap().put(KeyStroke.getKeyStroke('s'), "downAction"); // nút 'S' ở trên bàn phím
		label.getActionMap().put("downAction", downAction);
		label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction"); // nút mũi tên sang trái ở trên bàn phím
		label.getInputMap().put(KeyStroke.getKeyStroke('a'), "leftAction"); // nút 'A' ở trên bàn phím
		label.getActionMap().put("leftAction", leftAction);
		label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction"); // nút mũi tên sang phải ở trên bàn phím
		label.getInputMap().put(KeyStroke.getKeyStroke('d'), "rightAction"); // nút 'D' ở trên bàn phím
		label.getActionMap().put("rightAction", rightAction);
		
		frame.add(label);
		frame.setVisible(true);
		
	}
	
	public class UpAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX(), label.getY() - 10);
		}
		
	}
	
	public class DownAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX(), label.getY() + 10);
		}
		
	}
	
	public class LeftAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX() - 10, label.getY());
		}
		
	}
	
	public class RightAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX() + 10, label.getY());
		}
		
	}
	
}
