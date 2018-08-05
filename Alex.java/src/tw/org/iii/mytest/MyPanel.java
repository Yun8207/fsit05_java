package tw.org.iii.mytest;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	public MyPanel() {
		System.out.println("MyPanel()");
//		class MListener extends MouseAdapter {
//			public void mousePressed(MouseEvent e) {
//				repaint();
//			}
//			
//		}
		
		
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
		g2d.fillOval((int)(Math.random()*100), 0, 240, 240);
	}
	
}
//https://github.com/Yun8207/fsit05_java.git