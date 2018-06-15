package ch04;

import java.util.Scanner;

public class Ch04Ex02_17 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		String gate = first.nextLine();
		int a = Integer.parseInt(gate);
		int b = 1;
		
		for(int c=0;c<a;c++) {
			for(int d=0;d<c;d++) {
				System.out.print("  ");
			}
			for(int d=a-c;d>0;d--) {
				System.out.print(b%10+" ");
				b++;
			}System.out.println();
		}
	}	
}