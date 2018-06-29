package ch05;

import java.util.*;

public class Ch05Ex01_15 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		int a[][] = new int[5][4];
		int avg[] = new int[5];
		int count = 0;
		
		for(int b=0;b<=4;b++) avg[b]=0;
		
		for(int b=0;b<=4;b++) {
			for(int c=0;c<=3;c++) {
				a[b][c] = first.nextInt();
				avg[b] = avg[b]+a[b][c];
			}
			avg[b] = avg[b]/4;
		}
		for(int b=0;b<=4;b++) {
			if(avg[b]>=80) {
				System.out.println("pass");
				count++;
			}
			else if(avg[b]<80) System.out.println("fail");
		}System.out.print("Successful:"+count);
	}
}
