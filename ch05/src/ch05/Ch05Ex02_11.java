package ch05;

import java.util.*;

public class Ch05Ex02_11 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		int a[] = new int[10];
		int count[] = new int[6];
		int b=0;
		
		for(b=0;b<=9;b++) {
			a[b] = first.nextInt();
			count[a[b]-1]++;
		}
		for(b=1;b<=6;b++) {
			System.out.printf("%d:%d%n",b,count[b-1]);
		}
	}
}
