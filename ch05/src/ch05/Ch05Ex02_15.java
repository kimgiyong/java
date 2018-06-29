package ch05;

import java.util.*;

public class Ch05Ex02_15 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		int a[][] = new int[4][4];
		
		for(int b=0;b<=3;b++) {
			System.out.print(b+1+"class? ");
			for(int c=0;c<=2;c++) {
				a[b][c] = first.nextInt();
			}
		}for(int b=0;b<=3;b++) {
			System.out.print(b+1+"class: ");
			for(int c=0;c<=2;c++) {
				a[b][3] += a[b][c];
			}System.out.println(a[b][3]);
		}
	}
}
