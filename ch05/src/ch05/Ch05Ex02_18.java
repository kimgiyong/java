package ch05;

import java.util.*;

public class Ch05Ex02_18 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		char a[][] = new char[3][5];
		
		for(int b=0;b<=2;b++) {
			String gate[] = first.nextLine().split(" ");
			for(int c=0;c<=4;c++) {
				a[b][c] = gate[c].charAt(0);
			}
		}for(int b=0;b<=2;b++) {
			for(int c=0;c<=4;c++) {
				System.out.print((char)(a[b][c]+32) + " ");
			}System.out.println();
		}
	}
}
