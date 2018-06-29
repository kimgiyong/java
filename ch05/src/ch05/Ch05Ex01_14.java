package ch05;

import java.util.*;

public class Ch05Ex01_14 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		int a[][] = new int[2][4];
		int b[][] = new int[2][4];
		
		for(int c=0;c<=1;c++) {
			if(c==0) System.out.println("first array");
			else if(c==1) System.out.println("second array");
			for(int d=0;d<=1;d++) {
				for(int e=0;e<=3;e++) {
					if(c==0) a[d][e] = first.nextInt();
					else if(c==1) b[d][e] = first.nextInt();
				}
			}
		}for(int c=0;c<=1;c++) {
			for(int d=0;d<=3;d++) {
				System.out.print(a[c][d]*b[c][d]+" ");
			}System.out.println();
		}
	}
}
