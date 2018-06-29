package ch05;

import java.util.*;

public class Ch05Ex02_04 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		int a[] = new int[100];
		int b;
		
		for(b=0;b<=99;b++) {
			a[b] = first.nextInt();
			if(a[b]==-1) break;
		}if(b<4) {
			for(int c=0;c<=b-1;c++) System.out.print(a[c] + " ");
		}else {
			for(int c=b-3;c<=b-1;c++) System.out.print(a[c] + " ");
		}
	}
}
