package ch04;

import java.util.Scanner;

public class Ch04Ex02_16 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		String gate = first.nextLine();
		int a = Integer.parseInt(gate);
		char ch = 'A';
		int e = 0;
		
		for(int c=0;c<a;c++) {
			for(int d=0;d<a-c;d++) {
				System.out.print(ch++);
			}for(int d=0;d<c;d++) {
				System.out.print(e++);
			}System.out.println();
		}
	}	
}