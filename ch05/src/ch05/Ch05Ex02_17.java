package ch05;

import java.util.*;

public class Ch05Ex02_17 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		int a[][] = new int[4][2];
		int avg = 0;
		int he1 = 0, he2 = 0;
		
		for(int b=0;b<=3;b++) {
			for(int c=0;c<=1;c++) {
				a[b][c] = first.nextInt();
				avg += a[b][c];
			}
			he1 += a[b][0];
			he2 += a[b][1];
			a[b][0] += a[b][1];
		}
		for(int b=0;b<=3;b++) {
			System.out.print((a[b][0]/2) + " ");
		}System.out.println();
		System.out.print((he1/4) + " ");
		System.out.println(he2/4);
		System.out.print(avg/8);
	}
}
