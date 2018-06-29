package ch05;

import java.util.*;

public class Ch05Ex01_04 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		int a[] = new int[100];
		int b;
		
		for(b=0;b<a.length;b++) {
			a[b] = first.nextInt();
			if(a[b]==0) break;
		}for(int c=b-1;c>=0;c--) {
			System.out.printf("%d ",a[c]);
		}
	}
}
