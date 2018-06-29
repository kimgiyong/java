package ch05;

import java.util.*;

public class Ch05Ex02_09 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		int a[] = new int[100];
		int b;
		
		for(b=0;b<=99;b++) {
			a[b] = first.nextInt();
			if(a[b]==0) break;
		}System.out.println(b);
		for(int c=0;c<=b-1;c++) {
			if(a[c]%2==1) System.out.print(a[c]*2 + " ");
			else if(a[c]%2==0) System.out.print(a[c]/2 + " ");
		}
	}
}
