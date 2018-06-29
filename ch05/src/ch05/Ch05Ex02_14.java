package ch05;

import java.util.*;

public class Ch05Ex02_14 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		int a[][] = {
				{3,5,9}
				,{2,11,5}
				,{8,30,10}
				,{22,5,1}
		};int d = 0;
		for(int b=0;b<=a.length-1;b++) {
			for(int c=0;c<=a[0].length-1;c++) {
				System.out.print(a[b][c] + " ");
				d += a[b][c];
			}
			System.out.println();
		}System.out.print(d);
	}
}
