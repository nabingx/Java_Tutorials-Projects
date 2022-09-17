import javax.swing.JOptionPane;

public class Lesson6 /*extends Main*/ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//		6-------------------------
		
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello " + name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		//Inerger.parseInt(): phân tích string đó thành số kiểu Integer
		JOptionPane.showMessageDialog(null, "You are " + age + " years old");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
		JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");
		
		int a = Integer.parseInt("11", 16);	// Số 11 chuyển sang cơ số 16 là 17
		JOptionPane.showMessageDialog(null, a);
	}

}
