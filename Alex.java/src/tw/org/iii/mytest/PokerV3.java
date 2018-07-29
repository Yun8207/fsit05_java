package tw.org.iii.mytest;

import java.util.Arrays;

public class PokerV3 {

	public static void main(String[] args) {
		int[] poker = new int [52];
		int selectedn;
		int selected;
		int initv;
		for (int a= 0;a<poker.length; a++) {
			poker[a] = a ;
		}
		for (int s=0; s< 1000; s++) {
			selectedn = (int)(Math.random()*poker.length);
			selected = poker[selectedn] ;
			initv = poker[0];
			poker[0] = selected;
			poker[selectedn] = initv;
		}
		//System.out.println("-----");
		
		int[][] players = new int[4][13];
		for (int i=0; i<poker.length; i++) {
			System.out.println(poker[i]);
			players[i%4][i/4] = poker [i];
		}
		
		System.out.println("-----");
		
		String[] suits = {"spade","heart","diamond","club"};
		String[] values = {"A ","2 ","3 ","4 ","5 ","6 ","7 ","8 ","9 ","10", "J ", "Q ", "K "};		
		for (int[] player: players) {
			Arrays.sort(player);
			//System.out.print("card: ");
			for (int card : player) {
				int type = card%4;
				int numb = card%13;
				System.out.print(card + " ");
				System.out.print(suits[card/13]+ values[card%13] +" ");
			}
			System.out.println();
		}
		
		

//		for (int v : players[0]) {
//			System.out.println(v);
//		}
		
	}

}
