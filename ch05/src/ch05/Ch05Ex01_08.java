package ch05;

import java.util.*;

public class Ch05Ex01_08 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		int a[] = new int[10];
		
		for(int b=0;b<a.length;b++) {
			a[b]=first.nextInt();
		}int sum=0;
		double avg=0;
		for(int b=0;b<a.length;b++) {
			if(b%2==0) avg=avg+a[b];
			else if(b%2==1) sum=sum+a[b];
		}
		System.out.printf("sum:%d%navg:%.1f", sum,avg/5);
	}
}
