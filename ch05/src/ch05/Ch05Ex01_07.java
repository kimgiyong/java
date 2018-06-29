package ch05;

import java.util.*;

public class Ch05Ex01_07 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		int a[] = new int[10];
		
		for(int b=0;b<a.length;b++) {
			a[b]=first.nextInt();
		}int c=10000;
		int d=0;
		for(int b=0;b<a.length;b++) {
			if(a[b]>=100) {
				if(c>=a[b]) c=a[b];
			}
			else if(a[b]<100) {
				if(d<=a[b]) d=a[b];
			}
		}
		if(c==10000) c=100;
		if(d==0) d=100;
		System.out.print(d);
		System.out.print(" "+c);
	}
}
