package tw.org.iii.mytest;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyPanelV4 extends MyPanel {
	int c;
	private MouseListener mListener = new MouseListener() {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
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
		
	};
	
	private MouseListener mListener2 = new MouseAdapter() {
		public void mouseClickd(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	};
	
	
	public MyPanelV4() {
		
		addMouseListener(mListener);
		addMouseListener(mListener2);
	}
	
	public int getC() { return c;}
}

class MouseListenerV100 extends MouseAdapter {
	private MyPanelV4 obj;
	public MouseListenerV100(MyPanelV4 obj) {
		this.obj = obj;
	}
	
	public void mouseClickd(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}