package ch05;

import java.util.*;

public class Ch05Ex02_07 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		int a[] = new int[3];
		
		a[0] = first.nextInt();
		if(a[0]==999) a[0] = 0;
		a[1] = a[0];
		a[2] = a[0];
		while(a[0]!=0 && a[0]!=999) {
			a[0] = first.nextInt();
			if(a[1]<a[0] && a[0]!=999) a[1]=a[0];
			else if(a[2]>a[0] && a[0]!=999) a[2]=a[0];
		}System.out.printf("max:%d%nmin:%d", a[1],a[2]);
	}
}
