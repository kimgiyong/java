package ch05;

import java.util.*;

public class Ch05Ex02_12 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		int a[] = new int[100];
		int count[] = new int[10];
		int b;
		
		for(b=0;b<=99;b++) {
			a[b] = first.nextInt();
			if(a[b]==0) break;
			count[(a[b]/10)-1]++;
		}
		for(int c=100;c>=10;c-=10) {
			if(count[(c/10)-1]>0) System.out.printf("%d:%d person%n",c,count[(c/10)-1]);
		}
	}
}
