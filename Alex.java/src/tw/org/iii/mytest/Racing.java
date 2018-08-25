package tw.org.iii.mytest;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Racing extends JFrame {
	private JButton go;
	private JLabel[] lanes = new JLabel[8];
	private Horse horses[] = new Horse[8];
	private int rank = 1;
	
	public Racing() {
		super();
		setLayout(new GridLayout(9,0));
		//private AbstractClock dClock;//download github
		
		
		JPanel top = new JPanel(new BorderLayout());
		go = new JButton("Go!"); add(go);
		top.add(go, BorderLayout.CENTER);
		
		for (int i=0; i<lanes.length; i++) {
			lanes[i] = new JLabel((i+1) + ".");
			add(lanes[i]);
		}
		
		go.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				newRound();
				go.setEnabled(false);
			}
		});
		
		setSize(800, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void newRound() {
		rank = 1;
		for (int i=0; i<horses.length; i++) {
			lanes[i].setText((i+1)+".");
			horses[i] = new Horse(i);
			horses[i].start();
		}
	}
	private void stopGame() {
		for (int i=0; i<horses.length; i++) {
			horses[i].interrupt();
		}
		go.setEnabled(true);
	}
	private class Horse extends Thread {
		int lane;
		Horse(int lane){this.lane=lane;}
		@Override
		public void run() {
			for(int i=0; i<100; i++) {
				lanes[lane].setText(lanes[lane].getText()+">");
				if(i==99) {
					lanes[lane].setText(lanes[lane].getText()+ rank++);
					stopGame();
				}
				try {
					Thread.sleep(50 + (int)(Math.random()*150));
				} catch (InterruptedException e) {
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Racing();
	}
}//producer consumer example
