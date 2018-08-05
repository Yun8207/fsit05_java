package tw.org.iii.mytest;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuessNumber extends JFrame {
	private JButton guess;
	private JTextField input;
	private JTextArea hist;
	private String answer =  createAnswer();
	private int counter;
	private String word = "0123456789" ;
	
	public GuessNumber() {
		super("Guess Number Game");
		
		guess = new JButton("guess");
		input = new JTextField();
		hist = new JTextArea();
		
		setLayout(new BorderLayout());
		
		add(hist, BorderLayout.CENTER);
		input.setFont(new Font("Default", Font.PLAIN, 20)); 
		hist.setFont(new Font("Default", Font.BOLD + Font.ITALIC, 30)); 
		
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
		//System.out.println(answer);
		
	}
	
	void doGuess() {
		input.grabFocus();
		String text = input.getText();
		boolean Isnumb = false;
		for(int i=0; i<text.length(); i++) {
			if((word.indexOf(text.substring(i, i+1)) != -1)) {
				Isnumb = true;
			}else {
				Isnumb = false;
				break;
			}
		}
		
		
		if(Isnumb == true && text.length()<4) {
				counter++;
				String result = checkAB();
				hist.append(counter + ". " + input.getText() + " => " + result + "\n");
				System.out.println(input.getText());
				input.setText("");
				if(result.equals("3A0B")) {
					JOptionPane.showMessageDialog(null,"Congratulation!!");
				}else if(counter >= 10) {
					JOptionPane.showMessageDialog(null,"You Lose" + answer);
				}
		}
		
		
		
	}
	
	String checkAB() {
		int a, b; a = b = 0;
		String inputGuess = input.getText();
		for (int i = 0; i < inputGuess.length(); i++) {
			if (inputGuess.charAt(i) == answer.charAt(i)) {
				a++;
			}else if(answer.indexOf(inputGuess.charAt(i)) != -1 ) {
				b++;
			}
		}
		return a +"A" + b + "B";
	}
	
	String createAnswer() {
		int a, b, c;
		//a = String.valueOf((int)(Math.random()*10));
		a = (int)(Math.random()*10);
		b = (int)(Math.random()*10);
		c = (int)(Math.random()*10);
		while(a ==b) {
			b = (int)(Math.random()*10);
			while(b==c) {
				c = (int)(Math.random()*10);
			}
		}
		
		return ""+ a + b + c;
	}
	
	public static void main(String[] args) {
		new GuessNumber();
		
	}

}

//don't have to click on textbox again after guessing or mouse move to text automatically
//can't guess if "NAME" "ABCDEFG"
//reopen game after notice
