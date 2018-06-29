package ch05;

import java.util.*;

public class Ch05Ex02_10 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		int a[] = new int[20];
		int selec = first.nextInt();
		int tem = 0;
		
		for(int b=0;b<=selec-1;b++) {
			a[b] = first.nextInt();
		}
		for(int b=0;b<=selec-1;b++) {
			for(int c=b;c<=selec-1;c++) {
				if(a[b]<=a[c]) {
					tem = a[b];
					a[b] = a[c];
					a[c] = tem;
				}
			}
		}for(int b=0;b<=selec-1;b++) System.out.println(a[b]);
	}
}
