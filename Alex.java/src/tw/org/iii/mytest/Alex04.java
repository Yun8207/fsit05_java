package tw.org.iii.mytest;

import javax.swing.JOptionPane;

public class Alex04 {

	public static void main(String[] args) {
		String a1 = JOptionPane.showInputDialog("Input a number1");
		String a2 = JOptionPane.showInputDialog("Input a number2");
		System.out.println(a1 + " : " + a2);
		
		int i1 = Integer.parseInt(a1);
		int i2 = Integer.parseInt(a2);
		
		int b1 = i1/i2;
		int b2 = i1 - b1*i2 ;
		//int b2 = i1 % i2;
		
		
		System.out.println(i1 + "/" + i2 + "=" + b1 + "......" + b2);
	}

}
