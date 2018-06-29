package ch05;

import java.util.*;

public class Ch05Ex02_05 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		double a[] = new double[6];
		double avg = 0;
		
		for(int b=0;b<=a.length-1;b++) {
			a[b] = first.nextDouble();
			avg = avg+a[b];
		}System.out.printf("%.1f", avg/6);
	}
}
