package doyMors;

import java.util.Arrays;
import java.util.Random;

class DomCot {
	
	private int x;
	private int y;
	
	public static void main (String [] args) {
		
		int x = 7;
		int y = 7;
		
		String [][][] board = new String[x][y][1];
		
		DomCot doc = new DomCot (true);
		DomCot doc1 = new DomCot (true);
		DomCot doc2 = new DomCot (true);
		
		
		System.out.println(Arrays.toString(doc.getXY()));
		System.out.println(Arrays.toString(doc1.getXY()));
		System.out.println(Arrays.toString(doc2.getXY()));
		
	
		
		
		
		board = inBoadrd(board, doc1);
	}
	
	public static String[][][] inBoadrd(String [][][] board, DomCot doc) {
		
		for (int i = 0; i < board.length; i++) {
			for (int q = 0; q < board[i].length; q++) {
				
				board[i][q][0] = "0";
				
				
			}
		}
		
		
		return new String [][][] {};
	}
	
	public DomCot (boolean orient) {
		Random rand = new Random();
		
		if (orient == true) {
			x = 1 + rand.nextInt(3);
			y = 1;
		} else {
			x = 1;
			y = 1 + rand.nextInt(3);
		}
		
	}

	
	public int [] getXY () {return new int [] {x, y};}
	
}
