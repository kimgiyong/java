package ch05;

import java.util.*;

public class Ch05Ex02_08 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		int a[] = new int[100];
		int b;
		int count=0;
		int sum=0;
		
		for(b=0;b<=99;b++) {
			a[b] = first.nextInt();
			if(a[b]==0) break;
			if(a[b]%5==0) {
				count++;
				sum=sum+a[b];
			}
		}System.out.printf("Multiples of 5:%d%nsun:%d%navg:%.1f",count,sum,(double)sum/count);
	}
}
