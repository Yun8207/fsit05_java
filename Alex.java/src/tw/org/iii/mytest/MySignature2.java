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
import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MySignature2 extends JFrame {
	private JButton clear, undo, redo, saveJPG, saveObj, loadObj;
	private MyView2 MyView2;
	
	public MySignature2() {
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
		
		MyView2 = new MyView2();
		add(MyView2, BorderLayout.CENTER);
		
		clear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				MyView2.clear();
				
			}
		});
		
		undo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				MyView2.undo();
				
			}
		});
		
		redo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				MyView2.redo();
				
			}
		});
		
		saveJPG.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				MyView2.saveJPEG();
				
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
		LinkedList<LinkedList<HashMap<String,Integer>>> lines = MyView2.getLines();
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
			LinkedList<LinkedList<HashMap<String,Integer>>> lines =
					(LinkedList<LinkedList<HashMap<String,Integer>>>)oin.readObject();
			oin.close();
			MyView2.setLines(lines);
		} catch (Exception e) {
			System.out.println(e);
			
		}
	}
	
	
	
	public static void main(String[] args) {
		new MySignature2();

	}

}

