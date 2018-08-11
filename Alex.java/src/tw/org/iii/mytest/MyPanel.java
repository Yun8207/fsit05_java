package tw.org.iii.mytest;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	private int mx = 40;
	private int my = 40;
	public MyPanel() {
		System.out.println("MyPanel()");
		MListener myListener = new MListener();
		addMouseListener(myListener);
		
		
	}
	//

	
	 class MListener extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			mx = e.getX();
			my = e.getY();
			repaint();
		}
		
	}
	
	
	@Override
	public void paint(Graphics g) {
		
		super.paint(g);
		System.out.println("paint2");
	}
	

	@Override
	protected void paintComponent(Graphics g) {
		//repaint();
		super.paintComponent(g);
		System.out.println("paint");
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Color.RED);
		g2d.fillOval(mx-40, my-40, 80, 80);
	}
	
}