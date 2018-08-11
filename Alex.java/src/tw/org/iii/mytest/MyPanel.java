package tw.org.iii.mytest;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class MyPanel extends JPanel implements MouseListener { 
	private int mx = 40;
	private int my = 40;
	Color color;
	public MyPanel() {
//		MListener myListener = new MListener();
//		addMouseListener(myListener);
		//addMouseListener(this);
	}
	
	public MyPanel(int x, int y) {
		addMouseListener(this);
		this.mx = x; this.my = y;
		color = Color.RED;
		
	}
	
	
//	class MListener extends MouseAdapter {
//		public void mousePressed(MouseEvent e) {
//			mx = e.getX();
//			my = e.getY();
//			repaint();
//		}
//		
//	}
	

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		System.out.println("paint");
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(color);
		g2d.fillOval(mx-40, my-40, 80, 80);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		mx = e.getX();
		my = e.getY();
		//repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}