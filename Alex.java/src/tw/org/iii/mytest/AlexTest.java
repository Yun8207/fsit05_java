package tw.org.iii.mytest;

import javax.swing.JOptionPane;

public class AlexTest {

	public static void main(String[] args) {
		String year = JOptionPane.showInputDialog("year");
		
		int i1= Integer.parseInt(year);
		
		if (i1 % 4 == 0) {
			if (i1 % 100 == 0 && i1 % 400 != 0) {
				System.out.println("not leap year"); //28
			}else {
				System.out.println("leap year"); //29
			}
			
		}else {
			System.out.println("not leap year"); //28
		}

	}

}
