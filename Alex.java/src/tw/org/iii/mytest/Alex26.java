package tw.org.iii.mytest;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Alex26 extends JFrame {
	private JButton b1, b2;
	
	public Alex26() {
		super("My Window");
		
		b1 = new JButton("B1");
		b2= new JButton("B2");
		
		setLayout(new FlowLayout(FlowLayout.CENTER, 80, 100));
		add(b1);
		add(b2);
		
		
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Alex26();
		

	}

}
