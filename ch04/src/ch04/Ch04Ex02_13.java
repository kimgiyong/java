package ch04;

import java.util.Scanner;

public class Ch04Ex02_13 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		String[] gate = first.nextLine().split(" ");
		int a = Integer.parseInt(gate[0]);
		int b = Integer.parseInt(gate[1]);
		
		for(int c=1;c<=a;c++) {
			for(int d=1;d<=b;d++) {
				System.out.print(c*d+" ");
			}System.out.println();
		}
	}	
}