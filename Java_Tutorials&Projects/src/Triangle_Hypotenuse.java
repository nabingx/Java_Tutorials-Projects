import javax.swing.JOptionPane;

public class Triangle_Hypotenuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 7
		
		double x = Double.parseDouble(JOptionPane.showInputDialog("Enter side of x"));
		double y = Double.parseDouble(JOptionPane.showInputDialog("Enter side of y"));
		
		double z = Math.sqrt(x*x + y*y);
		
		JOptionPane.showMessageDialog(null, "Hypotenuse of the triangle is " + z);
		
		
	}

}
