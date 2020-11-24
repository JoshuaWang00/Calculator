import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculatorGUI implements ActionListener {
	//gui constructor
	JButton one = new JButton();
	JButton two = new JButton();
	JButton three = new JButton();
	JButton four = new JButton();
	JButton five = new JButton();
	JButton six = new JButton();
	JButton seven = new JButton();
	JButton eight = new JButton();
	JButton nine = new JButton();
	JButton plus = new JButton();
	JButton minus = new JButton();
	JButton multiply = new JButton();
	JButton divide = new JButton();
	JButton equals = new JButton();
	JTextField display = new JTextField();
	Font font = new Font("Whatever", Font.PLAIN, 50);
	int method;
	int displayint;
	
	
	public int add(int x, int y) {
		int z = 0; 
		z = x + y;
		return z;
	}
	
	public void setMethod(int number) {
		method = number;
	}
	
	
	public calculatorGUI(){
	JFrame window = new JFrame();
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(600, 800);
	
	
	one = new JButton("1");
	one.addActionListener(this);
	display.setBounds(10,10, 500, 60);
	display.setSize(500, 100);
	display.setFont(font);
	
	JPanel panel = new JPanel();
	panel.setLayout(null);
	window.add(panel);
	
	panel.add(display);
	display.setEditable(false);
	
	
	one.setBounds(10, 600, 100, 100);
	
	panel.add(one);

	
	two = new JButton("2");
	two.setBounds(130, 600, 100, 100);
	two.addActionListener(this);
	panel.add(two);
	
	three = new JButton("3");
	three.addActionListener(this);
	three.setBounds(250, 600, 100, 100);
	panel.add(three);
	
	four = new JButton("4");
	four.addActionListener(this);
	four.setBounds(10, 500, 100, 100);
	panel.add(four);
	
	five = new JButton("5");
	five.addActionListener(this);
	five.setBounds(130, 500, 100, 100);
	panel.add(five);
	
	six = new JButton("6");
	six.addActionListener(this);
	six.setBounds(250, 500, 100, 100);
	panel.add(six);
	
	seven = new JButton("7");
	seven.addActionListener(this);
	seven.setBounds(10, 400, 100, 100);
	panel.add(seven);
	
	eight = new JButton("8");
	eight.addActionListener(this);
	eight.setBounds(130, 400, 100, 100);
	panel.add(eight);
	
	nine = new JButton("9");
	nine.addActionListener(this);
	nine.setBounds(250, 400, 100, 100);
	panel.add(nine);
	
	plus = new JButton("+");
	plus.addActionListener(this);
	plus.setBounds(370, 400, 100, 100);
	panel.add(plus);
	
	minus = new JButton("-");
	minus.addActionListener(this);
	minus.setBounds(370, 500, 100, 100);
	panel.add(minus);
	
	equals = new JButton("=");
	equals.addActionListener(this);
	equals.setBounds(370, 600, 100, 100);
	panel.add(equals);
	
	multiply = new JButton("x");
	multiply.addActionListener(this);
	multiply.setBounds(370, 200, 100, 100);
	panel.add(multiply);
	
	divide = new JButton("/");
	divide.addActionListener(this);
	divide.setBounds(370, 300, 100, 100);
	panel.add(divide);
	
	
			
			
	window.setVisible(true);
	
	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculatorGUI GUI = new calculatorGUI();
		
		
		
		
	
		
		
		
		
		
		
		
				
		
		
	}
	
	
			
		
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == one) {
			
			display.setText(display.getText() + "1");}
		
		if (e.getSource() == two) {
			
			display.setText(display.getText() + "2");}

		if (e.getSource() == three) {
			
			display.setText(display.getText() + "3");}

		if (e.getSource() == four) {
			
			display.setText(display.getText() + "4");}

		if (e.getSource() == five) {
			
			display.setText(display.getText() + "5");}

		if (e.getSource() == six) {
			
			display.setText(display.getText() + "6");}

		if (e.getSource() == seven) {
			
			display.setText(display.getText() + "7");}

		if (e.getSource() == eight) {
			
			display.setText(display.getText() + "8");}

		if (e.getSource() == nine) {
			
			display.setText(display.getText() + "9");}
		
		if (e.getSource() == plus) {
			displayint = Integer.parseInt(display.getText());
			display.setText(null);	
					setMethod(1);
			;}
		
		if (e.getSource() == minus) {
			displayint = Integer.parseInt(display.getText());
			display.setText(null);	
					setMethod(2);
			;}
		
		if (e.getSource() == multiply) {
			displayint = Integer.parseInt(display.getText());
			display.setText(null);	
					setMethod(3);
			;}
		
		if (e.getSource() == divide) {
			displayint = Integer.parseInt(display.getText());
			display.setText(null);	
					setMethod(4);
			;}
		
		
		
		if (e.getSource() == equals) {
			
			if (method == 1) {
			displayint = displayint + Integer.parseInt(display.getText());
			display.setText(Integer.toString(displayint));	
					setMethod(0);
			;}
			
			if (method == 2) {
				displayint = displayint - Integer.parseInt(display.getText());
				display.setText(Integer.toString(displayint));	
						setMethod(0);
				;}
			
			if (method == 3) {
				displayint = displayint * Integer.parseInt(display.getText());
				display.setText(Integer.toString(displayint));	
						setMethod(0);
				;}
			
			if (method == 4) {
				displayint = displayint / Integer.parseInt(display.getText());
				display.setText(Integer.toString(displayint));	
						setMethod(0);
				;}
			
			
			
			
		}
		
		
		
		
	}
}
	
	

	
		
		
	
	
	


