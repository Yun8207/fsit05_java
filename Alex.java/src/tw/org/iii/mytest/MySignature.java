package tw.org.iii.mytest;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MySignature extends JFrame {
	private JButton clear, undo, redo, saveJPG, saveObj, loadObj;
	private MyView myView;
	
	public MySignature() {
		super("簽名");
		
		setLayout(new BorderLayout());
		JPanel top = new JPanel(new FlowLayout());
		clear = new JButton("Clear");
		undo = new JButton("Undo");
		redo = new JButton("Redo");
		saveJPG = new JButton("SaveJPG");
		saveObj = new JButton("SavObj");
		loadObj = new JButton("LoadObj");
		top.add(clear); top.add(undo); top.add(redo); top.add(saveJPG); top.add(saveObj); top.add(loadObj);
		add(top, BorderLayout.NORTH);
		
		myView = new MyView();
		add(myView, BorderLayout.CENTER);
		
		clear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				myView.clear();
				
			}
		});
		
		undo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				myView.undo();
				
			}
		});
		
		redo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				myView.redo();
				
			}
		});
		
		saveJPG.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				myView.saveJPEG();
				
			}
		});
		
		saveObj.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				saveObj();
				
			}
		});
		
		loadObj.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				loadObj();
				
			}
		});
		
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void saveObj() {
		LinkedList<LinkedList<MyPoint>> lines = myView.getLines();
		try {
			ObjectOutputStream oout =
					new ObjectOutputStream(
							new FileOutputStream("dir1/alex.obj"));
			oout.writeObject(lines);
			oout.flush();
			oout.close();
			JOptionPane.showMessageDialog(this, "Save OK");
		} catch (IOException e) {
			System.out.println(e);
		}
		
	}
	
	private void loadObj() {
		try {
			ObjectInputStream oin =
				new ObjectInputStream(new FileInputStream("dir1/alex.obj"));
			LinkedList<LinkedList<MyPoint>> lines =
					(LinkedList<LinkedList<MyPoint>>)oin.readObject();
			oin.close();
			myView.setLines(lines);
		} catch (Exception e) {
			System.out.println(e);
			
		}
	}
	
	
	
	public static void main(String[] args) {
		new MySignature();

	}

}
