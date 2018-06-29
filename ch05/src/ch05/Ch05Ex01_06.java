package ch05;

import java.util.*;

public class Ch05Ex01_06 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		int a[] = new int[10];
		
		for(int b=0;b<a.length;b++) {
			a[b]=first.nextInt();
		}int c=a[0];
		for(int b=0;b<a.length-1;b++) {
			if(c>a[b+1]) c=a[b+1];
		}System.out.print(c);
	}
}
