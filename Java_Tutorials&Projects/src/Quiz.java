import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Quiz implements ActionListener{
	
	String[] questions =	{
								"Which company created Java?",
								"Which year was Java created",
								"What was Java originally called?",
								"Who is credited with creating Java?"
							};
	String[][] options =	{
								{"Sun Microsystems", "Starbucks", "Microsoft", "Alphabet"},
								{"1989", "1996", "1972", "1492"},
								{"Apple", "Latte", "Oak", "Koffing"},
								{"Steve Jobs", "Bill Gates", "James Gosling", "Mark Zuckerburg"}
							};
	char[] answers = 		{
								'A',
								'B',
								'C',
								'C'
							};
	char guess;
	char answer;
	int index;
	int correct_guesses = 0;
	int total_questions = questions.length;
	int result;
	int second = 10;
	
	JFrame frame = new JFrame();
	JTextField textfield = new JTextField();
	JTextArea textarea = new JTextArea();
	
	JButton buttonA = new JButton();
	JButton buttonB = new JButton();
	JButton buttonC = new JButton();
	JButton buttonD = new JButton();
	
	JLabel answer_labelA = new JLabel();
	JLabel answer_labelB = new JLabel();
	JLabel answer_labelC = new JLabel();
	JLabel answer_labelD = new JLabel();
	
	JLabel time_label = new JLabel();
	JLabel second_left = new JLabel();
	JTextField number_right = new JTextField();
	JTextField percentage = new JTextField();
	
	Quiz() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(650,650);
		frame.getContentPane().setBackground(new Color(50, 50, 50));
		frame.setLayout(null);
		frame.setResizable(false);
		
		textfield.setBounds(0, 0, 650, 50);
		textfield.setBackground(new Color(25, 25, 25));
		textfield.setForeground(new Color(25, 255, 0));
		textfield.setFont(new Font("Ink Free", Font.BOLD, 30));
		textfield.setBorder(BorderFactory.createBevelBorder(1));
		textfield.setHorizontalAlignment(JTextField.CENTER);
		textfield.setEditable(false);
		
		textarea.setBounds(0, 50, 650, 50);
		textarea.setLineWrap(true);
		textarea.setWrapStyleWord(true);
		textarea.setBackground(new Color(25, 25, 25));
		textarea.setForeground(new Color(25, 255, 0));
		textarea.setFont(new Font("MV Boli", Font.BOLD, 25));
		textarea.setBorder(BorderFactory.createBevelBorder(1));
		textarea.setEditable(false);
		
		buttonA.setBounds(0, 100, 100, 100);
		buttonA.setFont(new Font("MV Boli", Font.BOLD, 35));
		buttonA.setFocusable(false);
		buttonA.addActionListener(this);
		buttonA.setText("A");
		
		buttonB.setBounds(0, 200, 100, 100);
		buttonB.setFont(new Font("MV Boli", Font.BOLD, 35));
		buttonB.setFocusable(false);
		buttonB.addActionListener(this);
		buttonB.setText("B");
		
		buttonC.setBounds(0, 300, 100, 100);
		buttonC.setFont(new Font("MV Boli", Font.BOLD, 35));
		buttonC.setFocusable(false);
		buttonC.addActionListener(this);
		buttonC.setText("C");
		
		buttonD.setBounds(0, 400, 100, 100);
		buttonD.setFont(new Font("MV Boli", Font.BOLD, 35));
		buttonD.setFocusable(false);
		buttonD.addActionListener(this);
		buttonD.setText("D");
		
		answer_labelA.setBounds(125, 100, 500, 100);
		answer_labelA.setBackground(new Color(50, 50, 50));
		answer_labelA.setForeground(new Color(25, 255, 0));
		answer_labelA.setFont(new Font("MV Boli", Font.PLAIN, 35));
		
		answer_labelB.setBounds(125, 200, 500, 100);
		answer_labelB.setBackground(new Color(50, 50, 50));
		answer_labelB.setForeground(new Color(25, 255, 0));
		answer_labelB.setFont(new Font("MV Boli", Font.PLAIN, 35));
		
		answer_labelC.setBounds(125, 300, 500, 100);
		answer_labelC.setBackground(new Color(50, 50, 50));
		answer_labelC.setForeground(new Color(25, 255, 0));
		answer_labelC.setFont(new Font("MV Boli", Font.PLAIN, 35));
		
		answer_labelD.setBounds(125, 400, 500, 100);
		answer_labelD.setBackground(new Color(50, 50, 50));
		answer_labelD.setForeground(new Color(25, 255, 0));
		answer_labelD.setFont(new Font("MV Boli", Font.PLAIN, 35));
		
		second_left.setBounds(535, 510, 100, 100);
		second_left.setBackground(new Color(25, 25, 25));
		second_left.setForeground(new Color(255, 0, 0));
		second_left.setFont(new Font("Ink Free", Font.BOLD, 60));
		second_left.setBorder(BorderFactory.createBevelBorder(1));
		second_left.setOpaque(true);
		second_left.setHorizontalAlignment(JTextField.CENTER);
		second_left.setText(String.valueOf(second));
		
		time_label.setBounds(535, 480, 100, 25);
		time_label.setBackground(new Color(50, 50, 50));
		time_label.setForeground(new Color(255, 0, 0));
		time_label.setFont(new Font("MV Boli", Font.BOLD, 18));
		time_label.setHorizontalAlignment(JTextField.CENTER);
		time_label.setText("Timer >:D");
		
		number_right.setBounds(225,225,200,100);
		number_right.setBackground(new Color(25,25,25));
		number_right.setForeground(new Color(25,255,0));
		number_right.setFont(new Font("Ink Free",Font.BOLD,50));
		number_right.setBorder(BorderFactory.createBevelBorder(1));
		number_right.setHorizontalAlignment(JTextField.CENTER);
		number_right.setEditable(false);
		
		percentage.setBounds(225,325,200,100);
		percentage.setBackground(new Color(25,25,25));
		percentage.setForeground(new Color(25,255,0));
		percentage.setFont(new Font("Ink Free",Font.BOLD,50));
		percentage.setBorder(BorderFactory.createBevelBorder(1));
		percentage.setHorizontalAlignment(JTextField.CENTER);
		percentage.setEditable(false);
		
		frame.add(time_label);
		frame.add(second_left);
		frame.add(answer_labelA);
		frame.add(answer_labelB);
		frame.add(answer_labelC);
		frame.add(answer_labelD);
		frame.add(buttonA);
		frame.add(buttonB);
		frame.add(buttonC);
		frame.add(buttonD);
		frame.add(textarea);
		frame.add(textfield);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		nextQuestion();
	}
	
	public void nextQuestion() {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
	public void displayAnswer() {
		
	}
	
	public void results() {
		
	}
	
}