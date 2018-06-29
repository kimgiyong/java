package ch05;

import java.util.*;

public class Ch05Ex01_05 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		double a[] = {85.6,79.5,83.1,80.0,78.2,75.0,0};
		int gate = first.nextInt();
		int c=gate;
		gate = first.nextInt();
		int d=gate;
		
		for(int b=0;b<a.length-1;b++) {
			if(b==c-1||b==d-1) a[6]=a[6]+a[b];
		}
		System.out.printf("%.1f",a[6]);
	}
}
