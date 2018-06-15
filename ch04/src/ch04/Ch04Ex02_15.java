package ch04;

import java.util.Scanner;

public class Ch04Ex02_15 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		String gate = first.nextLine();
		int a = Integer.parseInt(gate);
		int d = a+(a-1);
		
		for(int b=1;b<=d;b++) {
			if(b<=a)
				for(int c=1;c<=b;c++) {
					System.out.print("*");
				}
			if(b>a)
				for(int c=b;c<=d;c++) {
					System.out.print("*");
				}System.out.println();
		}
	}	
}