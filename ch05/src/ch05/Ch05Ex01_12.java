package ch05;

import java.util.*;

public class Ch05Ex01_12 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		int a[] = new int[4];
		a[0] = 100;
		a[1] = first.nextInt();
		System.out.print(a[0]+" "+a[1]+" ");
		
		for(int b=0;;b++) {
			a[2] = a[0]-a[1];
			a[0] = a[1];
			a[1] = a[2];
			System.out.print(a[1]+" ");
			if(a[1]<0) break;
		}
	}
}