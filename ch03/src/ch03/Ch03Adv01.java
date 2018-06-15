package ch03;

import java.util.Scanner;

public class Ch03Adv01 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		int animal[] = new int[10];
		int leg[] = new int[10];
		String sum[] = new String[2];
		int a[] = new int[2];
		int b,c;
		for(b=0;b<=9;b++) {
			sum = first.nextLine().split(" ");
			a[0] = Integer.parseInt(sum[0]);
			a[1] = Integer.parseInt(sum[1]);
			animal[b]=a[0];
			leg[b]=a[1];
			if(a[0]==0&&a[1]==0) {
				break;
			}
		}for(b=0;b<=9;b++) {
			for(c=0;c<=animal[b];c++) {
				
			}
		}
		
	}
}
