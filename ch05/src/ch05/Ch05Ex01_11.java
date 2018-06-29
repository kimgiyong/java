package ch05;

import java.util.*;

public class Ch05Ex01_11 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		int a[] = new int[11];
		int count[] = new int[10];

		for(int b=0;b<=9;b++) {
			count[b] = 0;
			a[b] = b;
		}
		
		for(int b=0;;b++) {
			a[10] = first.nextInt();
			if(a[10]==0)
				break;
			else if(a[10]<10) count[0]++;
			else {
				count[a[10]/10]++; 
			}
		}
		for(int b=0;b<=9;b++) {
			if(count[b]>=1) {
				System.out.println(a[b]+":"+count[b]);
			}
		}
	}
}