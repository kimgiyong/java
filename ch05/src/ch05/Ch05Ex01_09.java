package ch05;

import java.util.*;

public class Ch05Ex01_09 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		int a[] = new int[10];
		int c=0;
		
		for(int b=0;b<a.length;b++) {
			a[b]=first.nextInt();
		}
		for(int b=0;b<a.length-1;b++) {
			for(int d=b;d<a.length;d++) {
				if(a[b]<a[d]) {
					c=a[b];
					a[b]=a[d];
					a[d]=c;
				}
			}
		}for(int b=0;b<a.length;b++)
			System.out.print(a[b]+" ");
	}
}
