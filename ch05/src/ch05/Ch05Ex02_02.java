package ch05;

import java.util.*;

public class Ch05Ex02_02 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		int a[] = new int[5];
		
		for(int b=0;b<=4;b++) {
			a[b] = first.nextInt();
		}System.out.print(a[0]+a[2]+a[4]);
	}
}
