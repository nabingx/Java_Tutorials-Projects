import java.awt.*;
import javax.swing.*;

public class ProgressBarDemo {
	
	JFrame frame = new JFrame("HP Bar");
	JProgressBar bar = new JProgressBar(0, 500);
	
	public ProgressBarDemo() {
		
		bar.setValue(0);
		bar.setBounds(0, 0, 420, 50); // Dùng vì setLayout = null
		bar.setStringPainted(true); // Hiện phần trăm đc tô khi đang tô
		bar.setFont(new Font("MV Boli", Font.BOLD, 25));
		bar.setForeground(Color.RED); // Set màu nền phần đc tô
		bar.setBackground(Color.BLACK); // Set màu nền phần chưa đc tô
		
		frame.add(bar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		fill();
	}
	
	public void fill() {
		int counter = 500;
		int currentHP = 500;
		int maximumHP = 500;
		
		while(currentHP > 0) {
			
			//bar.setValue(counter);
			bar.setValue(currentHP);
			bar.setString(currentHP+"/"+maximumHP+" HP");
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//counter--;
			currentHP--;
		}
		//bar.setString("Done! :)");
		bar.setString("You're died :(");
	}
	
}
