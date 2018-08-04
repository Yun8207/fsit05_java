package tw.org.iii.mytest;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuessNumber extends JFrame {
	private JButton guess;
	private JTextField input;
	private JTextArea hist;
	
	public GuessNumber() {
		super("Guess Number Game");
		
		guess = new JButton("guess");
		input = new JTextField();
		hist = new JTextArea();
		
		setLayout(new BorderLayout());
		
		add(hist, BorderLayout.CENTER);
		
		JPanel top = new JPanel(new BorderLayout());
		top.add(input, BorderLayout.CENTER);
		top.add(guess, BorderLayout.EAST);
		add(top, BorderLayout.NORTH);
		
		guess.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				doGuess();
			}
		});
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	void doGuess() {
		
	}
	
	public static void main(String[] args) {
		new GuessNumber();

	}

}
