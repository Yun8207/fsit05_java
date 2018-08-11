package tw.org.iii.mytest;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class Alex38 extends JFrame{
	private MyPanelV3 myPanel;
	public Alex38() {
		
		setLayout(new BorderLayout());
		
		myPanel = new MyPanelV3();
		add(myPanel, BorderLayout.CENTER);
		addWindowListener(new MyListener());
		
		setSize(640, 480);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new Alex38();

	}

}
class MyListener extends WindowAdapter {
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Closing");
		System.exit(0); //command line return value; 0=> normal; !0 =>error
	}
}

class MListener extends MouseAdapter {
	public void mousePressed(MouseEvent e) {
		
	}
	
}



//class MyWindowListener implements WindowListener{
//
//	@Override
//	public void windowOpened(WindowEvent e) {
//		System.out.println("Opened");
//		
//	}
//
//	@Override
//	public void windowClosing(WindowEvent e) {
//		System.out.println("Closing");
//		System.exit(0); //command line return value; 0=> normal; !0 =>error
//	}
//
//	@Override
//	public void windowClosed(WindowEvent e) {
//		System.out.println("Closed");
//		
//	}
//
//	@Override
//	public void windowIconified(WindowEvent e) {
//		System.out.println("Iconified");
//		
//	}
//
//	@Override
//	public void windowDeiconified(WindowEvent e) {
//		System.out.println("Deiconified");
//		
//	}
//
//	@Override
//	public void windowActivated(WindowEvent e) {
//		System.out.println("Activated");
//		
//	}
//
//	@Override
//	public void windowDeactivated(WindowEvent e) {
//		System.out.println("Deactivated");
//		
//	}
//	
//}