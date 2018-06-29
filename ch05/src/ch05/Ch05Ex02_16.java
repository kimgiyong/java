package ch05;

import java.util.*;

public class Ch05Ex02_16 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		int a[][] = new int[2][3];
		int d[][] = new int[2][3];
		
		for(int b=0;b<=1;b++) {
			if(b==0) System.out.println("first array");
			else System.out.println("second array");
			for(int c=0;c<=2;c++) {
				if(b==0) a[b][c] = first.nextInt();
				else d[b][c] = first.nextInt();
			}
		}for(int b=0;b<=2;b++) {
			a[0][b] *= a[1][b];
		}
	}
}
