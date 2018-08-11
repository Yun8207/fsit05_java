package tw.org.iii.mytest;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyPanelV3 extends MyPanel{
	public MyPanelV3() {
		//super();
		addMouseListener(new MyListener());
	}
	
	private class MyListener extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			//super.mouseClicked(e);
			
		}
	}

}
