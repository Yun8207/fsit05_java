package tw.org.iii.mytest;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyView2 extends JPanel{
	private MyMouseListener mouseListener = new MyMouseListener();
	private LinkedList<LinkedList<HashMap<String,Integer>>> lines = new LinkedList<>();
	private LinkedList<LinkedList<HashMap<String,Integer>>> recycle = new LinkedList<>();
	private LinkedList<LinkedList<HashMap<String,Integer>>> recycleAll = new LinkedList<>();
	
	public MyView2() {
		setBackground(Color.YELLOW);
		addMouseListener(mouseListener);
		addMouseMotionListener(mouseListener);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D)g;
		
		g2d.setStroke(new BasicStroke(5));
		g2d.setColor(Color.BLUE);
		for(LinkedList<HashMap<String,Integer>> line :lines) {
		
			for (int i =1; i<line.size(); i++) {	
			HashMap<String,Integer> p0 = line.get(i-1);
			HashMap<String,Integer> p1 = line.get(i);
			g2d.drawLine(p0.get("x"), p0.get("y"), p1.get("x"), p1.get("y"));
			}
		}	
	}
	
	public void saveJPEG() {
		BufferedImage paintImage = 
			new BufferedImage(
				getWidth(), getHeight(), 
				BufferedImage.TYPE_3BYTE_BGR);
		Graphics2D graphics2D = paintImage.createGraphics();
	    paint(graphics2D);
		try {
			ImageIO.write(paintImage, "jpeg", new File("dir1/alex1.jpg"));
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	
	public void clear() {
		recycleAll.addAll(lines);
		lines.clear();
		repaint();
	}
	
	public void undo() {
		if(lines.size()>0) {
			//lines.getLast().clear();
			recycle.add(lines.removeLast());
			repaint();
		}
	}
	
	public void redo() {
		if(recycle.size()>0) {
			lines.add(recycle.removeLast());
			repaint();
		}
		if(recycleAll.size()>0) {
			lines.addAll(recycleAll);
			recycleAll.clear();
			repaint();
		}
	}
	
	public LinkedList<LinkedList<HashMap<String,Integer>>> getLines() {return lines;}
	
	public void setLines(LinkedList<LinkedList<HashMap<String,Integer>>> lines) {
		this.lines = lines;
		repaint();
	}
	
	
	private class MyMouseListener extends MouseAdapter{
		
		@Override
		public void mousePressed(MouseEvent e) {
			LinkedList<HashMap<String,Integer>> line = new LinkedList<>();
			//MyPoint2 point = new MyPoint2(e.getX(), e.getY());
			HashMap<String,Integer> point = new HashMap<>();
			point.put("x", e.getX());
			point.put("y", e.getY());
			
			line.add(point);
			lines.add(line);
			recycle.clear();
			recycleAll.clear();
		}
		@Override
		public void mouseDragged(MouseEvent e) {
			HashMap<String,Integer> point = new HashMap<>();
			point.put("x", e.getX());
			point.put("y", e.getY());
			
			lines.getLast().add(point);
			repaint();
		}
		
	}
}



