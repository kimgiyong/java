package ch05;

import java.util.*;

public class Ch05Ex02_13 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		int a[] = new int[3];
		
		a[0] = first.nextInt();
		a[1] = first.nextInt();
		System.out.print(a[0] + " ");
		System.out.print(a[1] + " ");
		for(int b=0;b<=7;b++) {
			a[2] = a[0] + a[1];
			System.out.print((a[2] = a[2] % 10) + " ");
			a[0] = a[1];
			a[1] = a[2];			
		}
	}
}
