package ch05;

import java.util.*;

public class Ch05Ex02_03 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		int a[] = new int[10];
		int ssum=0;
		int csum=0;
		
		for(int b=0;b<=9;b++) {
			a[b] = first.nextInt();
			if(b%2==0) ssum=ssum+a[b];
			else if(b%2==1) csum=csum+a[b];
		}System.out.println("odd:"+ssum);
		System.out.print("even:"+csum);
	}
}
